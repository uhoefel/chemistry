package eu.hoefel.chemistry;

import java.util.Objects;

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
        return name != null && Element.parseName(name) != null || Isotope.parseName(name) != null;
    }

    /**
     * Gets the nuclide from the given name.
     * 
     * @param name the name, e.g. "C", "Carbon" or "He3", not {@code null}
     * @return the corresponding nuclide
     * @throws NullPointerException if {@code name} is {@code null}
     */
    public static Nuclide named(String name) {
        Objects.requireNonNull(name);

        Element e = Element.parseName(name);
        if (e != null) {
            return e;
        }

        Isotope i = Isotope.parseName(name);
        if (i != null) {
            return i;
        }

        throw new IllegalArgumentException("Found no nuclide named '" + name + "'");
    }
}
