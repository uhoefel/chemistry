package eu.hoefel.chemistry;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import eu.hoefel.jatex.LatexPackage;
import eu.hoefel.jatex.LatexPreambleEntry;
import eu.hoefel.jatex.Texable;

/**
 * Record for handling all kind of molecules. Note that the first call for a
 * given name may be slow, subsequent calls should be fast as the results of the
 * first call are cached. Note further that non-valid molecule names (that
 * includes elements!) will throw an exception.
 * 
 * @param name the name, e.g. "hydroxychloroquine", "water" or "h2o"
 */
public final record Molecule(String name) implements ChemicalCompound, Texable {

    private static final ConcurrentMap<String, MoleculeInfo> info = new ConcurrentHashMap<>();

    /**
     * Gets a new molecule with the specified name.
     * 
     * @param name the name, e.g. "hydroxychloroquine", "water" or "h2o", not
     *             {@code null}
     * @throws NullPointerException if {@code name} is {@code null}
     */
    public Molecule {
        Objects.requireNonNull(name);

        MoleculeInfo mi = info.computeIfAbsent(name, MoleculeInfo::forMolecule);

        if (!mi.isValid()) {
            throw new IllegalArgumentException(
                    "You requested a nuclide (%s), not a molecule. Please use the nuclide classes!".formatted(name));
        }
    }

    /**
     * Gets the average mass in atomic units (see unified atomic mass unit and
     * Dalton). This method neglects binding energy effects and is thus just the sum
     * of the nuclide weights!
     * 
     * @return the average mass in u
     */
    @Override
    public double mass() {
        return info.getOrDefault(name, MoleculeInfo.INVALID_NAME).mass();
    }

    @Override
    public Set<Nuclide> nuclides() {
        return info.getOrDefault(name, MoleculeInfo.INVALID_NAME).components().keySet();
    }

    /**
     * Displays an interactive view of the molecule structure. Blocks until window
     * is closed.
     */
    public final void structure() {
        info.getOrDefault(name, MoleculeInfo.INVALID_NAME).structure();
    }

    /**
     * Gets the official IUPAC name.
     * 
     * @return the IUPAC name
     */
    public final String iupac() {
        return info.getOrDefault(name, MoleculeInfo.INVALID_NAME).iupac();
    }

    /**
     * Gets a number of commercially, colloquially and scientifically used names.
     * 
     * @return a list of other, synonymous, names for the given name
     */
    public final List<String> names() {
        return info.getOrDefault(name, MoleculeInfo.INVALID_NAME).names();
    }

    /**
     * Gets the contained components, including their frequency.
     * 
     * @return the components and their frequency
     */
    public final Map<Nuclide, Integer> components() {
        return info.getOrDefault(name, MoleculeInfo.INVALID_NAME).components();
    }

    /**
     * Gets the chemical formula.
     * 
     * @return the chemical formula
     */
    public final String formula() {
        return info.getOrDefault(name, MoleculeInfo.INVALID_NAME).formula();
    }

    /**
     * Gets the standard InChI key.
     * 
     * @return the standard InChI identifier
     */
    public final String key() {
        return info.getOrDefault(name, MoleculeInfo.INVALID_NAME).key();
    }

    /**
     * @implSpec The default implementation assumes the units can be expressed by
     *           the {@code chemformula} package.
     */
    @Override
    public List<LatexPackage> neededPackages() {
        return List.of(new LatexPackage("chemformula", Map.of(), Map.of("mhchem", Set.of(Molecule.class))));
    }

    /**
     * @implSpec The default implementation assumes the units can be expressed by
     *           the {@code chemformula} package.
     */
    @Override
    public List<LatexPreambleEntry> preambleExtras() {
        return List.of();
    }

    @Override
    public List<String> latexCode() {
        return List.of("\\ch{" + formula() + "}");
    }
}
