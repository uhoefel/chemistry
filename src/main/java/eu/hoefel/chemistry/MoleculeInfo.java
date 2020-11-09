package eu.hoefel.chemistry;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Record that holds the information required for a molecule.
 * 
 * @param name       the name, e.g. "water" or "h2o"
 * @param formula    the formula, e.g. "H2O"
 * @param isValid    true if the name corresponds to a valid molecule (that also
 *                   implies that it is not a {@link Nuclide nuclide})
 * @param key        the reference InChI key
 * @param components the components that make up this molecule
 * @param mass       the mass of the molecule in Da
 * @param iupac      the IUPAC name of the molecule
 * @param names      a list of names referring to this molecule
 */
final record MoleculeInfo(String name, String formula, boolean isValid, String key, Map<Nuclide, Integer> components,
		double mass, String iupac, List<String> names) {

	static final String REF_URL = "https://cactus.nci.nih.gov/chemical/structure/";
	static final String STD_IN_CH_I_TARGET = "/stdinchikey";
	static final String CHEMICAL_FORMULA_TARGET = "/formula";
	static final String IUPAC_NAME = "/iupac_name";
	static final String NAMES = "/names";
	static final String VISUALIZATION = "/twirl";

	/**
	 * "Molecules" with an invalid name are potentially not even molecules, so the
	 * only useful information necessary is that it is not a valid molecule.
	 */
	static final MoleculeInfo INVALID_NAME = new MoleculeInfo("", "", false, "", Map.of(), Double.NaN, "", List.of());

	/**
	 * Creates a new MoleculeInfo for the given name.
	 * 
	 * @param name the name of the molecule, e.g. "water" or "h2o"
	 * @return the MoleculeInfo corresponding to the given name
	 */
	public static final MoleculeInfo forMolecule(String name) {
		// as the webservice is a bit weird sometimes (nitrogen == H2N -> what?). We try
		// to be more stable by checking the name as well
		boolean isValid = !Nuclide.isNuclide(name);
		if (!isValid) return INVALID_NAME;

		String formula;
		try {
			formula = toFormula(name);
		} catch (RuntimeException e) {
			throw new IllegalArgumentException("Cannot fetch information for molecule named \"" + name + "\". "
					+ "Are you sure the spelling is correct?");
		}

		isValid = !Nuclide.isNuclide(formula);
		if (!isValid) return INVALID_NAME;
		
		String key = toKey(name);
		Map<Nuclide, Integer> components = getComponents(key);
		double mass = calculateMass(components);
		String iupac = toIupac(key);
		List<String> names = getNames(key);
		
		return new MoleculeInfo(name, formula, isValid, key, components, mass, iupac, names);
	}

	/**
	 * Displays an interactive view of the molecule structure. Blocks until window
	 * is closed.
	 */
	public void structure() {
		MoleculeViewer.main(name);
	}

	/**
	 * Gets the standard InChI key belonging to the given name.
	 * 
	 * @param name the name, e.g. "hydroxychloroquine" or "h2o"
	 * @return the standard InChI identifier
	 */
	private static final String toKey(String name) {
		return readUrl(REF_URL + name + STD_IN_CH_I_TARGET);
	}

	/**
	 * Gets the chemical formula associated with the given name.
	 * 
	 * @param name the name, e.g. "hydroxychloroquine" or "h2o"
	 * @return the chemical formula
	 */
	private static final String toFormula(String name) {
		return readUrl(REF_URL + name + CHEMICAL_FORMULA_TARGET);
	}

	/**
	 * Gets the official IUPAC name belonging to the given molecule name.
	 * 
	 * @param name the name, e.g. "hydroxychloroquine" or "h2o"
	 * @return the IUPAC name
	 */
	private static final String toIupac(String name) {
		return readUrl(REF_URL + name + IUPAC_NAME);
	}

	/**
	 * Gets a number of commercially, colloquially and scientifically used names for
	 * the specified molecule name.
	 * 
	 * @param name the name, e.g. "hydroxychloroquine" or "h2o"
	 * @return a list of other, synonymous, names for the given name
	 */
	private static final List<String> getNames(String name) {
		return Arrays.asList(readUrl(REF_URL + name + NAMES).split("\\R"));
	}

	/**
	 * Gets the components that molecule specified by the given name contains
	 * (including their frequency).
	 * 
	 * @param name the name, e.g. "hydroxychloroquine" or "h2o"
	 * @return the components in the molecule and their frequency
	 */
	private static final Map<Nuclide, Integer> getComponents(String name) {
		String formula = readUrl(REF_URL + name + CHEMICAL_FORMULA_TARGET);
		Map<Nuclide, Integer> moleculeComponents = new LinkedHashMap<>();
		for (int i = 0; i < formula.length(); i++) {
			if (Character.isDigit(formula.charAt(i))) {
				continue;
			}

			// check 2-letter elements
			if (i < formula.length() - 1) {
				for (Element element : Element.values()) {
					if (element.name().equals(formula.substring(i, i + 2))) {
						// check if followed by a number
						String number = "0";
						i += 2;
						for (int j = i + 2; j < formula.length(); j++) {
							char c = formula.charAt(j);
							if (Character.isDigit(c)) {
								number += c;
								i++;
							} else {
								break;
							}
						}
						moleculeComponents.put(element, moleculeComponents.getOrDefault(element, 0) + Math.max(1, Integer.parseInt(number)));
					}
				}
			}

			for (Element element : Element.values()) {
				if (element.name().equals(formula.substring(i, i + 1))) {
					// check if followed by a number
					String number = "0";
					for (int j = i + 1; j < formula.length(); j++) {
						char c = formula.charAt(j);
						if (Character.isDigit(c)) {
							number += c;
						} else {
							break;
						}
					}
					moleculeComponents.put(element, moleculeComponents.getOrDefault(element, 0) + Math.max(1, Integer.parseInt(number)));
				}
			}
		}

		return Map.copyOf(moleculeComponents);
	}

	/**
	 * Calculates the mass of the molecule. Neglects binding energy effects, this is
	 * just the sum of the nuclides!
	 * 
	 * @param components the components of the molecule
	 * @return the binding-energy-neglecting mass of the molecule in Da
	 */
	private static final double calculateMass(Map<Nuclide, Integer> components) {
		// This method could be updated and use the mass as given by the webservice as
		// well. Not sure if it is worth the loss in speed though. It would however take
		// the binding energy into account, I guess.
		double mass = 0;
		for (Entry<Nuclide, Integer> component : components.entrySet()) {
			mass += component.getKey().mass() * component.getValue();
		}
		return mass == 0 ? Double.NaN : mass;
	}

	/**
	 * Reads the specified URL.
	 * 
	 * @param url the URL to read from
	 * @return the text at the given URL
	 */
	private static final String readUrl(String url) {
		URL u;
		try {
			u = new URL(url);
			URI uri = new URI(u.getProtocol(), u.getUserInfo(), u.getHost(), u.getPort(), u.getPath(), u.getQuery(), u.getRef());
			u = new URL(uri.toASCIIString());
		} catch (URISyntaxException | MalformedURLException e) {
			throw new IllegalArgumentException(e);
		}

		try (InputStream in = u.openStream()) {
			return new String(in.readAllBytes(), StandardCharsets.UTF_8);
		} catch (IOException e) {
			throw new RuntimeException("Cannot read from " + u, e);
		}
	}
}
