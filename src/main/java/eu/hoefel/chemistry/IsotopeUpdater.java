package eu.hoefel.chemistry;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eu.hoefel.utils.IOs;
import eu.hoefel.utils.Strings;

/**
 * Class for automatically creating an enum with all known isotopes from some
 * NIST data.
 */
final class IsotopeUpdater {

    private static final Pattern NEW_ELEMENT_PATTERN = Pattern.compile("\\d+\\s+\\w+\\s+\\d+\\s+\\d+\\.\\d+.*");
    private static final Pattern NEW_ELEMENT_NUMBER = Pattern.compile("(\\d+)(?=\\s+\\w+\\s+\\d+\\s+\\d+\\.\\d+.*)");
    private static final Pattern NEW_NAME = Pattern.compile("(\\w+)(?=\\s+\\d+\\s+\\d+\\.\\d+.*)");
    private static final Pattern NEW_ISOTOPE_MASS_NUMBER = Pattern.compile("(\\d+)(?=\\s+\\d+\\.\\d+.*)");
    private static final Pattern NEW_ISOTOPE_ATOMIC_MASS = Pattern.compile("(\\d+.\\d+)(?=\\(\\d+#*\\))");
    private static final Pattern NEW_NAME_PATTERN = Pattern.compile("\\w+\\s+\\d+\\s+\\d+\\.\\d+.*");
    private static final Pattern NEW_ISOTOPE_PATTERN = Pattern.compile("\\d+\\s+\\d+\\.\\d+.*");

    private static final String LB = "\n";

    private record Isotope(Element element, String name, int massNumber, double atomicMass) implements Comparable<Isotope> {

        @Override
        public int compareTo(Isotope other) {
            return Comparator.comparing(Isotope::element)
                             .thenComparingInt(Isotope::massNumber)
                             .compare(this, other);
        }
    }

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
    private static final String constructIsotope(NavigableSet<Isotope> data) {
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
                 * All known isotopes.
                 * Based on <a href="https://www.nist.gov/pml/atomic-weights-and-isotopic-compositions-relative-atomic-masses">NIST data</a>.
                 * 
                 * @see %s
                 * @see %s
                 */
                public sealed interface Isotope extends %s {
                """,
                Element.class.getSimpleName(), Nuclide.class.getSimpleName(), Nuclide.class.getSimpleName())
        );

        List<Element> elements = data.stream().map(Isotope::element).distinct().sorted().toList();

        for (var element : elements) {
            sb.append(LB);
            sb.append("    /** " + Strings.capitalize(element.fullName()) + " (cf. {@link "
                    + Element.class.getSimpleName() + "#" + element.name() + "}) isotopes. */" + LB);
            sb.append("    public enum " + element.name() + " implements Isotope {" + LB);

            var isotopes = data.stream().filter(iso -> iso.element().equals(element)).sorted().toList();

            var isos = new ArrayList<String>();
            for (var iso : isotopes) {
                String javadoc = switch (iso.name()) {
                    case "D" -> "Deuterium";
                    case "T" -> "Tritium";
                    default  -> Strings.capitalize(element.fullName())+" "+iso.massNumber();
                };

                String enumName = switch (iso.name()) {
                    case "D" -> "D";
                    case "T" -> "T";
                    default  -> Strings.capitalize(element.name())+iso.massNumber();
                };

                isos.add("""
                         %-24s%5s(%19.15f)\
                         """.formatted("        /** " + javadoc + " */", enumName, iso.atomicMass()));
            }

            sb.append(String.join(","+LB, isos));
            sb.append(";");
            sb.append("""


                    private double atomicMass;

                    %s(double avgAtomicMass) { atomicMass = avgAtomicMass; }

                    @Override public double mass() { return atomicMass; }
                    @Override public %s element() { return %s.%s; }
                    @Override public Set<Nuclide> nuclides() { return Set.of(this); }
                }
            """.formatted(element.name(), Element.class.getSimpleName(), Element.class.getSimpleName(), element.name()));
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
                        throw new IllegalArgumentException("Found no isotope named '" + name + "'");
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
    private static final String constructIsotopeUtils(NavigableSet<Isotope> data) {
        List<Element> elements = data.stream().map(Isotope::element).distinct().sorted().toList();

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
                elementValues.append(LB + "            ");
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
    private static NavigableSet<Isotope> parseData(String[] lines) {
        var data = new TreeSet<Isotope>();

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
                currentName = sanitizeNames(newElementName.group());

                Matcher newElementIsotopeMassNumber = NEW_ISOTOPE_MASS_NUMBER.matcher(line);
                newElementIsotopeMassNumber.find();
                var massNumber = Integer.parseInt(newElementIsotopeMassNumber.group());

                Matcher newElementIsotopeAtomicMass = NEW_ISOTOPE_ATOMIC_MASS.matcher(line);
                newElementIsotopeAtomicMass.find(); // here we need only the first one!
                var atomicMass = Double.parseDouble(newElementIsotopeAtomicMass.group());

                var elem = Element.withAtomicNumber(currentElementNumber);
                var iso = new Isotope(elem, currentName, massNumber, atomicMass);
                data.add(iso);
            } else if (newName.matches()) {
                Matcher newElementName = NEW_NAME.matcher(line);
                newElementName.find();
                currentName = sanitizeNames(newElementName.group());

                Matcher newElementIsotopeMassNumber = NEW_ISOTOPE_MASS_NUMBER.matcher(line);
                newElementIsotopeMassNumber.find();
                var massNumber = Integer.parseInt(newElementIsotopeMassNumber.group());

                Matcher newElementIsotopeAtomicMass = NEW_ISOTOPE_ATOMIC_MASS.matcher(line);
                newElementIsotopeAtomicMass.find(); // here we need only the first one!
                var atomicMass = Double.parseDouble(newElementIsotopeAtomicMass.group());

                var elem = Element.withAtomicNumber(currentElementNumber);
                var iso = new Isotope(elem, currentName, massNumber, atomicMass);
                data.add(iso);
            } else if (newIsotope.matches()) {
                Matcher newElementIsotopeMassNumber = NEW_ISOTOPE_MASS_NUMBER.matcher(line);
                newElementIsotopeMassNumber.find();
                var massNumber = Integer.parseInt(newElementIsotopeMassNumber.group());

                Matcher newElementIsotopeAtomicMass = NEW_ISOTOPE_ATOMIC_MASS.matcher(line);
                newElementIsotopeAtomicMass.find(); // here we need only the first one!
                var atomicMass = Double.parseDouble(newElementIsotopeAtomicMass.group());

                var elem = Element.withAtomicNumber(currentElementNumber);
                var iso = new Isotope(elem, currentName, massNumber, atomicMass);
                data.add(iso);
            }
        }

        return data;
    }

    private static final String sanitizeNames(String name) {
        return switch (name) {
            case "Uup" -> Element.Mc.name();
            case "Uus" -> Element.Ts.name();
            default    -> name;
        };
    }
}
