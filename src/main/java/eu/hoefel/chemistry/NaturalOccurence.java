package eu.hoefel.chemistry;

/** The enum specifying the possible natural occurrences of an element. */
public enum NaturalOccurence {

    /**
     * Primordial {@link Nuclide nuclides} were already present in the interstellar
     * medium in which the solar system formed. They originate e.g. from the Big
     * Bang, nucleosynthesis and cosmic ray spallation. All of these nuclides are
     * either completely stable or only weakly radioactive, such that meaningful
     * quantities survived until the present. In total 286 nuclides having these
     * properties are known.
     */
    PRIMORDIAL,

    /**
     * Naturally occuring {@link Nuclide nuclides} with a half-life time short in
     * comparison to the age of Earth are nuclides that are produced continually by
     * decaying parent nuclides, as their primordial remnants are minuscle in
     * comparison.
     */
    FROM_DECAY,

    /**
     * A synthetic element is an {@link Element element} that does not occur
     * naturally on Earth, and can only be created artificially.
     */
    SYNTHETIC
}