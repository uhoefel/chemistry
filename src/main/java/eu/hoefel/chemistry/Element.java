package eu.hoefel.chemistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/** Enum for all elements currently known to man. */
public enum Element implements Nuclide {

    /**
     * <a href="https://doi.org/10.1098/rstl.1766.0019">Hydrogen</a> (together with
     * its isotopes) is the most abundant baryonic substance in the universe. It is
     * the lightest element. The first artificial production happened in the
     * 16<sup>th</sup> century. In the 18<sup>th</sup> century Henry Cavendish
     * realized that hydrogen was a distinct substance and that it forms water when
     * burned, hence its name, meaning "water-former" in greek.
     */
    H("hydrogen", 1, 1, 1.00794, 31, 120, 2.1, ElementCategory.REACTIVE_NONMETAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rspl.1868.0011">Helium</a> (together with
     * its isotopes) is the second most abundant baryonic substance in the universe.
     * It has the lowest boiling point of all substances. Its name is a reference to
     * the greek titan of the sun, Helios. Norman Lockyer was the first to propose
     * in the 19<sup>th</sup> century that a spectral line signature observed in
     * sunlight was caused by a new element - Helium. The formal discovery was made
     * some years later by Per Teodor Cleve and Nils Abraham Langlet.
     */
    He("helium", 18, 1, 4.0026, 28, 140, 0, ElementCategory.NOBLE_GAS,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Lithium is the lightest metal and solid element, given standard conditions.
     * Its existence was first detected in 1817 by Johan August Arfwedson. It was
     * first isolated in 1821 by Wiliam Thomas Brande.
     */
    Li("lithium", 1, 2, 6.941, 128, 182, 0.98, ElementCategory.ALKALI_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Beryllium is rather rare in the universe, as it gets fused in stars. It was
     * discovered in 1798 by Louis-Nicolas Vauquelin. It was first isolated by
     * <a href="https://doi.org/10.1002/andp.18280890805">Friedrich Wöhler</a> and
     * independently by Antoine Bussy in 1828.
     */
    Be("beryllium", 2, 2, 9.01218, 96, 153, 1.57, ElementCategory.ALKALINE_EARTH_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Boron is overwhelmingly produced by supernovae and cosmic ray spallation (not
     * by nucleosynthesis) and is quite rare in the solar system. Its elementary
     * character was discovered in 1824 by Jöns Jakob Berzelius. It was produced in
     * pure, crystalline form by W. Weintraub in 1909.
     */
    B("boron", 13, 2, 10.811, 84, 192, 2.04, ElementCategory.METALLOID,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Carbon is known since the dawn of man, e.g. in the form of (char)coal. It is
     * fundamental for biology and plays a huge role in chemistry. It was listed as
     * an element in Antoine Lavoisier's textbook in 1789.
     */
    C("carbon", 14, 2, 12.011, 76, 170, 2.55, ElementCategory.REACTIVE_NONMETAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1021/ed012p370">Nitrogen</a> is quite common in
     * the universe. It dominates Earths atmosphere. Daniel Rutherford is credited
     * with its discovery. Nitrogen, in the form of nitrogen fertilizers is crucial
     * for global food production.
     */
    N("nitrogen", 15, 2, 14.0067, 71, 155, 3.04, ElementCategory.REACTIVE_NONMETAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Oxygen is highly reactive and is the third most abundant element in the
     * universe. Joseph Priestley is often cited as the discoverer of oxygen, while
     * Antoine Lavoisier first recognized its elementary nature.
     */
    O("oxygen", 16, 2, 15.9994, 66, 152, 3.44, ElementCategory.REACTIVE_NONMETAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Fluorine is extraordinarily reactive and reacts with all other elements, save
     * {@link #He}, {@link #Ar} and {@link #Ne}. As extracting pure fluorine proved
     * difficult and dangerous, it took several decades until Henri Moissan
     * succeeded in 1886.
     */
    F("fluorine", 17, 2, 18.9984, 57, 147, 3.98, ElementCategory.REACTIVE_NONMETAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rspl.1898.0057">Neon</a> is an inert,
     * colorless noble gas. It was identified as a new element by Sir William Ramsay
     * and Morris W. Travers by liquefying air.
     */
    Ne("neon", 18, 2, 20.1797, 58, 154, 0, ElementCategory.NOBLE_GAS,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rstl.1808.0001">Sodium</a> is a highly
     * reactive alkali metal. It is abbreviated as "Na" from the latin word Natrium.
     * It was first isolated by Sir Humphry Davy via electrolysis of sodium
     * hydroxide.
     */
    Na("sodium", 1, 3, 22.98977, 166, 227, 0.93, ElementCategory.ALKALI_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rstl.1808.0023">Magnesium</a> is a highly
     * reactive alkaline earth metal. It was first isolated in 1808 by Sir Humphry
     * Davy via electrolysis.
     */
    Mg("magnesium", 2, 3, 24.305, 141, 173, 1.31, ElementCategory.ALKALINE_EARTH_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Aluminium is highly reactive, although it has quite a high resilience against
     * corrosion due to its quick in-air passivation. It was first produced (in
     * halfway pure) form by Hans Christian Ørsted.
     */
    Al("aluminium", 13, 3, 26.9815384, 121, 184, 1.61, ElementCategory.POST_TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Silicon is a hard, crystalline semiconductor. It was first produced in a pure
     * form by Jöns Jacob Berzelius. It is of utmost importance in modern society,
     * as MOSFETs require it.
     */
    Si("silicon", 14, 3, 28.0855, 111, 210, 1.9, ElementCategory.METALLOID,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Phosphorus is highly reactive and essential for life, it occurs e.g. within
     * DNA. It was discovered by Hennig Brand (an alchemist) in 1669.
     */
    P("phosphorus", 15, 3, 30.97376, 107, 180, 2.19, ElementCategory.REACTIVE_NONMETAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Sulfur is nonmetallic and, in its elementary form under standard conditions,
     * exhibits a bright yellow color. It is known since antiquity. Antoine
     * Lavoisier noted that sulfur is an element in November 1777.
     */
    S("sulfur", 16, 3, 32.066, 105, 180, 2.58, ElementCategory.REACTIVE_NONMETAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Chlorine was discovered in 1774 by Carl Wilhelm Scheele. He named it after
     * the Greek word for "green-yellow". It plays an important role e.g. for public
     * sanitation.
     */
    Cl("chlorine", 17, 3, 35.4527, 102, 175, 3.16, ElementCategory.REACTIVE_NONMETAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rspl.1894.0149">Argon</a> was discovered in
     * 1895 by John William Strutt, 3rd Baron Rayleigh, and Sir William Ramsay. It
     * is named after the Greek word for "inreactive" in reference to its chemical
     * non-reactivity. Applications for argon usually exploit its inertness.
     */
    Ar("argon", 18, 3, 39.948, 106, 188, 0, ElementCategory.NOBLE_GAS,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Potassium was discovered in 1807 by Sir Humphry Davy, who named the element
     * after potash. It is a silvery-white metal with huge importance e.g. for
     * biology (especially for the functioning of cells).
     */
    K("potassium", 1, 4, 39.0983, 203, 275, 0.82, ElementCategory.ALKALI_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rstl.1808.0023">Calcium</a>, while compounds
     * have been used for millenia, was discovered by Sir Humphry Davy in 1808. ITs
     * name refers to the Roman word for "lime". It is a ductile, silvery metal with
     * applications e.g. in metallurgy.
     */
    Ca("calcium", 2, 4, 40.078, 176, 231, 1, ElementCategory.ALKALINE_EARTH_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1002/cber.187901201157">Scandium</a> was
     * discovered in 1879 by Lars Fredrik Nilson and is named after Scandinavia. It
     * is a silvery-white metal with applications e.g. in aerospace.
     */
    Sc("scandium", 3, 4, 44.9559, 170, 211, 1.36, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Titanium was discovered in 1791 by William Gregor. It is named after the
     * Titans in Greek mythology. It is used e.g. in aerospace.
     */
    Ti("titanium", 4, 4, 47.88, 160, Double.NaN, 1.54, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1002/andp.18310970103">Vanadium</a> was
     * discovered in 1801 by Andrés Manuel del Río. It is named after Freyja, the
     * Norse goddess of love. It is mainly used for metallurgic purposes.
     */
    V("vanadium", 5, 4, 50.9415, 153, Double.NaN, 1.63, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Chromium was discovered in 1794 by Louis Nicolas Vauquelin. It is named after
     * the Greek word for "color", as many compounds containing chromium are
     * colorful. Its main usage is in metallurgy.
     */
    Cr("chromium", 6, 4, 51.996, 139, Double.NaN, 1.66, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Manganese was discovered in 1774 by Carl Wilhelm Scheele. Its name probably
     * refers to the ancient region of Magnesia in Greece. Its main use is in steel
     * production.
     */
    Mn("manganese", 7, 4, 54.938043, 139, Double.NaN, 1.55, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Iron has been used by mankind for several millenia, even lending its name to
     * the Iron Age. It is by far the most used metal mainly due to its wide and
     * cheap availability.
     */
    Fe("iron", 8, 4, 55.847, 132, Double.NaN, 1.83, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Cobalt was discovered around 1735 by Georg Brandt. It is named after the
     * German word for "goblin". It is used e.g. in some high-performance alloys.
     */
    Co("cobalt", 9, 4, 58.933194, 126, Double.NaN, 1.88, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Nickel was discovered in 1851 by Baron Axel Fredrik Cronstedt. He named it
     * after Nickel, a sprite in German mythology. It is a corrosion-resistant,
     * silvery-white metal that is mainly used for the production of stainless
     * steel.
     */
    Ni("nickel", 10, 4, 58.6934, 124, 163, 1.91, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Copper has been used by mankind for more than 10 000 years. Example
     * applications include wires and electronics.
     */
    Cu("copper", 11, 4, 63.546, 132, 140, 1.9, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Zinc was discovered as an element in the 14th century in India. The first
     * documented use of the name zinc dates back to Paracelsus. It is a
     * silvery-blue metal with one of its major applications being in galvanization.
     */
    Zn("zinc", 12, 4, 65.39, 122, 139, 1.65, ElementCategory.POST_TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Gallium was discovered in 1875 by Paul Emile Lecoq de Boisbaudran. He named
     * it after Gaul, a historical region comprising mostly France. It is a
     * silvery-blue metal with applications e.g. in semiconductors.
     */
    Ga("gallium", 13, 4, 69.723, 122, 187, 1.81, ElementCategory.POST_TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1002/cber.18860190156">Germanium</a> was
     * discovered in 1886 by Clemens Winkler and is named after Germany. It has
     * applications in electronics and optics.
     */
    Ge("germanium", 14, 4, 72.61, 120, 211, 2.01, ElementCategory.METALLOID,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Arsenic is known since more than thousand years and was often used to poison,
     * as symptoms of arsenic poisoning are unspecific.
     */
    As("arsenic", 15, 4, 74.9216, 119, 185, 2.18, ElementCategory.METALLOID,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Selenium was discovered in 1817 by Jöns Jacob Berzelius and Johan Gottlieb
     * Gahn, who named it after Selene, the Greek goddess of the moon. Its main
     * commercial use is in glass production.
     */
    Se("selenium", 16, 4, 78.96, 120, 190, 2.55, ElementCategory.REACTIVE_NONMETAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Bromine was discovered in 1825 and 1826 by Carl Jacob Löwig and Antoine
     * Balard. Bromine compounds were used in the first world war as poison gas.
     */
    Br("bromine", 17, 4, 79.904, 120, 185, 2.96, ElementCategory.REACTIVE_NONMETAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rspl.1898.0051">Krypton</a> was discovered
     * in 1898 by William Ramsay and Morris William Travers. It is named after the
     * ancient Greek word for "hidden". It is an inert, colorless noble gas.
     */
    Kr("krypton", 18, 4, 83.8, 116, 202, 0, ElementCategory.NOBLE_GAS,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1002/andp.18611890702">Rubidium</a> was
     * discovered in 1801 by Robert Bunsen and Gustav Kirchhoff. Its name comes from
     * the Latin name for "deep red", alluding to the colour of prominent lines in
     * its emission spectrum. It is a ductile, silvery-white metal.
     */
    Rb("rubidium", 1, 5, 85.4678, 220, 303, 0.82, ElementCategory.ALKALI_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rstl.1808.0023">Strontium</a> was first
     * isolated in 1808 by Sir Humphry Davy. It is named after Strontian, Scotland.
     * It is a highly reactive, silvery-white element.
     */
    Sr("strontium", 2, 5, 87.62, 195, 249, 0.95, ElementCategory.ALKALINE_EARTH_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Yttrium was discovered in 1794 by Johan Gadolin. It is named after Ytterby,
     * Sweden. It is silvery-white and is used e.g. in LEDs.
     */
    Y("yttrium", 3, 5, 88.9059, 190, Double.NaN, 1.22, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Zirconium was discovered in 1789 by Martin Heinrich Klaproth. It is named
     * after the mineral zircon, which was already mentioned in the bible. It is
     * corrosion-resistant and has a silvery-white color.
     */
    Zr("zirconium", 4, 5, 91.224, 175, Double.NaN, 1.33, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rspl.1800.0045">Niobium</a> was discovered
     * in 1801 by Charles Hatchett. It is named after Niobe, the daughter of
     * Tantalus in Greek mythology. It is mostly used in special steel alloys.
     */
    Nb("niobium", 5, 5, 92.90637, 164, Double.NaN, 1.6, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Molybdenum was discovered in 1778 by Carl Wilhelm Scheele and named in
     * reference to the Greek word for lead, with which it was often confused. It is
     * a silvery metal with its main application in steel alloys.
     */
    Mo("molybdenum", 6, 5, 95.94, 154, Double.NaN, 2.16, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Technetium was discovered in 1937 by Carlo Perrier and Emilio Segrè, who
     * named it in reference to the Greek word for "artificial", as it was the first
     * artificially produced element. It is also the lightest element whose isotopes
     * are all radioactive.
     */
    Tc("technetium", 7, 5, 98, 147, Double.NaN, 1.9, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.FROM_DECAY),

    /**
     * Ruthenium was discovered in 1844 by Karl Ernst Claus, who named the element
     * after Russia. It is a inert, silvery-white metal.
     */
    Ru("ruthenium", 8, 5, 101.07, 146, Double.NaN, 2.2, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rstl.1804.0019">Rhodium</a> was discovered
     * in 1803 by William Hyde Wollaston and is named in reference to the Greek word
     * for "rose". It is a corrosion-resistant, inert, silvery-white metal.
     */
    Rh("rhodium", 9, 5, 102.9055, 142, Double.NaN, 2.28, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rstl.1805.0024">Palladium</a> was discovered
     * in 1802 by William Hyde Wollaston, who named the element after the asteroid
     * Pallas, which had just been found few months earlier. It is a silvery-white
     * metal that is mostly used for catalytic converters nowadays.
     */
    Pd("palladium", 10, 5, 106.42, 139, 163, 2.2, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Silver is known to mankind since prehistoric times and was often used for
     * monetary purposes. It is a silvery-white metal with the highest reflectivity,
     * electrical and thermal conductivity of all metalls.
     */
    Ag("silver", 11, 5, 107.868, 145, 172, 1.93, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1002/andp.18180590511">Cadmium</a> was discovered
     * in 1817 by Friedrich Stromeyer and Karl Samuel Leberecht Hermann and was
     * named after the mineral calamine, as it was found in it. It is a
     * silvery-white metal.
     */
    Cd("cadmium", 12, 5, 112.41, 144, 158, 1.69, ElementCategory.POST_TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1002/prac.18630900122">Indium</a> was discovered
     * in 1863 by Reich and Richter and named after the color indigo. It is a
     * silvery-white metal.
     */
    In("indium", 13, 5, 114.82, 142, 193, 1.78, ElementCategory.POST_TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Tin has been known to man since several thousand years. It was essential for
     * civilizational progress as it allowed the production of bronze, which
     * contains 1/8 tin and 7/8 {@link #Cu}. It is a ductile, silvery-white metal.
     */
    Sn("tin", 14, 5, 118.71, 139, 217, 1.96, ElementCategory.POST_TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Antimony has been known since at least several hundred years. It is a silvery
     * metalloid.
     */
    Sb("antimony", 15, 5, 121.757, 139, 206, 2.05, ElementCategory.METALLOID,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Tellurium was discovered in 1782 by Franz-Joseph Müller von Reichenstein and
     * is named after the Latin word for "earth". Its main application is in
     * metallurgy.
     */
    Te("tellurium", 16, 5, 127.6, 138, 206, 2.1, ElementCategory.METALLOID,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Iodine was discovered in 1811 by Bernard Courtois. It is named after the
     * Greek word for "violet-coloured". It is nonmetallic.
     */
    I("iodine", 17, 5, 126.9045, 139, 198, 2.66, ElementCategory.REACTIVE_NONMETAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Xenon was discovered in 1898 by William Ramsay and Morris Travers and is
     * named in reference to the Greek word for "strange(r)". At standard conditions
     * it is a colorless gas.
     */
    Xe("xenon", 18, 5, 131.29, 140, 216, 2.6, ElementCategory.NOBLE_GAS,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1002/andp.18611890702">Caesium</a> was discovered
     * in 1860 by Robert Bunsen and Gustav Kirchhoff. Its name refers to the Latin
     * word for "sky-blue". It is a silvery-golden metal that liquefies just above
     * room temperature.
     */
    Cs("caesium", 1, 6, 132.9054, 244, 343, 0.79, ElementCategory.ALKALI_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Barium was first isolated by Sir Humphry Davy in 1808. Its name refers to
     * Greek word for "heavy". It is a silvery-white metal.
     */
    Ba("barium", 2, 6, 137.33, 215, 268, 0.89, ElementCategory.ALKALINE_EARTH_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Lanthanum was discovered in 1839 by Carl Gustaf Mosander, who named it after
     * the ancient Greek word for "to lie hidden". It is a ductile, silvery-white
     * metal.
     */
    La("lanthanum", 3, 6, 138.9055, 207, Double.NaN, 1.1, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Cerium was discovered in 1803 by Jöns Jakob Berzelius and Wilhelm Hisinger
     * and independently by Martin Heinrich Klaproth. It is named after the dwarf
     * planet Ceres. It is a ductile, silvery-white metal.
     */
    Ce("cerium", Double.NaN, 6, 140.12, 204, Double.NaN, 1.12, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Praseodymium was discovered in 1885 by Carl Auer von Welsbach. It is named
     * after the Greek word for "leek green". It is a ductile, silvery metal.
     */
    Pr("praseodymium", Double.NaN, 6, 140.9077, 203, Double.NaN, 1.13, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1007/BF01554643">Neodymium</a> was discovered in
     * 1885 by Carl Auer von Welsbach. Its name refers to the Greek words for "new"
     * and "twin". It is a hard, silvery-white metal.
     */
    Nd("neodymium", Double.NaN, 6, 144.24, 201, Double.NaN, 1.14, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1021/ja01203a059">Promethium</a> was discovered
     * in 1945 by Jacob A. Marinsky, Lawrence E. Glendenin and Charles D. Coryell.
     * It is named after Prometheus, the "lightbringer" in Greek mythology. It is
     * radioactive.
     */
    Pm("promethium", Double.NaN, 6, 145, 199, Double.NaN, 1.13, ElementCategory.LANTHANOIDE,
            NaturalOccurence.FROM_DECAY),

    /**
     * Samarium was discovered in 1879 by Paul Émile Lecoq de Boisbaudran, who named
     * it after the mineral samarskite, which was the material in which he found the
     * new element. 
     */
    Sm("samarium", Double.NaN, 6, 150.36, 198, Double.NaN, 1.17, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Europium was discovered in 1896 by Eugène-Anatole Demarçay and is named after
     * Europe. It is a ductile, silvery-white metal, which becomes superconducting
     * below 1.8 kelvin.
     */
    Eu("europium", Double.NaN, 6, 151.965, 198, Double.NaN, 1.2, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Gadolinium was discovered in 1880 by Jean Charles Galissard de Marignac and
     * is named after Johan Gadolin. It is a ductile, silvery-white metal which can
     * heftily influence metallurgic properties of compounds.
     */
    Gd("gadolinium", Double.NaN, 6, 157.25, 196, Double.NaN, 1.2, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Terbium was discovered in 1843 by Carl Gustaf Mosander. It is named after
     * Ytterby, Sweden. It is a ductile, silvery-white metal.
     */
    Tb("terbium", Double.NaN, 6, 158.9253, 194, Double.NaN, 1.1, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Dysprosium was discovered in 1878 by Paul Émile Lecoq de Boisbaudran, who
     * named it after the Greek word for "hard to get", as its isolation was
     * difficult. It is a silvery-white metal with high magnetic susceptibility.
     */
    Dy("dysprosium", Double.NaN, 6, 162.5, 192, Double.NaN, 1.22, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Holmium was discovered in 1878 by Jacques-Louis Soret and Marc Delafontaine.
     * It is named after Stockholm, Sweden. It is a malleable, silvery-white metal
     * with the highest magnetic permeability of all known elements.
     */
    Ho("holmium", Double.NaN, 6, 164.930328, 192, Double.NaN, 1.23, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1080/14786444308644728">Erbium</a> was discovered
     * in 1843 by Carl Gustaf Mosander, who named it after Ytterby, Sweden. It is a
     * soft, silvery-white metal.
     */
    Er("erbium", Double.NaN, 6, 167.26, 189, Double.NaN, 1.24, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Thulium was discovered in 1879 by Per Teodor Cleve and is named after
     * "Thule", the ancient Greek name for a place in Scandinavia or Iceland.
     */
    Tm("thulium", Double.NaN, 6, 168.9342, 190, Double.NaN, 1.25, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href=
     * "https://gallica.bnf.fr/ark:/12148/bpt6k3044x.image.f636.lang=EN">Ytterbium</a>
     * was discovered in 1878 by Jean Charles Galissard de Marignac. It is named
     * after Ytterby, Sweden. It is a silvery-white metal.
     */
    Yb("ytterbium", Double.NaN, 6, 173.04, 187, Double.NaN, 1.1, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1021/ja01958a010">Lutetium</a> was discovered by
     * Georges Urbain, Baron Carl Auer von Welsbach and Charles James. It is named
     * after Paris, France. It is a silvery-white metal.
     */
    Lu("lutetium", Double.NaN, 6, 174.967, 175, Double.NaN, 1.27, ElementCategory.LANTHANOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Hafnium (see <a href="https://doi.org/10.1038/111079a0">here</a> and
     * <a href="https://doi.org/10.1021/cr60005a001">here</a>) was discovered in
     * 1923 by Dirk Coster and Georg von Hevesy. Its name is derived from the latin
     * name for Copenhagen, Denmark. It is a silvery, corrosion-resistant metal with
     * no biological significance.
     */
    Hf("hafnium", 4, 6, 178.49, 187, Double.NaN, 1.3, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Tantalum was discovered in 1802 by Anders Gustav Ekeberg. He named it after
     * Tantalus from Greek mythology. It is a grey, corrosion-resistant metal.
     */
    Ta("tantalum", 5, 6, 180.9479, 170, Double.NaN, 1.5, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Tungsten was discovered by José and Fausto Elhuyar in 1783. The name
     * "tungsten" means "heavy stone" in Swedish. It is a dense, greyish metal with
     * the highest melting and boiling points of all known elements.
     */
    W("tungsten", 6, 6, 183.85, 162, Double.NaN, 2.36, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1007/BF01558746">Rhenium</a> was discovered by
     * Walter and Ida Noddack, and Otto Berg in 1925, who named it after the river
     * rhine. It is a dense, silvery-grey metsl with a high melting point.
     */
    Re("rhenium", 7, 6, 186.207, 151, Double.NaN, 1.9, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rstl.1804.0018">Osmium</a> was discovered as
     * an element by Smithson Tennant in 1803. It is a hard, brittle, silvery-blue
     * metal, with the highest density amongst the known elements.
     */
    Os("osmium", 8, 6,190.2, 144, Double.NaN, 2.2, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1098/rstl.1804.0018">Iridium</a> was discovered
     * as an element by Smithson Tennant in 1803. He named it after Iris, the Greek
     * goddess of the rainbow, as many iridium compounds he found were strongly
     * colored. It is the second-densest element and the most corrosion resistant
     * metal.
     */
    Ir("iridium", 9, 6, 192.217, 141, Double.NaN, 2.2, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Platinum is named after Spanish "platino" ("little silver). It is a
     * nonreactive, ductile, silvery-white precious metal. It is often used in
     * catalytic converters.
     */
    Pt("platinum", 10, 6, 195.08, 136, 175, 2.28, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Gold is known since antiquity. It is a soft, ductile, nonreactive, yellowish
     * metal. Throughout mans history it was often considered precious and was
     * frequently used to mint coins.
     */
    Au("gold", 11, 6, 196.966570, 136, 166, 2.54, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Mercury is known since antiquity and is named after the Roman god Mercury and
     * is also associated with the planet Mercury. It is commonly known as
     * quicksilver, as it is the only metallic element which is liquid at standard
     * conditions. It is also toxic.
     */
    Hg("mercury", 12, 6, 200.59f, 132, 155, 2, ElementCategory.POST_TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1080/14786446108643058">Thallium</a> was
     * discovered by William Crookes in 1861 and is named in reference to its bright
     * green emission lines. It is a silvery-white metal.
     */
    Tl("thallium", 13, 6, 204.383, 145, 196, 2.04, ElementCategory.POST_TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Lead has been known to man since several thousand years BCE. It is a soft,
     * dense, silvery metal.
     */
    Pb("lead", 14, 6, 207.2, 146, 202, 2.33, ElementCategory.POST_TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Bismuth is known since antiquity. It is a silvery-white metal with the
     * longest known half-life time, by far exceeding the age of the universe.
     */
    Bi("bismuth", 15, 6, 208.9804, 148, 207, 2.02, ElementCategory.POST_TRANSITION_METAL,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href=
     * "https://web.archive.org/web/20130723022419/http://www.academie-sciences.fr/activite/archive/dossiers/Curie/Curie_pdf/CR1898_p175_178.pdf">Polonium</a>
     * was discovered in 1898 by Marie and Pierre Curie and named after Poland. It
     * is a highly radioactive and very toxic metal.
     */
    Po("polonium", 16, 6, 209, 140, 197, 2, ElementCategory.POST_TRANSITION_METAL,
            NaturalOccurence.FROM_DECAY),

    /**
     * <a href="https://doi.org/10.1103/PhysRev.58.672">Astatine</a> was discovered
     * in 1940 by Dale R. Corson, Kenneth Ross MacKenzie, and Emilio G. Segrè. Its
     * name refers to "unstable" in greek, hinting at its radioactive nature.
     */
    At("astatine", 17, 6, 210, 150, 202, 2.2, ElementCategory.METALLOID,
            NaturalOccurence.FROM_DECAY),

    /**
     * <a href="https://doi.org/10.1038/179912a0">Radon</a> was discovered in 1899
     * by Ernest Rutherford and Robert B. Owens. Its name resembles the words "ray"
     * (in latin) to indicate its radioactivity and "emanations" (in latin) as it
     * stays radioactive for some time. It is a radioactive, colorless noble gas.
     */
    Rn("radon", 18, 6, 222, 150, 220, 0, ElementCategory.NOBLE_GAS,
            NaturalOccurence.FROM_DECAY),

    /**
     * Francium was discovered by Marguerite Perey is named after France. It is
     * highly radioactive, which makes it unlikely that it will ever be produced in
     * bulk, as the decay heat would vaporize it too quickly.
     */
    Fr("francium", 1, 7, 223, 260, 348, 0.7, ElementCategory.ALKALI_METAL,
            NaturalOccurence.FROM_DECAY),

    /**
     * Radium was discovered by Marie and Pierre Curie and named in resemblance of
     * latin "ray", hinting at its radioactive nature. It is a radioactive,
     * silvery-white metal.
     */
    Ra("radium", 2, 7, 226.0254, 221, 283, 0.89, ElementCategory.ALKALINE_EARTH_METAL,
            NaturalOccurence.FROM_DECAY),

    /**
     * <a href="https://doi.org/10.1086/350760">Actinium</a>'s name refers to "ray"
     * in ancient greek, which was chosen due to its radioactivity. It is a
     * radioactive, silvery-white metallic element. It is the eponym for the
     * {@link ElementCategory#ACTINOIDE actinoides}.
     */
    Ac("actinium", 3, 7, 227, 215, Double.NaN, 1.1, ElementCategory.ACTINOIDE,
            NaturalOccurence.FROM_DECAY),

    /**
     * <a href="https://doi.org/10.1021/ed009p1231">Thorium</a> is named after Thor,
     * the Norse god of thunder. It is a radioactive, silvery metallic element.
     */
    Th("thorium", Double.NaN, 7, 232.0381, 206, Double.NaN, 1.3, ElementCategory.ACTINOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * Protactinium's name refers to "precursor of actinium", as protactinium can
     * decay to {@link #Ac}. It is a highly radioactive, silvery-grey metal.
     */
    Pa("protactinium", Double.NaN, 7, 231.0359, 200, Double.NaN, 1.5, ElementCategory.ACTINOIDE,
            NaturalOccurence.FROM_DECAY),

    /**
     * Uranium was discovered in 1789 by Martin Heinrich Klaproth, who named it
     * after Uranus. It is a weakly radioactive, silvery-grey metal. It was used in
     * the first atomic bomb, dropped on Hiroshima.
     */
    U("uranium", Double.NaN, 7, 238.029, 196, 186, 1.38, ElementCategory.ACTINOIDE,
            NaturalOccurence.PRIMORDIAL),

    /**
     * <a href="https://doi.org/10.1103/PhysRev.57.1185.2">Neptunium</a> is named
     * after Neptune. It is a radioactive, silvery metal.
     */
    Np("neptunium", Double.NaN, 7, 237.0482, 190, Double.NaN, 1.36, ElementCategory.ACTINOIDE,
            NaturalOccurence.FROM_DECAY),

    /**
     * <a href="https://doi.org/10.1103/PhysRev.70.555">Plutonium</a> is named after
     * Pluto. It is a radioactive, silvery-gray metal. It was also used for the atom
     * bomb dropped on Nagasaki at the end of the second world war.
     */
    Pu("plutonium", Double.NaN, 7, 244, 187, Double.NaN, 1.28, ElementCategory.ACTINOIDE,
            NaturalOccurence.FROM_DECAY),

    /**
     * <a href="https://doi.org/10.1103/PhysRev.79.530">Americium</a> was named
     * after the Americas. It is a radioactive, silvery metal.
     */
    Am("americium", Double.NaN, 7, 243, 180, Double.NaN, 1.3, ElementCategory.ACTINOIDE,
            NaturalOccurence.SYNTHETIC),

    /**
     * Curium was named after Marie Skłodowska-Curie and Pierre Curie. It is a
     * radioactive, silvery metal with high density.
     */
    Cm("curium", Double.NaN, 7, 247, 169, Double.NaN, 1.3, ElementCategory.ACTINOIDE,
            NaturalOccurence.SYNTHETIC),

    /**
     * Berkelium (for (early) references see
     * <a href="https://doi.org/10.1103/PhysRev.77.838.2">here</a>,
     * <a href="https://doi.org/10.1103/PhysRev.80.781">here</a> and
     * <a href="https://doi.org/10.1021/ja01162a538">here</a>) was named after
     * Berkeley, California in the United States of America. It is a silvery-white,
     * radioactive metal.
     */
    Bk("berkelium", Double.NaN, 7, 247, Double.NaN, Double.NaN, 1.3, ElementCategory.ACTINOIDE,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1021/ja01166a528">Californium</a> was named after
     * the University of California Radiation Laboratory and the state California.
     * It is a silvery-white metal with applications in medicine and reactor startup.
     * It is also often used to produce heavier elements, e.g. {@link #Og}.
     */
    Cf("californium", Double.NaN, 7, 251, Double.NaN, Double.NaN, 1.3, ElementCategory.ACTINOIDE,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRev.99.1048">Einsteinium</a> is named
     * after Albert Einstein. It was first found in fallout from the first hydrogen
     * bomb test. It is a strongly radioactive, silvery-white metal.
     */
    Es("einsteinium", Double.NaN, 7, 252, Double.NaN, Double.NaN, 1.3, ElementCategory.ACTINOIDE,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRev.99.1048">Fermium</a> is named after
     * Enrico Fermi. It was first found in fallout from the first hydrogen bomb
     * test. While it could be produced in macroscopic quantities, the studies
     * focused on fermium in solution.
     */
    Fm("fermium", Double.NaN, 7, 257, Double.NaN, Double.NaN, 1.3, ElementCategory.ACTINOIDE,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRev.98.1518">Mendelevium</a> is named
     * after Dmitri Mendeleev. As it cannot be produced in large enough quantities
     * for exhaustive experimental properties investigations, hence its properties
     * are only partially known.
     */
    Md("mendelevium", Double.NaN, 7, 258, Double.NaN, Double.NaN, 1.3, ElementCategory.ACTINOIDE,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1007/BF01133459">Nobelium</a> is named after
     * Alfred Nobel. Its experimental properties are only partially known.
     */
    No("nobelium", Double.NaN, 7, 259, Double.NaN, Double.NaN, 1.3, ElementCategory.ACTINOIDE,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRevLett.6.473">Lawrencium</a> is named
     * after Ernest Orlando Lawrence, who invented the cyclotron. It is the last
     * {@link ElementCategory#ACTINOIDE actinoide}. Compared to heavier elements,
     * there are relatively many properties known.
     */
    Lr("lawrencium", Double.NaN, 7, 266, Double.NaN, Double.NaN, Double.NaN, ElementCategory.ACTINOIDE,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRevLett.22.1317">Rutherfordium</a> is
     * named after Ernest Rutherford. Its experimental properties are only partially
     * known. It seems to behave similar to other group 4 elements and act as the
     * heavier homologue to {@link #Hf}.
     */
    Rf("rutherfordium", 4, 7, 267, Double.NaN, Double.NaN, Double.NaN, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRevLett.24.1498">Dubnium</a> is named
     * after Dubna, Russia, in which one of the laboratories that discovered the
     * element is located. Its experimental properties are only partially known, but
     * the ones known are similar to other group 5 elements, although relativistic
     * effects lead to some anomalies. Some of the experiments conducted indicate
     * that it behaves mroe like {@link #Nb} than like {@link #Ta}.
     */
    Db("dubnium", 5, 7, 268, Double.NaN, Double.NaN, Double.NaN, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRevLett.33.1490">Seaborgium</a> is
     * named after Glenn T. Seaborg. Its experimental properties are only partially
     * known, but the ones known are similar to other group 6 elements.
     */
    Sg("seaborgium", 6, 7, 269, Double.NaN, Double.NaN, Double.NaN, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1007/BF01412623">Bohrium</a> is named after
     * Niels Bohr. Its experimental properties are mostly unknown, but the ones
     * known are similar to other group 7 elements.
     */
    Bh("bohrium", 7, 7, 270, Double.NaN, Double.NaN, Double.NaN, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1007/BF01421260">Hassium</a> is named after
     * Hesse, a state in Germany. Its experimental properties are difficult to
     * assess due to its short half-life times and small producible quantities.
     */
    Hs("hassium", 8, 7, 270, Double.NaN, Double.NaN, Double.NaN, ElementCategory.TRANSITION_METAL,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1007/BF01420157">Meitnerium</a> is named after
     * Lise Meitner. Its experimental properties are for the most part unknown due
     * to its short half-life times and small producible quantities.
     */
    Mt("meitnerium", 9, 7, 278, Double.NaN, Double.NaN, Double.NaN, ElementCategory.UNKNOWN,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1007/BF01291181">Darmstadtium</a> is named after
     * Darmstadt, Germany, in which the laboratory discovering it is located. Its
     * experimental properties are for the most part unknown due to its short
     * half-life times and small producible quantities.
     */
    Ds("darmstadtium", 10, 7, 281, Double.NaN, Double.NaN, Double.NaN, ElementCategory.UNKNOWN,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1007/BF01291182">Roentgenium</a> is named after
     * Wilhelm Röntgen. Its experimental properties are for the most part unknown
     * due to its short half-life times and small producible quantities.
     */
    Rg("roentgenium", 11, 7, 282, Double.NaN, Double.NaN, Double.NaN, ElementCategory.UNKNOWN,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1007/BF02769517">Copernicium</a> is named after
     * Nicolaus Copernicus. Its experimental properties are for the most part
     * unknown due to its short half-life times and small producible quantities.
     */
    Cn("copernicium", 12, 7, 285, Double.NaN, Double.NaN, Double.NaN, ElementCategory.UNKNOWN,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1143/JPSJ.73.2593">Nihonium</a> is named after
     * Japan. Its experimental properties are still largely unknown due to its short
     * half-life times and small producible quantities. It is rather close to the
     * "island of stability", which explains some of the anomalously long half-life
     * times (still only on the order of seconds).
     */
    Nh("nihonium", 13, 7, 286, Double.NaN, Double.NaN, Double.NaN, ElementCategory.UNKNOWN,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRevLett.83.3154">Flerovium</a> is named
     * after the Flerov Laboratory of Nuclear Reactions of the Joint Institute for
     * Nuclear Research in Dubna, Russia. Its chemical properties are partially
     * known, <a href="https://doi.org/10.1524/ract.2010.1705">indicating</a> that
     * it is quite volatile. It is expected to be near the center of the "island of
     * stability".
     */
    Fl("flerovium", 14, 7, 289, Double.NaN, Double.NaN, Double.NaN, ElementCategory.UNKNOWN,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRevC.69.021601">Moscovium</a> is named
     * after Moscow, Russia. Its experimental properties are still unknown due to
     * its short half-life times.
     */
    Mc("moscovium", 15, 7, 290, Double.NaN, Double.NaN, Double.NaN, ElementCategory.UNKNOWN,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRevC.63.011301">Livermorium</a> is named
     * after the Lawrence Livermore National Laboratory in the United States, which
     * was one of the institutes that, in cooperation, discovered the element. Its
     * experimental properties are still unknown due to its short half-life times.
     */
    Lv("livermorium", 16, 7, 293, Double.NaN, Double.NaN, Double.NaN, ElementCategory.UNKNOWN,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRevLett.104.142502">Tennessine</a> is
     * named after Tennessee, United States. Its experimental properties are
     * unknown, but predictions are available. It is located near the "island of
     * stability", leading to comparably long half-life times.
     */
    Ts("tennessine", 17, 7, 294, Double.NaN, Double.NaN, Double.NaN, ElementCategory.UNKNOWN,
            NaturalOccurence.SYNTHETIC),

    /**
     * <a href="https://doi.org/10.1103/PhysRevC.74.044602">Oganesson</a> is named
     * after Yuri Oganessian. Its properties are largely unknown, as only a handful
     * of atoms have been synthesized.
     */
    Og("oganesson", 18, 7, 294, Double.NaN, Double.NaN, Double.NaN, ElementCategory.UNKNOWN,
            NaturalOccurence.SYNTHETIC);

    /** The IUPAC name of the element. */
    private String name;

    /** The IUPAC group of the element. */
    private double group;

    /** The period (i.e., the row in the periodic table). */
    private int period;

    /** The average atomic mass in Dalton. */
    private double avgAtomicMass;

    /** The covalent radius in picometer. */
    private double covalentRadius;

    /** The van der Waals radius in picometer. */
    private double vdWRadius;

    /** The Pauling electronegativity. */
    private double electroNegativity;

    /** The category to which the element belongs. */
    private ElementCategory prop;

    /** Describes how the element occurs. */
    private NaturalOccurence occurence;

    /** Isotopes corresponding to the element. */
    private List<Isotope> isotopes;

    /**
     * Constructor for a new element.
     * 
     * @param name              the full name of the element
     * @param group             the IUPAC group
     * @param period            the period in the periodic table
     * @param avgAtomicMass     the average atomic mass in Dalton
     * @param covalentRadius    the covalent radius in picometer
     * @param vdWRadius         the van der Waals radius in picometer
     * @param electroNegativity the Pauling electronegativity
     * @param prop              the category
     * @param occurence         the natural occurence
     */
    Element(String name, double group, int period, double avgAtomicMass, double covalentRadius, double vdWRadius,
            double electroNegativity, ElementCategory prop, NaturalOccurence occurence) {
        this.name = name;
        this.group = group;
        this.period = period;
        this.avgAtomicMass = avgAtomicMass;
        this.covalentRadius = covalentRadius;
        this.vdWRadius = vdWRadius;
        this.electroNegativity = electroNegativity;
        this.prop = prop;
        this.occurence = occurence;
    }

    /**
     * Gets the full name of the element, e.g. "Hydrogen".
     * 
     * @return the full name
     */
    public String fullName() {
        return name;
    }

    /**
     * Gets the IUPAC group number. Elements in no group will return
     * {@link Double#NaN NaN}.
     * 
     * @return the IUPAC group number
     */
    public double group() {
        return group;
    }

    /**
     * Gets the period, i.e. the row in the periodic table in which the element
     * resides.
     * 
     * @return the period
     */
    public int period() {
        return period;
    }

    /**
     * Gets the average mass (for the very high atomic number elements this is the
     * mass of the most stable isotope) in atomic units (see unified atomic mass
     * unit).
     * 
     * @return the average mass in Dalton
     */
    @Override
    public double mass() {
        return avgAtomicMass;
    }

    /**
     * Gets the covalent radius in picometer.
     * 
     * @return the covalent radius
     * @see <a href="https://doi.org/10.1039%2Fb801115j">Covalent radii
     *      revisited</a>
     */
    public double covalentRadius() {
        return covalentRadius;
    }

    /**
     * Gets the (experimental) van der Waals radius in picometer.
     * 
     * @return the van der Waals radius
     * @see <a href="https://doi.org/10.1021%2Fj100785a001">van der Waals Volumes and Radii</a>
     * @see <a href="https://doi.org/10.1021%2Fjp8111556">Consistent van der Waals Radii for the Whole Main Group</a>
     */
    public double vanderWaalsRadius() {
        return vdWRadius;
    }

    /**
     * Gets the Pauling electronegativity.
     * 
     * @return the Pauling electronegativity
     */
    public double electronegativity() {
        return electroNegativity;
    }

    /**
     * Gets the ChemicalProperties of the element.
     * 
     * @return the ChemicalProperties
     */
    public ElementCategory category() {
        return prop;
    }

    /**
     * Gets the NaturalOccurence of the element.
     * 
     * @return the NaturalOccurence
     */
    public NaturalOccurence occurence() {
        return occurence;
    }

    /**
     * Gets the atomic number, so e.g. C has an atomic number of 6.
     * 
     * @return the atomic number
     */
    public int atomicNumber() {
        return ordinal() + 1;
    }

    /**
     * Gets the element from the given atomic number.
     * 
     * @param atomicNumber the atomic number
     * @return the corresponding element
     */
    public static final Element withAtomicNumber(int atomicNumber) {
        for (Element element : values()) {
            if (element.atomicNumber() == atomicNumber) {
                return element;
            }
        }

        throw new IllegalArgumentException("Found no element with an atomic number of " + atomicNumber);
    }

    /**
     * Checks whether an element with the given name exists.
     * 
     * @param name the name, e.g. "C" or "Carbon"
     * @return {@code true} if such a named element exists
     */
    public static final boolean isElement(String name) {
        return name != null && parseName(name) != null;
    }

    /**
     * Gets the element from the given name.
     * 
     * @param name the name, e.g. "C" or "Carbon", not {@code null}
     * @return the corresponding element
     * @throws NullPointerException     if {@code name} is {@code null}
     * @throws IllegalArgumentException if no element with the given {@code name}
     *                                  was found
     */
    public static final Element named(String name) {
        Objects.requireNonNull(name);

        Element e = parseName(name);

        if (e == null) {
            throw new IllegalArgumentException("Found no element named '" + name + "'");
        }

        return e;
    }

    /**
     * Parses the given name and returns the matching element, if found.
     * 
     * @param name the name, e.g. "C" or "Carbon"
     * @return the corresponding element or null if no matching element has been
     *         found
     */
    static final Element parseName(String name) {
        for (Element element : values()) {
            if (element.name().equals(name) || element.fullName().equalsIgnoreCase(name)) {
                return element;
            }
        }

        // special cases
        if ("aluminum".equalsIgnoreCase(name)) return Al;
        if ("sulphur".equalsIgnoreCase(name)) return S;
        if ("cesium".equalsIgnoreCase(name)) return Cs;

        return null;
    }

    /**
     * Gets all elements that share the specified chemcial properties.
     * 
     * @param prop the ChemicalProperties for which you want all elements
     * @return the elements that share prop
     */
    public static List<Element> get(ElementCategory prop) {
        List<Element> ret = new ArrayList<>();
        for (Element elem : values()) {
            if (elem.category() == prop) ret.add(elem);
        }
        return ret;
    }

    /**
     * Gets all elements that share the specified natural occurence.
     * 
     * @param occurrence the NaturalOccurence for which you want all elements
     * @return the elements that share occurrence
     */
    public static List<Element> get(NaturalOccurence occurrence) {
        List<Element> ret = new ArrayList<>();
        for (Element elem : values()) {
            if (elem.occurence() == occurrence) ret.add(elem);
        }
        return ret;
    }

    /**
     * Gets all known isotopes.
     * 
     * @return the corresponding isotopes
     */
    public List<Isotope> isotopes() {
        // cannot go in the constructor, as we have circularity then
        if (isotopes == null) isotopes = Isotope.ofElement(this);
        return isotopes;
    }

    @Override public Element element() { return this; }
    @Override public boolean isIsotope() { return false; }
    @Override public Set<Nuclide> nuclides() { return Set.of(this); }
}
