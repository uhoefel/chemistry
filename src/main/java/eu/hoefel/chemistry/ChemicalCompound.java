package eu.hoefel.chemistry;

import java.util.Set;

/**
 * All of the {@link Element elements}, {@link Isotope isotopes},
 * {@link Molecule molecules} and non-pure compounds.
 */
public interface ChemicalCompound {

    /**
     * Gets the average mass in atomic units (see unified atomic mass unit and
     * Dalton).
     * 
     * @return the average mass in u
     */
    public double mass();

    /**
     * Gets the {@link Nuclide}s occuring in the compound.
     * 
     * @return the compounds' nuclides
     */
    public Set<Nuclide> nuclides();
}
