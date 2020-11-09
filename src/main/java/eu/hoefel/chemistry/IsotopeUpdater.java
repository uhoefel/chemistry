package eu.hoefel.chemistry;

import java.io.File;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eu.hoefel.utils.IOs;
//import eu.hoefel.utils.IOs;
import eu.hoefel.utils.Maths;
import eu.hoefel.utils.Strings;

/**
 * Class for automatically creating an enum with all known isotopes from some
 * NIST data.
 */
final class IsotopeUpdater {

	private static final Pattern NEW_ELEMENT_PATTERN = Pattern.compile("\\d+\\s+\\w+\\s+\\d+\\s+\\d+\\.\\d+.*");
	private static final Pattern NEW_ELEMENT_NUMBER = Pattern.compile("(\\d+)(?=\\s+\\w+\\s+\\d+\\s+\\d+\\.\\d+.*)");
	private static final Pattern NEW_NAME = Pattern.compile("(\\w+)(?=\\s+\\d+\\s+\\d+\\.\\d+.*)");
	private static final Pattern NEW_ISOTOPE = Pattern.compile("(\\d+)(?=\\s+\\d+\\.\\d+.*)");
	private static final Pattern NEW_ISOTOPE_MASS = Pattern.compile("(\\d+.\\d+)(?=\\(\\d+#*\\))");
	private static final Pattern NEW_NAME_PATTERN = Pattern.compile("\\w+\\s+\\d+\\s+\\d+\\.\\d+.*");
	private static final Pattern NEW_ISOTOPE_PATTERN = Pattern.compile("\\d+\\s+\\d+\\.\\d+.*");

	private static final String LB = "\n";

	private static final double ALLOWED_DEVIATION = 0.49;

	/**
	 * Creates the enum for the isotope enum.
	 * 
	 * @param args none
	 */
	public static void main(String[] args) {
		// See https://www.nist.gov/pml/atomic-weights-and-isotopic-compositions-relative-atomic-masses
		// or https://physics.nist.gov/cgi-bin/Compositions/stand_alone.pl?ele=&all=all&ascii=ascii&isotype=all
		// Reference:
		// Coursey, J.S., Schwab, D.J., Tsai, J.J., and Dragoset, R.A. (2015), Atomic
		// Weights and Isotopic Compositions (version 4.1). [Online] Available:
		// http://physics.nist.gov/Comp [2019, 11, 26]. National Institute of Standards
		// and Technology, Gaithersburg, MD.
		createIsotopeClasses(IOs.getStringFromResources("/isotope_2019_11_26.txt", IsotopeUpdater.class), 
				new File("src/main/java/" + IsotopeUpdater.class.getPackage().getName()).getAbsolutePath().replace(".", "/") + "/");
	}

	/**
	 * Creates the isotope classes from the source text file to the target folder.
	 * 
	 * @param input        the content of the NIST file as a String
	 * @param targetFolder the folder to save the created enum to
	 */
	private static void createIsotopeClasses(String input, String targetFolder) {
		String[] lines = input.split("\r\n|\n");

		var data = parseData(lines);

		IOs.writeToFile(new File(targetFolder + "Isotope.java"), constructIsotope(data));
		IOs.writeToFile(new File(targetFolder + "Isotopes.java"), constructIsotopeUtils(data));
	}

	/**
	 * Constructs the enum source code for the given data.
	 * 
	 * @param data the data to create the interface from
	 * @return the source code
	 */
	private static String constructIsotope(Map<Integer, Map<String, Map<Integer, Double>>> data) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("package " + IsotopeUpdater.class.getPackage().getName() + ";" + LB);
		sb.append(LB);
		
		if (!Element.class.getPackage().getName().equals(IsotopeUpdater.class.getPackage().getName())) {
			sb.append("import " + Element.class.getPackage().getName() + "." + Element.class.getSimpleName() + ";" + LB);
			sb.append(LB);
		}

		sb.append(String.format(Locale.ENGLISH,
				"""
				import java.util.ArrayList;
				import java.util.List;
				import java.util.Set;
				
				/**
				 * All known isotopes (excluding elements!).
				 * Based on <a href="https://www.nist.gov/pml/atomic-weights-and-isotopic-compositions-relative-atomic-masses">NIST data</a>.
				 * 
				 * @see %s
				 * @see %s
				 */
				public sealed interface Isotope extends %s {
				""",
				Element.class.getSimpleName(), Nuclide.class.getSimpleName(), Nuclide.class.getSimpleName())
		);
		
		Set<Element> elements = EnumSet.noneOf(Element.class);
		for (var entry : data.entrySet()) {
			Element elem = Element.withAtomicNumber(entry.getKey());
			elements.add(elem);

			for (var innerEntry : entry.getValue().entrySet()) {
				if (elem.name().equalsIgnoreCase(innerEntry.getKey())) {

					sb.append(LB);
					sb.append("	/** " + Strings.capitalize(elem.fullName()) + " (cf. {@link "
							+ Element.class.getSimpleName() + "#" + elem.name() + "}) isotopes. */" + LB);
					sb.append("	public enum " + elem.name() + " implements Isotope {" + LB);

					double minStandardIsotopes = Double.MAX_VALUE;
					double maxStandardIsotopes = Double.MIN_VALUE;

					for (var innerEntry2 : entry.getValue().entrySet()) {
						if (elem.name().equalsIgnoreCase(innerEntry2.getKey())) {
							for (var info : innerEntry2.getValue().entrySet()) {
								minStandardIsotopes = Math.min(minStandardIsotopes, info.getKey());
								maxStandardIsotopes = Math.max(maxStandardIsotopes, info.getKey());
							}
						}
					}

					// check if we have lighter specially named isotopes
					for (var innerEntry2 : entry.getValue().entrySet()) {
						if (elem.name().equalsIgnoreCase(innerEntry2.getKey())) {
							break; // no lighter specially named element
						}
						for (var info : innerEntry2.getValue().entrySet()) {
							if (Maths.approximates(elem.mass(), info.getValue(), ALLOWED_DEVIATION)) {
								// skip because elements are handled in the corresponding Element enum
							} else if (minStandardIsotopes > info.getValue()) {
								sb.append(LB);
								String javadoc = "";
								String name = "";
								if ("D".equals(innerEntry2.getKey())) {
									javadoc = "Deuterium";
									name = "D";
								} else if ("T".equals(innerEntry2.getKey())) {
									javadoc = "Tritium";
									name = "T";
								} else {
									javadoc = innerEntry2.getKey() + info.getKey();
									name = info.getKey().toString();
								}
								sb.append(String.format(Locale.ENGLISH, "%-24s", "		/** " + javadoc + " */"));
								
								if (Maths.isInteger(name)) {
									sb.append(String.format(Locale.ENGLISH, "%5s", elem.name() + name));
								} else {
									sb.append(String.format(Locale.ENGLISH, "%5s", name));
								}
								
								sb.append("(");
								sb.append(String.format(Locale.ENGLISH, "%19.15f", info.getValue()));
								sb.append("),");
							}
						}
					}
					
					for (Entry<Integer, Double> info : innerEntry.getValue().entrySet()) {
						if (Maths.approximates(elem.mass(), info.getValue(), ALLOWED_DEVIATION)) {
							// skip because elements are handled in the corresponding Element enum
						} else {
							sb.append(LB);
							sb.append(String.format(Locale.ENGLISH, "%-24s", "		/** " + Strings.capitalize(elem.fullName()) + " " + info.getKey() + " */"));
							sb.append(String.format(Locale.ENGLISH, "%5s", elem.name() + info.getKey()));
							sb.append("(");
							sb.append(String.format(Locale.ENGLISH, "%19.15f", info.getValue()));
							sb.append("),");
						}
					}
					
					// check if we have heavier specially named isotopes
					for (var innerEntry2 : entry.getValue().entrySet()) {
						if (!elem.name().equalsIgnoreCase(innerEntry2.getKey())) {
							for (var info : innerEntry2.getValue().entrySet()) {
								if (Maths.approximates(elem.mass(), info.getValue(), ALLOWED_DEVIATION)) {
									// skip because elements are handled in the corresponding Element enum
								} else if (maxStandardIsotopes < info.getValue()) {
									sb.append(LB);
									String name = "";
									if ("Uup".equals(innerEntry2.getKey())) {
										// Uup was just the preliminary name, in the meantime a proper name was assigned, so we put it to Mc
										name = Element.Mc.fullName() + info.getKey();
									} else if ("Uus".equals(innerEntry2.getKey())) {
										// Uus was just the preliminary name, in the meantime a proper name was assigned, so we put it to Ts
										name = Element.Ts.fullName() + info.getKey();
									} else {
										name = innerEntry2.getKey() + info.getKey();
									}
									sb.append(String.format(Locale.ENGLISH, "%-24s", "		/** " + name + " */"));
									sb.append(String.format(Locale.ENGLISH, "%5s", elem.name() + info.getKey()));
									sb.append(String.format(Locale.ENGLISH, "%4s", "_" + info.getKey()));
									sb.append("(");
									sb.append(String.format(Locale.ENGLISH, "%19.15f", info.getValue()));
									sb.append("),");
								}
							}
						}
					}
					sb.append(";");
					
					sb.append("""


							private double atomicMass;
							
							%s(double avgAtomicMass) { atomicMass = avgAtomicMass; }
							
							@Override public double mass() { return atomicMass; }
							@Override public %s element() { return %s.%s; }
							@Override public Set<Nuclide> nuclides() { return Set.of(this); }
						}
					""".formatted(elem.name(), Element.class.getSimpleName(), Element.class.getSimpleName(), elem.name()));
				}
			}
		}

		sb.append(LB);

		sb.append(String.format(Locale.ENGLISH,
			"""
				@Override default boolean isIsotope() { return true; }
	
				/**
				 * Gets the isotopes for the requested element.
				 *
				 * @param elem the element for which the isotopes are requested
				 * @return the isotopes of elem
				 */
				public static List<Isotope> ofElement(%s elem) {
					List<Isotope> correspondingIsotopes = new ArrayList<>();
					for (Isotope isotope : Isotope.values()) {
						if (isotope.element() == elem) correspondingIsotopes.add(isotope);
					}
					return correspondingIsotopes;
				}
			
				/**
				 * Gets all isotopes.
				 *
				 * @return all isotopes
				 */
				public static Isotope[] values() {
					return Isotopes.values(); // we know that all elements are enum, so shallow copying should be fine
				}
	
				/**
				 * Checks whether an isotope with the given name exists.
				 * 
				 * @param name the name, e.g. "He3"
				 * @return true if such a named isotope exists
				 */
				public static boolean isIsotope(String name) {
					return parseName(name) != null;
				}
		
				/**
				 * Gets the isotope from the given name.
				 * 
				 * @param name the name, e.g. "He3"
				 * @return the corresponding isotope
				 */
				public static Isotope named(String name) {
					Isotope isotope = parseName(name);
		
					if (isotope == null) {
						throw new IllegalArgumentException("Found no isotope named \\"" + name + "\\"");
					}
					
					return isotope;
				}
		
				/**
				 * Parses the given name and returns the matching element, if found.
				 * 
				 * @param name the name, e.g. "He3"
				 * @return the corresponding isotope or null if no matching isotope has been
				 *         found
				 */
				public static Isotope parseName(String name) {
					for (Isotope isotope : values()) {
						if (isotope.toString().equalsIgnoreCase(name)) {
							return isotope;
						}
					}
		
					// special cases
					if ("deuterium".equalsIgnoreCase(name)) return H.D;
					if ("tritium".equalsIgnoreCase(name)) return H.T;
		
					return null;
				}
			}
			""",
		Element.class.getSimpleName()));
		
		return sb.toString();
	}

	/**
	 * Constructs utility methods for the isotopes.
	 * 
	 * @param data the data to create the class from
	 * @return the source code
	 */
	private static final String constructIsotopeUtils(Map<Integer, Map<String, Map<Integer, Double>>> data) {
		Set<Element> elements = EnumSet.noneOf(Element.class);
		for (var entry : data.entrySet()) {
			Element elem = Element.withAtomicNumber(entry.getKey());
			elements.add(elem);
		}

		StringBuilder sb = new StringBuilder();
		
		sb.append("package " + IsotopeUpdater.class.getPackage().getName() + ";" + LB);
		sb.append(LB);

		sb.append("import java.util.stream.Stream;" + LB);
		sb.append(LB);
		
		if (!Element.class.getPackage().getName().equals(IsotopeUpdater.class.getPackage().getName())) {
			sb.append("import " + Element.class.getPackage().getName() + "." + Element.class.getSimpleName() + ";" + LB);
			sb.append(LB);
		}

		for (Element e : elements) {
			sb.append("import " + Element.class.getPackage().getName() + "." + Isotope.class.getSimpleName() + "." + e.name() + ";" + LB);
		}
		sb.append(LB);

		
		
		StringBuilder elementValues = new StringBuilder();
		int counter = 1;
		int stringLength = 2;
		for (Element elem : elements) {
			elementValues.append(String.format(Locale.ENGLISH, "%" + stringLength + "s.values()", elem.name()) + (counter == elements.size() ? " " : ","));
			if (counter++ % 10 == 0) {
				elementValues.append(LB + "			");
				stringLength = 2;
			} else {
				stringLength = 3;
			}
		}
		
		sb.append("""
				/**
				 * Utility methods for the {@link Isotope isotopes}.
				 * 
				 * @see %s
				 */
				final class Isotopes {

					/** Represents all isotopes. */
					private static final Isotope[] values;

					static {
						Isotope[][] isotopes = {
							%s
						};

						values = Stream.of(isotopes).flatMap(Stream::of).toArray(Isotope[]::new);
					}

					private Isotopes() {
					    throw new IllegalStateException("Utility class");
					}

					/**
					 * Gets all isotopes.
					 *
					 * @return all isotopes
					 */
					public static final Isotope[] values() {
						return values.clone();
					}
				""".formatted(Isotope.class.getSimpleName(), elementValues.toString()));
		sb.append("}");
		
		return sb.toString();
	}

	/**
	 * Parses the NIST text file.
	 * 
	 * @param lines the lines to parse
	 * @return the parsed data
	 */
	private static Map<Integer, Map<String, Map<Integer, Double>>> parseData(String[] lines) {
		Map<Integer,Map<String,Map<Integer,Double>>> data = new LinkedHashMap<>();

		int currentElementNumber = 0;
		String currentName = "";
		for (String line : lines) {

			line = line.trim();
			if (line.isEmpty()) continue;

			Matcher newElement = NEW_ELEMENT_PATTERN.matcher(line);
			Matcher newName = NEW_NAME_PATTERN.matcher(line);
			Matcher newIsotope = NEW_ISOTOPE_PATTERN.matcher(line);

			if (newElement.matches()) {
				Matcher newElementNumber = NEW_ELEMENT_NUMBER.matcher(line);
				newElementNumber.find();
				currentElementNumber = Integer.parseInt(newElementNumber.group());
				
				Matcher newElementName = NEW_NAME.matcher(line);
				newElementName.find();
				currentName = newElementName.group();

				Matcher newElementIsotope = NEW_ISOTOPE.matcher(line);
				newElementIsotope.find();

				Matcher newElementIsotopeAtomicMass = NEW_ISOTOPE_MASS.matcher(line);
				newElementIsotopeAtomicMass.find(); // here we need only the first one!

				Map<Integer, Double> isotopeMass = new LinkedHashMap<>();
				isotopeMass.put(Integer.parseInt(newElementIsotope.group()), Double.parseDouble(newElementIsotopeAtomicMass.group()));

				Map<String, Map<Integer, Double>> nameInfo = new LinkedHashMap<>();
				nameInfo.put(currentName, isotopeMass);

				data.put(currentElementNumber, nameInfo);

			} else if (newName.matches()) {
				var nameInfo = data.get(currentElementNumber);

				Matcher newElementName = NEW_NAME.matcher(line);
				newElementName.find();
				currentName = newElementName.group();
				
				Matcher newElementIsotope = NEW_ISOTOPE.matcher(line);
				newElementIsotope.find();

				Matcher newElementIsotopeAtomicMass = NEW_ISOTOPE_MASS.matcher(line);
				newElementIsotopeAtomicMass.find(); // here we need only the first one!

				Map<Integer,Double> isotopeMass = new LinkedHashMap<>();
				isotopeMass.put(Integer.parseInt(newElementIsotope.group()), Double.parseDouble(newElementIsotopeAtomicMass.group()));

				// fix order for D and T
				if ("D".equals(currentName)) {
					var copy = new LinkedHashMap<>(nameInfo);
					nameInfo.clear();
					nameInfo.put(currentName, isotopeMass);
					nameInfo.putAll(copy);
				} else if ("T".equals(currentName)) {
					var copy = new LinkedHashMap<>(nameInfo);
					nameInfo.clear();
					nameInfo.put("D", copy.get("D"));
					nameInfo.put(currentName, isotopeMass);
					nameInfo.put("H", copy.get("H"));
				} else {
					nameInfo.put(currentName, isotopeMass);
				}
				
			} else if (newIsotope.matches()) {
				var nameInfo = data.get(currentElementNumber);
				Map<Integer,Double> isotopeMass = nameInfo.get(currentName);
				
				Matcher newElementIsotope = NEW_ISOTOPE.matcher(line);
				newElementIsotope.find();

				Matcher newElementIsotopeAtomicMass = NEW_ISOTOPE_MASS.matcher(line);
				newElementIsotopeAtomicMass.find(); // here we need only the first one!

				isotopeMass.put(Integer.parseInt(newElementIsotope.group()), Double.parseDouble(newElementIsotopeAtomicMass.group()));
			}
		}
		
		return data;
	}
}
