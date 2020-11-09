package eu.hoefel.chemistry;

/** Interface for all nuclides, i.e. {@link Element} and {@link Isotope}. */
public sealed interface Nuclide extends ChemicalCompound permits Element,Isotope {

	// Potential TODO: One could add AntiElement and AntiIsotope for antimatter, but probably YAGNI

	/**
	 * Gets the corresponding element.
	 * 
	 * @return the corresponding element
	 * @see Element
	 */
	public Element element();

	/**
	 * Gets whether the nuclide is an isotope.
	 * 
	 * @return true if nuclide is an isotope
	 */
	public boolean isIsotope();

	/**
	 * Checks whether a nuclide with the given name exists.
	 * 
	 * @param name the name, e.g. "C", "Carbon" or "He3"
	 * @return true if such a named nuclide exists
	 */
	public static boolean isNuclide(String name) {
		return Element.parseName(name) != null || Isotope.parseName(name) != null;
	}

	/**
	 * Gets the nuclide from the given name.
	 * 
	 * @param name the name, e.g. "C", "Carbon" or "He3"
	 * @return the corresponding nuclide
	 */
	public static Nuclide named(String name) {
		Element e = Element.parseName(name);
		if (e != null) {
			return e;
		} else {
			Isotope i = Isotope.parseName(name);
			if (i != null) {
				return i;
			} else {
				throw new IllegalArgumentException("Found no nuclide named \"" + name + "\"");
			}
		}
	}
}
