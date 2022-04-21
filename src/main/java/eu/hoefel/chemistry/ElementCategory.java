package eu.hoefel.chemistry;

/**
 * The chemical properties an element can have (or rather, to which group in the
 * periodic table an element belongs).
 */
public enum ElementCategory {

    /**
     * Alkali metals are highly reactive, shiny and soft at standard temperature and
     * standard state pressure. They easily form cations with charge +1, as their
     * outermost electron can be lost easily. Cutting with a knife is possible.
     * Surfaces are shiny, but when exposed to air they quickly react with it (or
     * the moisture in it), effectively tarnishing the surface.
     */
    ALKALI_METAL(true, false, false, false),

    /**
     * Alkaline earth metal are reactive, shiny metals at standard temperature and
     * standard state pressure. They also exhibit a silvery-white color. They easily
     * form cations with charge +2, as their outermost electrons can be lost easily.
     */
    ALKALINE_EARTH_METAL(true, false, false, false),

    /**
     * Lanthanoides are named after {@link Element#La lanthanum}, to which they are
     * chemically similar. All lanthanoides form cations with charge +3.
     */
    LANTHANOIDE(true, false, false, false),

    /**
     * Actinoides are named after {@link Element#Ac actinium}, to which they are
     * chemically similar. All actinoides are radioactive.
     */
    ACTINOIDE(true, false, false, false),

    /**
     * Transition elements are elements that have an incomplete d sub shell or can
     * form cations with an incomplete d sub shell.
     * 
     * @see <a href="https://doi.org/10.1351/goldbook.T06456">IUPAC definition</a>
     */
    TRANSITION_METAL(true, false, false, false),

    /**
     * Post-transition metals are located between {@link #TRANSITION_METAL
     * transition metals} and {@link #METALLOID metalloids} in the periodic table.
     * They exhibit melting points below those of transition metals and have poor
     * mechanical strength. Furthermore, they have a tendency to form covalent bonds
     * and show acid-base amphoterism.
     */
    POST_TRANSITION_METAL(true, false, false, false),

    /**
     * Metalloids have properties in between those of metals and nonmetals. Their
     * chemical properties resemble more nonmetals.
     */
    METALLOID(false, true, false, false),

    /**
     * Reactive nonmetals largely occupy a position in the periodic table between
     * the weakly nonmetallic {@link #METALLOID metalloids} to the left and the
     * {@link #NOBLE_GAS noble gases} to the right. They are relatively strong
     * oxidizing agents.
     */
    REACTIVE_NONMETAL(false, false, true, false),

    /**
     * Noble gases show a very low chemical reactivity as their outer shell of
     * valence electrons is full. They appear to be color- and odorless.
     */
    NOBLE_GAS(false, false, true, false),

    /** The chemical properties are unknown. */
    UNKNOWN(false, false, false, true);

    /** True if the element category has metallic properties. */
    private boolean isMetal;

    /** True if the element category has metalloid properties. */
    private boolean isMetalloid;

    /** True if the element category has non-metallic properties. */
    private boolean isNonmetal;

    /** True if the element category is unknown. */
    private boolean isUnknown;

    /**
     * Constructor for an elements category enum.
     * 
     * @param isMetal     true if the element category has metallic properties
     * @param isMetalloid true if the element category has metalloid properties
     * @param isNonmetal  true if the element category has non-metallic properties
     * @param isUnknown   true if the element category is unknown
     */
    ElementCategory(boolean isMetal, boolean isMetalloid, boolean isNonmetal, boolean isUnknown) {
        this.isMetal = isMetal;
        this.isMetalloid = isMetalloid;
        this.isNonmetal = isNonmetal;
        this.isUnknown = isUnknown;
    }

    /**
     * Is this property a metal property?
     * 
     * @return true if a metal property
     */
    public boolean isMetal() {
        return isMetal;
    }

    /**
     * Is this property a metalloid property?
     * 
     * @return true if a metalloid property
     */
    public boolean isMetalloid() {
        return isMetalloid;
    }

    /**
     * Is this property a nonmetal property?
     * 
     * @return true if a nonmetal property
     */
    public boolean isNonmetal() {
        return isNonmetal;
    }

    /**
     * Are the chemical properties unknown?
     * 
     * @return true if the chemical properties are unknown
     */
    public boolean isUnknown() {
        return isUnknown;
    }
}