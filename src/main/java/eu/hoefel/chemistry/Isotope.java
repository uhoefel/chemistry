package eu.hoefel.chemistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * All known isotopes (excluding elements!).
 * Based on <a href="https://www.nist.gov/pml/atomic-weights-and-isotopic-compositions-relative-atomic-masses">NIST data</a>.
 *
 * @see Element
 * @see Nuclide
 */
public sealed interface Isotope extends Nuclide {

	/** Hydrogen (cf. {@link Element#H}) isotopes. */
	public enum H implements Isotope {

		/** Deuterium */          D(  2.014101778120000),
		/** Tritium */            T(  3.016049277900000),
		/** Hydrogen 4 */        H4(  4.026430000000000),
		/** Hydrogen 5 */        H5(  5.035311000000000),
		/** Hydrogen 6 */        H6(  6.044960000000000),
		/** Hydrogen 7 */        H7(  7.052700000000000),;

		private double atomicMass;

		H(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.H; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Helium (cf. {@link Element#He}) isotopes. */
	public enum He implements Isotope {

		/** Helium 3 */         He3(  3.016029320100000),
		/** Helium 5 */         He5(  5.012057000000000),
		/** Helium 6 */         He6(  6.018885891000000),
		/** Helium 7 */         He7(  7.027990700000000),
		/** Helium 8 */         He8(  8.033934390000000),
		/** Helium 9 */         He9(  9.043946000000000),
		/** Helium 10 */       He10( 10.052790000000000),;

		private double atomicMass;

		He(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.He; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Lithium (cf. {@link Element#Li}) isotopes. */
	public enum Li implements Isotope {

		/** Lithium 3 */        Li3(  3.030800000000000),
		/** Lithium 4 */        Li4(  4.027190000000000),
		/** Lithium 5 */        Li5(  5.012538000000000),
		/** Lithium 6 */        Li6(  6.015122887400000),
		/** Lithium 8 */        Li8(  8.022486246000000),
		/** Lithium 9 */        Li9(  9.026790190000000),
		/** Lithium 10 */      Li10( 10.035483000000000),
		/** Lithium 11 */      Li11( 11.043723580000000),
		/** Lithium 12 */      Li12( 12.052517000000000),
		/** Lithium 13 */      Li13( 13.062630000000000),;

		private double atomicMass;

		Li(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Li; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Beryllium (cf. {@link Element#Be}) isotopes. */
	public enum Be implements Isotope {

		/** Beryllium 5 */      Be5(  5.039900000000000),
		/** Beryllium 6 */      Be6(  6.019726400000000),
		/** Beryllium 7 */      Be7(  7.016928717000000),
		/** Beryllium 8 */      Be8(  8.005305102000000),
		/** Beryllium 10 */    Be10( 10.013534695000000),
		/** Beryllium 11 */    Be11( 11.021661080000000),
		/** Beryllium 12 */    Be12( 12.026922100000000),
		/** Beryllium 13 */    Be13( 13.036135000000000),
		/** Beryllium 14 */    Be14( 14.042890000000000),
		/** Beryllium 15 */    Be15( 15.053420000000000),
		/** Beryllium 16 */    Be16( 16.061670000000000),;

		private double atomicMass;

		Be(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Be; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Boron (cf. {@link Element#B}) isotopes. */
	public enum B implements Isotope {

		/** Boron 6 */           B6(  6.050800000000000),
		/** Boron 7 */           B7(  7.029712000000000),
		/** Boron 8 */           B8(  8.024607300000000),
		/** Boron 9 */           B9(  9.013329650000000),
		/** Boron 10 */         B10( 10.012936950000000),
		/** Boron 12 */         B12( 12.014352700000000),
		/** Boron 13 */         B13( 13.017780200000000),
		/** Boron 14 */         B14( 14.025404000000000),
		/** Boron 15 */         B15( 15.031088000000000),
		/** Boron 16 */         B16( 16.039842000000000),
		/** Boron 17 */         B17( 17.046990000000000),
		/** Boron 18 */         B18( 18.055660000000000),
		/** Boron 19 */         B19( 19.063100000000000),
		/** Boron 20 */         B20( 20.072070000000000),
		/** Boron 21 */         B21( 21.081290000000000),;

		private double atomicMass;

		B(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.B; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Carbon (cf. {@link Element#C}) isotopes. */
	public enum C implements Isotope {

		/** Carbon 8 */          C8(  8.037643000000000),
		/** Carbon 9 */          C9(  9.031037200000000),
		/** Carbon 10 */        C10( 10.016853310000000),
		/** Carbon 11 */        C11( 11.011433600000000),
		/** Carbon 13 */        C13( 13.003354835070000),
		/** Carbon 14 */        C14( 14.003241988400000),
		/** Carbon 15 */        C15( 15.010599260000000),
		/** Carbon 16 */        C16( 16.014701300000000),
		/** Carbon 17 */        C17( 17.022577000000000),
		/** Carbon 18 */        C18( 18.026751000000000),
		/** Carbon 19 */        C19( 19.034800000000000),
		/** Carbon 20 */        C20( 20.040320000000000),
		/** Carbon 21 */        C21( 21.049000000000000),
		/** Carbon 22 */        C22( 22.057530000000000),
		/** Carbon 23 */        C23( 23.068900000000000),;

		private double atomicMass;

		C(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.C; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Nitrogen (cf. {@link Element#N}) isotopes. */
	public enum N implements Isotope {

		/** Nitrogen 10 */      N10( 10.041650000000000),
		/** Nitrogen 11 */      N11( 11.026091000000000),
		/** Nitrogen 12 */      N12( 12.018613200000000),
		/** Nitrogen 13 */      N13( 13.005738610000000),
		/** Nitrogen 15 */      N15( 15.000108898880000),
		/** Nitrogen 16 */      N16( 16.006101900000000),
		/** Nitrogen 17 */      N17( 17.008449000000000),
		/** Nitrogen 18 */      N18( 18.014078000000000),
		/** Nitrogen 19 */      N19( 19.017022000000000),
		/** Nitrogen 20 */      N20( 20.023366000000000),
		/** Nitrogen 21 */      N21( 21.027110000000000),
		/** Nitrogen 22 */      N22( 22.034390000000000),
		/** Nitrogen 23 */      N23( 23.041140000000000),
		/** Nitrogen 24 */      N24( 24.050390000000000),
		/** Nitrogen 25 */      N25( 25.060100000000000),;

		private double atomicMass;

		N(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.N; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Oxygen (cf. {@link Element#O}) isotopes. */
	public enum O implements Isotope {

		/** Oxygen 12 */        O12( 12.034262000000000),
		/** Oxygen 13 */        O13( 13.024815000000000),
		/** Oxygen 14 */        O14( 14.008596360000000),
		/** Oxygen 15 */        O15( 15.003065620000000),
		/** Oxygen 17 */        O17( 16.999131756500000),
		/** Oxygen 18 */        O18( 17.999159612860000),
		/** Oxygen 19 */        O19( 19.003578000000000),
		/** Oxygen 20 */        O20( 20.004075350000000),
		/** Oxygen 21 */        O21( 21.008655000000000),
		/** Oxygen 22 */        O22( 22.009966000000000),
		/** Oxygen 23 */        O23( 23.015696000000000),
		/** Oxygen 24 */        O24( 24.019860000000000),
		/** Oxygen 25 */        O25( 25.029360000000000),
		/** Oxygen 26 */        O26( 26.037290000000000),
		/** Oxygen 27 */        O27( 27.047720000000000),
		/** Oxygen 28 */        O28( 28.055910000000000),;

		private double atomicMass;

		O(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.O; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Fluorine (cf. {@link Element#F}) isotopes. */
	public enum F implements Isotope {

		/** Fluorine 14 */      F14( 14.034315000000000),
		/** Fluorine 15 */      F15( 15.018043000000000),
		/** Fluorine 16 */      F16( 16.011465700000000),
		/** Fluorine 17 */      F17( 17.002095240000000),
		/** Fluorine 18 */      F18( 18.000937330000000),
		/** Fluorine 20 */      F20( 19.999981252000000),
		/** Fluorine 21 */      F21( 20.999948900000000),
		/** Fluorine 22 */      F22( 22.002999000000000),
		/** Fluorine 23 */      F23( 23.003557000000000),
		/** Fluorine 24 */      F24( 24.008115000000000),
		/** Fluorine 25 */      F25( 25.012199000000000),
		/** Fluorine 26 */      F26( 26.020038000000000),
		/** Fluorine 27 */      F27( 27.026440000000000),
		/** Fluorine 28 */      F28( 28.035340000000000),
		/** Fluorine 29 */      F29( 29.042540000000000),
		/** Fluorine 30 */      F30( 30.051650000000000),
		/** Fluorine 31 */      F31( 31.059710000000000),;

		private double atomicMass;

		F(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.F; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Neon (cf. {@link Element#Ne}) isotopes. */
	public enum Ne implements Isotope {

		/** Neon 16 */         Ne16( 16.025750000000000),
		/** Neon 17 */         Ne17( 17.017713960000000),
		/** Neon 18 */         Ne18( 18.005708700000000),
		/** Neon 19 */         Ne19( 19.001880910000000),
		/** Neon 21 */         Ne21( 20.993846685000000),
		/** Neon 22 */         Ne22( 21.991385114000000),
		/** Neon 23 */         Ne23( 22.994466910000000),
		/** Neon 24 */         Ne24( 23.993610650000000),
		/** Neon 25 */         Ne25( 24.997789000000000),
		/** Neon 26 */         Ne26( 26.000515000000000),
		/** Neon 27 */         Ne27( 27.007553000000000),
		/** Neon 28 */         Ne28( 28.012120000000000),
		/** Neon 29 */         Ne29( 29.019750000000000),
		/** Neon 30 */         Ne30( 30.024730000000000),
		/** Neon 31 */         Ne31( 31.033100000000000),
		/** Neon 32 */         Ne32( 32.039720000000000),
		/** Neon 33 */         Ne33( 33.049380000000000),
		/** Neon 34 */         Ne34( 34.056730000000000),;

		private double atomicMass;

		Ne(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ne; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Sodium (cf. {@link Element#Na}) isotopes. */
	public enum Na implements Isotope {

		/** Sodium 18 */       Na18( 18.026880000000000),
		/** Sodium 19 */       Na19( 19.013880000000000),
		/** Sodium 20 */       Na20( 20.007354400000000),
		/** Sodium 21 */       Na21( 20.997654690000000),
		/** Sodium 22 */       Na22( 21.994437410000000),
		/** Sodium 24 */       Na24( 23.990962950000000),
		/** Sodium 25 */       Na25( 24.989954000000000),
		/** Sodium 26 */       Na26( 25.992634600000000),
		/** Sodium 27 */       Na27( 26.994076500000000),
		/** Sodium 28 */       Na28( 27.998939000000000),
		/** Sodium 29 */       Na29( 29.002877100000000),
		/** Sodium 30 */       Na30( 30.009097900000000),
		/** Sodium 31 */       Na31( 31.013163000000000),
		/** Sodium 32 */       Na32( 32.020190000000000),
		/** Sodium 33 */       Na33( 33.025730000000000),
		/** Sodium 34 */       Na34( 34.033590000000000),
		/** Sodium 35 */       Na35( 35.040620000000000),
		/** Sodium 36 */       Na36( 36.049290000000000),
		/** Sodium 37 */       Na37( 37.057050000000000),;

		private double atomicMass;

		Na(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Na; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Magnesium (cf. {@link Element#Mg}) isotopes. */
	public enum Mg implements Isotope {

		/** Magnesium 19 */    Mg19( 19.034169000000000),
		/** Magnesium 20 */    Mg20( 20.018850000000000),
		/** Magnesium 21 */    Mg21( 21.011716000000000),
		/** Magnesium 22 */    Mg22( 21.999570650000000),
		/** Magnesium 23 */    Mg23( 22.994124210000000),
		/** Magnesium 25 */    Mg25( 24.985836976000000),
		/** Magnesium 26 */    Mg26( 25.982592968000000),
		/** Magnesium 27 */    Mg27( 26.984340624000000),
		/** Magnesium 28 */    Mg28( 27.983876700000000),
		/** Magnesium 29 */    Mg29( 28.988617000000000),
		/** Magnesium 30 */    Mg30( 29.990462900000000),
		/** Magnesium 31 */    Mg31( 30.996648000000000),
		/** Magnesium 32 */    Mg32( 31.999110200000000),
		/** Magnesium 33 */    Mg33( 33.005327100000000),
		/** Magnesium 34 */    Mg34( 34.008935000000000),
		/** Magnesium 35 */    Mg35( 35.016790000000000),
		/** Magnesium 36 */    Mg36( 36.021880000000000),
		/** Magnesium 37 */    Mg37( 37.030370000000000),
		/** Magnesium 38 */    Mg38( 38.036580000000000),
		/** Magnesium 39 */    Mg39( 39.045380000000000),
		/** Magnesium 40 */    Mg40( 40.052180000000000),;

		private double atomicMass;

		Mg(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Mg; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Aluminium (cf. {@link Element#Al}) isotopes. */
	public enum Al implements Isotope {

		/** Aluminium 21 */    Al21( 21.028970000000000),
		/** Aluminium 22 */    Al22( 22.019540000000000),
		/** Aluminium 23 */    Al23( 23.007244350000000),
		/** Aluminium 24 */    Al24( 23.999948900000000),
		/** Aluminium 25 */    Al25( 24.990428100000000),
		/** Aluminium 26 */    Al26( 25.986891904000000),
		/** Aluminium 28 */    Al28( 27.981910210000000),
		/** Aluminium 29 */    Al29( 28.980456500000000),
		/** Aluminium 30 */    Al30( 29.982960000000000),
		/** Aluminium 31 */    Al31( 30.983945000000000),
		/** Aluminium 32 */    Al32( 31.988085000000000),
		/** Aluminium 33 */    Al33( 32.990909000000000),
		/** Aluminium 34 */    Al34( 33.996705000000000),
		/** Aluminium 35 */    Al35( 34.999764000000000),
		/** Aluminium 36 */    Al36( 36.006390000000000),
		/** Aluminium 37 */    Al37( 37.010530000000000),
		/** Aluminium 38 */    Al38( 38.017400000000000),
		/** Aluminium 39 */    Al39( 39.022540000000000),
		/** Aluminium 40 */    Al40( 40.030030000000000),
		/** Aluminium 41 */    Al41( 41.036380000000000),
		/** Aluminium 42 */    Al42( 42.043840000000000),
		/** Aluminium 43 */    Al43( 43.051470000000000),;

		private double atomicMass;

		Al(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Al; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Silicon (cf. {@link Element#Si}) isotopes. */
	public enum Si implements Isotope {

		/** Silicon 22 */      Si22( 22.035790000000000),
		/** Silicon 23 */      Si23( 23.025440000000000),
		/** Silicon 24 */      Si24( 24.011535000000000),
		/** Silicon 25 */      Si25( 25.004109000000000),
		/** Silicon 26 */      Si26( 25.992333840000000),
		/** Silicon 27 */      Si27( 26.986704810000000),
		/** Silicon 29 */      Si29( 28.976494664900000),
		/** Silicon 30 */      Si30( 29.973770136000000),
		/** Silicon 31 */      Si31( 30.975363194000000),
		/** Silicon 32 */      Si32( 31.974151540000000),
		/** Silicon 33 */      Si33( 32.977976960000000),
		/** Silicon 34 */      Si34( 33.978576000000000),
		/** Silicon 35 */      Si35( 34.984583000000000),
		/** Silicon 36 */      Si36( 35.986695000000000),
		/** Silicon 37 */      Si37( 36.992921000000000),
		/** Silicon 38 */      Si38( 37.995523000000000),
		/** Silicon 39 */      Si39( 39.002491000000000),
		/** Silicon 40 */      Si40( 40.005830000000000),
		/** Silicon 41 */      Si41( 41.013010000000000),
		/** Silicon 42 */      Si42( 42.017780000000000),
		/** Silicon 43 */      Si43( 43.024800000000000),
		/** Silicon 44 */      Si44( 44.030610000000000),
		/** Silicon 45 */      Si45( 45.039950000000000),;

		private double atomicMass;

		Si(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Si; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Phosphorus (cf. {@link Element#P}) isotopes. */
	public enum P implements Isotope {

		/** Phosphorus 24 */    P24( 24.035770000000000),
		/** Phosphorus 25 */    P25( 25.021190000000000),
		/** Phosphorus 26 */    P26( 26.011780000000000),
		/** Phosphorus 27 */    P27( 26.999224000000000),
		/** Phosphorus 28 */    P28( 27.992326600000000),
		/** Phosphorus 29 */    P29( 28.981800790000000),
		/** Phosphorus 30 */    P30( 29.978313750000000),
		/** Phosphorus 32 */    P32( 31.973907643000000),
		/** Phosphorus 33 */    P33( 32.971725700000000),
		/** Phosphorus 34 */    P34( 33.973645890000000),
		/** Phosphorus 35 */    P35( 34.973314100000000),
		/** Phosphorus 36 */    P36( 35.978260000000000),
		/** Phosphorus 37 */    P37( 36.979607000000000),
		/** Phosphorus 38 */    P38( 37.984252000000000),
		/** Phosphorus 39 */    P39( 38.986227000000000),
		/** Phosphorus 40 */    P40( 39.991330000000000),
		/** Phosphorus 41 */    P41( 40.994654000000000),
		/** Phosphorus 42 */    P42( 42.001080000000000),
		/** Phosphorus 43 */    P43( 43.005020000000000),
		/** Phosphorus 44 */    P44( 44.011210000000000),
		/** Phosphorus 45 */    P45( 45.016450000000000),
		/** Phosphorus 46 */    P46( 46.024460000000000),
		/** Phosphorus 47 */    P47( 47.031390000000000),;

		private double atomicMass;

		P(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.P; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Sulfur (cf. {@link Element#S}) isotopes. */
	public enum S implements Isotope {

		/** Sulfur 26 */        S26( 26.029070000000000),
		/** Sulfur 27 */        S27( 27.018280000000000),
		/** Sulfur 28 */        S28( 28.004370000000000),
		/** Sulfur 29 */        S29( 28.996611000000000),
		/** Sulfur 30 */        S30( 29.984907030000000),
		/** Sulfur 31 */        S31( 30.979557010000000),
		/** Sulfur 33 */        S33( 32.971458909800000),
		/** Sulfur 34 */        S34( 33.967867004000000),
		/** Sulfur 35 */        S35( 34.969032310000000),
		/** Sulfur 36 */        S36( 35.967080710000000),
		/** Sulfur 37 */        S37( 36.971125510000000),
		/** Sulfur 38 */        S38( 37.971163300000000),
		/** Sulfur 39 */        S39( 38.975134000000000),
		/** Sulfur 40 */        S40( 39.975482600000000),
		/** Sulfur 41 */        S41( 40.979593500000000),
		/** Sulfur 42 */        S42( 41.981065100000000),
		/** Sulfur 43 */        S43( 42.986907600000000),
		/** Sulfur 44 */        S44( 43.990118800000000),
		/** Sulfur 45 */        S45( 44.995720000000000),
		/** Sulfur 46 */        S46( 46.000040000000000),
		/** Sulfur 47 */        S47( 47.007950000000000),
		/** Sulfur 48 */        S48( 48.013700000000000),
		/** Sulfur 49 */        S49( 49.022760000000000),;

		private double atomicMass;

		S(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.S; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Chlorine (cf. {@link Element#Cl}) isotopes. */
	public enum Cl implements Isotope {

		/** Chlorine 28 */     Cl28( 28.029540000000000),
		/** Chlorine 29 */     Cl29( 29.014780000000000),
		/** Chlorine 30 */     Cl30( 30.004770000000000),
		/** Chlorine 31 */     Cl31( 30.992414000000000),
		/** Chlorine 32 */     Cl32( 31.985684640000000),
		/** Chlorine 33 */     Cl33( 32.977451990000000),
		/** Chlorine 34 */     Cl34( 33.973762485000000),
		/** Chlorine 36 */     Cl36( 35.968306809000000),
		/** Chlorine 37 */     Cl37( 36.965902602000000),
		/** Chlorine 38 */     Cl38( 37.968010440000000),
		/** Chlorine 39 */     Cl39( 38.968008200000000),
		/** Chlorine 40 */     Cl40( 39.970415000000000),
		/** Chlorine 41 */     Cl41( 40.970685000000000),
		/** Chlorine 42 */     Cl42( 41.973250000000000),
		/** Chlorine 43 */     Cl43( 42.973890000000000),
		/** Chlorine 44 */     Cl44( 43.977870000000000),
		/** Chlorine 45 */     Cl45( 44.980290000000000),
		/** Chlorine 46 */     Cl46( 45.985170000000000),
		/** Chlorine 47 */     Cl47( 46.989160000000000),
		/** Chlorine 48 */     Cl48( 47.995640000000000),
		/** Chlorine 49 */     Cl49( 49.001230000000000),
		/** Chlorine 50 */     Cl50( 50.009050000000000),
		/** Chlorine 51 */     Cl51( 51.015540000000000),;

		private double atomicMass;

		Cl(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Cl; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Argon (cf. {@link Element#Ar}) isotopes. */
	public enum Ar implements Isotope {

		/** Argon 30 */        Ar30( 30.023070000000000),
		/** Argon 31 */        Ar31( 31.012120000000000),
		/** Argon 32 */        Ar32( 31.997637800000000),
		/** Argon 33 */        Ar33( 32.989925550000000),
		/** Argon 34 */        Ar34( 33.980270090000000),
		/** Argon 35 */        Ar35( 34.975257590000000),
		/** Argon 36 */        Ar36( 35.967545105000000),
		/** Argon 37 */        Ar37( 36.966776330000000),
		/** Argon 38 */        Ar38( 37.962732110000000),
		/** Argon 39 */        Ar39( 38.964313000000000),
		/** Argon 41 */        Ar41( 40.964500570000000),
		/** Argon 42 */        Ar42( 41.963045700000000),
		/** Argon 43 */        Ar43( 42.965636100000000),
		/** Argon 44 */        Ar44( 43.964923800000000),
		/** Argon 45 */        Ar45( 44.968039730000000),
		/** Argon 46 */        Ar46( 45.968083000000000),
		/** Argon 47 */        Ar47( 46.972935000000000),
		/** Argon 48 */        Ar48( 47.975910000000000),
		/** Argon 49 */        Ar49( 48.981900000000000),
		/** Argon 50 */        Ar50( 49.986130000000000),
		/** Argon 51 */        Ar51( 50.993700000000000),
		/** Argon 52 */        Ar52( 51.998960000000000),
		/** Argon 53 */        Ar53( 53.007290000000000),;

		private double atomicMass;

		Ar(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ar; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Potassium (cf. {@link Element#K}) isotopes. */
	public enum K implements Isotope {

		/** Potassium 32 */     K32( 32.022650000000000),
		/** Potassium 33 */     K33( 33.007560000000000),
		/** Potassium 34 */     K34( 33.998690000000000),
		/** Potassium 35 */     K35( 34.988005410000000),
		/** Potassium 36 */     K36( 35.981302010000000),
		/** Potassium 37 */     K37( 36.973375890000000),
		/** Potassium 38 */     K38( 37.969081120000000),
		/** Potassium 40 */     K40( 39.963998166000000),
		/** Potassium 41 */     K41( 40.961825257900000),
		/** Potassium 42 */     K42( 41.962402310000000),
		/** Potassium 43 */     K43( 42.960734700000000),
		/** Potassium 44 */     K44( 43.961586990000000),
		/** Potassium 45 */     K45( 44.960691490000000),
		/** Potassium 46 */     K46( 45.961981590000000),
		/** Potassium 47 */     K47( 46.961661600000000),
		/** Potassium 48 */     K48( 47.965341190000000),
		/** Potassium 49 */     K49( 48.968210750000000),
		/** Potassium 50 */     K50( 49.972380000000000),
		/** Potassium 51 */     K51( 50.975828000000000),
		/** Potassium 52 */     K52( 51.982240000000000),
		/** Potassium 53 */     K53( 52.987460000000000),
		/** Potassium 54 */     K54( 53.994630000000000),
		/** Potassium 55 */     K55( 55.000760000000000),
		/** Potassium 56 */     K56( 56.008510000000000),;

		private double atomicMass;

		K(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.K; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Calcium (cf. {@link Element#Ca}) isotopes. */
	public enum Ca implements Isotope {

		/** Calcium 34 */      Ca34( 34.014870000000000),
		/** Calcium 35 */      Ca35( 35.005140000000000),
		/** Calcium 36 */      Ca36( 35.993074000000000),
		/** Calcium 37 */      Ca37( 36.985897850000000),
		/** Calcium 38 */      Ca38( 37.976319220000000),
		/** Calcium 39 */      Ca39( 38.970710810000000),
		/** Calcium 41 */      Ca41( 40.962277920000000),
		/** Calcium 42 */      Ca42( 41.958617830000000),
		/** Calcium 43 */      Ca43( 42.958766440000000),
		/** Calcium 44 */      Ca44( 43.955481560000000),
		/** Calcium 45 */      Ca45( 44.956186350000000),
		/** Calcium 46 */      Ca46( 45.953689000000000),
		/** Calcium 47 */      Ca47( 46.954542400000000),
		/** Calcium 48 */      Ca48( 47.952522760000000),
		/** Calcium 49 */      Ca49( 48.955662740000000),
		/** Calcium 50 */      Ca50( 49.957499200000000),
		/** Calcium 51 */      Ca51( 50.960989000000000),
		/** Calcium 52 */      Ca52( 51.963217000000000),
		/** Calcium 53 */      Ca53( 52.969450000000000),
		/** Calcium 54 */      Ca54( 53.973400000000000),
		/** Calcium 55 */      Ca55( 54.980300000000000),
		/** Calcium 56 */      Ca56( 55.985080000000000),
		/** Calcium 57 */      Ca57( 56.992620000000000),
		/** Calcium 58 */      Ca58( 57.997940000000000),;

		private double atomicMass;

		Ca(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ca; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Scandium (cf. {@link Element#Sc}) isotopes. */
	public enum Sc implements Isotope {

		/** Scandium 36 */     Sc36( 36.016480000000000),
		/** Scandium 37 */     Sc37( 37.003740000000000),
		/** Scandium 38 */     Sc38( 37.995120000000000),
		/** Scandium 39 */     Sc39( 38.984785000000000),
		/** Scandium 40 */     Sc40( 39.977967300000000),
		/** Scandium 41 */     Sc41( 40.969251105000000),
		/** Scandium 42 */     Sc42( 41.965516530000000),
		/** Scandium 43 */     Sc43( 42.961150500000000),
		/** Scandium 44 */     Sc44( 43.959402900000000),
		/** Scandium 46 */     Sc46( 45.955168260000000),
		/** Scandium 47 */     Sc47( 46.952403700000000),
		/** Scandium 48 */     Sc48( 47.952223600000000),
		/** Scandium 49 */     Sc49( 48.950014600000000),
		/** Scandium 50 */     Sc50( 49.952176000000000),
		/** Scandium 51 */     Sc51( 50.953592000000000),
		/** Scandium 52 */     Sc52( 51.956880000000000),
		/** Scandium 53 */     Sc53( 52.959090000000000),
		/** Scandium 54 */     Sc54( 53.963930000000000),
		/** Scandium 55 */     Sc55( 54.967820000000000),
		/** Scandium 56 */     Sc56( 55.973450000000000),
		/** Scandium 57 */     Sc57( 56.977770000000000),
		/** Scandium 58 */     Sc58( 57.984030000000000),
		/** Scandium 59 */     Sc59( 58.988940000000000),
		/** Scandium 60 */     Sc60( 59.995650000000000),
		/** Scandium 61 */     Sc61( 61.001000000000000),;

		private double atomicMass;

		Sc(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Sc; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Titanium (cf. {@link Element#Ti}) isotopes. */
	public enum Ti implements Isotope {

		/** Titanium 38 */     Ti38( 38.011450000000000),
		/** Titanium 39 */     Ti39( 39.002360000000000),
		/** Titanium 40 */     Ti40( 39.990500000000000),
		/** Titanium 41 */     Ti41( 40.983148000000000),
		/** Titanium 42 */     Ti42( 41.973049030000000),
		/** Titanium 43 */     Ti43( 42.968522500000000),
		/** Titanium 44 */     Ti44( 43.959689950000000),
		/** Titanium 45 */     Ti45( 44.958121980000000),
		/** Titanium 46 */     Ti46( 45.952627720000000),
		/** Titanium 47 */     Ti47( 46.951758790000000),
		/** Titanium 49 */     Ti49( 48.947865680000000),
		/** Titanium 50 */     Ti50( 49.944786890000000),
		/** Titanium 51 */     Ti51( 50.946610650000000),
		/** Titanium 52 */     Ti52( 51.946893000000000),
		/** Titanium 53 */     Ti53( 52.949730000000000),
		/** Titanium 54 */     Ti54( 53.951050000000000),
		/** Titanium 55 */     Ti55( 54.955270000000000),
		/** Titanium 56 */     Ti56( 55.957910000000000),
		/** Titanium 57 */     Ti57( 56.963640000000000),
		/** Titanium 58 */     Ti58( 57.966600000000000),
		/** Titanium 59 */     Ti59( 58.972470000000000),
		/** Titanium 60 */     Ti60( 59.976030000000000),
		/** Titanium 61 */     Ti61( 60.982450000000000),
		/** Titanium 62 */     Ti62( 61.986510000000000),
		/** Titanium 63 */     Ti63( 62.993750000000000),;

		private double atomicMass;

		Ti(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ti; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Vanadium (cf. {@link Element#V}) isotopes. */
	public enum V implements Isotope {

		/** Vanadium 40 */      V40( 40.012760000000000),
		/** Vanadium 41 */      V41( 41.000210000000000),
		/** Vanadium 42 */      V42( 41.991820000000000),
		/** Vanadium 43 */      V43( 42.980766000000000),
		/** Vanadium 44 */      V44( 43.974110000000000),
		/** Vanadium 45 */      V45( 44.965774800000000),
		/** Vanadium 46 */      V46( 45.960198780000000),
		/** Vanadium 47 */      V47( 46.954904910000000),
		/** Vanadium 48 */      V48( 47.952252200000000),
		/** Vanadium 49 */      V49( 48.948511800000000),
		/** Vanadium 50 */      V50( 49.947156010000000),
		/** Vanadium 52 */      V52( 51.944773010000000),
		/** Vanadium 53 */      V53( 52.944336700000000),
		/** Vanadium 54 */      V54( 53.946439000000000),
		/** Vanadium 55 */      V55( 54.947240000000000),
		/** Vanadium 56 */      V56( 55.950480000000000),
		/** Vanadium 57 */      V57( 56.952520000000000),
		/** Vanadium 58 */      V58( 57.956720000000000),
		/** Vanadium 59 */      V59( 58.959390000000000),
		/** Vanadium 60 */      V60( 59.964310000000000),
		/** Vanadium 61 */      V61( 60.967250000000000),
		/** Vanadium 62 */      V62( 61.972650000000000),
		/** Vanadium 63 */      V63( 62.976390000000000),
		/** Vanadium 64 */      V64( 63.982640000000000),
		/** Vanadium 65 */      V65( 64.987500000000000),
		/** Vanadium 66 */      V66( 65.993980000000000),;

		private double atomicMass;

		V(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.V; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Chromium (cf. {@link Element#Cr}) isotopes. */
	public enum Cr implements Isotope {

		/** Chromium 42 */     Cr42( 42.006700000000000),
		/** Chromium 43 */     Cr43( 42.997530000000000),
		/** Chromium 44 */     Cr44( 43.985360000000000),
		/** Chromium 45 */     Cr45( 44.979050000000000),
		/** Chromium 46 */     Cr46( 45.968359000000000),
		/** Chromium 47 */     Cr47( 46.962897400000000),
		/** Chromium 48 */     Cr48( 47.954029100000000),
		/** Chromium 49 */     Cr49( 48.951333300000000),
		/** Chromium 50 */     Cr50( 49.946041830000000),
		/** Chromium 51 */     Cr51( 50.944765020000000),
		/** Chromium 53 */     Cr53( 52.940648150000000),
		/** Chromium 54 */     Cr54( 53.938879160000000),
		/** Chromium 55 */     Cr55( 54.940838430000000),
		/** Chromium 56 */     Cr56( 55.940653100000000),
		/** Chromium 57 */     Cr57( 56.943613000000000),
		/** Chromium 58 */     Cr58( 57.944350000000000),
		/** Chromium 59 */     Cr59( 58.948590000000000),
		/** Chromium 60 */     Cr60( 59.950080000000000),
		/** Chromium 61 */     Cr61( 60.954420000000000),
		/** Chromium 62 */     Cr62( 61.956100000000000),
		/** Chromium 63 */     Cr63( 62.961650000000000),
		/** Chromium 64 */     Cr64( 63.964080000000000),
		/** Chromium 65 */     Cr65( 64.969960000000000),
		/** Chromium 66 */     Cr66( 65.973660000000000),
		/** Chromium 67 */     Cr67( 66.980160000000000),
		/** Chromium 68 */     Cr68( 67.984030000000000),;

		private double atomicMass;

		Cr(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Cr; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Manganese (cf. {@link Element#Mn}) isotopes. */
	public enum Mn implements Isotope {

		/** Manganese 44 */    Mn44( 44.007150000000000),
		/** Manganese 45 */    Mn45( 44.994490000000000),
		/** Manganese 46 */    Mn46( 45.986090000000000),
		/** Manganese 47 */    Mn47( 46.975775000000000),
		/** Manganese 48 */    Mn48( 47.968520000000000),
		/** Manganese 49 */    Mn49( 48.959595000000000),
		/** Manganese 50 */    Mn50( 49.954237780000000),
		/** Manganese 51 */    Mn51( 50.948208470000000),
		/** Manganese 52 */    Mn52( 51.945563900000000),
		/** Manganese 53 */    Mn53( 52.941288890000000),
		/** Manganese 54 */    Mn54( 53.940357600000000),
		/** Manganese 56 */    Mn56( 55.938903690000000),
		/** Manganese 57 */    Mn57( 56.938286100000000),
		/** Manganese 58 */    Mn58( 57.940066600000000),
		/** Manganese 59 */    Mn59( 58.940391100000000),
		/** Manganese 60 */    Mn60( 59.943136600000000),
		/** Manganese 61 */    Mn61( 60.944452500000000),
		/** Manganese 62 */    Mn62( 61.947950000000000),
		/** Manganese 63 */    Mn63( 62.949664700000000),
		/** Manganese 64 */    Mn64( 63.953849400000000),
		/** Manganese 65 */    Mn65( 64.956019800000000),
		/** Manganese 66 */    Mn66( 65.960547000000000),
		/** Manganese 67 */    Mn67( 66.964240000000000),
		/** Manganese 68 */    Mn68( 67.969620000000000),
		/** Manganese 69 */    Mn69( 68.973660000000000),
		/** Manganese 70 */    Mn70( 69.979370000000000),
		/** Manganese 71 */    Mn71( 70.983680000000000),;

		private double atomicMass;

		Mn(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Mn; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Iron (cf. {@link Element#Fe}) isotopes. */
	public enum Fe implements Isotope {

		/** Iron 45 */         Fe45( 45.014420000000000),
		/** Iron 46 */         Fe46( 46.000630000000000),
		/** Iron 47 */         Fe47( 46.991850000000000),
		/** Iron 48 */         Fe48( 47.980230000000000),
		/** Iron 49 */         Fe49( 48.973429000000000),
		/** Iron 50 */         Fe50( 49.962975000000000),
		/** Iron 51 */         Fe51( 50.956841000000000),
		/** Iron 52 */         Fe52( 51.948113100000000),
		/** Iron 53 */         Fe53( 52.945306400000000),
		/** Iron 54 */         Fe54( 53.939608990000000),
		/** Iron 55 */         Fe55( 54.938291990000000),
		/** Iron 57 */         Fe57( 56.935392840000000),
		/** Iron 58 */         Fe58( 57.933274430000000),
		/** Iron 59 */         Fe59( 58.934874340000000),
		/** Iron 60 */         Fe60( 59.934071100000000),
		/** Iron 61 */         Fe61( 60.936746200000000),
		/** Iron 62 */         Fe62( 61.936791800000000),
		/** Iron 63 */         Fe63( 62.940272700000000),
		/** Iron 64 */         Fe64( 63.940987800000000),
		/** Iron 65 */         Fe65( 64.945011500000000),
		/** Iron 66 */         Fe66( 65.946250000000000),
		/** Iron 67 */         Fe67( 66.950540000000000),
		/** Iron 68 */         Fe68( 67.952950000000000),
		/** Iron 69 */         Fe69( 68.958070000000000),
		/** Iron 70 */         Fe70( 69.961020000000000),
		/** Iron 71 */         Fe71( 70.966720000000000),
		/** Iron 72 */         Fe72( 71.969830000000000),
		/** Iron 73 */         Fe73( 72.975720000000000),
		/** Iron 74 */         Fe74( 73.979350000000000),;

		private double atomicMass;

		Fe(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Fe; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Cobalt (cf. {@link Element#Co}) isotopes. */
	public enum Co implements Isotope {

		/** Cobalt 47 */       Co47( 47.010570000000000),
		/** Cobalt 48 */       Co48( 48.000930000000000),
		/** Cobalt 49 */       Co49( 48.988910000000000),
		/** Cobalt 50 */       Co50( 49.980910000000000),
		/** Cobalt 51 */       Co51( 50.970647000000000),
		/** Cobalt 52 */       Co52( 51.963510000000000),
		/** Cobalt 53 */       Co53( 52.954204100000000),
		/** Cobalt 54 */       Co54( 53.948459870000000),
		/** Cobalt 55 */       Co55( 54.941997200000000),
		/** Cobalt 56 */       Co56( 55.939838800000000),
		/** Cobalt 57 */       Co57( 56.936290570000000),
		/** Cobalt 58 */       Co58( 57.935752100000000),
		/** Cobalt 60 */       Co60( 59.933816300000000),
		/** Cobalt 61 */       Co61( 60.932476620000000),
		/** Cobalt 62 */       Co62( 61.934059000000000),
		/** Cobalt 63 */       Co63( 62.933600000000000),
		/** Cobalt 64 */       Co64( 63.935811000000000),
		/** Cobalt 65 */       Co65( 64.936462100000000),
		/** Cobalt 66 */       Co66( 65.939443000000000),
		/** Cobalt 67 */       Co67( 66.940609600000000),
		/** Cobalt 68 */       Co68( 67.944260000000000),
		/** Cobalt 69 */       Co69( 68.946140000000000),
		/** Cobalt 70 */       Co70( 69.949630000000000),
		/** Cobalt 71 */       Co71( 70.952370000000000),
		/** Cobalt 72 */       Co72( 71.957290000000000),
		/** Cobalt 73 */       Co73( 72.960390000000000),
		/** Cobalt 74 */       Co74( 73.965150000000000),
		/** Cobalt 75 */       Co75( 74.968760000000000),
		/** Cobalt 76 */       Co76( 75.974130000000000),;

		private double atomicMass;

		Co(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Co; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Nickel (cf. {@link Element#Ni}) isotopes. */
	public enum Ni implements Isotope {

		/** Nickel 48 */       Ni48( 48.017690000000000),
		/** Nickel 49 */       Ni49( 49.007700000000000),
		/** Nickel 50 */       Ni50( 49.994740000000000),
		/** Nickel 51 */       Ni51( 50.986110000000000),
		/** Nickel 52 */       Ni52( 51.974800000000000),
		/** Nickel 53 */       Ni53( 52.968190000000000),
		/** Nickel 54 */       Ni54( 53.957892000000000),
		/** Nickel 55 */       Ni55( 54.951330630000000),
		/** Nickel 56 */       Ni56( 55.942128550000000),
		/** Nickel 57 */       Ni57( 56.939792180000000),
		/** Nickel 58 */       Ni58( 57.935342410000000),
		/** Nickel 60 */       Ni60( 59.930785880000000),
		/** Nickel 61 */       Ni61( 60.931055570000000),
		/** Nickel 62 */       Ni62( 61.928345370000000),
		/** Nickel 63 */       Ni63( 62.929669630000000),
		/** Nickel 64 */       Ni64( 63.927966820000000),
		/** Nickel 65 */       Ni65( 64.930085170000000),
		/** Nickel 66 */       Ni66( 65.929139300000000),
		/** Nickel 67 */       Ni67( 66.931569400000000),
		/** Nickel 68 */       Ni68( 67.931868800000000),
		/** Nickel 69 */       Ni69( 68.935610300000000),
		/** Nickel 70 */       Ni70( 69.936431300000000),
		/** Nickel 71 */       Ni71( 70.940519000000000),
		/** Nickel 72 */       Ni72( 71.941785900000000),
		/** Nickel 73 */       Ni73( 72.946206700000000),
		/** Nickel 74 */       Ni74( 73.947980000000000),
		/** Nickel 75 */       Ni75( 74.952500000000000),
		/** Nickel 76 */       Ni76( 75.955330000000000),
		/** Nickel 77 */       Ni77( 76.960550000000000),
		/** Nickel 78 */       Ni78( 77.963360000000000),
		/** Nickel 79 */       Ni79( 78.970250000000000),;

		private double atomicMass;

		Ni(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ni; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Copper (cf. {@link Element#Cu}) isotopes. */
	public enum Cu implements Isotope {

		/** Copper 52 */       Cu52( 51.996710000000000),
		/** Copper 53 */       Cu53( 52.984590000000000),
		/** Copper 54 */       Cu54( 53.976660000000000),
		/** Copper 55 */       Cu55( 54.966040000000000),
		/** Copper 56 */       Cu56( 55.958950000000000),
		/** Copper 57 */       Cu57( 56.949212500000000),
		/** Copper 58 */       Cu58( 57.944533050000000),
		/** Copper 59 */       Cu59( 58.939497480000000),
		/** Copper 60 */       Cu60( 59.937364500000000),
		/** Copper 61 */       Cu61( 60.933457600000000),
		/** Copper 62 */       Cu62( 61.932595410000000),
		/** Copper 63 */       Cu63( 62.929597720000000),
		/** Copper 65 */       Cu65( 64.927789700000000),
		/** Copper 66 */       Cu66( 65.928869030000000),
		/** Copper 67 */       Cu67( 66.927730300000000),
		/** Copper 68 */       Cu68( 67.929610900000000),
		/** Copper 69 */       Cu69( 68.929429300000000),
		/** Copper 70 */       Cu70( 69.932392100000000),
		/** Copper 71 */       Cu71( 70.932676800000000),
		/** Copper 72 */       Cu72( 71.935820300000000),
		/** Copper 73 */       Cu73( 72.936674400000000),
		/** Copper 74 */       Cu74( 73.939874900000000),
		/** Copper 75 */       Cu75( 74.941522600000000),
		/** Copper 76 */       Cu76( 75.945275000000000),
		/** Copper 77 */       Cu77( 76.947920000000000),
		/** Copper 78 */       Cu78( 77.952230000000000),
		/** Copper 79 */       Cu79( 78.955020000000000),
		/** Copper 80 */       Cu80( 79.960890000000000),
		/** Copper 81 */       Cu81( 80.965870000000000),
		/** Copper 82 */       Cu82( 81.972440000000000),;

		private double atomicMass;

		Cu(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Cu; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Zinc (cf. {@link Element#Zn}) isotopes. */
	public enum Zn implements Isotope {

		/** Zinc 54 */         Zn54( 53.992040000000000),
		/** Zinc 55 */         Zn55( 54.983980000000000),
		/** Zinc 56 */         Zn56( 55.972540000000000),
		/** Zinc 57 */         Zn57( 56.965060000000000),
		/** Zinc 58 */         Zn58( 57.954591000000000),
		/** Zinc 59 */         Zn59( 58.949312660000000),
		/** Zinc 60 */         Zn60( 59.941842100000000),
		/** Zinc 61 */         Zn61( 60.939507000000000),
		/** Zinc 62 */         Zn62( 61.934333970000000),
		/** Zinc 63 */         Zn63( 62.933211500000000),
		/** Zinc 64 */         Zn64( 63.929142010000000),
		/** Zinc 66 */         Zn66( 65.926033810000000),
		/** Zinc 67 */         Zn67( 66.927127750000000),
		/** Zinc 68 */         Zn68( 67.924844550000000),
		/** Zinc 69 */         Zn69( 68.926550700000000),
		/** Zinc 70 */         Zn70( 69.925319200000000),
		/** Zinc 71 */         Zn71( 70.927719600000000),
		/** Zinc 72 */         Zn72( 71.926842800000000),
		/** Zinc 73 */         Zn73( 72.929582600000000),
		/** Zinc 74 */         Zn74( 73.929407300000000),
		/** Zinc 75 */         Zn75( 74.932840200000000),
		/** Zinc 76 */         Zn76( 75.933115000000000),
		/** Zinc 77 */         Zn77( 76.936887200000000),
		/** Zinc 78 */         Zn78( 77.938289200000000),
		/** Zinc 79 */         Zn79( 78.942638100000000),
		/** Zinc 80 */         Zn80( 79.944552900000000),
		/** Zinc 81 */         Zn81( 80.950402600000000),
		/** Zinc 82 */         Zn82( 81.954260000000000),
		/** Zinc 83 */         Zn83( 82.960560000000000),
		/** Zinc 84 */         Zn84( 83.965210000000000),
		/** Zinc 85 */         Zn85( 84.972260000000000),;

		private double atomicMass;

		Zn(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Zn; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Gallium (cf. {@link Element#Ga}) isotopes. */
	public enum Ga implements Isotope {

		/** Gallium 56 */      Ga56( 55.995360000000000),
		/** Gallium 57 */      Ga57( 56.983200000000000),
		/** Gallium 58 */      Ga58( 57.974780000000000),
		/** Gallium 59 */      Ga59( 58.963530000000000),
		/** Gallium 60 */      Ga60( 59.957290000000000),
		/** Gallium 61 */      Ga61( 60.949399000000000),
		/** Gallium 62 */      Ga62( 61.944190250000000),
		/** Gallium 63 */      Ga63( 62.939294200000000),
		/** Gallium 64 */      Ga64( 63.936840400000000),
		/** Gallium 65 */      Ga65( 64.932734590000000),
		/** Gallium 66 */      Ga66( 65.931589400000000),
		/** Gallium 67 */      Ga67( 66.928202500000000),
		/** Gallium 68 */      Ga68( 67.927980500000000),
		/** Gallium 69 */      Ga69( 68.925573500000000),
		/** Gallium 71 */      Ga71( 70.924702580000000),
		/** Gallium 72 */      Ga72( 71.926367470000000),
		/** Gallium 73 */      Ga73( 72.925174700000000),
		/** Gallium 74 */      Ga74( 73.926945700000000),
		/** Gallium 75 */      Ga75( 74.926500200000000),
		/** Gallium 76 */      Ga76( 75.928827600000000),
		/** Gallium 77 */      Ga77( 76.929154300000000),
		/** Gallium 78 */      Ga78( 77.931608800000000),
		/** Gallium 79 */      Ga79( 78.932852300000000),
		/** Gallium 80 */      Ga80( 79.936420800000000),
		/** Gallium 81 */      Ga81( 80.938133800000000),
		/** Gallium 82 */      Ga82( 81.943176500000000),
		/** Gallium 83 */      Ga83( 82.947120300000000),
		/** Gallium 84 */      Ga84( 83.952460000000000),
		/** Gallium 85 */      Ga85( 84.956990000000000),
		/** Gallium 86 */      Ga86( 85.963010000000000),
		/** Gallium 87 */      Ga87( 86.968240000000000),;

		private double atomicMass;

		Ga(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ga; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Germanium (cf. {@link Element#Ge}) isotopes. */
	public enum Ge implements Isotope {

		/** Germanium 58 */    Ge58( 57.991720000000000),
		/** Germanium 59 */    Ge59( 58.982490000000000),
		/** Germanium 60 */    Ge60( 59.970360000000000),
		/** Germanium 61 */    Ge61( 60.963790000000000),
		/** Germanium 62 */    Ge62( 61.955020000000000),
		/** Germanium 63 */    Ge63( 62.949628000000000),
		/** Germanium 64 */    Ge64( 63.941689900000000),
		/** Germanium 65 */    Ge65( 64.939368100000000),
		/** Germanium 66 */    Ge66( 65.933862100000000),
		/** Germanium 67 */    Ge67( 66.932733900000000),
		/** Germanium 68 */    Ge68( 67.928095300000000),
		/** Germanium 69 */    Ge69( 68.927964500000000),
		/** Germanium 70 */    Ge70( 69.924248750000000),
		/** Germanium 71 */    Ge71( 70.924952330000000),
		/** Germanium 72 */    Ge72( 71.922075826000000),
		/** Germanium 74 */    Ge74( 73.921177761000000),
		/** Germanium 75 */    Ge75( 74.922858370000000),
		/** Germanium 76 */    Ge76( 75.921402726000000),
		/** Germanium 77 */    Ge77( 76.923549843000000),
		/** Germanium 78 */    Ge78( 77.922852900000000),
		/** Germanium 79 */    Ge79( 78.925360000000000),
		/** Germanium 80 */    Ge80( 79.925350800000000),
		/** Germanium 81 */    Ge81( 80.928832900000000),
		/** Germanium 82 */    Ge82( 81.929774000000000),
		/** Germanium 83 */    Ge83( 82.934539100000000),
		/** Germanium 84 */    Ge84( 83.937575100000000),
		/** Germanium 85 */    Ge85( 84.942969700000000),
		/** Germanium 86 */    Ge86( 85.946580000000000),
		/** Germanium 87 */    Ge87( 86.952680000000000),
		/** Germanium 88 */    Ge88( 87.956910000000000),
		/** Germanium 89 */    Ge89( 88.963790000000000),
		/** Germanium 90 */    Ge90( 89.968630000000000),;

		private double atomicMass;

		Ge(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ge; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Arsenic (cf. {@link Element#As}) isotopes. */
	public enum As implements Isotope {

		/** Arsenic 60 */      As60( 59.993880000000000),
		/** Arsenic 61 */      As61( 60.981120000000000),
		/** Arsenic 62 */      As62( 61.973610000000000),
		/** Arsenic 63 */      As63( 62.963900000000000),
		/** Arsenic 64 */      As64( 63.957430000000000),
		/** Arsenic 65 */      As65( 64.949611000000000),
		/** Arsenic 66 */      As66( 65.944148800000000),
		/** Arsenic 67 */      As67( 66.939251110000000),
		/** Arsenic 68 */      As68( 67.936774100000000),
		/** Arsenic 69 */      As69( 68.932246000000000),
		/** Arsenic 70 */      As70( 69.930926000000000),
		/** Arsenic 71 */      As71( 70.927113800000000),
		/** Arsenic 72 */      As72( 71.926752300000000),
		/** Arsenic 73 */      As73( 72.923829100000000),
		/** Arsenic 74 */      As74( 73.923928600000000),
		/** Arsenic 76 */      As76( 75.922392020000000),
		/** Arsenic 77 */      As77( 76.920647600000000),
		/** Arsenic 78 */      As78( 77.921828000000000),
		/** Arsenic 79 */      As79( 78.920948400000000),
		/** Arsenic 80 */      As80( 79.922474600000000),
		/** Arsenic 81 */      As81( 80.922132300000000),
		/** Arsenic 82 */      As82( 81.924741200000000),
		/** Arsenic 83 */      As83( 82.925206900000000),
		/** Arsenic 84 */      As84( 83.929303300000000),
		/** Arsenic 85 */      As85( 84.932163700000000),
		/** Arsenic 86 */      As86( 85.936701500000000),
		/** Arsenic 87 */      As87( 86.940291700000000),
		/** Arsenic 88 */      As88( 87.945550000000000),
		/** Arsenic 89 */      As89( 88.949760000000000),
		/** Arsenic 90 */      As90( 89.955630000000000),
		/** Arsenic 91 */      As91( 90.960390000000000),
		/** Arsenic 92 */      As92( 91.966740000000000),;

		private double atomicMass;

		As(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.As; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Selenium (cf. {@link Element#Se}) isotopes. */
	public enum Se implements Isotope {

		/** Selenium 64 */     Se64( 63.971090000000000),
		/** Selenium 65 */     Se65( 64.964400000000000),
		/** Selenium 66 */     Se66( 65.955590000000000),
		/** Selenium 67 */     Se67( 66.949994000000000),
		/** Selenium 68 */     Se68( 67.941825240000000),
		/** Selenium 69 */     Se69( 68.939414800000000),
		/** Selenium 70 */     Se70( 69.933515500000000),
		/** Selenium 71 */     Se71( 70.932209400000000),
		/** Selenium 72 */     Se72( 71.927140500000000),
		/** Selenium 73 */     Se73( 72.926754900000000),
		/** Selenium 74 */     Se74( 73.922475934000000),
		/** Selenium 75 */     Se75( 74.922522870000000),
		/** Selenium 76 */     Se76( 75.919213704000000),
		/** Selenium 77 */     Se77( 76.919914154000000),
		/** Selenium 78 */     Se78( 77.917309280000000),
		/** Selenium 80 */     Se80( 79.916521800000000),
		/** Selenium 81 */     Se81( 80.917993000000000),
		/** Selenium 82 */     Se82( 81.916699500000000),
		/** Selenium 83 */     Se83( 82.919118600000000),
		/** Selenium 84 */     Se84( 83.918466800000000),
		/** Selenium 85 */     Se85( 84.922260800000000),
		/** Selenium 86 */     Se86( 85.924311700000000),
		/** Selenium 87 */     Se87( 86.928688600000000),
		/** Selenium 88 */     Se88( 87.931417500000000),
		/** Selenium 89 */     Se89( 88.936669100000000),
		/** Selenium 90 */     Se90( 89.940100000000000),
		/** Selenium 91 */     Se91( 90.945960000000000),
		/** Selenium 92 */     Se92( 91.949840000000000),
		/** Selenium 93 */     Se93( 92.956290000000000),
		/** Selenium 94 */     Se94( 93.960490000000000),
		/** Selenium 95 */     Se95( 94.967300000000000),;

		private double atomicMass;

		Se(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Se; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Bromine (cf. {@link Element#Br}) isotopes. */
	public enum Br implements Isotope {

		/** Bromine 67 */      Br67( 66.964650000000000),
		/** Bromine 68 */      Br68( 67.958730000000000),
		/** Bromine 69 */      Br69( 68.950497000000000),
		/** Bromine 70 */      Br70( 69.944792000000000),
		/** Bromine 71 */      Br71( 70.939342200000000),
		/** Bromine 72 */      Br72( 71.936588600000000),
		/** Bromine 73 */      Br73( 72.931671500000000),
		/** Bromine 74 */      Br74( 73.929910200000000),
		/** Bromine 75 */      Br75( 74.925810500000000),
		/** Bromine 76 */      Br76( 75.924542000000000),
		/** Bromine 77 */      Br77( 76.921379200000000),
		/** Bromine 78 */      Br78( 77.921145900000000),
		/** Bromine 79 */      Br79( 78.918337600000000),
		/** Bromine 81 */      Br81( 80.916289700000000),
		/** Bromine 82 */      Br82( 81.916803200000000),
		/** Bromine 83 */      Br83( 82.915175600000000),
		/** Bromine 84 */      Br84( 83.916496000000000),
		/** Bromine 85 */      Br85( 84.915645800000000),
		/** Bromine 86 */      Br86( 85.918805400000000),
		/** Bromine 87 */      Br87( 86.920674000000000),
		/** Bromine 88 */      Br88( 87.924083300000000),
		/** Bromine 89 */      Br89( 88.926704600000000),
		/** Bromine 90 */      Br90( 89.931292800000000),
		/** Bromine 91 */      Br91( 90.934398600000000),
		/** Bromine 92 */      Br92( 91.939631600000000),
		/** Bromine 93 */      Br93( 92.943130000000000),
		/** Bromine 94 */      Br94( 93.948900000000000),
		/** Bromine 95 */      Br95( 94.953010000000000),
		/** Bromine 96 */      Br96( 95.959030000000000),
		/** Bromine 97 */      Br97( 96.963440000000000),
		/** Bromine 98 */      Br98( 97.969460000000000),;

		private double atomicMass;

		Br(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Br; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Krypton (cf. {@link Element#Kr}) isotopes. */
	public enum Kr implements Isotope {

		/** Krypton 69 */      Kr69( 68.965180000000000),
		/** Krypton 70 */      Kr70( 69.956040000000000),
		/** Krypton 71 */      Kr71( 70.950270000000000),
		/** Krypton 72 */      Kr72( 71.942092400000000),
		/** Krypton 73 */      Kr73( 72.939289200000000),
		/** Krypton 74 */      Kr74( 73.933084000000000),
		/** Krypton 75 */      Kr75( 74.930945700000000),
		/** Krypton 76 */      Kr76( 75.925910300000000),
		/** Krypton 77 */      Kr77( 76.924670000000000),
		/** Krypton 78 */      Kr78( 77.920364940000000),
		/** Krypton 79 */      Kr79( 78.920082900000000),
		/** Krypton 80 */      Kr80( 79.916378080000000),
		/** Krypton 81 */      Kr81( 80.916591200000000),
		/** Krypton 82 */      Kr82( 81.913482730000000),
		/** Krypton 83 */      Kr83( 82.914127160000000),
		/** Krypton 85 */      Kr85( 84.912527300000000),
		/** Krypton 86 */      Kr86( 85.910610626900000),
		/** Krypton 87 */      Kr87( 86.913354760000000),
		/** Krypton 88 */      Kr88( 87.914447900000000),
		/** Krypton 89 */      Kr89( 88.917835500000000),
		/** Krypton 90 */      Kr90( 89.919527900000000),
		/** Krypton 91 */      Kr91( 90.923806300000000),
		/** Krypton 92 */      Kr92( 91.926173100000000),
		/** Krypton 93 */      Kr93( 92.931147200000000),
		/** Krypton 94 */      Kr94( 93.934140000000000),
		/** Krypton 95 */      Kr95( 94.939711000000000),
		/** Krypton 96 */      Kr96( 95.943017000000000),
		/** Krypton 97 */      Kr97( 96.949090000000000),
		/** Krypton 98 */      Kr98( 97.952430000000000),
		/** Krypton 99 */      Kr99( 98.958390000000000),
		/** Krypton 100 */    Kr100( 99.962370000000000),
		/** Krypton 101 */    Kr101(100.968730000000000),;

		private double atomicMass;

		Kr(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Kr; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Rubidium (cf. {@link Element#Rb}) isotopes. */
	public enum Rb implements Isotope {

		/** Rubidium 71 */     Rb71( 70.965320000000000),
		/** Rubidium 72 */     Rb72( 71.959080000000000),
		/** Rubidium 73 */     Rb73( 72.950530000000000),
		/** Rubidium 74 */     Rb74( 73.944265900000000),
		/** Rubidium 75 */     Rb75( 74.938573200000000),
		/** Rubidium 76 */     Rb76( 75.935073000000000),
		/** Rubidium 77 */     Rb77( 76.930401600000000),
		/** Rubidium 78 */     Rb78( 77.928141900000000),
		/** Rubidium 79 */     Rb79( 78.923989900000000),
		/** Rubidium 80 */     Rb80( 79.922516400000000),
		/** Rubidium 81 */     Rb81( 80.918993900000000),
		/** Rubidium 82 */     Rb82( 81.918209000000000),
		/** Rubidium 83 */     Rb83( 82.915114200000000),
		/** Rubidium 84 */     Rb84( 83.914375200000000),
		/** Rubidium 85 */     Rb85( 84.911789737900000),
		/** Rubidium 87 */     Rb87( 86.909180531000000),
		/** Rubidium 88 */     Rb88( 87.911315590000000),
		/** Rubidium 89 */     Rb89( 88.912278300000000),
		/** Rubidium 90 */     Rb90( 89.914798500000000),
		/** Rubidium 91 */     Rb91( 90.916537200000000),
		/** Rubidium 92 */     Rb92( 91.919728400000000),
		/** Rubidium 93 */     Rb93( 92.922039300000000),
		/** Rubidium 94 */     Rb94( 93.926394800000000),
		/** Rubidium 95 */     Rb95( 94.929260000000000),
		/** Rubidium 96 */     Rb96( 95.934133400000000),
		/** Rubidium 97 */     Rb97( 96.937177100000000),
		/** Rubidium 98 */     Rb98( 97.941686900000000),
		/** Rubidium 99 */     Rb99( 98.945030000000000),
		/** Rubidium 100 */   Rb100( 99.950030000000000),
		/** Rubidium 101 */   Rb101(100.954040000000000),
		/** Rubidium 102 */   Rb102(101.959520000000000),
		/** Rubidium 103 */   Rb103(102.963920000000000),;

		private double atomicMass;

		Rb(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Rb; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Strontium (cf. {@link Element#Sr}) isotopes. */
	public enum Sr implements Isotope {

		/** Strontium 73 */    Sr73( 72.965700000000000),
		/** Strontium 74 */    Sr74( 73.956170000000000),
		/** Strontium 75 */    Sr75( 74.949950000000000),
		/** Strontium 76 */    Sr76( 75.941763000000000),
		/** Strontium 77 */    Sr77( 76.937945500000000),
		/** Strontium 78 */    Sr78( 77.932180000000000),
		/** Strontium 79 */    Sr79( 78.929707700000000),
		/** Strontium 80 */    Sr80( 79.924517500000000),
		/** Strontium 81 */    Sr81( 80.923211400000000),
		/** Strontium 82 */    Sr82( 81.918399900000000),
		/** Strontium 83 */    Sr83( 82.917554400000000),
		/** Strontium 84 */    Sr84( 83.913419100000000),
		/** Strontium 85 */    Sr85( 84.912932000000000),
		/** Strontium 86 */    Sr86( 85.909260600000000),
		/** Strontium 87 */    Sr87( 86.908877500000000),
		/** Strontium 89 */    Sr89( 88.907451100000000),
		/** Strontium 90 */    Sr90( 89.907730000000000),
		/** Strontium 91 */    Sr91( 90.910195400000000),
		/** Strontium 92 */    Sr92( 91.911038200000000),
		/** Strontium 93 */    Sr93( 92.914024200000000),
		/** Strontium 94 */    Sr94( 93.915355600000000),
		/** Strontium 95 */    Sr95( 94.919352900000000),
		/** Strontium 96 */    Sr96( 95.921706600000000),
		/** Strontium 97 */    Sr97( 96.926374000000000),
		/** Strontium 98 */    Sr98( 97.928688800000000),
		/** Strontium 99 */    Sr99( 98.932890700000000),
		/** Strontium 100 */  Sr100( 99.935770000000000),
		/** Strontium 101 */  Sr101(100.940352000000000),
		/** Strontium 102 */  Sr102(101.943791000000000),
		/** Strontium 103 */  Sr103(102.949090000000000),
		/** Strontium 104 */  Sr104(103.952650000000000),
		/** Strontium 105 */  Sr105(104.958550000000000),
		/** Strontium 106 */  Sr106(105.962650000000000),
		/** Strontium 107 */  Sr107(106.968970000000000),;

		private double atomicMass;

		Sr(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Sr; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Yttrium (cf. {@link Element#Y}) isotopes. */
	public enum Y implements Isotope {

		/** Yttrium 76 */       Y76( 75.958560000000000),
		/** Yttrium 77 */       Y77( 76.949781000000000),
		/** Yttrium 78 */       Y78( 77.943610000000000),
		/** Yttrium 79 */       Y79( 78.937350000000000),
		/** Yttrium 80 */       Y80( 79.934356100000000),
		/** Yttrium 81 */       Y81( 80.929455600000000),
		/** Yttrium 82 */       Y82( 81.926931400000000),
		/** Yttrium 83 */       Y83( 82.922485000000000),
		/** Yttrium 84 */       Y84( 83.920672100000000),
		/** Yttrium 85 */       Y85( 84.916433000000000),
		/** Yttrium 86 */       Y86( 85.914886000000000),
		/** Yttrium 87 */       Y87( 86.910876100000000),
		/** Yttrium 88 */       Y88( 87.909501600000000),
		/** Yttrium 90 */       Y90( 89.907143900000000),
		/** Yttrium 91 */       Y91( 90.907297400000000),
		/** Yttrium 92 */       Y92( 91.908945100000000),
		/** Yttrium 93 */       Y93( 92.909578000000000),
		/** Yttrium 94 */       Y94( 93.911590600000000),
		/** Yttrium 95 */       Y95( 94.912816100000000),
		/** Yttrium 96 */       Y96( 95.915896800000000),
		/** Yttrium 97 */       Y97( 96.918274100000000),
		/** Yttrium 98 */       Y98( 97.922382100000000),
		/** Yttrium 99 */       Y99( 98.924148000000000),
		/** Yttrium 100 */     Y100( 99.927715000000000),
		/** Yttrium 101 */     Y101(100.930147700000000),
		/** Yttrium 102 */     Y102(101.934327700000000),
		/** Yttrium 103 */     Y103(102.937243000000000),
		/** Yttrium 104 */     Y104(103.941960000000000),
		/** Yttrium 105 */     Y105(104.945440000000000),
		/** Yttrium 106 */     Y106(105.950560000000000),
		/** Yttrium 107 */     Y107(106.954520000000000),
		/** Yttrium 108 */     Y108(107.959960000000000),
		/** Yttrium 109 */     Y109(108.964360000000000),;

		private double atomicMass;

		Y(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Y; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Zirconium (cf. {@link Element#Zr}) isotopes. */
	public enum Zr implements Isotope {

		/** Zirconium 78 */    Zr78( 77.955660000000000),
		/** Zirconium 79 */    Zr79( 78.949480000000000),
		/** Zirconium 80 */    Zr80( 79.940400000000000),
		/** Zirconium 81 */    Zr81( 80.937310000000000),
		/** Zirconium 82 */    Zr82( 81.931350000000000),
		/** Zirconium 83 */    Zr83( 82.929242100000000),
		/** Zirconium 84 */    Zr84( 83.923326900000000),
		/** Zirconium 85 */    Zr85( 84.921444400000000),
		/** Zirconium 86 */    Zr86( 85.916297200000000),
		/** Zirconium 87 */    Zr87( 86.914818000000000),
		/** Zirconium 88 */    Zr88( 87.910221300000000),
		/** Zirconium 89 */    Zr89( 88.908881400000000),
		/** Zirconium 90 */    Zr90( 89.904697700000000),
		/** Zirconium 92 */    Zr92( 91.905034700000000),
		/** Zirconium 93 */    Zr93( 92.906469900000000),
		/** Zirconium 94 */    Zr94( 93.906310800000000),
		/** Zirconium 95 */    Zr95( 94.908038500000000),
		/** Zirconium 96 */    Zr96( 95.908271400000000),
		/** Zirconium 97 */    Zr97( 96.910951200000000),
		/** Zirconium 98 */    Zr98( 97.912728900000000),
		/** Zirconium 99 */    Zr99( 98.916667000000000),
		/** Zirconium 100 */  Zr100( 99.918000600000000),
		/** Zirconium 101 */  Zr101(100.921448000000000),
		/** Zirconium 102 */  Zr102(101.923140900000000),
		/** Zirconium 103 */  Zr103(102.927191000000000),
		/** Zirconium 104 */  Zr104(103.929436000000000),
		/** Zirconium 105 */  Zr105(104.934008000000000),
		/** Zirconium 106 */  Zr106(105.936760000000000),
		/** Zirconium 107 */  Zr107(106.941740000000000),
		/** Zirconium 108 */  Zr108(107.944870000000000),
		/** Zirconium 109 */  Zr109(108.950410000000000),
		/** Zirconium 110 */  Zr110(109.953960000000000),
		/** Zirconium 111 */  Zr111(110.959680000000000),
		/** Zirconium 112 */  Zr112(111.963700000000000),;

		private double atomicMass;

		Zr(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Zr; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Niobium (cf. {@link Element#Nb}) isotopes. */
	public enum Nb implements Isotope {

		/** Niobium 81 */      Nb81( 80.949600000000000),
		/** Niobium 82 */      Nb82( 81.943960000000000),
		/** Niobium 83 */      Nb83( 82.937290000000000),
		/** Niobium 84 */      Nb84( 83.934490000000000),
		/** Niobium 85 */      Nb85( 84.928845800000000),
		/** Niobium 86 */      Nb86( 85.925782800000000),
		/** Niobium 87 */      Nb87( 86.920693700000000),
		/** Niobium 88 */      Nb88( 87.918222000000000),
		/** Niobium 89 */      Nb89( 88.913445000000000),
		/** Niobium 90 */      Nb90( 89.911258400000000),
		/** Niobium 91 */      Nb91( 90.906989700000000),
		/** Niobium 92 */      Nb92( 91.907188100000000),
		/** Niobium 94 */      Nb94( 93.907278800000000),
		/** Niobium 95 */      Nb95( 94.906832400000000),
		/** Niobium 96 */      Nb96( 95.908097300000000),
		/** Niobium 97 */      Nb97( 96.908095900000000),
		/** Niobium 98 */      Nb98( 97.910326500000000),
		/** Niobium 99 */      Nb99( 98.911613000000000),
		/** Niobium 100 */    Nb100( 99.914327600000000),
		/** Niobium 101 */    Nb101(100.915310300000000),
		/** Niobium 102 */    Nb102(101.918077200000000),
		/** Niobium 103 */    Nb103(102.919457200000000),
		/** Niobium 104 */    Nb104(103.922892500000000),
		/** Niobium 105 */    Nb105(104.924946500000000),
		/** Niobium 106 */    Nb106(105.928931700000000),
		/** Niobium 107 */    Nb107(106.931593700000000),
		/** Niobium 108 */    Nb108(107.936074800000000),
		/** Niobium 109 */    Nb109(108.939220000000000),
		/** Niobium 110 */    Nb110(109.944030000000000),
		/** Niobium 111 */    Nb111(110.947530000000000),
		/** Niobium 112 */    Nb112(111.952470000000000),
		/** Niobium 113 */    Nb113(112.956510000000000),
		/** Niobium 114 */    Nb114(113.962010000000000),
		/** Niobium 115 */    Nb115(114.966340000000000),;

		private double atomicMass;

		Nb(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Nb; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Molybdenum (cf. {@link Element#Mo}) isotopes. */
	public enum Mo implements Isotope {

		/** Molybdenum 83 */   Mo83( 82.949880000000000),
		/** Molybdenum 84 */   Mo84( 83.941490000000000),
		/** Molybdenum 85 */   Mo85( 84.938261000000000),
		/** Molybdenum 86 */   Mo86( 85.931174800000000),
		/** Molybdenum 87 */   Mo87( 86.928196200000000),
		/** Molybdenum 88 */   Mo88( 87.921967800000000),
		/** Molybdenum 89 */   Mo89( 88.919468200000000),
		/** Molybdenum 90 */   Mo90( 89.913930900000000),
		/** Molybdenum 91 */   Mo91( 90.911745300000000),
		/** Molybdenum 92 */   Mo92( 91.906807960000000),
		/** Molybdenum 93 */   Mo93( 92.906809580000000),
		/** Molybdenum 94 */   Mo94( 93.905084900000000),
		/** Molybdenum 95 */   Mo95( 94.905838770000000),
		/** Molybdenum 97 */   Mo97( 96.906018120000000),
		/** Molybdenum 98 */   Mo98( 97.905404820000000),
		/** Molybdenum 99 */   Mo99( 98.907708510000000),
		/** Molybdenum 100 */ Mo100( 99.907471800000000),
		/** Molybdenum 101 */ Mo101(100.910341400000000),
		/** Molybdenum 102 */ Mo102(101.910283400000000),
		/** Molybdenum 103 */ Mo103(102.913079000000000),
		/** Molybdenum 104 */ Mo104(103.913734400000000),
		/** Molybdenum 105 */ Mo105(104.916969000000000),
		/** Molybdenum 106 */ Mo106(105.918259000000000),
		/** Molybdenum 107 */ Mo107(106.922106000000000),
		/** Molybdenum 108 */ Mo108(107.924033000000000),
		/** Molybdenum 109 */ Mo109(108.928424000000000),
		/** Molybdenum 110 */ Mo110(109.930704000000000),
		/** Molybdenum 111 */ Mo111(110.935654000000000),
		/** Molybdenum 112 */ Mo112(111.938310000000000),
		/** Molybdenum 113 */ Mo113(112.943350000000000),
		/** Molybdenum 114 */ Mo114(113.946530000000000),
		/** Molybdenum 115 */ Mo115(114.951960000000000),
		/** Molybdenum 116 */ Mo116(115.955450000000000),
		/** Molybdenum 117 */ Mo117(116.961170000000000),;

		private double atomicMass;

		Mo(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Mo; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Technetium (cf. {@link Element#Tc}) isotopes. */
	public enum Tc implements Isotope {

		/** Technetium 85 */   Tc85( 84.950580000000000),
		/** Technetium 86 */   Tc86( 85.944930000000000),
		/** Technetium 87 */   Tc87( 86.938067200000000),
		/** Technetium 88 */   Tc88( 87.933780000000000),
		/** Technetium 89 */   Tc89( 88.927648700000000),
		/** Technetium 90 */   Tc90( 89.924073900000000),
		/** Technetium 91 */   Tc91( 90.918425400000000),
		/** Technetium 92 */   Tc92( 91.915269800000000),
		/** Technetium 93 */   Tc93( 92.910246000000000),
		/** Technetium 94 */   Tc94( 93.909653600000000),
		/** Technetium 95 */   Tc95( 94.907653600000000),
		/** Technetium 96 */   Tc96( 95.907868000000000),
		/** Technetium 97 */   Tc97( 96.906366700000000),
		/** Technetium 99 */   Tc99( 98.906250800000000),
		/** Technetium 100 */ Tc100( 99.907653900000000),
		/** Technetium 101 */ Tc101(100.907309000000000),
		/** Technetium 102 */ Tc102(101.909209700000000),
		/** Technetium 103 */ Tc103(102.909176000000000),
		/** Technetium 104 */ Tc104(103.911425000000000),
		/** Technetium 105 */ Tc105(104.911655000000000),
		/** Technetium 106 */ Tc106(105.914358000000000),
		/** Technetium 107 */ Tc107(106.915460600000000),
		/** Technetium 108 */ Tc108(107.918495700000000),
		/** Technetium 109 */ Tc109(108.920256000000000),
		/** Technetium 110 */ Tc110(109.923744000000000),
		/** Technetium 111 */ Tc111(110.925901000000000),
		/** Technetium 112 */ Tc112(111.929945800000000),
		/** Technetium 113 */ Tc113(112.932569000000000),
		/** Technetium 114 */ Tc114(113.936910000000000),
		/** Technetium 115 */ Tc115(114.939980000000000),
		/** Technetium 116 */ Tc116(115.944760000000000),
		/** Technetium 117 */ Tc117(116.948060000000000),
		/** Technetium 118 */ Tc118(117.952990000000000),
		/** Technetium 119 */ Tc119(118.956660000000000),
		/** Technetium 120 */ Tc120(119.961870000000000),;

		private double atomicMass;

		Tc(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Tc; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Ruthenium (cf. {@link Element#Ru}) isotopes. */
	public enum Ru implements Isotope {

		/** Ruthenium 87 */    Ru87( 86.950690000000000),
		/** Ruthenium 88 */    Ru88( 87.941600000000000),
		/** Ruthenium 89 */    Ru89( 88.937620000000000),
		/** Ruthenium 90 */    Ru90( 89.930344400000000),
		/** Ruthenium 91 */    Ru91( 90.926741900000000),
		/** Ruthenium 92 */    Ru92( 91.920234400000000),
		/** Ruthenium 93 */    Ru93( 92.917104400000000),
		/** Ruthenium 94 */    Ru94( 93.911342900000000),
		/** Ruthenium 95 */    Ru95( 94.910406000000000),
		/** Ruthenium 96 */    Ru96( 95.907590250000000),
		/** Ruthenium 97 */    Ru97( 96.907547100000000),
		/** Ruthenium 98 */    Ru98( 97.905286800000000),
		/** Ruthenium 99 */    Ru99( 98.905934100000000),
		/** Ruthenium 100 */  Ru100( 99.904214300000000),
		/** Ruthenium 102 */  Ru102(101.904344100000000),
		/** Ruthenium 103 */  Ru103(102.906318600000000),
		/** Ruthenium 104 */  Ru104(103.905427500000000),
		/** Ruthenium 105 */  Ru105(104.907747600000000),
		/** Ruthenium 106 */  Ru106(105.907329100000000),
		/** Ruthenium 107 */  Ru107(106.909972000000000),
		/** Ruthenium 108 */  Ru108(107.910188000000000),
		/** Ruthenium 109 */  Ru109(108.913326000000000),
		/** Ruthenium 110 */  Ru110(109.914040700000000),
		/** Ruthenium 111 */  Ru111(110.917570000000000),
		/** Ruthenium 112 */  Ru112(111.918809000000000),
		/** Ruthenium 113 */  Ru113(112.922844000000000),
		/** Ruthenium 114 */  Ru114(113.924613600000000),
		/** Ruthenium 115 */  Ru115(114.928820000000000),
		/** Ruthenium 116 */  Ru116(115.931219200000000),
		/** Ruthenium 117 */  Ru117(116.936100000000000),
		/** Ruthenium 118 */  Ru118(117.938530000000000),
		/** Ruthenium 119 */  Ru119(118.943570000000000),
		/** Ruthenium 120 */  Ru120(119.946310000000000),
		/** Ruthenium 121 */  Ru121(120.951640000000000),
		/** Ruthenium 122 */  Ru122(121.954470000000000),
		/** Ruthenium 123 */  Ru123(122.959890000000000),
		/** Ruthenium 124 */  Ru124(123.963050000000000),;

		private double atomicMass;

		Ru(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ru; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Rhodium (cf. {@link Element#Rh}) isotopes. */
	public enum Rh implements Isotope {

		/** Rhodium 89 */      Rh89( 88.950580000000000),
		/** Rhodium 90 */      Rh90( 89.944220000000000),
		/** Rhodium 91 */      Rh91( 90.936880000000000),
		/** Rhodium 92 */      Rh92( 91.932367700000000),
		/** Rhodium 93 */      Rh93( 92.925912800000000),
		/** Rhodium 94 */      Rh94( 93.921730500000000),
		/** Rhodium 95 */      Rh95( 94.915897900000000),
		/** Rhodium 96 */      Rh96( 95.914453000000000),
		/** Rhodium 97 */      Rh97( 96.911329000000000),
		/** Rhodium 98 */      Rh98( 97.910708000000000),
		/** Rhodium 99 */      Rh99( 98.908128200000000),
		/** Rhodium 100 */    Rh100( 99.908117000000000),
		/** Rhodium 101 */    Rh101(100.906160600000000),
		/** Rhodium 102 */    Rh102(101.906837400000000),
		/** Rhodium 104 */    Rh104(103.906649200000000),
		/** Rhodium 105 */    Rh105(104.905688500000000),
		/** Rhodium 106 */    Rh106(105.907286800000000),
		/** Rhodium 107 */    Rh107(106.906748000000000),
		/** Rhodium 108 */    Rh108(107.908714000000000),
		/** Rhodium 109 */    Rh109(108.908748800000000),
		/** Rhodium 110 */    Rh110(109.911079000000000),
		/** Rhodium 111 */    Rh111(110.911642300000000),
		/** Rhodium 112 */    Rh112(111.914403000000000),
		/** Rhodium 113 */    Rh113(112.915439300000000),
		/** Rhodium 114 */    Rh114(113.918718000000000),
		/** Rhodium 115 */    Rh115(114.920311600000000),
		/** Rhodium 116 */    Rh116(115.924059000000000),
		/** Rhodium 117 */    Rh117(116.926035400000000),
		/** Rhodium 118 */    Rh118(117.930340000000000),
		/** Rhodium 119 */    Rh119(118.932557000000000),
		/** Rhodium 120 */    Rh120(119.936860000000000),
		/** Rhodium 121 */    Rh121(120.939420000000000),
		/** Rhodium 122 */    Rh122(121.943990000000000),
		/** Rhodium 123 */    Rh123(122.946850000000000),
		/** Rhodium 124 */    Rh124(123.951510000000000),
		/** Rhodium 125 */    Rh125(124.954690000000000),
		/** Rhodium 126 */    Rh126(125.959460000000000),;

		private double atomicMass;

		Rh(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Rh; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Palladium (cf. {@link Element#Pd}) isotopes. */
	public enum Pd implements Isotope {

		/** Palladium 91 */    Pd91( 90.950320000000000),
		/** Palladium 92 */    Pd92( 91.940880000000000),
		/** Palladium 93 */    Pd93( 92.936510000000000),
		/** Palladium 94 */    Pd94( 93.929037600000000),
		/** Palladium 95 */    Pd95( 94.924889800000000),
		/** Palladium 96 */    Pd96( 95.918215100000000),
		/** Palladium 97 */    Pd97( 96.916472000000000),
		/** Palladium 98 */    Pd98( 97.912698300000000),
		/** Palladium 99 */    Pd99( 98.911774800000000),
		/** Palladium 100 */  Pd100( 99.908505000000000),
		/** Palladium 101 */  Pd101(100.908286400000000),
		/** Palladium 102 */  Pd102(101.905602200000000),
		/** Palladium 103 */  Pd103(102.906080900000000),
		/** Palladium 104 */  Pd104(103.904030500000000),
		/** Palladium 105 */  Pd105(104.905079600000000),
		/** Palladium 106 */  Pd106(105.903480400000000),
		/** Palladium 108 */  Pd108(107.903891600000000),
		/** Palladium 109 */  Pd109(108.905950400000000),
		/** Palladium 110 */  Pd110(109.905172200000000),
		/** Palladium 111 */  Pd111(110.907689680000000),
		/** Palladium 112 */  Pd112(111.907329700000000),
		/** Palladium 113 */  Pd113(112.910261000000000),
		/** Palladium 114 */  Pd114(113.910368600000000),
		/** Palladium 115 */  Pd115(114.913659000000000),
		/** Palladium 116 */  Pd116(115.914297000000000),
		/** Palladium 117 */  Pd117(116.917954700000000),
		/** Palladium 118 */  Pd118(117.919066700000000),
		/** Palladium 119 */  Pd119(118.923340200000000),
		/** Palladium 120 */  Pd120(119.924551100000000),
		/** Palladium 121 */  Pd121(120.928950300000000),
		/** Palladium 122 */  Pd122(121.930632000000000),
		/** Palladium 123 */  Pd123(122.935140000000000),
		/** Palladium 124 */  Pd124(123.937140000000000),
		/** Palladium 125 */  Pd125(124.941790000000000),
		/** Palladium 126 */  Pd126(125.944160000000000),
		/** Palladium 127 */  Pd127(126.949070000000000),
		/** Palladium 128 */  Pd128(127.951830000000000),;

		private double atomicMass;

		Pd(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Pd; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Silver (cf. {@link Element#Ag}) isotopes. */
	public enum Ag implements Isotope {

		/** Silver 93 */       Ag93( 92.950330000000000),
		/** Silver 94 */       Ag94( 93.943730000000000),
		/** Silver 95 */       Ag95( 94.936020000000000),
		/** Silver 96 */       Ag96( 95.930744000000000),
		/** Silver 97 */       Ag97( 96.923970000000000),
		/** Silver 98 */       Ag98( 97.921560000000000),
		/** Silver 99 */       Ag99( 98.917645800000000),
		/** Silver 100 */     Ag100( 99.916115400000000),
		/** Silver 101 */     Ag101(100.912684000000000),
		/** Silver 102 */     Ag102(101.911704700000000),
		/** Silver 103 */     Ag103(102.908963100000000),
		/** Silver 104 */     Ag104(103.908623900000000),
		/** Silver 105 */     Ag105(104.906525600000000),
		/** Silver 106 */     Ag106(105.906663600000000),
		/** Silver 107 */     Ag107(106.905091600000000),
		/** Silver 109 */     Ag109(108.904755300000000),
		/** Silver 110 */     Ag110(109.906110200000000),
		/** Silver 111 */     Ag111(110.905295900000000),
		/** Silver 112 */     Ag112(111.907048600000000),
		/** Silver 113 */     Ag113(112.906573000000000),
		/** Silver 114 */     Ag114(113.908823000000000),
		/** Silver 115 */     Ag115(114.908767000000000),
		/** Silver 116 */     Ag116(115.911386800000000),
		/** Silver 117 */     Ag117(116.911774000000000),
		/** Silver 118 */     Ag118(117.914595500000000),
		/** Silver 119 */     Ag119(118.915570000000000),
		/** Silver 120 */     Ag120(119.918784800000000),
		/** Silver 121 */     Ag121(120.920125000000000),
		/** Silver 122 */     Ag122(121.923664000000000),
		/** Silver 123 */     Ag123(122.925337000000000),
		/** Silver 124 */     Ag124(123.928930000000000),
		/** Silver 125 */     Ag125(124.931050000000000),
		/** Silver 126 */     Ag126(125.934750000000000),
		/** Silver 127 */     Ag127(126.937110000000000),
		/** Silver 128 */     Ag128(127.941060000000000),
		/** Silver 129 */     Ag129(128.943950000000000),
		/** Silver 130 */     Ag130(129.950700000000000),;

		private double atomicMass;

		Ag(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ag; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Cadmium (cf. {@link Element#Cd}) isotopes. */
	public enum Cd implements Isotope {

		/** Cadmium 95 */      Cd95( 94.949940000000000),
		/** Cadmium 96 */      Cd96( 95.940340000000000),
		/** Cadmium 97 */      Cd97( 96.935100000000000),
		/** Cadmium 98 */      Cd98( 97.927389000000000),
		/** Cadmium 99 */      Cd99( 98.924925800000000),
		/** Cadmium 100 */    Cd100( 99.920348800000000),
		/** Cadmium 101 */    Cd101(100.918586200000000),
		/** Cadmium 102 */    Cd102(101.914482000000000),
		/** Cadmium 103 */    Cd103(102.913416500000000),
		/** Cadmium 104 */    Cd104(103.909856400000000),
		/** Cadmium 105 */    Cd105(104.909463900000000),
		/** Cadmium 106 */    Cd106(105.906459900000000),
		/** Cadmium 107 */    Cd107(106.906612100000000),
		/** Cadmium 108 */    Cd108(107.904183400000000),
		/** Cadmium 109 */    Cd109(108.904986700000000),
		/** Cadmium 110 */    Cd110(109.903006610000000),
		/** Cadmium 111 */    Cd111(110.904182870000000),
		/** Cadmium 112 */    Cd112(111.902762870000000),
		/** Cadmium 113 */    Cd113(112.904408130000000),
		/** Cadmium 114 */    Cd114(113.903365090000000),
		/** Cadmium 115 */    Cd115(114.905437510000000),
		/** Cadmium 116 */    Cd116(115.904763150000000),
		/** Cadmium 117 */    Cd117(116.907226000000000),
		/** Cadmium 118 */    Cd118(117.906922000000000),
		/** Cadmium 119 */    Cd119(118.909847000000000),
		/** Cadmium 120 */    Cd120(119.909868100000000),
		/** Cadmium 121 */    Cd121(120.912963700000000),
		/** Cadmium 122 */    Cd122(121.913459100000000),
		/** Cadmium 123 */    Cd123(122.916892500000000),
		/** Cadmium 124 */    Cd124(123.917657400000000),
		/** Cadmium 125 */    Cd125(124.921257600000000),
		/** Cadmium 126 */    Cd126(125.922429100000000),
		/** Cadmium 127 */    Cd127(126.926472000000000),
		/** Cadmium 128 */    Cd128(127.927812900000000),
		/** Cadmium 129 */    Cd129(128.931820000000000),
		/** Cadmium 130 */    Cd130(129.933940000000000),
		/** Cadmium 131 */    Cd131(130.940600000000000),
		/** Cadmium 132 */    Cd132(131.946040000000000),
		/** Cadmium 133 */    Cd133(132.952850000000000),;

		private double atomicMass;

		Cd(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Cd; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Indium (cf. {@link Element#In}) isotopes. */
	public enum In implements Isotope {

		/** Indium 97 */       In97( 96.949340000000000),
		/** Indium 98 */       In98( 97.942140000000000),
		/** Indium 99 */       In99( 98.934110000000000),
		/** Indium 100 */     In100( 99.930960000000000),
		/** Indium 101 */     In101(100.926340000000000),
		/** Indium 102 */     In102(101.924107100000000),
		/** Indium 103 */     In103(102.919881900000000),
		/** Indium 104 */     In104(103.918214500000000),
		/** Indium 105 */     In105(104.914502000000000),
		/** Indium 106 */     In106(105.913464000000000),
		/** Indium 107 */     In107(106.910290000000000),
		/** Indium 108 */     In108(107.909693500000000),
		/** Indium 109 */     In109(108.907151400000000),
		/** Indium 110 */     In110(109.907170000000000),
		/** Indium 111 */     In111(110.905108500000000),
		/** Indium 112 */     In112(111.905537700000000),
		/** Indium 113 */     In113(112.904061840000000),
		/** Indium 114 */     In114(113.904917910000000),
		/** Indium 116 */     In116(115.905259990000000),
		/** Indium 117 */     In117(116.904515700000000),
		/** Indium 118 */     In118(117.906356600000000),
		/** Indium 119 */     In119(118.905850700000000),
		/** Indium 120 */     In120(119.907967000000000),
		/** Indium 121 */     In121(120.907851000000000),
		/** Indium 122 */     In122(121.910281000000000),
		/** Indium 123 */     In123(122.910434000000000),
		/** Indium 124 */     In124(123.913182000000000),
		/** Indium 125 */     In125(124.913605000000000),
		/** Indium 126 */     In126(125.916507000000000),
		/** Indium 127 */     In127(126.917446000000000),
		/** Indium 128 */     In128(127.920400000000000),
		/** Indium 129 */     In129(128.921805300000000),
		/** Indium 130 */     In130(129.924977000000000),
		/** Indium 131 */     In131(130.926971500000000),
		/** Indium 132 */     In132(131.933001000000000),
		/** Indium 133 */     In133(132.938310000000000),
		/** Indium 134 */     In134(133.944540000000000),
		/** Indium 135 */     In135(134.950050000000000),;

		private double atomicMass;

		In(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.In; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Tin (cf. {@link Element#Sn}) isotopes. */
	public enum Sn implements Isotope {

		/** Tin 99 */          Sn99( 98.948530000000000),
		/** Tin 100 */        Sn100( 99.938500000000000),
		/** Tin 101 */        Sn101(100.935260000000000),
		/** Tin 102 */        Sn102(101.930290000000000),
		/** Tin 103 */        Sn103(102.928105000000000),
		/** Tin 104 */        Sn104(103.923105200000000),
		/** Tin 105 */        Sn105(104.921268400000000),
		/** Tin 106 */        Sn106(105.916957400000000),
		/** Tin 107 */        Sn107(106.915713700000000),
		/** Tin 108 */        Sn108(107.911894300000000),
		/** Tin 109 */        Sn109(108.911292100000000),
		/** Tin 110 */        Sn110(109.907845000000000),
		/** Tin 111 */        Sn111(110.907740100000000),
		/** Tin 112 */        Sn112(111.904823870000000),
		/** Tin 113 */        Sn113(112.905175700000000),
		/** Tin 114 */        Sn114(113.902782700000000),
		/** Tin 115 */        Sn115(114.903344699000000),
		/** Tin 116 */        Sn116(115.901742800000000),
		/** Tin 117 */        Sn117(116.902953980000000),
		/** Tin 118 */        Sn118(117.901606570000000),
		/** Tin 120 */        Sn120(119.902201630000000),
		/** Tin 121 */        Sn121(120.904242600000000),
		/** Tin 122 */        Sn122(121.903443800000000),
		/** Tin 123 */        Sn123(122.905725200000000),
		/** Tin 124 */        Sn124(123.905276600000000),
		/** Tin 125 */        Sn125(124.907786400000000),
		/** Tin 126 */        Sn126(125.907659000000000),
		/** Tin 127 */        Sn127(126.910390000000000),
		/** Tin 128 */        Sn128(127.910507000000000),
		/** Tin 129 */        Sn129(128.913465000000000),
		/** Tin 130 */        Sn130(129.913973800000000),
		/** Tin 131 */        Sn131(130.917045000000000),
		/** Tin 132 */        Sn132(131.917826700000000),
		/** Tin 133 */        Sn133(132.923913400000000),
		/** Tin 134 */        Sn134(133.928682100000000),
		/** Tin 135 */        Sn135(134.934908600000000),
		/** Tin 136 */        Sn136(135.939990000000000),
		/** Tin 137 */        Sn137(136.946550000000000),
		/** Tin 138 */        Sn138(137.951840000000000),;

		private double atomicMass;

		Sn(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Sn; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Antimony (cf. {@link Element#Sb}) isotopes. */
	public enum Sb implements Isotope {

		/** Antimony 103 */   Sb103(102.939690000000000),
		/** Antimony 104 */   Sb104(103.936480000000000),
		/** Antimony 105 */   Sb105(104.931276000000000),
		/** Antimony 106 */   Sb106(105.928638000000000),
		/** Antimony 107 */   Sb107(106.924150600000000),
		/** Antimony 108 */   Sb108(107.922226700000000),
		/** Antimony 109 */   Sb109(108.918141100000000),
		/** Antimony 110 */   Sb110(109.916854300000000),
		/** Antimony 111 */   Sb111(110.913218200000000),
		/** Antimony 112 */   Sb112(111.912400000000000),
		/** Antimony 113 */   Sb113(112.909375000000000),
		/** Antimony 114 */   Sb114(113.909290000000000),
		/** Antimony 115 */   Sb115(114.906598000000000),
		/** Antimony 116 */   Sb116(115.906793100000000),
		/** Antimony 117 */   Sb117(116.904841500000000),
		/** Antimony 118 */   Sb118(117.905532100000000),
		/** Antimony 119 */   Sb119(118.903945500000000),
		/** Antimony 120 */   Sb120(119.905079400000000),
		/** Antimony 121 */   Sb121(120.903812000000000),
		/** Antimony 123 */   Sb123(122.904213200000000),
		/** Antimony 124 */   Sb124(123.905935000000000),
		/** Antimony 125 */   Sb125(124.905253000000000),
		/** Antimony 126 */   Sb126(125.907253000000000),
		/** Antimony 127 */   Sb127(126.906924300000000),
		/** Antimony 128 */   Sb128(127.909146000000000),
		/** Antimony 129 */   Sb129(128.909147000000000),
		/** Antimony 130 */   Sb130(129.911662000000000),
		/** Antimony 131 */   Sb131(130.911988800000000),
		/** Antimony 132 */   Sb132(131.914507700000000),
		/** Antimony 133 */   Sb133(132.915273200000000),
		/** Antimony 134 */   Sb134(133.920535700000000),
		/** Antimony 135 */   Sb135(134.925185100000000),
		/** Antimony 136 */   Sb136(135.930745900000000),
		/** Antimony 137 */   Sb137(136.935550000000000),
		/** Antimony 138 */   Sb138(137.941450000000000),
		/** Antimony 139 */   Sb139(138.946550000000000),
		/** Antimony 140 */   Sb140(139.952830000000000),;

		private double atomicMass;

		Sb(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Sb; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Tellurium (cf. {@link Element#Te}) isotopes. */
	public enum Te implements Isotope {

		/** Tellurium 105 */  Te105(104.943300000000000),
		/** Tellurium 106 */  Te106(105.937500000000000),
		/** Tellurium 107 */  Te107(106.935012000000000),
		/** Tellurium 108 */  Te108(107.929380500000000),
		/** Tellurium 109 */  Te109(108.927304500000000),
		/** Tellurium 110 */  Te110(109.922458100000000),
		/** Tellurium 111 */  Te111(110.921000600000000),
		/** Tellurium 112 */  Te112(111.916727900000000),
		/** Tellurium 113 */  Te113(112.915891000000000),
		/** Tellurium 114 */  Te114(113.912089000000000),
		/** Tellurium 115 */  Te115(114.911902000000000),
		/** Tellurium 116 */  Te116(115.908460000000000),
		/** Tellurium 117 */  Te117(116.908646000000000),
		/** Tellurium 118 */  Te118(117.905854000000000),
		/** Tellurium 119 */  Te119(118.906407100000000),
		/** Tellurium 120 */  Te120(119.904059300000000),
		/** Tellurium 121 */  Te121(120.904944000000000),
		/** Tellurium 122 */  Te122(121.903043500000000),
		/** Tellurium 123 */  Te123(122.904269800000000),
		/** Tellurium 124 */  Te124(123.902817100000000),
		/** Tellurium 125 */  Te125(124.904429900000000),
		/** Tellurium 126 */  Te126(125.903310900000000),
		/** Tellurium 127 */  Te127(126.905225700000000),
		/** Tellurium 129 */  Te129(128.906596460000000),
		/** Tellurium 130 */  Te130(129.906222748000000),
		/** Tellurium 131 */  Te131(130.908522213000000),
		/** Tellurium 132 */  Te132(131.908546700000000),
		/** Tellurium 133 */  Te133(132.910968800000000),
		/** Tellurium 134 */  Te134(133.911394000000000),
		/** Tellurium 135 */  Te135(134.916555700000000),
		/** Tellurium 136 */  Te136(135.920100600000000),
		/** Tellurium 137 */  Te137(136.925598900000000),
		/** Tellurium 138 */  Te138(137.929472200000000),
		/** Tellurium 139 */  Te139(138.935367200000000),
		/** Tellurium 140 */  Te140(139.939499000000000),
		/** Tellurium 141 */  Te141(140.945800000000000),
		/** Tellurium 142 */  Te142(141.950220000000000),
		/** Tellurium 143 */  Te143(142.956760000000000),;

		private double atomicMass;

		Te(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Te; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Iodine (cf. {@link Element#I}) isotopes. */
	public enum I implements Isotope {

		/** Iodine 107 */      I107(106.946780000000000),
		/** Iodine 108 */      I108(107.943480000000000),
		/** Iodine 109 */      I109(108.938085300000000),
		/** Iodine 110 */      I110(109.935089000000000),
		/** Iodine 111 */      I111(110.930269200000000),
		/** Iodine 112 */      I112(111.928005000000000),
		/** Iodine 113 */      I113(112.923650100000000),
		/** Iodine 114 */      I114(113.921850000000000),
		/** Iodine 115 */      I115(114.918048000000000),
		/** Iodine 116 */      I116(115.916810000000000),
		/** Iodine 117 */      I117(116.913648000000000),
		/** Iodine 118 */      I118(117.913074000000000),
		/** Iodine 119 */      I119(118.910074000000000),
		/** Iodine 120 */      I120(119.910087000000000),
		/** Iodine 121 */      I121(120.907405100000000),
		/** Iodine 122 */      I122(121.907588800000000),
		/** Iodine 123 */      I123(122.905588500000000),
		/** Iodine 124 */      I124(123.906209000000000),
		/** Iodine 125 */      I125(124.904629400000000),
		/** Iodine 126 */      I126(125.905623300000000),
		/** Iodine 128 */      I128(127.905808600000000),
		/** Iodine 129 */      I129(128.904983700000000),
		/** Iodine 130 */      I130(129.906670200000000),
		/** Iodine 131 */      I131(130.906126300000000),
		/** Iodine 132 */      I132(131.907993500000000),
		/** Iodine 133 */      I133(132.907797000000000),
		/** Iodine 134 */      I134(133.909758800000000),
		/** Iodine 135 */      I135(134.910048800000000),
		/** Iodine 136 */      I136(135.914604000000000),
		/** Iodine 137 */      I137(136.918028200000000),
		/** Iodine 138 */      I138(137.922726400000000),
		/** Iodine 139 */      I139(138.926506000000000),
		/** Iodine 140 */      I140(139.931730000000000),
		/** Iodine 141 */      I141(140.935690000000000),
		/** Iodine 142 */      I142(141.941200000000000),
		/** Iodine 143 */      I143(142.945650000000000),
		/** Iodine 144 */      I144(143.951390000000000),
		/** Iodine 145 */      I145(144.956050000000000),;

		private double atomicMass;

		I(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.I; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Xenon (cf. {@link Element#Xe}) isotopes. */
	public enum Xe implements Isotope {

		/** Xenon 109 */      Xe109(108.950430000000000),
		/** Xenon 110 */      Xe110(109.944260000000000),
		/** Xenon 111 */      Xe111(110.941607000000000),
		/** Xenon 112 */      Xe112(111.935559000000000),
		/** Xenon 113 */      Xe113(112.933221700000000),
		/** Xenon 114 */      Xe114(113.927980000000000),
		/** Xenon 115 */      Xe115(114.926294000000000),
		/** Xenon 116 */      Xe116(115.921581000000000),
		/** Xenon 117 */      Xe117(116.920359000000000),
		/** Xenon 118 */      Xe118(117.916179000000000),
		/** Xenon 119 */      Xe119(118.915411000000000),
		/** Xenon 120 */      Xe120(119.911784000000000),
		/** Xenon 121 */      Xe121(120.911453000000000),
		/** Xenon 122 */      Xe122(121.908368000000000),
		/** Xenon 123 */      Xe123(122.908482000000000),
		/** Xenon 124 */      Xe124(123.905892000000000),
		/** Xenon 125 */      Xe125(124.906394400000000),
		/** Xenon 126 */      Xe126(125.904298300000000),
		/** Xenon 127 */      Xe127(126.905182900000000),
		/** Xenon 128 */      Xe128(127.903531000000000),
		/** Xenon 129 */      Xe129(128.904780861100000),
		/** Xenon 130 */      Xe130(129.903509349000000),
		/** Xenon 132 */      Xe132(131.904155085600000),
		/** Xenon 133 */      Xe133(132.905910800000000),
		/** Xenon 134 */      Xe134(133.905394660000000),
		/** Xenon 135 */      Xe135(134.907227800000000),
		/** Xenon 136 */      Xe136(135.907214484000000),
		/** Xenon 137 */      Xe137(136.911557780000000),
		/** Xenon 138 */      Xe138(137.914146300000000),
		/** Xenon 139 */      Xe139(138.918792200000000),
		/** Xenon 140 */      Xe140(139.921645800000000),
		/** Xenon 141 */      Xe141(140.926787200000000),
		/** Xenon 142 */      Xe142(141.929973100000000),
		/** Xenon 143 */      Xe143(142.935369600000000),
		/** Xenon 144 */      Xe144(143.938945100000000),
		/** Xenon 145 */      Xe145(144.944720000000000),
		/** Xenon 146 */      Xe146(145.948518000000000),
		/** Xenon 147 */      Xe147(146.954260000000000),
		/** Xenon 148 */      Xe148(147.958130000000000),;

		private double atomicMass;

		Xe(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Xe; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Caesium (cf. {@link Element#Cs}) isotopes. */
	public enum Cs implements Isotope {

		/** Caesium 112 */    Cs112(111.950309000000000),
		/** Caesium 113 */    Cs113(112.944429100000000),
		/** Caesium 114 */    Cs114(113.941296000000000),
		/** Caesium 115 */    Cs115(114.935910000000000),
		/** Caesium 116 */    Cs116(115.933370000000000),
		/** Caesium 117 */    Cs117(116.928617000000000),
		/** Caesium 118 */    Cs118(117.926560000000000),
		/** Caesium 119 */    Cs119(118.922377000000000),
		/** Caesium 120 */    Cs120(119.920677000000000),
		/** Caesium 121 */    Cs121(120.917227000000000),
		/** Caesium 122 */    Cs122(121.916108000000000),
		/** Caesium 123 */    Cs123(122.912996000000000),
		/** Caesium 124 */    Cs124(123.912257800000000),
		/** Caesium 125 */    Cs125(124.909728000000000),
		/** Caesium 126 */    Cs126(125.909446000000000),
		/** Caesium 127 */    Cs127(126.907417400000000),
		/** Caesium 128 */    Cs128(127.907748700000000),
		/** Caesium 129 */    Cs129(128.906065700000000),
		/** Caesium 130 */    Cs130(129.906709300000000),
		/** Caesium 131 */    Cs131(130.905464900000000),
		/** Caesium 132 */    Cs132(131.906433900000000),
		/** Caesium 134 */    Cs134(133.906718503000000),
		/** Caesium 135 */    Cs135(134.905977000000000),
		/** Caesium 136 */    Cs136(135.907311400000000),
		/** Caesium 137 */    Cs137(136.907089230000000),
		/** Caesium 138 */    Cs138(137.911017100000000),
		/** Caesium 139 */    Cs139(138.913363800000000),
		/** Caesium 140 */    Cs140(139.917283100000000),
		/** Caesium 141 */    Cs141(140.920045500000000),
		/** Caesium 142 */    Cs142(141.924296000000000),
		/** Caesium 143 */    Cs143(142.927349000000000),
		/** Caesium 144 */    Cs144(143.932076000000000),
		/** Caesium 145 */    Cs145(144.935527000000000),
		/** Caesium 146 */    Cs146(145.940344000000000),
		/** Caesium 147 */    Cs147(146.944156000000000),
		/** Caesium 148 */    Cs148(147.949230000000000),
		/** Caesium 149 */    Cs149(148.953020000000000),
		/** Caesium 150 */    Cs150(149.958330000000000),
		/** Caesium 151 */    Cs151(150.962580000000000),;

		private double atomicMass;

		Cs(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Cs; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Barium (cf. {@link Element#Ba}) isotopes. */
	public enum Ba implements Isotope {

		/** Barium 114 */     Ba114(113.950660000000000),
		/** Barium 115 */     Ba115(114.947370000000000),
		/** Barium 116 */     Ba116(115.941280000000000),
		/** Barium 117 */     Ba117(116.938140000000000),
		/** Barium 118 */     Ba118(117.933060000000000),
		/** Barium 119 */     Ba119(118.930660000000000),
		/** Barium 120 */     Ba120(119.926050000000000),
		/** Barium 121 */     Ba121(120.924050000000000),
		/** Barium 122 */     Ba122(121.919904000000000),
		/** Barium 123 */     Ba123(122.918781000000000),
		/** Barium 124 */     Ba124(123.915094000000000),
		/** Barium 125 */     Ba125(124.914472000000000),
		/** Barium 126 */     Ba126(125.911250000000000),
		/** Barium 127 */     Ba127(126.911091000000000),
		/** Barium 128 */     Ba128(127.908342000000000),
		/** Barium 129 */     Ba129(128.908681000000000),
		/** Barium 130 */     Ba130(129.906320700000000),
		/** Barium 131 */     Ba131(130.906941000000000),
		/** Barium 132 */     Ba132(131.905061100000000),
		/** Barium 133 */     Ba133(132.906007400000000),
		/** Barium 134 */     Ba134(133.904508180000000),
		/** Barium 135 */     Ba135(134.905688380000000),
		/** Barium 136 */     Ba136(135.904575730000000),
		/** Barium 138 */     Ba138(137.905247000000000),
		/** Barium 139 */     Ba139(138.908841100000000),
		/** Barium 140 */     Ba140(139.910605700000000),
		/** Barium 141 */     Ba141(140.914403300000000),
		/** Barium 142 */     Ba142(141.916432400000000),
		/** Barium 143 */     Ba143(142.920625300000000),
		/** Barium 144 */     Ba144(143.922954900000000),
		/** Barium 145 */     Ba145(144.927518400000000),
		/** Barium 146 */     Ba146(145.930284000000000),
		/** Barium 147 */     Ba147(146.935304000000000),
		/** Barium 148 */     Ba148(147.938171000000000),
		/** Barium 149 */     Ba149(148.943080000000000),
		/** Barium 150 */     Ba150(149.946050000000000),
		/** Barium 151 */     Ba151(150.951270000000000),
		/** Barium 152 */     Ba152(151.954810000000000),
		/** Barium 153 */     Ba153(152.960360000000000),;

		private double atomicMass;

		Ba(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ba; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Lanthanum (cf. {@link Element#La}) isotopes. */
	public enum La implements Isotope {

		/** Lanthanum 116 */  La116(115.956300000000000),
		/** Lanthanum 117 */  La117(116.949990000000000),
		/** Lanthanum 118 */  La118(117.946730000000000),
		/** Lanthanum 119 */  La119(118.940990000000000),
		/** Lanthanum 120 */  La120(119.938070000000000),
		/** Lanthanum 121 */  La121(120.933150000000000),
		/** Lanthanum 122 */  La122(121.930710000000000),
		/** Lanthanum 123 */  La123(122.926300000000000),
		/** Lanthanum 124 */  La124(123.924574000000000),
		/** Lanthanum 125 */  La125(124.920816000000000),
		/** Lanthanum 126 */  La126(125.919513000000000),
		/** Lanthanum 127 */  La127(126.916375000000000),
		/** Lanthanum 128 */  La128(127.915592000000000),
		/** Lanthanum 129 */  La129(128.912694000000000),
		/** Lanthanum 130 */  La130(129.912369000000000),
		/** Lanthanum 131 */  La131(130.910070000000000),
		/** Lanthanum 132 */  La132(131.910119000000000),
		/** Lanthanum 133 */  La133(132.908218000000000),
		/** Lanthanum 134 */  La134(133.908514000000000),
		/** Lanthanum 135 */  La135(134.906984000000000),
		/** Lanthanum 136 */  La136(135.907635000000000),
		/** Lanthanum 137 */  La137(136.906450400000000),
		/** Lanthanum 138 */  La138(137.907114900000000),
		/** Lanthanum 140 */  La140(139.909480600000000),
		/** Lanthanum 141 */  La141(140.910966000000000),
		/** Lanthanum 142 */  La142(141.914090900000000),
		/** Lanthanum 143 */  La143(142.916079500000000),
		/** Lanthanum 144 */  La144(143.919646000000000),
		/** Lanthanum 145 */  La145(144.921808000000000),
		/** Lanthanum 146 */  La146(145.925875000000000),
		/** Lanthanum 147 */  La147(146.928418000000000),
		/** Lanthanum 148 */  La148(147.932679000000000),
		/** Lanthanum 149 */  La149(148.935350000000000),
		/** Lanthanum 150 */  La150(149.939470000000000),
		/** Lanthanum 151 */  La151(150.942320000000000),
		/** Lanthanum 152 */  La152(151.946820000000000),
		/** Lanthanum 153 */  La153(152.950360000000000),
		/** Lanthanum 154 */  La154(153.955170000000000),
		/** Lanthanum 155 */  La155(154.959010000000000),;

		private double atomicMass;

		La(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.La; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Cerium (cf. {@link Element#Ce}) isotopes. */
	public enum Ce implements Isotope {

		/** Cerium 119 */     Ce119(118.952710000000000),
		/** Cerium 120 */     Ce120(119.946540000000000),
		/** Cerium 121 */     Ce121(120.943350000000000),
		/** Cerium 122 */     Ce122(121.937870000000000),
		/** Cerium 123 */     Ce123(122.935280000000000),
		/** Cerium 124 */     Ce124(123.930310000000000),
		/** Cerium 125 */     Ce125(124.928440000000000),
		/** Cerium 126 */     Ce126(125.923971000000000),
		/** Cerium 127 */     Ce127(126.922727000000000),
		/** Cerium 128 */     Ce128(127.918911000000000),
		/** Cerium 129 */     Ce129(128.918102000000000),
		/** Cerium 130 */     Ce130(129.914736000000000),
		/** Cerium 131 */     Ce131(130.914429000000000),
		/** Cerium 132 */     Ce132(131.911464000000000),
		/** Cerium 133 */     Ce133(132.911520000000000),
		/** Cerium 134 */     Ce134(133.908928000000000),
		/** Cerium 135 */     Ce135(134.909161000000000),
		/** Cerium 136 */     Ce136(135.907129210000000),
		/** Cerium 137 */     Ce137(136.907762360000000),
		/** Cerium 138 */     Ce138(137.905991000000000),
		/** Cerium 139 */     Ce139(138.906655100000000),
		/** Cerium 141 */     Ce141(140.908280700000000),
		/** Cerium 142 */     Ce142(141.909250400000000),
		/** Cerium 143 */     Ce143(142.912392100000000),
		/** Cerium 144 */     Ce144(143.913652900000000),
		/** Cerium 145 */     Ce145(144.917265000000000),
		/** Cerium 146 */     Ce146(145.918802000000000),
		/** Cerium 147 */     Ce147(146.922689900000000),
		/** Cerium 148 */     Ce148(147.924424000000000),
		/** Cerium 149 */     Ce149(148.928427000000000),
		/** Cerium 150 */     Ce150(149.930384000000000),
		/** Cerium 151 */     Ce151(150.934272000000000),
		/** Cerium 152 */     Ce152(151.936600000000000),
		/** Cerium 153 */     Ce153(152.940930000000000),
		/** Cerium 154 */     Ce154(153.943800000000000),
		/** Cerium 155 */     Ce155(154.948550000000000),
		/** Cerium 156 */     Ce156(155.951830000000000),
		/** Cerium 157 */     Ce157(156.957050000000000),;

		private double atomicMass;

		Ce(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ce; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Praseodymium (cf. {@link Element#Pr}) isotopes. */
	public enum Pr implements Isotope {

		/** Praseodymium 121 */Pr121(120.955320000000000),
		/** Praseodymium 122 */Pr122(121.951750000000000),
		/** Praseodymium 123 */Pr123(122.945960000000000),
		/** Praseodymium 124 */Pr124(123.942940000000000),
		/** Praseodymium 125 */Pr125(124.937700000000000),
		/** Praseodymium 126 */Pr126(125.935240000000000),
		/** Praseodymium 127 */Pr127(126.930710000000000),
		/** Praseodymium 128 */Pr128(127.928791000000000),
		/** Praseodymium 129 */Pr129(128.925095000000000),
		/** Praseodymium 130 */Pr130(129.923590000000000),
		/** Praseodymium 131 */Pr131(130.920235000000000),
		/** Praseodymium 132 */Pr132(131.919255000000000),
		/** Praseodymium 133 */Pr133(132.916331000000000),
		/** Praseodymium 134 */Pr134(133.915697000000000),
		/** Praseodymium 135 */Pr135(134.913112000000000),
		/** Praseodymium 136 */Pr136(135.912677000000000),
		/** Praseodymium 137 */Pr137(136.910679200000000),
		/** Praseodymium 138 */Pr138(137.910754000000000),
		/** Praseodymium 139 */Pr139(138.908940800000000),
		/** Praseodymium 140 */Pr140(139.909080300000000),
		/** Praseodymium 142 */Pr142(141.910049600000000),
		/** Praseodymium 143 */Pr143(142.910822800000000),
		/** Praseodymium 144 */Pr144(143.913310900000000),
		/** Praseodymium 145 */Pr145(144.914518200000000),
		/** Praseodymium 146 */Pr146(145.917680000000000),
		/** Praseodymium 147 */Pr147(146.919008000000000),
		/** Praseodymium 148 */Pr148(147.922130000000000),
		/** Praseodymium 149 */Pr149(148.923736000000000),
		/** Praseodymium 150 */Pr150(149.926676500000000),
		/** Praseodymium 151 */Pr151(150.928309000000000),
		/** Praseodymium 152 */Pr152(151.931553000000000),
		/** Praseodymium 153 */Pr153(152.933904000000000),
		/** Praseodymium 154 */Pr154(153.937530000000000),
		/** Praseodymium 155 */Pr155(154.940509000000000),
		/** Praseodymium 156 */Pr156(155.944640000000000),
		/** Praseodymium 157 */Pr157(156.947890000000000),
		/** Praseodymium 158 */Pr158(157.952410000000000),
		/** Praseodymium 159 */Pr159(158.955890000000000),;

		private double atomicMass;

		Pr(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Pr; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Neodymium (cf. {@link Element#Nd}) isotopes. */
	public enum Nd implements Isotope {

		/** Neodymium 124 */  Nd124(123.952200000000000),
		/** Neodymium 125 */  Nd125(124.948900000000000),
		/** Neodymium 126 */  Nd126(125.943110000000000),
		/** Neodymium 127 */  Nd127(126.940380000000000),
		/** Neodymium 128 */  Nd128(127.935250000000000),
		/** Neodymium 129 */  Nd129(128.933100000000000),
		/** Neodymium 130 */  Nd130(129.928506000000000),
		/** Neodymium 131 */  Nd131(130.927248000000000),
		/** Neodymium 132 */  Nd132(131.923321000000000),
		/** Neodymium 133 */  Nd133(132.922348000000000),
		/** Neodymium 134 */  Nd134(133.918790000000000),
		/** Neodymium 135 */  Nd135(134.918181000000000),
		/** Neodymium 136 */  Nd136(135.914976000000000),
		/** Neodymium 137 */  Nd137(136.914562000000000),
		/** Neodymium 138 */  Nd138(137.911950000000000),
		/** Neodymium 139 */  Nd139(138.911954000000000),
		/** Neodymium 140 */  Nd140(139.909550000000000),
		/** Neodymium 141 */  Nd141(140.909614700000000),
		/** Neodymium 142 */  Nd142(141.907729000000000),
		/** Neodymium 143 */  Nd143(142.909820000000000),
		/** Neodymium 145 */  Nd145(144.912579300000000),
		/** Neodymium 146 */  Nd146(145.913122600000000),
		/** Neodymium 147 */  Nd147(146.916106100000000),
		/** Neodymium 148 */  Nd148(147.916899300000000),
		/** Neodymium 149 */  Nd149(148.920154800000000),
		/** Neodymium 150 */  Nd150(149.920902200000000),
		/** Neodymium 151 */  Nd151(150.923840300000000),
		/** Neodymium 152 */  Nd152(151.924692000000000),
		/** Neodymium 153 */  Nd153(152.927718000000000),
		/** Neodymium 154 */  Nd154(153.929480000000000),
		/** Neodymium 155 */  Nd155(154.933135700000000),
		/** Neodymium 156 */  Nd156(155.935080000000000),
		/** Neodymium 157 */  Nd157(156.939386000000000),
		/** Neodymium 158 */  Nd158(157.941970000000000),
		/** Neodymium 159 */  Nd159(158.946530000000000),
		/** Neodymium 160 */  Nd160(159.949400000000000),
		/** Neodymium 161 */  Nd161(160.954280000000000),;

		private double atomicMass;

		Nd(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Nd; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Promethium (cf. {@link Element#Pm}) isotopes. */
	public enum Pm implements Isotope {

		/** Promethium 126 */ Pm126(125.957920000000000),
		/** Promethium 127 */ Pm127(126.951920000000000),
		/** Promethium 128 */ Pm128(127.948700000000000),
		/** Promethium 129 */ Pm129(128.943230000000000),
		/** Promethium 130 */ Pm130(129.940530000000000),
		/** Promethium 131 */ Pm131(130.935670000000000),
		/** Promethium 132 */ Pm132(131.933840000000000),
		/** Promethium 133 */ Pm133(132.929782000000000),
		/** Promethium 134 */ Pm134(133.928353000000000),
		/** Promethium 135 */ Pm135(134.924823000000000),
		/** Promethium 136 */ Pm136(135.923585000000000),
		/** Promethium 137 */ Pm137(136.920480000000000),
		/** Promethium 138 */ Pm138(137.919548000000000),
		/** Promethium 139 */ Pm139(138.916800000000000),
		/** Promethium 140 */ Pm140(139.916040000000000),
		/** Promethium 141 */ Pm141(140.913555000000000),
		/** Promethium 142 */ Pm142(141.912890000000000),
		/** Promethium 143 */ Pm143(142.910938300000000),
		/** Promethium 144 */ Pm144(143.912596400000000),
		/** Promethium 146 */ Pm146(145.914702400000000),
		/** Promethium 147 */ Pm147(146.915145000000000),
		/** Promethium 148 */ Pm148(147.917481900000000),
		/** Promethium 149 */ Pm149(148.918342300000000),
		/** Promethium 150 */ Pm150(149.920991000000000),
		/** Promethium 151 */ Pm151(150.921217500000000),
		/** Promethium 152 */ Pm152(151.923506000000000),
		/** Promethium 153 */ Pm153(152.924156700000000),
		/** Promethium 154 */ Pm154(153.926472000000000),
		/** Promethium 155 */ Pm155(154.928137000000000),
		/** Promethium 156 */ Pm156(155.931117500000000),
		/** Promethium 157 */ Pm157(156.933121400000000),
		/** Promethium 158 */ Pm158(157.936565000000000),
		/** Promethium 159 */ Pm159(158.939287000000000),
		/** Promethium 160 */ Pm160(159.943100000000000),
		/** Promethium 161 */ Pm161(160.946070000000000),
		/** Promethium 162 */ Pm162(161.950220000000000),
		/** Promethium 163 */ Pm163(162.953570000000000),;

		private double atomicMass;

		Pm(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Pm; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Samarium (cf. {@link Element#Sm}) isotopes. */
	public enum Sm implements Isotope {

		/** Samarium 128 */   Sm128(127.958420000000000),
		/** Samarium 129 */   Sm129(128.954760000000000),
		/** Samarium 130 */   Sm130(129.949000000000000),
		/** Samarium 131 */   Sm131(130.946180000000000),
		/** Samarium 132 */   Sm132(131.940870000000000),
		/** Samarium 133 */   Sm133(132.938560000000000),
		/** Samarium 134 */   Sm134(133.934110000000000),
		/** Samarium 135 */   Sm135(134.932520000000000),
		/** Samarium 136 */   Sm136(135.928276000000000),
		/** Samarium 137 */   Sm137(136.926971000000000),
		/** Samarium 138 */   Sm138(137.923244000000000),
		/** Samarium 139 */   Sm139(138.922297000000000),
		/** Samarium 140 */   Sm140(139.918995000000000),
		/** Samarium 141 */   Sm141(140.918481600000000),
		/** Samarium 142 */   Sm142(141.915204400000000),
		/** Samarium 143 */   Sm143(142.914635300000000),
		/** Samarium 144 */   Sm144(143.912006500000000),
		/** Samarium 145 */   Sm145(144.913417300000000),
		/** Samarium 146 */   Sm146(145.913047000000000),
		/** Samarium 147 */   Sm147(146.914904400000000),
		/** Samarium 148 */   Sm148(147.914829200000000),
		/** Samarium 149 */   Sm149(148.917192100000000),
		/** Samarium 151 */   Sm151(150.919939800000000),
		/** Samarium 152 */   Sm152(151.919739700000000),
		/** Samarium 153 */   Sm153(152.922104700000000),
		/** Samarium 154 */   Sm154(153.922216900000000),
		/** Samarium 155 */   Sm155(154.924647700000000),
		/** Samarium 156 */   Sm156(155.925536000000000),
		/** Samarium 157 */   Sm157(156.928418700000000),
		/** Samarium 158 */   Sm158(157.929951000000000),
		/** Samarium 159 */   Sm159(158.933217200000000),
		/** Samarium 160 */   Sm160(159.935335300000000),
		/** Samarium 161 */   Sm161(160.939160200000000),
		/** Samarium 162 */   Sm162(161.941460000000000),
		/** Samarium 163 */   Sm163(162.945550000000000),
		/** Samarium 164 */   Sm164(163.948360000000000),
		/** Samarium 165 */   Sm165(164.952970000000000),;

		private double atomicMass;

		Sm(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Sm; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Europium (cf. {@link Element#Eu}) isotopes. */
	public enum Eu implements Isotope {

		/** Europium 130 */   Eu130(129.963690000000000),
		/** Europium 131 */   Eu131(130.957840000000000),
		/** Europium 132 */   Eu132(131.954670000000000),
		/** Europium 133 */   Eu133(132.949290000000000),
		/** Europium 134 */   Eu134(133.946400000000000),
		/** Europium 135 */   Eu135(134.941870000000000),
		/** Europium 136 */   Eu136(135.939620000000000),
		/** Europium 137 */   Eu137(136.935460000000000),
		/** Europium 138 */   Eu138(137.933709000000000),
		/** Europium 139 */   Eu139(138.929792000000000),
		/** Europium 140 */   Eu140(139.928088000000000),
		/** Europium 141 */   Eu141(140.924932000000000),
		/** Europium 142 */   Eu142(141.923442000000000),
		/** Europium 143 */   Eu143(142.920299000000000),
		/** Europium 144 */   Eu144(143.918820000000000),
		/** Europium 145 */   Eu145(144.916272600000000),
		/** Europium 146 */   Eu146(145.917211000000000),
		/** Europium 147 */   Eu147(146.916752700000000),
		/** Europium 148 */   Eu148(147.918089000000000),
		/** Europium 149 */   Eu149(148.917937800000000),
		/** Europium 150 */   Eu150(149.919707700000000),
		/** Europium 151 */   Eu151(150.919857800000000),
		/** Europium 153 */   Eu153(152.921238000000000),
		/** Europium 154 */   Eu154(153.922987000000000),
		/** Europium 155 */   Eu155(154.922901100000000),
		/** Europium 156 */   Eu156(155.924760500000000),
		/** Europium 157 */   Eu157(156.925433400000000),
		/** Europium 158 */   Eu158(157.927799000000000),
		/** Europium 159 */   Eu159(158.929100100000000),
		/** Europium 160 */   Eu160(159.931851000000000),
		/** Europium 161 */   Eu161(160.933664000000000),
		/** Europium 162 */   Eu162(161.936989000000000),
		/** Europium 163 */   Eu163(162.939196000000000),
		/** Europium 164 */   Eu164(163.942740000000000),
		/** Europium 165 */   Eu165(164.945590000000000),
		/** Europium 166 */   Eu166(165.949620000000000),
		/** Europium 167 */   Eu167(166.952890000000000),;

		private double atomicMass;

		Eu(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Eu; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Gadolinium (cf. {@link Element#Gd}) isotopes. */
	public enum Gd implements Isotope {

		/** Gadolinium 133 */ Gd133(132.961330000000000),
		/** Gadolinium 134 */ Gd134(133.955660000000000),
		/** Gadolinium 135 */ Gd135(134.952450000000000),
		/** Gadolinium 136 */ Gd136(135.947300000000000),
		/** Gadolinium 137 */ Gd137(136.945020000000000),
		/** Gadolinium 138 */ Gd138(137.940250000000000),
		/** Gadolinium 139 */ Gd139(138.938130000000000),
		/** Gadolinium 140 */ Gd140(139.933674000000000),
		/** Gadolinium 141 */ Gd141(140.932126000000000),
		/** Gadolinium 142 */ Gd142(141.928116000000000),
		/** Gadolinium 143 */ Gd143(142.926750000000000),
		/** Gadolinium 144 */ Gd144(143.922963000000000),
		/** Gadolinium 145 */ Gd145(144.921713000000000),
		/** Gadolinium 146 */ Gd146(145.918318800000000),
		/** Gadolinium 147 */ Gd147(146.919101400000000),
		/** Gadolinium 148 */ Gd148(147.918121500000000),
		/** Gadolinium 149 */ Gd149(148.919348100000000),
		/** Gadolinium 150 */ Gd150(149.918664400000000),
		/** Gadolinium 151 */ Gd151(150.920356000000000),
		/** Gadolinium 152 */ Gd152(151.919799500000000),
		/** Gadolinium 153 */ Gd153(152.921758000000000),
		/** Gadolinium 154 */ Gd154(153.920874100000000),
		/** Gadolinium 155 */ Gd155(154.922630500000000),
		/** Gadolinium 156 */ Gd156(155.922131200000000),
		/** Gadolinium 158 */ Gd158(157.924112300000000),
		/** Gadolinium 159 */ Gd159(158.926397000000000),
		/** Gadolinium 160 */ Gd160(159.927062400000000),
		/** Gadolinium 161 */ Gd161(160.929677500000000),
		/** Gadolinium 162 */ Gd162(161.930993000000000),
		/** Gadolinium 163 */ Gd163(162.934176900000000),
		/** Gadolinium 164 */ Gd164(163.935830000000000),
		/** Gadolinium 165 */ Gd165(164.939360000000000),
		/** Gadolinium 166 */ Gd166(165.941460000000000),
		/** Gadolinium 167 */ Gd167(166.945450000000000),
		/** Gadolinium 168 */ Gd168(167.948080000000000),
		/** Gadolinium 169 */ Gd169(168.952600000000000),;

		private double atomicMass;

		Gd(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Gd; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Terbium (cf. {@link Element#Tb}) isotopes. */
	public enum Tb implements Isotope {

		/** Terbium 135 */    Tb135(134.964760000000000),
		/** Terbium 136 */    Tb136(135.961290000000000),
		/** Terbium 137 */    Tb137(136.956020000000000),
		/** Terbium 138 */    Tb138(137.953120000000000),
		/** Terbium 139 */    Tb139(138.948330000000000),
		/** Terbium 140 */    Tb140(139.945810000000000),
		/** Terbium 141 */    Tb141(140.941450000000000),
		/** Terbium 142 */    Tb142(141.939280000000000),
		/** Terbium 143 */    Tb143(142.935137000000000),
		/** Terbium 144 */    Tb144(143.933045000000000),
		/** Terbium 145 */    Tb145(144.928820000000000),
		/** Terbium 146 */    Tb146(145.927253000000000),
		/** Terbium 147 */    Tb147(146.924054800000000),
		/** Terbium 148 */    Tb148(147.924282000000000),
		/** Terbium 149 */    Tb149(148.923253500000000),
		/** Terbium 150 */    Tb150(149.923664900000000),
		/** Terbium 151 */    Tb151(150.923109600000000),
		/** Terbium 152 */    Tb152(151.924083000000000),
		/** Terbium 153 */    Tb153(152.923442400000000),
		/** Terbium 154 */    Tb154(153.924685000000000),
		/** Terbium 155 */    Tb155(154.923511000000000),
		/** Terbium 156 */    Tb156(155.924755200000000),
		/** Terbium 157 */    Tb157(156.924033000000000),
		/** Terbium 158 */    Tb158(157.925420900000000),
		/** Terbium 160 */    Tb160(159.927175600000000),
		/** Terbium 161 */    Tb161(160.927577800000000),
		/** Terbium 162 */    Tb162(161.929495000000000),
		/** Terbium 163 */    Tb163(162.930654700000000),
		/** Terbium 164 */    Tb164(163.933360000000000),
		/** Terbium 165 */    Tb165(164.934980000000000),
		/** Terbium 166 */    Tb166(165.937860000000000),
		/** Terbium 167 */    Tb167(166.939960000000000),
		/** Terbium 168 */    Tb168(167.943400000000000),
		/** Terbium 169 */    Tb169(168.945970000000000),
		/** Terbium 170 */    Tb170(169.949840000000000),
		/** Terbium 171 */    Tb171(170.952730000000000),;

		private double atomicMass;

		Tb(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Tb; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Dysprosium (cf. {@link Element#Dy}) isotopes. */
	public enum Dy implements Isotope {

		/** Dysprosium 138 */ Dy138(137.962500000000000),
		/** Dysprosium 139 */ Dy139(138.959590000000000),
		/** Dysprosium 140 */ Dy140(139.954020000000000),
		/** Dysprosium 141 */ Dy141(140.951280000000000),
		/** Dysprosium 142 */ Dy142(141.946190000000000),
		/** Dysprosium 143 */ Dy143(142.943994000000000),
		/** Dysprosium 144 */ Dy144(143.939269500000000),
		/** Dysprosium 145 */ Dy145(144.937474000000000),
		/** Dysprosium 146 */ Dy146(145.932844500000000),
		/** Dysprosium 147 */ Dy147(146.931082700000000),
		/** Dysprosium 148 */ Dy148(147.927157000000000),
		/** Dysprosium 149 */ Dy149(148.927322000000000),
		/** Dysprosium 150 */ Dy150(149.925593300000000),
		/** Dysprosium 151 */ Dy151(150.926191600000000),
		/** Dysprosium 152 */ Dy152(151.924725300000000),
		/** Dysprosium 153 */ Dy153(152.925772400000000),
		/** Dysprosium 154 */ Dy154(153.924429300000000),
		/** Dysprosium 155 */ Dy155(154.925759000000000),
		/** Dysprosium 156 */ Dy156(155.924284700000000),
		/** Dysprosium 157 */ Dy157(156.925470700000000),
		/** Dysprosium 158 */ Dy158(157.924415900000000),
		/** Dysprosium 159 */ Dy159(158.925747000000000),
		/** Dysprosium 160 */ Dy160(159.925204600000000),
		/** Dysprosium 161 */ Dy161(160.926940500000000),
		/** Dysprosium 162 */ Dy162(161.926805600000000),
		/** Dysprosium 164 */ Dy164(163.929181900000000),
		/** Dysprosium 165 */ Dy165(164.931710500000000),
		/** Dysprosium 166 */ Dy166(165.932813900000000),
		/** Dysprosium 167 */ Dy167(166.935661000000000),
		/** Dysprosium 168 */ Dy168(167.937130000000000),
		/** Dysprosium 169 */ Dy169(168.940310000000000),
		/** Dysprosium 170 */ Dy170(169.942390000000000),
		/** Dysprosium 171 */ Dy171(170.946120000000000),
		/** Dysprosium 172 */ Dy172(171.948460000000000),
		/** Dysprosium 173 */ Dy173(172.952830000000000),;

		private double atomicMass;

		Dy(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Dy; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Holmium (cf. {@link Element#Ho}) isotopes. */
	public enum Ho implements Isotope {

		/** Holmium 140 */    Ho140(139.968590000000000),
		/** Holmium 141 */    Ho141(140.963110000000000),
		/** Holmium 142 */    Ho142(141.960010000000000),
		/** Holmium 143 */    Ho143(142.954860000000000),
		/** Holmium 144 */    Ho144(143.952109700000000),
		/** Holmium 145 */    Ho145(144.947267400000000),
		/** Holmium 146 */    Ho146(145.944993500000000),
		/** Holmium 147 */    Ho147(146.940142300000000),
		/** Holmium 148 */    Ho148(147.937744000000000),
		/** Holmium 149 */    Ho149(148.933803000000000),
		/** Holmium 150 */    Ho150(149.933498000000000),
		/** Holmium 151 */    Ho151(150.931698300000000),
		/** Holmium 152 */    Ho152(151.931724000000000),
		/** Holmium 153 */    Ho153(152.930206400000000),
		/** Holmium 154 */    Ho154(153.930606800000000),
		/** Holmium 155 */    Ho155(154.929104000000000),
		/** Holmium 156 */    Ho156(155.929706000000000),
		/** Holmium 157 */    Ho157(156.928254000000000),
		/** Holmium 158 */    Ho158(157.928946000000000),
		/** Holmium 159 */    Ho159(158.927719700000000),
		/** Holmium 160 */    Ho160(159.928737000000000),
		/** Holmium 161 */    Ho161(160.927861500000000),
		/** Holmium 162 */    Ho162(161.929102300000000),
		/** Holmium 163 */    Ho163(162.928741000000000),
		/** Holmium 164 */    Ho164(163.930240300000000),
		/** Holmium 166 */    Ho166(165.932290900000000),
		/** Holmium 167 */    Ho167(166.933138500000000),
		/** Holmium 168 */    Ho168(167.935522000000000),
		/** Holmium 169 */    Ho169(168.936878000000000),
		/** Holmium 170 */    Ho170(169.939625000000000),
		/** Holmium 171 */    Ho171(170.941470000000000),
		/** Holmium 172 */    Ho172(171.944730000000000),
		/** Holmium 173 */    Ho173(172.947020000000000),
		/** Holmium 174 */    Ho174(173.950950000000000),
		/** Holmium 175 */    Ho175(174.953620000000000),;

		private double atomicMass;

		Ho(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ho; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Erbium (cf. {@link Element#Er}) isotopes. */
	public enum Er implements Isotope {

		/** Erbium 142 */     Er142(141.970100000000000),
		/** Erbium 143 */     Er143(142.966620000000000),
		/** Erbium 144 */     Er144(143.960700000000000),
		/** Erbium 145 */     Er145(144.958050000000000),
		/** Erbium 146 */     Er146(145.952418400000000),
		/** Erbium 147 */     Er147(146.949964000000000),
		/** Erbium 148 */     Er148(147.944735000000000),
		/** Erbium 149 */     Er149(148.942306000000000),
		/** Erbium 150 */     Er150(149.937916000000000),
		/** Erbium 151 */     Er151(150.937449000000000),
		/** Erbium 152 */     Er152(151.935057000000000),
		/** Erbium 153 */     Er153(152.935080000000000),
		/** Erbium 154 */     Er154(153.932790800000000),
		/** Erbium 155 */     Er155(154.933215900000000),
		/** Erbium 156 */     Er156(155.931067000000000),
		/** Erbium 157 */     Er157(156.931949000000000),
		/** Erbium 158 */     Er158(157.929893000000000),
		/** Erbium 159 */     Er159(158.930691800000000),
		/** Erbium 160 */     Er160(159.929077000000000),
		/** Erbium 161 */     Er161(160.930004600000000),
		/** Erbium 162 */     Er162(161.928788400000000),
		/** Erbium 163 */     Er163(162.930040800000000),
		/** Erbium 164 */     Er164(163.929208800000000),
		/** Erbium 165 */     Er165(164.930734500000000),
		/** Erbium 166 */     Er166(165.930299500000000),
		/** Erbium 168 */     Er168(167.932376700000000),
		/** Erbium 169 */     Er169(168.934596800000000),
		/** Erbium 170 */     Er170(169.935470200000000),
		/** Erbium 171 */     Er171(170.938035700000000),
		/** Erbium 172 */     Er172(171.939361900000000),
		/** Erbium 173 */     Er173(172.942400000000000),
		/** Erbium 174 */     Er174(173.944230000000000),
		/** Erbium 175 */     Er175(174.947770000000000),
		/** Erbium 176 */     Er176(175.949940000000000),
		/** Erbium 177 */     Er177(176.953990000000000),;

		private double atomicMass;

		Er(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Er; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Thulium (cf. {@link Element#Tm}) isotopes. */
	public enum Tm implements Isotope {

		/** Thulium 144 */    Tm144(143.976280000000000),
		/** Thulium 145 */    Tm145(144.970390000000000),
		/** Thulium 146 */    Tm146(145.966840000000000),
		/** Thulium 147 */    Tm147(146.961379900000000),
		/** Thulium 148 */    Tm148(147.958384000000000),
		/** Thulium 149 */    Tm149(148.952890000000000),
		/** Thulium 150 */    Tm150(149.950090000000000),
		/** Thulium 151 */    Tm151(150.945488000000000),
		/** Thulium 152 */    Tm152(151.944422000000000),
		/** Thulium 153 */    Tm153(152.942040000000000),
		/** Thulium 154 */    Tm154(153.941570000000000),
		/** Thulium 155 */    Tm155(154.939210000000000),
		/** Thulium 156 */    Tm156(155.938992000000000),
		/** Thulium 157 */    Tm157(156.936944000000000),
		/** Thulium 158 */    Tm158(157.936980000000000),
		/** Thulium 159 */    Tm159(158.934975000000000),
		/** Thulium 160 */    Tm160(159.935263000000000),
		/** Thulium 161 */    Tm161(160.933549000000000),
		/** Thulium 162 */    Tm162(161.934002000000000),
		/** Thulium 163 */    Tm163(162.932659200000000),
		/** Thulium 164 */    Tm164(163.933544000000000),
		/** Thulium 165 */    Tm165(164.932443100000000),
		/** Thulium 166 */    Tm166(165.933561000000000),
		/** Thulium 167 */    Tm167(166.932856200000000),
		/** Thulium 168 */    Tm168(167.934177400000000),
		/** Thulium 170 */    Tm170(169.935806000000000),
		/** Thulium 171 */    Tm171(170.936433900000000),
		/** Thulium 172 */    Tm172(171.938405500000000),
		/** Thulium 173 */    Tm173(172.939608400000000),
		/** Thulium 174 */    Tm174(173.942173000000000),
		/** Thulium 175 */    Tm175(174.943841000000000),
		/** Thulium 176 */    Tm176(175.947000000000000),
		/** Thulium 177 */    Tm177(176.949040000000000),
		/** Thulium 178 */    Tm178(177.952640000000000),
		/** Thulium 179 */    Tm179(178.955340000000000),;

		private double atomicMass;

		Tm(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Tm; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Ytterbium (cf. {@link Element#Yb}) isotopes. */
	public enum Yb implements Isotope {

		/** Ytterbium 148 */  Yb148(147.967580000000000),
		/** Ytterbium 149 */  Yb149(148.964360000000000),
		/** Ytterbium 150 */  Yb150(149.958520000000000),
		/** Ytterbium 151 */  Yb151(150.955400000000000),
		/** Ytterbium 152 */  Yb152(151.950270000000000),
		/** Ytterbium 153 */  Yb153(152.949320000000000),
		/** Ytterbium 154 */  Yb154(153.946396000000000),
		/** Ytterbium 155 */  Yb155(154.945783000000000),
		/** Ytterbium 156 */  Yb156(155.942825000000000),
		/** Ytterbium 157 */  Yb157(156.942645000000000),
		/** Ytterbium 158 */  Yb158(157.939870500000000),
		/** Ytterbium 159 */  Yb159(158.940055000000000),
		/** Ytterbium 160 */  Yb160(159.937557000000000),
		/** Ytterbium 161 */  Yb161(160.937907000000000),
		/** Ytterbium 162 */  Yb162(161.935774000000000),
		/** Ytterbium 163 */  Yb163(162.936340000000000),
		/** Ytterbium 164 */  Yb164(163.934495000000000),
		/** Ytterbium 165 */  Yb165(164.935270000000000),
		/** Ytterbium 166 */  Yb166(165.933874700000000),
		/** Ytterbium 167 */  Yb167(166.934953000000000),
		/** Ytterbium 168 */  Yb168(167.933889600000000),
		/** Ytterbium 169 */  Yb169(168.935182500000000),
		/** Ytterbium 170 */  Yb170(169.934766400000000),
		/** Ytterbium 171 */  Yb171(170.936330200000000),
		/** Ytterbium 172 */  Yb172(171.936385900000000),
		/** Ytterbium 174 */  Yb174(173.938866400000000),
		/** Ytterbium 175 */  Yb175(174.941280800000000),
		/** Ytterbium 176 */  Yb176(175.942576400000000),
		/** Ytterbium 177 */  Yb177(176.945265600000000),
		/** Ytterbium 178 */  Yb178(177.946651000000000),
		/** Ytterbium 179 */  Yb179(178.950040000000000),
		/** Ytterbium 180 */  Yb180(179.952120000000000),
		/** Ytterbium 181 */  Yb181(180.955890000000000),;

		private double atomicMass;

		Yb(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Yb; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Lutetium (cf. {@link Element#Lu}) isotopes. */
	public enum Lu implements Isotope {

		/** Lutetium 150 */   Lu150(149.973550000000000),
		/** Lutetium 151 */   Lu151(150.967680000000000),
		/** Lutetium 152 */   Lu152(151.964120000000000),
		/** Lutetium 153 */   Lu153(152.958750000000000),
		/** Lutetium 154 */   Lu154(153.957360000000000),
		/** Lutetium 155 */   Lu155(154.954321000000000),
		/** Lutetium 156 */   Lu156(155.953033000000000),
		/** Lutetium 157 */   Lu157(156.950127000000000),
		/** Lutetium 158 */   Lu158(157.949316000000000),
		/** Lutetium 159 */   Lu159(158.946636000000000),
		/** Lutetium 160 */   Lu160(159.946033000000000),
		/** Lutetium 161 */   Lu161(160.943572000000000),
		/** Lutetium 162 */   Lu162(161.943283000000000),
		/** Lutetium 163 */   Lu163(162.941179000000000),
		/** Lutetium 164 */   Lu164(163.941339000000000),
		/** Lutetium 165 */   Lu165(164.939407000000000),
		/** Lutetium 166 */   Lu166(165.939859000000000),
		/** Lutetium 167 */   Lu167(166.938270000000000),
		/** Lutetium 168 */   Lu168(167.938736000000000),
		/** Lutetium 169 */   Lu169(168.937644100000000),
		/** Lutetium 170 */   Lu170(169.938478000000000),
		/** Lutetium 171 */   Lu171(170.937917000000000),
		/** Lutetium 172 */   Lu172(171.939089100000000),
		/** Lutetium 173 */   Lu173(172.938934000000000),
		/** Lutetium 174 */   Lu174(173.940340900000000),
		/** Lutetium 176 */   Lu176(175.942689700000000),
		/** Lutetium 177 */   Lu177(176.943761500000000),
		/** Lutetium 178 */   Lu178(177.945958000000000),
		/** Lutetium 179 */   Lu179(178.947330900000000),
		/** Lutetium 180 */   Lu180(179.949888000000000),
		/** Lutetium 181 */   Lu181(180.951910000000000),
		/** Lutetium 182 */   Lu182(181.955040000000000),
		/** Lutetium 183 */   Lu183(182.957363000000000),
		/** Lutetium 184 */   Lu184(183.960910000000000),
		/** Lutetium 185 */   Lu185(184.963620000000000),;

		private double atomicMass;

		Lu(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Lu; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Hafnium (cf. {@link Element#Hf}) isotopes. */
	public enum Hf implements Isotope {

		/** Hafnium 153 */    Hf153(152.970690000000000),
		/** Hafnium 154 */    Hf154(153.964860000000000),
		/** Hafnium 155 */    Hf155(154.963110000000000),
		/** Hafnium 156 */    Hf156(155.959350000000000),
		/** Hafnium 157 */    Hf157(156.958240000000000),
		/** Hafnium 158 */    Hf158(157.954801000000000),
		/** Hafnium 159 */    Hf159(158.953996000000000),
		/** Hafnium 160 */    Hf160(159.950691000000000),
		/** Hafnium 161 */    Hf161(160.950278000000000),
		/** Hafnium 162 */    Hf162(161.947214800000000),
		/** Hafnium 163 */    Hf163(162.947113000000000),
		/** Hafnium 164 */    Hf164(163.944371000000000),
		/** Hafnium 165 */    Hf165(164.944567000000000),
		/** Hafnium 166 */    Hf166(165.942180000000000),
		/** Hafnium 167 */    Hf167(166.942600000000000),
		/** Hafnium 168 */    Hf168(167.940568000000000),
		/** Hafnium 169 */    Hf169(168.941259000000000),
		/** Hafnium 170 */    Hf170(169.939609000000000),
		/** Hafnium 171 */    Hf171(170.940492000000000),
		/** Hafnium 172 */    Hf172(171.939450000000000),
		/** Hafnium 173 */    Hf173(172.940513000000000),
		/** Hafnium 174 */    Hf174(173.940046100000000),
		/** Hafnium 175 */    Hf175(174.941509200000000),
		/** Hafnium 176 */    Hf176(175.941407600000000),
		/** Hafnium 177 */    Hf177(176.943227700000000),
		/** Hafnium 178 */    Hf178(177.943705800000000),
		/** Hafnium 180 */    Hf180(179.946557000000000),
		/** Hafnium 181 */    Hf181(180.949108300000000),
		/** Hafnium 182 */    Hf182(181.950561200000000),
		/** Hafnium 183 */    Hf183(182.953530000000000),
		/** Hafnium 184 */    Hf184(183.955446000000000),
		/** Hafnium 185 */    Hf185(184.958862000000000),
		/** Hafnium 186 */    Hf186(185.960897000000000),
		/** Hafnium 187 */    Hf187(186.964770000000000),
		/** Hafnium 188 */    Hf188(187.966850000000000),
		/** Hafnium 189 */    Hf189(188.970840000000000),;

		private double atomicMass;

		Hf(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Hf; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Tantalum (cf. {@link Element#Ta}) isotopes. */
	public enum Ta implements Isotope {

		/** Tantalum 155 */   Ta155(154.974240000000000),
		/** Tantalum 156 */   Ta156(155.972030000000000),
		/** Tantalum 157 */   Ta157(156.968180000000000),
		/** Tantalum 158 */   Ta158(157.966540000000000),
		/** Tantalum 159 */   Ta159(158.963023000000000),
		/** Tantalum 160 */   Ta160(159.961488000000000),
		/** Tantalum 161 */   Ta161(160.958452000000000),
		/** Tantalum 162 */   Ta162(161.957294000000000),
		/** Tantalum 163 */   Ta163(162.954337000000000),
		/** Tantalum 164 */   Ta164(163.953534000000000),
		/** Tantalum 165 */   Ta165(164.950781000000000),
		/** Tantalum 166 */   Ta166(165.950512000000000),
		/** Tantalum 167 */   Ta167(166.948093000000000),
		/** Tantalum 168 */   Ta168(167.948047000000000),
		/** Tantalum 169 */   Ta169(168.946011000000000),
		/** Tantalum 170 */   Ta170(169.946175000000000),
		/** Tantalum 171 */   Ta171(170.944476000000000),
		/** Tantalum 172 */   Ta172(171.944895000000000),
		/** Tantalum 173 */   Ta173(172.943750000000000),
		/** Tantalum 174 */   Ta174(173.944454000000000),
		/** Tantalum 175 */   Ta175(174.943737000000000),
		/** Tantalum 176 */   Ta176(175.944857000000000),
		/** Tantalum 177 */   Ta177(176.944479500000000),
		/** Tantalum 178 */   Ta178(177.945678000000000),
		/** Tantalum 179 */   Ta179(178.945936600000000),
		/** Tantalum 180 */   Ta180(179.947464800000000),
		/** Tantalum 182 */   Ta182(181.950151900000000),
		/** Tantalum 183 */   Ta183(182.951372600000000),
		/** Tantalum 184 */   Ta184(183.954008000000000),
		/** Tantalum 185 */   Ta185(184.955559000000000),
		/** Tantalum 186 */   Ta186(185.958551000000000),
		/** Tantalum 187 */   Ta187(186.960386000000000),
		/** Tantalum 188 */   Ta188(187.963916000000000),
		/** Tantalum 189 */   Ta189(188.965830000000000),
		/** Tantalum 190 */   Ta190(189.969390000000000),
		/** Tantalum 191 */   Ta191(190.971560000000000),
		/** Tantalum 192 */   Ta192(191.975140000000000),;

		private double atomicMass;

		Ta(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ta; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Tungsten (cf. {@link Element#W}) isotopes. */
	public enum W implements Isotope {

		/** Tungsten 157 */    W157(156.978840000000000),
		/** Tungsten 158 */    W158(157.974560000000000),
		/** Tungsten 159 */    W159(158.972640000000000),
		/** Tungsten 160 */    W160(159.968460000000000),
		/** Tungsten 161 */    W161(160.967200000000000),
		/** Tungsten 162 */    W162(161.963499000000000),
		/** Tungsten 163 */    W163(162.962524000000000),
		/** Tungsten 164 */    W164(163.958961000000000),
		/** Tungsten 165 */    W165(164.958281000000000),
		/** Tungsten 166 */    W166(165.955031000000000),
		/** Tungsten 167 */    W167(166.954805000000000),
		/** Tungsten 168 */    W168(167.951806000000000),
		/** Tungsten 169 */    W169(168.951779000000000),
		/** Tungsten 170 */    W170(169.949232000000000),
		/** Tungsten 171 */    W171(170.949451000000000),
		/** Tungsten 172 */    W172(171.947292000000000),
		/** Tungsten 173 */    W173(172.947689000000000),
		/** Tungsten 174 */    W174(173.946079000000000),
		/** Tungsten 175 */    W175(174.946717000000000),
		/** Tungsten 176 */    W176(175.945634000000000),
		/** Tungsten 177 */    W177(176.946643000000000),
		/** Tungsten 178 */    W178(177.945883000000000),
		/** Tungsten 179 */    W179(178.947077000000000),
		/** Tungsten 180 */    W180(179.946710800000000),
		/** Tungsten 181 */    W181(180.948197800000000),
		/** Tungsten 182 */    W182(181.948203940000000),
		/** Tungsten 183 */    W183(182.950222750000000),
		/** Tungsten 185 */    W185(184.953418970000000),
		/** Tungsten 186 */    W186(185.954362800000000),
		/** Tungsten 187 */    W187(186.957158800000000),
		/** Tungsten 188 */    W188(187.958486200000000),
		/** Tungsten 189 */    W189(188.961763000000000),
		/** Tungsten 190 */    W190(189.963091000000000),
		/** Tungsten 191 */    W191(190.966531000000000),
		/** Tungsten 192 */    W192(191.968170000000000),
		/** Tungsten 193 */    W193(192.971780000000000),
		/** Tungsten 194 */    W194(193.973670000000000),;

		private double atomicMass;

		W(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.W; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Rhenium (cf. {@link Element#Re}) isotopes. */
	public enum Re implements Isotope {

		/** Rhenium 159 */    Re159(158.984180000000000),
		/** Rhenium 160 */    Re160(159.981820000000000),
		/** Rhenium 161 */    Re161(160.977570000000000),
		/** Rhenium 162 */    Re162(161.975840000000000),
		/** Rhenium 163 */    Re163(162.972080000000000),
		/** Rhenium 164 */    Re164(163.970453000000000),
		/** Rhenium 165 */    Re165(164.967103000000000),
		/** Rhenium 166 */    Re166(165.965761000000000),
		/** Rhenium 167 */    Re167(166.962595000000000),
		/** Rhenium 168 */    Re168(167.961573000000000),
		/** Rhenium 169 */    Re169(168.958766000000000),
		/** Rhenium 170 */    Re170(169.958220000000000),
		/** Rhenium 171 */    Re171(170.955716000000000),
		/** Rhenium 172 */    Re172(171.955420000000000),
		/** Rhenium 173 */    Re173(172.953243000000000),
		/** Rhenium 174 */    Re174(173.953115000000000),
		/** Rhenium 175 */    Re175(174.951381000000000),
		/** Rhenium 176 */    Re176(175.951623000000000),
		/** Rhenium 177 */    Re177(176.950328000000000),
		/** Rhenium 178 */    Re178(177.950989000000000),
		/** Rhenium 179 */    Re179(178.949989000000000),
		/** Rhenium 180 */    Re180(179.950792000000000),
		/** Rhenium 181 */    Re181(180.950058000000000),
		/** Rhenium 182 */    Re182(181.951210000000000),
		/** Rhenium 183 */    Re183(182.950819600000000),
		/** Rhenium 184 */    Re184(183.952522800000000),
		/** Rhenium 185 */    Re185(184.952954500000000),
		/** Rhenium 187 */    Re187(186.955750100000000),
		/** Rhenium 188 */    Re188(187.958111500000000),
		/** Rhenium 189 */    Re189(188.959226000000000),
		/** Rhenium 190 */    Re190(189.961744000000000),
		/** Rhenium 191 */    Re191(190.963122000000000),
		/** Rhenium 192 */    Re192(191.966088000000000),
		/** Rhenium 193 */    Re193(192.967541000000000),
		/** Rhenium 194 */    Re194(193.970760000000000),
		/** Rhenium 195 */    Re195(194.972540000000000),
		/** Rhenium 196 */    Re196(195.975800000000000),
		/** Rhenium 197 */    Re197(196.977990000000000),
		/** Rhenium 198 */    Re198(197.981600000000000),;

		private double atomicMass;

		Re(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Re; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Osmium (cf. {@link Element#Os}) isotopes. */
	public enum Os implements Isotope {

		/** Osmium 161 */     Os161(160.989030000000000),
		/** Osmium 162 */     Os162(161.984430000000000),
		/** Osmium 163 */     Os163(162.982410000000000),
		/** Osmium 164 */     Os164(163.978020000000000),
		/** Osmium 165 */     Os165(164.976600000000000),
		/** Osmium 166 */     Os166(165.972692000000000),
		/** Osmium 167 */     Os167(166.971549000000000),
		/** Osmium 168 */     Os168(167.967808000000000),
		/** Osmium 169 */     Os169(168.967018000000000),
		/** Osmium 170 */     Os170(169.963578000000000),
		/** Osmium 171 */     Os171(170.963174000000000),
		/** Osmium 172 */     Os172(171.960017000000000),
		/** Osmium 173 */     Os173(172.959808000000000),
		/** Osmium 174 */     Os174(173.957064000000000),
		/** Osmium 175 */     Os175(174.956945000000000),
		/** Osmium 176 */     Os176(175.954806000000000),
		/** Osmium 177 */     Os177(176.954966000000000),
		/** Osmium 178 */     Os178(177.953254000000000),
		/** Osmium 179 */     Os179(178.953817000000000),
		/** Osmium 180 */     Os180(179.952375000000000),
		/** Osmium 181 */     Os181(180.953247000000000),
		/** Osmium 182 */     Os182(181.952110000000000),
		/** Osmium 183 */     Os183(182.953125000000000),
		/** Osmium 184 */     Os184(183.952488500000000),
		/** Osmium 185 */     Os185(184.954041700000000),
		/** Osmium 186 */     Os186(185.953835000000000),
		/** Osmium 187 */     Os187(186.955747400000000),
		/** Osmium 188 */     Os188(187.955835200000000),
		/** Osmium 189 */     Os189(188.958144200000000),
		/** Osmium 191 */     Os191(190.960926400000000),
		/** Osmium 192 */     Os192(191.961477000000000),
		/** Osmium 193 */     Os193(192.964147900000000),
		/** Osmium 194 */     Os194(193.965177200000000),
		/** Osmium 195 */     Os195(194.968318000000000),
		/** Osmium 196 */     Os196(195.969641000000000),
		/** Osmium 197 */     Os197(196.972830000000000),
		/** Osmium 198 */     Os198(197.974410000000000),
		/** Osmium 199 */     Os199(198.978010000000000),
		/** Osmium 200 */     Os200(199.979840000000000),
		/** Osmium 201 */     Os201(200.983640000000000),
		/** Osmium 202 */     Os202(201.985950000000000),;

		private double atomicMass;

		Os(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Os; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Iridium (cf. {@link Element#Ir}) isotopes. */
	public enum Ir implements Isotope {

		/** Iridium 164 */    Ir164(163.991910000000000),
		/** Iridium 165 */    Ir165(164.987500000000000),
		/** Iridium 166 */    Ir166(165.985660000000000),
		/** Iridium 167 */    Ir167(166.981666000000000),
		/** Iridium 168 */    Ir168(167.979907000000000),
		/** Iridium 169 */    Ir169(168.976298000000000),
		/** Iridium 170 */    Ir170(169.974922000000000),
		/** Iridium 171 */    Ir171(170.971640000000000),
		/** Iridium 172 */    Ir172(171.970607000000000),
		/** Iridium 173 */    Ir173(172.967506000000000),
		/** Iridium 174 */    Ir174(173.966861000000000),
		/** Iridium 175 */    Ir175(174.964150000000000),
		/** Iridium 176 */    Ir176(175.963650000000000),
		/** Iridium 177 */    Ir177(176.961301000000000),
		/** Iridium 178 */    Ir178(177.961082000000000),
		/** Iridium 179 */    Ir179(178.959120000000000),
		/** Iridium 180 */    Ir180(179.959229000000000),
		/** Iridium 181 */    Ir181(180.957625000000000),
		/** Iridium 182 */    Ir182(181.958076000000000),
		/** Iridium 183 */    Ir183(182.956840000000000),
		/** Iridium 184 */    Ir184(183.957476000000000),
		/** Iridium 185 */    Ir185(184.956698000000000),
		/** Iridium 186 */    Ir186(185.957944000000000),
		/** Iridium 187 */    Ir187(186.957542000000000),
		/** Iridium 188 */    Ir188(187.958828000000000),
		/** Iridium 189 */    Ir189(188.958715000000000),
		/** Iridium 190 */    Ir190(189.960541200000000),
		/** Iridium 191 */    Ir191(190.960589300000000),
		/** Iridium 193 */    Ir193(192.962921600000000),
		/** Iridium 194 */    Ir194(193.965073500000000),
		/** Iridium 195 */    Ir195(194.965974700000000),
		/** Iridium 196 */    Ir196(195.968397000000000),
		/** Iridium 197 */    Ir197(196.969655000000000),
		/** Iridium 198 */    Ir198(197.972280000000000),
		/** Iridium 199 */    Ir199(198.973805000000000),
		/** Iridium 200 */    Ir200(199.976800000000000),
		/** Iridium 201 */    Ir201(200.978640000000000),
		/** Iridium 202 */    Ir202(201.981990000000000),
		/** Iridium 203 */    Ir203(202.984230000000000),
		/** Iridium 204 */    Ir204(203.989600000000000),;

		private double atomicMass;

		Ir(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ir; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Platinum (cf. {@link Element#Pt}) isotopes. */
	public enum Pt implements Isotope {

		/** Platinum 166 */   Pt166(165.994860000000000),
		/** Platinum 167 */   Pt167(166.992690000000000),
		/** Platinum 168 */   Pt168(167.988130000000000),
		/** Platinum 169 */   Pt169(168.986570000000000),
		/** Platinum 170 */   Pt170(169.982496000000000),
		/** Platinum 171 */   Pt171(170.981245000000000),
		/** Platinum 172 */   Pt172(171.977351000000000),
		/** Platinum 173 */   Pt173(172.976443000000000),
		/** Platinum 174 */   Pt174(173.972820000000000),
		/** Platinum 175 */   Pt175(174.972410000000000),
		/** Platinum 176 */   Pt176(175.968938000000000),
		/** Platinum 177 */   Pt177(176.968470000000000),
		/** Platinum 178 */   Pt178(177.965650000000000),
		/** Platinum 179 */   Pt179(178.965359000000000),
		/** Platinum 180 */   Pt180(179.963032000000000),
		/** Platinum 181 */   Pt181(180.963098000000000),
		/** Platinum 182 */   Pt182(181.961172000000000),
		/** Platinum 183 */   Pt183(182.961597000000000),
		/** Platinum 184 */   Pt184(183.959915000000000),
		/** Platinum 185 */   Pt185(184.960614000000000),
		/** Platinum 186 */   Pt186(185.959351000000000),
		/** Platinum 187 */   Pt187(186.960617000000000),
		/** Platinum 188 */   Pt188(187.959388900000000),
		/** Platinum 189 */   Pt189(188.960831000000000),
		/** Platinum 190 */   Pt190(189.959929700000000),
		/** Platinum 191 */   Pt191(190.961672900000000),
		/** Platinum 192 */   Pt192(191.961038700000000),
		/** Platinum 193 */   Pt193(192.962982400000000),
		/** Platinum 194 */   Pt194(193.962680900000000),
		/** Platinum 196 */   Pt196(195.964952090000000),
		/** Platinum 197 */   Pt197(196.967340690000000),
		/** Platinum 198 */   Pt198(197.967894900000000),
		/** Platinum 199 */   Pt199(198.970595200000000),
		/** Platinum 200 */   Pt200(199.971443000000000),
		/** Platinum 201 */   Pt201(200.974513000000000),
		/** Platinum 202 */   Pt202(201.975639000000000),
		/** Platinum 203 */   Pt203(202.978930000000000),
		/** Platinum 204 */   Pt204(203.980760000000000),
		/** Platinum 205 */   Pt205(204.986080000000000),
		/** Platinum 206 */   Pt206(205.989660000000000),;

		private double atomicMass;

		Pt(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Pt; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Gold (cf. {@link Element#Au}) isotopes. */
	public enum Au implements Isotope {

		/** Gold 169 */       Au169(168.998080000000000),
		/** Gold 170 */       Au170(169.995970000000000),
		/** Gold 171 */       Au171(170.991876000000000),
		/** Gold 172 */       Au172(171.989942000000000),
		/** Gold 173 */       Au173(172.986241000000000),
		/** Gold 174 */       Au174(173.984717000000000),
		/** Gold 175 */       Au175(174.981304000000000),
		/** Gold 176 */       Au176(175.980250000000000),
		/** Gold 177 */       Au177(176.976870000000000),
		/** Gold 178 */       Au178(177.976032000000000),
		/** Gold 179 */       Au179(178.973174000000000),
		/** Gold 180 */       Au180(179.972523000000000),
		/** Gold 181 */       Au181(180.970079000000000),
		/** Gold 182 */       Au182(181.969618000000000),
		/** Gold 183 */       Au183(182.967591000000000),
		/** Gold 184 */       Au184(183.967452000000000),
		/** Gold 185 */       Au185(184.965790000000000),
		/** Gold 186 */       Au186(185.965953000000000),
		/** Gold 187 */       Au187(186.964543000000000),
		/** Gold 188 */       Au188(187.965349000000000),
		/** Gold 189 */       Au189(188.963948000000000),
		/** Gold 190 */       Au190(189.964698000000000),
		/** Gold 191 */       Au191(190.963702000000000),
		/** Gold 192 */       Au192(191.964814000000000),
		/** Gold 193 */       Au193(192.964137300000000),
		/** Gold 194 */       Au194(193.965417800000000),
		/** Gold 195 */       Au195(194.965035200000000),
		/** Gold 196 */       Au196(195.966569900000000),
		/** Gold 198 */       Au198(197.968242420000000),
		/** Gold 199 */       Au199(198.968765280000000),
		/** Gold 200 */       Au200(199.970756000000000),
		/** Gold 201 */       Au201(200.971657500000000),
		/** Gold 202 */       Au202(201.973856000000000),
		/** Gold 203 */       Au203(202.975154400000000),
		/** Gold 204 */       Au204(203.977830000000000),
		/** Gold 205 */       Au205(204.979850000000000),
		/** Gold 206 */       Au206(205.984740000000000),
		/** Gold 207 */       Au207(206.988400000000000),
		/** Gold 208 */       Au208(207.993450000000000),
		/** Gold 209 */       Au209(208.997350000000000),
		/** Gold 210 */       Au210(210.002500000000000),;

		private double atomicMass;

		Au(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Au; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Mercury (cf. {@link Element#Hg}) isotopes. */
	public enum Hg implements Isotope {

		/** Mercury 171 */    Hg171(171.003530000000000),
		/** Mercury 172 */    Hg172(171.998810000000000),
		/** Mercury 173 */    Hg173(172.997090000000000),
		/** Mercury 174 */    Hg174(173.992865000000000),
		/** Mercury 175 */    Hg175(174.991441000000000),
		/** Mercury 176 */    Hg176(175.987361000000000),
		/** Mercury 177 */    Hg177(176.986277000000000),
		/** Mercury 178 */    Hg178(177.982484000000000),
		/** Mercury 179 */    Hg179(178.981831000000000),
		/** Mercury 180 */    Hg180(179.978260000000000),
		/** Mercury 181 */    Hg181(180.977819000000000),
		/** Mercury 182 */    Hg182(181.974689000000000),
		/** Mercury 183 */    Hg183(182.974444800000000),
		/** Mercury 184 */    Hg184(183.971714000000000),
		/** Mercury 185 */    Hg185(184.971899000000000),
		/** Mercury 186 */    Hg186(185.969362000000000),
		/** Mercury 187 */    Hg187(186.969814000000000),
		/** Mercury 188 */    Hg188(187.967567000000000),
		/** Mercury 189 */    Hg189(188.968195000000000),
		/** Mercury 190 */    Hg190(189.966323000000000),
		/** Mercury 191 */    Hg191(190.967157000000000),
		/** Mercury 192 */    Hg192(191.965635000000000),
		/** Mercury 193 */    Hg193(192.966653000000000),
		/** Mercury 194 */    Hg194(193.965449100000000),
		/** Mercury 195 */    Hg195(194.966721000000000),
		/** Mercury 196 */    Hg196(195.965832600000000),
		/** Mercury 197 */    Hg197(196.967212800000000),
		/** Mercury 198 */    Hg198(197.966768600000000),
		/** Mercury 199 */    Hg199(198.968280640000000),
		/** Mercury 200 */    Hg200(199.968326590000000),
		/** Mercury 202 */    Hg202(201.970643400000000),
		/** Mercury 203 */    Hg203(202.972872800000000),
		/** Mercury 204 */    Hg204(203.973493980000000),
		/** Mercury 205 */    Hg205(204.976073400000000),
		/** Mercury 206 */    Hg206(205.977514000000000),
		/** Mercury 207 */    Hg207(206.982300000000000),
		/** Mercury 208 */    Hg208(207.985759000000000),
		/** Mercury 209 */    Hg209(208.990720000000000),
		/** Mercury 210 */    Hg210(209.994240000000000),
		/** Mercury 211 */    Hg211(210.999330000000000),
		/** Mercury 212 */    Hg212(212.002960000000000),
		/** Mercury 213 */    Hg213(213.008230000000000),
		/** Mercury 214 */    Hg214(214.012000000000000),
		/** Mercury 215 */    Hg215(215.017400000000000),
		/** Mercury 216 */    Hg216(216.021320000000000),;

		private double atomicMass;

		Hg(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Hg; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Thallium (cf. {@link Element#Tl}) isotopes. */
	public enum Tl implements Isotope {

		/** Thallium 176 */   Tl176(176.000624000000000),
		/** Thallium 177 */   Tl177(176.996431000000000),
		/** Thallium 178 */   Tl178(177.994850000000000),
		/** Thallium 179 */   Tl179(178.991111000000000),
		/** Thallium 180 */   Tl180(179.990057000000000),
		/** Thallium 181 */   Tl181(180.986260000000000),
		/** Thallium 182 */   Tl182(181.985713000000000),
		/** Thallium 183 */   Tl183(182.982193000000000),
		/** Thallium 184 */   Tl184(183.981886000000000),
		/** Thallium 185 */   Tl185(184.978789000000000),
		/** Thallium 186 */   Tl186(185.978651000000000),
		/** Thallium 187 */   Tl187(186.975906300000000),
		/** Thallium 188 */   Tl188(187.976021000000000),
		/** Thallium 189 */   Tl189(188.973588000000000),
		/** Thallium 190 */   Tl190(189.973828000000000),
		/** Thallium 191 */   Tl191(190.971784200000000),
		/** Thallium 192 */   Tl192(191.972225000000000),
		/** Thallium 193 */   Tl193(192.970502000000000),
		/** Thallium 194 */   Tl194(193.971081000000000),
		/** Thallium 195 */   Tl195(194.969774000000000),
		/** Thallium 196 */   Tl196(195.970481000000000),
		/** Thallium 197 */   Tl197(196.969576000000000),
		/** Thallium 198 */   Tl198(197.970483000000000),
		/** Thallium 199 */   Tl199(198.969877000000000),
		/** Thallium 200 */   Tl200(199.970963300000000),
		/** Thallium 201 */   Tl201(200.970822000000000),
		/** Thallium 202 */   Tl202(201.972102000000000),
		/** Thallium 203 */   Tl203(202.972344600000000),
		/** Thallium 205 */   Tl205(204.974427800000000),
		/** Thallium 206 */   Tl206(205.976110600000000),
		/** Thallium 207 */   Tl207(206.977419700000000),
		/** Thallium 208 */   Tl208(207.982019000000000),
		/** Thallium 209 */   Tl209(208.985359400000000),
		/** Thallium 210 */   Tl210(209.990074000000000),
		/** Thallium 211 */   Tl211(210.993475000000000),
		/** Thallium 212 */   Tl212(211.998340000000000),
		/** Thallium 213 */   Tl213(213.001915000000000),
		/** Thallium 214 */   Tl214(214.006940000000000),
		/** Thallium 215 */   Tl215(215.010640000000000),
		/** Thallium 216 */   Tl216(216.015800000000000),
		/** Thallium 217 */   Tl217(217.019660000000000),
		/** Thallium 218 */   Tl218(218.024790000000000),;

		private double atomicMass;

		Tl(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Tl; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Lead (cf. {@link Element#Pb}) isotopes. */
	public enum Pb implements Isotope {

		/** Lead 178 */       Pb178(178.003831000000000),
		/** Lead 179 */       Pb179(179.002201000000000),
		/** Lead 180 */       Pb180(179.997928000000000),
		/** Lead 181 */       Pb181(180.996653000000000),
		/** Lead 182 */       Pb182(181.992672000000000),
		/** Lead 183 */       Pb183(182.991872000000000),
		/** Lead 184 */       Pb184(183.988136000000000),
		/** Lead 185 */       Pb185(184.987610000000000),
		/** Lead 186 */       Pb186(185.984238000000000),
		/** Lead 187 */       Pb187(186.983910900000000),
		/** Lead 188 */       Pb188(187.980875000000000),
		/** Lead 189 */       Pb189(188.980807000000000),
		/** Lead 190 */       Pb190(189.978082000000000),
		/** Lead 191 */       Pb191(190.978276000000000),
		/** Lead 192 */       Pb192(191.975775000000000),
		/** Lead 193 */       Pb193(192.976173000000000),
		/** Lead 194 */       Pb194(193.974012000000000),
		/** Lead 195 */       Pb195(194.974543000000000),
		/** Lead 196 */       Pb196(195.972774000000000),
		/** Lead 197 */       Pb197(196.973431200000000),
		/** Lead 198 */       Pb198(197.972034000000000),
		/** Lead 199 */       Pb199(198.972913000000000),
		/** Lead 200 */       Pb200(199.971819000000000),
		/** Lead 201 */       Pb201(200.972883000000000),
		/** Lead 202 */       Pb202(201.972152000000000),
		/** Lead 203 */       Pb203(202.973391100000000),
		/** Lead 204 */       Pb204(203.973044000000000),
		/** Lead 205 */       Pb205(204.974482200000000),
		/** Lead 206 */       Pb206(205.974465700000000),
		/** Lead 208 */       Pb208(207.976652500000000),
		/** Lead 209 */       Pb209(208.981090500000000),
		/** Lead 210 */       Pb210(209.984188900000000),
		/** Lead 211 */       Pb211(210.988737100000000),
		/** Lead 212 */       Pb212(211.991897700000000),
		/** Lead 213 */       Pb213(212.996562900000000),
		/** Lead 214 */       Pb214(213.999805900000000),
		/** Lead 215 */       Pb215(215.004740000000000),
		/** Lead 216 */       Pb216(216.008030000000000),
		/** Lead 217 */       Pb217(217.013140000000000),
		/** Lead 218 */       Pb218(218.016590000000000),
		/** Lead 219 */       Pb219(219.021770000000000),
		/** Lead 220 */       Pb220(220.025410000000000),;

		private double atomicMass;

		Pb(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Pb; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Bismuth (cf. {@link Element#Bi}) isotopes. */
	public enum Bi implements Isotope {

		/** Bismuth 184 */    Bi184(184.001275000000000),
		/** Bismuth 185 */    Bi185(184.997600000000000),
		/** Bismuth 186 */    Bi186(185.996644000000000),
		/** Bismuth 187 */    Bi187(186.993147000000000),
		/** Bismuth 188 */    Bi188(187.992287000000000),
		/** Bismuth 189 */    Bi189(188.989195000000000),
		/** Bismuth 190 */    Bi190(189.988622000000000),
		/** Bismuth 191 */    Bi191(190.985786600000000),
		/** Bismuth 192 */    Bi192(191.985469000000000),
		/** Bismuth 193 */    Bi193(192.982960000000000),
		/** Bismuth 194 */    Bi194(193.982785000000000),
		/** Bismuth 195 */    Bi195(194.980648800000000),
		/** Bismuth 196 */    Bi196(195.980667000000000),
		/** Bismuth 197 */    Bi197(196.978865100000000),
		/** Bismuth 198 */    Bi198(197.979206000000000),
		/** Bismuth 199 */    Bi199(198.977673000000000),
		/** Bismuth 200 */    Bi200(199.978131000000000),
		/** Bismuth 201 */    Bi201(200.977010000000000),
		/** Bismuth 202 */    Bi202(201.977734000000000),
		/** Bismuth 203 */    Bi203(202.976893000000000),
		/** Bismuth 204 */    Bi204(203.977836100000000),
		/** Bismuth 205 */    Bi205(204.977386700000000),
		/** Bismuth 206 */    Bi206(205.978499300000000),
		/** Bismuth 207 */    Bi207(206.978471000000000),
		/** Bismuth 208 */    Bi208(207.979742500000000),
		/** Bismuth 210 */    Bi210(209.984120700000000),
		/** Bismuth 211 */    Bi211(210.987269700000000),
		/** Bismuth 212 */    Bi212(211.991286000000000),
		/** Bismuth 213 */    Bi213(212.994385100000000),
		/** Bismuth 214 */    Bi214(213.998712000000000),
		/** Bismuth 215 */    Bi215(215.001770000000000),
		/** Bismuth 216 */    Bi216(216.006306000000000),
		/** Bismuth 217 */    Bi217(217.009372000000000),
		/** Bismuth 218 */    Bi218(218.014188000000000),
		/** Bismuth 219 */    Bi219(219.017480000000000),
		/** Bismuth 220 */    Bi220(220.022350000000000),
		/** Bismuth 221 */    Bi221(221.025870000000000),
		/** Bismuth 222 */    Bi222(222.030780000000000),
		/** Bismuth 223 */    Bi223(223.034500000000000),
		/** Bismuth 224 */    Bi224(224.039470000000000),;

		private double atomicMass;

		Bi(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Bi; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Polonium (cf. {@link Element#Po}) isotopes. */
	public enum Po implements Isotope {

		/** Polonium 186 */   Po186(186.004393000000000),
		/** Polonium 187 */   Po187(187.003041000000000),
		/** Polonium 188 */   Po188(187.999416000000000),
		/** Polonium 189 */   Po189(188.998473000000000),
		/** Polonium 190 */   Po190(189.995101000000000),
		/** Polonium 191 */   Po191(190.994558500000000),
		/** Polonium 192 */   Po192(191.991336000000000),
		/** Polonium 193 */   Po193(192.991026000000000),
		/** Polonium 194 */   Po194(193.988186000000000),
		/** Polonium 195 */   Po195(194.988126000000000),
		/** Polonium 196 */   Po196(195.985526000000000),
		/** Polonium 197 */   Po197(196.985660000000000),
		/** Polonium 198 */   Po198(197.983389000000000),
		/** Polonium 199 */   Po199(198.983667000000000),
		/** Polonium 200 */   Po200(199.981799000000000),
		/** Polonium 201 */   Po201(200.982259800000000),
		/** Polonium 202 */   Po202(201.980758000000000),
		/** Polonium 203 */   Po203(202.981416100000000),
		/** Polonium 204 */   Po204(203.980310000000000),
		/** Polonium 205 */   Po205(204.981203000000000),
		/** Polonium 206 */   Po206(205.980474000000000),
		/** Polonium 207 */   Po207(206.981593800000000),
		/** Polonium 208 */   Po208(207.981246100000000),
		/** Polonium 210 */   Po210(209.982874100000000),
		/** Polonium 211 */   Po211(210.986653600000000),
		/** Polonium 212 */   Po212(211.988868400000000),
		/** Polonium 213 */   Po213(212.992857600000000),
		/** Polonium 214 */   Po214(213.995201700000000),
		/** Polonium 215 */   Po215(214.999420100000000),
		/** Polonium 216 */   Po216(216.001915200000000),
		/** Polonium 217 */   Po217(217.006318200000000),
		/** Polonium 218 */   Po218(218.008973500000000),
		/** Polonium 219 */   Po219(219.013614000000000),
		/** Polonium 220 */   Po220(220.016386000000000),
		/** Polonium 221 */   Po221(221.021228000000000),
		/** Polonium 222 */   Po222(222.024140000000000),
		/** Polonium 223 */   Po223(223.029070000000000),
		/** Polonium 224 */   Po224(224.032110000000000),
		/** Polonium 225 */   Po225(225.037070000000000),
		/** Polonium 226 */   Po226(226.040310000000000),
		/** Polonium 227 */   Po227(227.045390000000000),;

		private double atomicMass;

		Po(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Po; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Astatine (cf. {@link Element#At}) isotopes. */
	public enum At implements Isotope {

		/** Astatine 191 */   At191(191.004148000000000),
		/** Astatine 192 */   At192(192.003152000000000),
		/** Astatine 193 */   At193(192.999927000000000),
		/** Astatine 194 */   At194(193.999236000000000),
		/** Astatine 195 */   At195(194.996268500000000),
		/** Astatine 196 */   At196(195.995800000000000),
		/** Astatine 197 */   At197(196.993189000000000),
		/** Astatine 198 */   At198(197.992784000000000),
		/** Astatine 199 */   At199(198.990527700000000),
		/** Astatine 200 */   At200(199.990351000000000),
		/** Astatine 201 */   At201(200.988417100000000),
		/** Astatine 202 */   At202(201.988630000000000),
		/** Astatine 203 */   At203(202.986943000000000),
		/** Astatine 204 */   At204(203.987251000000000),
		/** Astatine 205 */   At205(204.986076000000000),
		/** Astatine 206 */   At206(205.986657000000000),
		/** Astatine 207 */   At207(206.985800000000000),
		/** Astatine 208 */   At208(207.986613300000000),
		/** Astatine 209 */   At209(208.986170200000000),
		/** Astatine 211 */   At211(210.987496600000000),
		/** Astatine 212 */   At212(211.990737700000000),
		/** Astatine 213 */   At213(212.992937000000000),
		/** Astatine 214 */   At214(213.996372100000000),
		/** Astatine 215 */   At215(214.998652800000000),
		/** Astatine 216 */   At216(216.002423600000000),
		/** Astatine 217 */   At217(217.004719200000000),
		/** Astatine 218 */   At218(218.008695000000000),
		/** Astatine 219 */   At219(219.011161800000000),
		/** Astatine 220 */   At220(220.015433000000000),
		/** Astatine 221 */   At221(221.018017000000000),
		/** Astatine 222 */   At222(222.022494000000000),
		/** Astatine 223 */   At223(223.025151000000000),
		/** Astatine 224 */   At224(224.029749000000000),
		/** Astatine 225 */   At225(225.032630000000000),
		/** Astatine 226 */   At226(226.037160000000000),
		/** Astatine 227 */   At227(227.040240000000000),
		/** Astatine 228 */   At228(228.044750000000000),
		/** Astatine 229 */   At229(229.048120000000000),;

		private double atomicMass;

		At(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.At; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Radon (cf. {@link Element#Rn}) isotopes. */
	public enum Rn implements Isotope {

		/** Radon 193 */      Rn193(193.009708000000000),
		/** Radon 194 */      Rn194(194.006144000000000),
		/** Radon 195 */      Rn195(195.005422000000000),
		/** Radon 196 */      Rn196(196.002116000000000),
		/** Radon 197 */      Rn197(197.001585000000000),
		/** Radon 198 */      Rn198(197.998679000000000),
		/** Radon 199 */      Rn199(198.998390000000000),
		/** Radon 200 */      Rn200(199.995690000000000),
		/** Radon 201 */      Rn201(200.995628000000000),
		/** Radon 202 */      Rn202(201.993264000000000),
		/** Radon 203 */      Rn203(202.993388000000000),
		/** Radon 204 */      Rn204(203.991430000000000),
		/** Radon 205 */      Rn205(204.991719000000000),
		/** Radon 206 */      Rn206(205.990214000000000),
		/** Radon 207 */      Rn207(206.990730300000000),
		/** Radon 208 */      Rn208(207.989635000000000),
		/** Radon 209 */      Rn209(208.990415000000000),
		/** Radon 210 */      Rn210(209.989689100000000),
		/** Radon 211 */      Rn211(210.990601100000000),
		/** Radon 212 */      Rn212(211.990703900000000),
		/** Radon 213 */      Rn213(212.993883100000000),
		/** Radon 214 */      Rn214(213.995363000000000),
		/** Radon 215 */      Rn215(214.998745900000000),
		/** Radon 216 */      Rn216(216.000271900000000),
		/** Radon 217 */      Rn217(217.003928000000000),
		/** Radon 218 */      Rn218(218.005601600000000),
		/** Radon 219 */      Rn219(219.009480400000000),
		/** Radon 220 */      Rn220(220.011394100000000),
		/** Radon 221 */      Rn221(221.015537100000000),
		/** Radon 223 */      Rn223(223.021889300000000),
		/** Radon 224 */      Rn224(224.024096000000000),
		/** Radon 225 */      Rn225(225.028486000000000),
		/** Radon 226 */      Rn226(226.030861000000000),
		/** Radon 227 */      Rn227(227.035304000000000),
		/** Radon 228 */      Rn228(228.037835000000000),
		/** Radon 229 */      Rn229(229.042257000000000),
		/** Radon 230 */      Rn230(230.045140000000000),
		/** Radon 231 */      Rn231(231.049870000000000),;

		private double atomicMass;

		Rn(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Rn; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Francium (cf. {@link Element#Fr}) isotopes. */
	public enum Fr implements Isotope {

		/** Francium 199 */   Fr199(199.007259000000000),
		/** Francium 200 */   Fr200(200.006586000000000),
		/** Francium 201 */   Fr201(201.003867000000000),
		/** Francium 202 */   Fr202(202.003320000000000),
		/** Francium 203 */   Fr203(203.000940700000000),
		/** Francium 204 */   Fr204(204.000652000000000),
		/** Francium 205 */   Fr205(204.998593900000000),
		/** Francium 206 */   Fr206(205.998666000000000),
		/** Francium 207 */   Fr207(206.996946000000000),
		/** Francium 208 */   Fr208(207.997138000000000),
		/** Francium 209 */   Fr209(208.995955000000000),
		/** Francium 210 */   Fr210(209.996422000000000),
		/** Francium 211 */   Fr211(210.995556000000000),
		/** Francium 212 */   Fr212(211.996225700000000),
		/** Francium 213 */   Fr213(212.996186000000000),
		/** Francium 214 */   Fr214(213.998971300000000),
		/** Francium 215 */   Fr215(215.000341800000000),
		/** Francium 216 */   Fr216(216.003189900000000),
		/** Francium 217 */   Fr217(217.004632300000000),
		/** Francium 218 */   Fr218(218.007578700000000),
		/** Francium 219 */   Fr219(219.009252400000000),
		/** Francium 220 */   Fr220(220.012327700000000),
		/** Francium 221 */   Fr221(221.014255200000000),
		/** Francium 222 */   Fr222(222.017552000000000),
		/** Francium 224 */   Fr224(224.023398000000000),
		/** Francium 225 */   Fr225(225.025573000000000),
		/** Francium 226 */   Fr226(226.029566000000000),
		/** Francium 227 */   Fr227(227.031869000000000),
		/** Francium 228 */   Fr228(228.035823000000000),
		/** Francium 229 */   Fr229(229.038298000000000),
		/** Francium 230 */   Fr230(230.042416000000000),
		/** Francium 231 */   Fr231(231.045158000000000),
		/** Francium 232 */   Fr232(232.049370000000000),
		/** Francium 233 */   Fr233(233.052640000000000),;

		private double atomicMass;

		Fr(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Fr; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Radium (cf. {@link Element#Ra}) isotopes. */
	public enum Ra implements Isotope {

		/** Radium 201 */     Ra201(201.012710000000000),
		/** Radium 202 */     Ra202(202.009760000000000),
		/** Radium 203 */     Ra203(203.009304000000000),
		/** Radium 204 */     Ra204(204.006492000000000),
		/** Radium 205 */     Ra205(205.006268000000000),
		/** Radium 206 */     Ra206(206.003828000000000),
		/** Radium 207 */     Ra207(207.003799000000000),
		/** Radium 208 */     Ra208(208.001841000000000),
		/** Radium 209 */     Ra209(209.001990000000000),
		/** Radium 210 */     Ra210(210.000494000000000),
		/** Radium 211 */     Ra211(211.000893200000000),
		/** Radium 212 */     Ra212(211.999787000000000),
		/** Radium 213 */     Ra213(213.000384000000000),
		/** Radium 214 */     Ra214(214.000099700000000),
		/** Radium 215 */     Ra215(215.002720400000000),
		/** Radium 216 */     Ra216(216.003533400000000),
		/** Radium 217 */     Ra217(217.006320700000000),
		/** Radium 218 */     Ra218(218.007141000000000),
		/** Radium 219 */     Ra219(219.010085500000000),
		/** Radium 220 */     Ra220(220.011025900000000),
		/** Radium 221 */     Ra221(221.013917700000000),
		/** Radium 222 */     Ra222(222.015374800000000),
		/** Radium 223 */     Ra223(223.018502300000000),
		/** Radium 224 */     Ra224(224.020212000000000),
		/** Radium 225 */     Ra225(225.023611900000000),
		/** Radium 227 */     Ra227(227.029178300000000),
		/** Radium 228 */     Ra228(228.031070700000000),
		/** Radium 229 */     Ra229(229.034942000000000),
		/** Radium 230 */     Ra230(230.037055000000000),
		/** Radium 231 */     Ra231(231.041027000000000),
		/** Radium 232 */     Ra232(232.043475300000000),
		/** Radium 233 */     Ra233(233.047582000000000),
		/** Radium 234 */     Ra234(234.050342000000000),
		/** Radium 235 */     Ra235(235.054970000000000),;

		private double atomicMass;

		Ra(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ra; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Actinium (cf. {@link Element#Ac}) isotopes. */
	public enum Ac implements Isotope {

		/** Actinium 206 */   Ac206(206.014452000000000),
		/** Actinium 207 */   Ac207(207.011966000000000),
		/** Actinium 208 */   Ac208(208.011550000000000),
		/** Actinium 209 */   Ac209(209.009495000000000),
		/** Actinium 210 */   Ac210(210.009436000000000),
		/** Actinium 211 */   Ac211(211.007732000000000),
		/** Actinium 212 */   Ac212(212.007813000000000),
		/** Actinium 213 */   Ac213(213.006609000000000),
		/** Actinium 214 */   Ac214(214.006918000000000),
		/** Actinium 215 */   Ac215(215.006475000000000),
		/** Actinium 216 */   Ac216(216.008743000000000),
		/** Actinium 217 */   Ac217(217.009344000000000),
		/** Actinium 218 */   Ac218(218.011642000000000),
		/** Actinium 219 */   Ac219(219.012421000000000),
		/** Actinium 220 */   Ac220(220.014754900000000),
		/** Actinium 221 */   Ac221(221.015592000000000),
		/** Actinium 222 */   Ac222(222.017844200000000),
		/** Actinium 223 */   Ac223(223.019137700000000),
		/** Actinium 224 */   Ac224(224.021723200000000),
		/** Actinium 225 */   Ac225(225.023230000000000),
		/** Actinium 226 */   Ac226(226.026098400000000),
		/** Actinium 228 */   Ac228(228.031021500000000),
		/** Actinium 229 */   Ac229(229.032956000000000),
		/** Actinium 230 */   Ac230(230.036327000000000),
		/** Actinium 231 */   Ac231(231.038393000000000),
		/** Actinium 232 */   Ac232(232.042034000000000),
		/** Actinium 233 */   Ac233(233.044346000000000),
		/** Actinium 234 */   Ac234(234.048139000000000),
		/** Actinium 235 */   Ac235(235.050840000000000),
		/** Actinium 236 */   Ac236(236.054988000000000),
		/** Actinium 237 */   Ac237(237.058270000000000),;

		private double atomicMass;

		Ac(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ac; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Thorium (cf. {@link Element#Th}) isotopes. */
	public enum Th implements Isotope {

		/** Thorium 208 */    Th208(208.017900000000000),
		/** Thorium 209 */    Th209(209.017753000000000),
		/** Thorium 210 */    Th210(210.015094000000000),
		/** Thorium 211 */    Th211(211.014929000000000),
		/** Thorium 212 */    Th212(212.012988000000000),
		/** Thorium 213 */    Th213(213.013009000000000),
		/** Thorium 214 */    Th214(214.011500000000000),
		/** Thorium 215 */    Th215(215.011724800000000),
		/** Thorium 216 */    Th216(216.011056000000000),
		/** Thorium 217 */    Th217(217.013117000000000),
		/** Thorium 218 */    Th218(218.013276000000000),
		/** Thorium 219 */    Th219(219.015537000000000),
		/** Thorium 220 */    Th220(220.015748000000000),
		/** Thorium 221 */    Th221(221.018184000000000),
		/** Thorium 222 */    Th222(222.018469000000000),
		/** Thorium 223 */    Th223(223.020811900000000),
		/** Thorium 224 */    Th224(224.021464000000000),
		/** Thorium 225 */    Th225(225.023951400000000),
		/** Thorium 226 */    Th226(226.024903400000000),
		/** Thorium 227 */    Th227(227.027704200000000),
		/** Thorium 228 */    Th228(228.028741300000000),
		/** Thorium 229 */    Th229(229.031762700000000),
		/** Thorium 230 */    Th230(230.033134100000000),
		/** Thorium 231 */    Th231(231.036304600000000),
		/** Thorium 233 */    Th233(233.041582300000000),
		/** Thorium 234 */    Th234(234.043601400000000),
		/** Thorium 235 */    Th235(235.047255000000000),
		/** Thorium 236 */    Th236(236.049657000000000),
		/** Thorium 237 */    Th237(237.053629000000000),
		/** Thorium 238 */    Th238(238.056500000000000),
		/** Thorium 239 */    Th239(239.060770000000000),;

		private double atomicMass;

		Th(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Th; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Protactinium (cf. {@link Element#Pa}) isotopes. */
	public enum Pa implements Isotope {

		/** Protactinium 212 */Pa212(212.023203000000000),
		/** Protactinium 213 */Pa213(213.021109000000000),
		/** Protactinium 214 */Pa214(214.020918000000000),
		/** Protactinium 215 */Pa215(215.019183000000000),
		/** Protactinium 216 */Pa216(216.019109000000000),
		/** Protactinium 217 */Pa217(217.018325000000000),
		/** Protactinium 218 */Pa218(218.020059000000000),
		/** Protactinium 219 */Pa219(219.019904000000000),
		/** Protactinium 220 */Pa220(220.021705000000000),
		/** Protactinium 221 */Pa221(221.021875000000000),
		/** Protactinium 222 */Pa222(222.023784000000000),
		/** Protactinium 223 */Pa223(223.023963000000000),
		/** Protactinium 224 */Pa224(224.025617600000000),
		/** Protactinium 225 */Pa225(225.026131000000000),
		/** Protactinium 226 */Pa226(226.027948000000000),
		/** Protactinium 227 */Pa227(227.028805400000000),
		/** Protactinium 228 */Pa228(228.031051700000000),
		/** Protactinium 229 */Pa229(229.032097200000000),
		/** Protactinium 230 */Pa230(230.034541000000000),
		/** Protactinium 232 */Pa232(232.038591700000000),
		/** Protactinium 233 */Pa233(233.040247200000000),
		/** Protactinium 234 */Pa234(234.043307200000000),
		/** Protactinium 235 */Pa235(235.045399000000000),
		/** Protactinium 236 */Pa236(236.048668000000000),
		/** Protactinium 237 */Pa237(237.051023000000000),
		/** Protactinium 238 */Pa238(238.054637000000000),
		/** Protactinium 239 */Pa239(239.057260000000000),
		/** Protactinium 240 */Pa240(240.060980000000000),
		/** Protactinium 241 */Pa241(241.064080000000000),;

		private double atomicMass;

		Pa(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Pa; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Uranium (cf. {@link Element#U}) isotopes. */
	public enum U implements Isotope {

		/** Uranium 217 */     U217(217.024660000000000),
		/** Uranium 218 */     U218(218.023523000000000),
		/** Uranium 219 */     U219(219.024999000000000),
		/** Uranium 220 */     U220(220.024620000000000),
		/** Uranium 221 */     U221(221.026280000000000),
		/** Uranium 222 */     U222(222.026000000000000),
		/** Uranium 223 */     U223(223.027739000000000),
		/** Uranium 224 */     U224(224.027605000000000),
		/** Uranium 225 */     U225(225.029391000000000),
		/** Uranium 226 */     U226(226.029339000000000),
		/** Uranium 227 */     U227(227.031157000000000),
		/** Uranium 228 */     U228(228.031371000000000),
		/** Uranium 229 */     U229(229.033506300000000),
		/** Uranium 230 */     U230(230.033940100000000),
		/** Uranium 231 */     U231(231.036293900000000),
		/** Uranium 232 */     U232(232.037156300000000),
		/** Uranium 233 */     U233(233.039635500000000),
		/** Uranium 234 */     U234(234.040952300000000),
		/** Uranium 235 */     U235(235.043930100000000),
		/** Uranium 236 */     U236(236.045568200000000),
		/** Uranium 237 */     U237(237.048730400000000),
		/** Uranium 239 */     U239(239.054293500000000),
		/** Uranium 240 */     U240(240.056593400000000),
		/** Uranium 241 */     U241(241.060330000000000),
		/** Uranium 242 */     U242(242.062930000000000),
		/** Uranium 243 */     U243(243.066990000000000),;

		private double atomicMass;

		U(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.U; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Neptunium (cf. {@link Element#Np}) isotopes. */
	public enum Np implements Isotope {

		/** Neptunium 219 */  Np219(219.031430000000000),
		/** Neptunium 220 */  Np220(220.032540000000000),
		/** Neptunium 221 */  Np221(221.032040000000000),
		/** Neptunium 222 */  Np222(222.033300000000000),
		/** Neptunium 223 */  Np223(223.032850000000000),
		/** Neptunium 224 */  Np224(224.034220000000000),
		/** Neptunium 225 */  Np225(225.033911000000000),
		/** Neptunium 226 */  Np226(226.035188000000000),
		/** Neptunium 227 */  Np227(227.034957000000000),
		/** Neptunium 228 */  Np228(228.036067000000000),
		/** Neptunium 229 */  Np229(229.036264000000000),
		/** Neptunium 230 */  Np230(230.037828000000000),
		/** Neptunium 231 */  Np231(231.038245000000000),
		/** Neptunium 232 */  Np232(232.040110000000000),
		/** Neptunium 233 */  Np233(233.040741000000000),
		/** Neptunium 234 */  Np234(234.042895300000000),
		/** Neptunium 235 */  Np235(235.044063500000000),
		/** Neptunium 236 */  Np236(236.046570000000000),
		/** Neptunium 238 */  Np238(238.050946600000000),
		/** Neptunium 239 */  Np239(239.052939200000000),
		/** Neptunium 240 */  Np240(240.056165000000000),
		/** Neptunium 241 */  Np241(241.058253000000000),
		/** Neptunium 242 */  Np242(242.061640000000000),
		/** Neptunium 243 */  Np243(243.064280000000000),
		/** Neptunium 244 */  Np244(244.067850000000000),
		/** Neptunium 245 */  Np245(245.070800000000000),;

		private double atomicMass;

		Np(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Np; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Plutonium (cf. {@link Element#Pu}) isotopes. */
	public enum Pu implements Isotope {

		/** Plutonium 228 */  Pu228(228.038732000000000),
		/** Plutonium 229 */  Pu229(229.040144000000000),
		/** Plutonium 230 */  Pu230(230.039650000000000),
		/** Plutonium 231 */  Pu231(231.041102000000000),
		/** Plutonium 232 */  Pu232(232.041185000000000),
		/** Plutonium 233 */  Pu233(233.042998000000000),
		/** Plutonium 234 */  Pu234(234.043317400000000),
		/** Plutonium 235 */  Pu235(235.045286000000000),
		/** Plutonium 236 */  Pu236(236.046058100000000),
		/** Plutonium 237 */  Pu237(237.048409800000000),
		/** Plutonium 238 */  Pu238(238.049560100000000),
		/** Plutonium 239 */  Pu239(239.052163600000000),
		/** Plutonium 240 */  Pu240(240.053813800000000),
		/** Plutonium 241 */  Pu241(241.056851700000000),
		/** Plutonium 242 */  Pu242(242.058742800000000),
		/** Plutonium 243 */  Pu243(243.062003600000000),
		/** Plutonium 245 */  Pu245(245.067826000000000),
		/** Plutonium 246 */  Pu246(246.070205000000000),
		/** Plutonium 247 */  Pu247(247.074190000000000),;

		private double atomicMass;

		Pu(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Pu; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Americium (cf. {@link Element#Am}) isotopes. */
	public enum Am implements Isotope {

		/** Americium 230 */  Am230(230.046090000000000),
		/** Americium 231 */  Am231(231.045560000000000),
		/** Americium 232 */  Am232(232.046450000000000),
		/** Americium 233 */  Am233(233.046440000000000),
		/** Americium 234 */  Am234(234.047730000000000),
		/** Americium 235 */  Am235(235.047908000000000),
		/** Americium 236 */  Am236(236.049430000000000),
		/** Americium 237 */  Am237(237.049996000000000),
		/** Americium 238 */  Am238(238.051985000000000),
		/** Americium 239 */  Am239(239.053024700000000),
		/** Americium 240 */  Am240(240.055300000000000),
		/** Americium 241 */  Am241(241.056829300000000),
		/** Americium 242 */  Am242(242.059549400000000),
		/** Americium 244 */  Am244(244.064285100000000),
		/** Americium 245 */  Am245(245.066454800000000),
		/** Americium 246 */  Am246(246.069775000000000),
		/** Americium 247 */  Am247(247.072090000000000),
		/** Americium 248 */  Am248(248.075750000000000),
		/** Americium 249 */  Am249(249.078480000000000),;

		private double atomicMass;

		Am(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Am; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Curium (cf. {@link Element#Cm}) isotopes. */
	public enum Cm implements Isotope {

		/** Curium 232 */     Cm232(232.049820000000000),
		/** Curium 233 */     Cm233(233.050770000000000),
		/** Curium 234 */     Cm234(234.050160000000000),
		/** Curium 235 */     Cm235(235.051540000000000),
		/** Curium 236 */     Cm236(236.051374000000000),
		/** Curium 237 */     Cm237(237.052869000000000),
		/** Curium 238 */     Cm238(238.053081000000000),
		/** Curium 239 */     Cm239(239.054910000000000),
		/** Curium 240 */     Cm240(240.055529700000000),
		/** Curium 241 */     Cm241(241.057653200000000),
		/** Curium 242 */     Cm242(242.058836000000000),
		/** Curium 243 */     Cm243(243.061389300000000),
		/** Curium 244 */     Cm244(244.062752800000000),
		/** Curium 245 */     Cm245(245.065491500000000),
		/** Curium 246 */     Cm246(246.067223800000000),
		/** Curium 248 */     Cm248(248.072349900000000),
		/** Curium 249 */     Cm249(249.075954800000000),
		/** Curium 250 */     Cm250(250.078358000000000),
		/** Curium 251 */     Cm251(251.082286000000000),
		/** Curium 252 */     Cm252(252.084870000000000),;

		private double atomicMass;

		Cm(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Cm; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Berkelium (cf. {@link Element#Bk}) isotopes. */
	public enum Bk implements Isotope {

		/** Berkelium 234 */  Bk234(234.057270000000000),
		/** Berkelium 235 */  Bk235(235.056580000000000),
		/** Berkelium 236 */  Bk236(236.057480000000000),
		/** Berkelium 237 */  Bk237(237.057100000000000),
		/** Berkelium 238 */  Bk238(238.058200000000000),
		/** Berkelium 239 */  Bk239(239.058240000000000),
		/** Berkelium 240 */  Bk240(240.059760000000000),
		/** Berkelium 241 */  Bk241(241.060160000000000),
		/** Berkelium 242 */  Bk242(242.061980000000000),
		/** Berkelium 243 */  Bk243(243.063007800000000),
		/** Berkelium 244 */  Bk244(244.065181000000000),
		/** Berkelium 245 */  Bk245(245.066361800000000),
		/** Berkelium 246 */  Bk246(246.068673000000000),
		/** Berkelium 248 */  Bk248(248.073088000000000),
		/** Berkelium 249 */  Bk249(249.074987700000000),
		/** Berkelium 250 */  Bk250(250.078316700000000),
		/** Berkelium 251 */  Bk251(251.080762000000000),
		/** Berkelium 252 */  Bk252(252.084310000000000),
		/** Berkelium 253 */  Bk253(253.086880000000000),
		/** Berkelium 254 */  Bk254(254.090600000000000),;

		private double atomicMass;

		Bk(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Bk; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Californium (cf. {@link Element#Cf}) isotopes. */
	public enum Cf implements Isotope {

		/** Californium 237 */Cf237(237.062198000000000),
		/** Californium 238 */Cf238(238.061490000000000),
		/** Californium 239 */Cf239(239.062530000000000),
		/** Californium 240 */Cf240(240.062256000000000),
		/** Californium 241 */Cf241(241.063690000000000),
		/** Californium 242 */Cf242(242.063754000000000),
		/** Californium 243 */Cf243(243.065480000000000),
		/** Californium 244 */Cf244(244.066000800000000),
		/** Californium 245 */Cf245(245.068048700000000),
		/** Californium 246 */Cf246(246.068805500000000),
		/** Californium 247 */Cf247(247.070965000000000),
		/** Californium 248 */Cf248(248.072185100000000),
		/** Californium 249 */Cf249(249.074853900000000),
		/** Californium 250 */Cf250(250.076406200000000),
		/** Californium 252 */Cf252(252.081627200000000),
		/** Californium 253 */Cf253(253.085134500000000),
		/** Californium 254 */Cf254(254.087324000000000),
		/** Californium 255 */Cf255(255.091050000000000),
		/** Californium 256 */Cf256(256.093440000000000),;

		private double atomicMass;

		Cf(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Cf; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Einsteinium (cf. {@link Element#Es}) isotopes. */
	public enum Es implements Isotope {

		/** Einsteinium 239 */Es239(239.068230000000000),
		/** Einsteinium 240 */Es240(240.068920000000000),
		/** Einsteinium 241 */Es241(241.068560000000000),
		/** Einsteinium 242 */Es242(242.069570000000000),
		/** Einsteinium 243 */Es243(243.069510000000000),
		/** Einsteinium 244 */Es244(244.070880000000000),
		/** Einsteinium 245 */Es245(245.071250000000000),
		/** Einsteinium 246 */Es246(246.072900000000000),
		/** Einsteinium 247 */Es247(247.073622000000000),
		/** Einsteinium 248 */Es248(248.075471000000000),
		/** Einsteinium 249 */Es249(249.076411000000000),
		/** Einsteinium 250 */Es250(250.078610000000000),
		/** Einsteinium 251 */Es251(251.079993600000000),
		/** Einsteinium 253 */Es253(253.084825700000000),
		/** Einsteinium 254 */Es254(254.088022200000000),
		/** Einsteinium 255 */Es255(255.090275000000000),
		/** Einsteinium 256 */Es256(256.093600000000000),
		/** Einsteinium 257 */Es257(257.095980000000000),
		/** Einsteinium 258 */Es258(258.099520000000000),;

		private double atomicMass;

		Es(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Es; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Fermium (cf. {@link Element#Fm}) isotopes. */
	public enum Fm implements Isotope {

		/** Fermium 241 */    Fm241(241.074210000000000),
		/** Fermium 242 */    Fm242(242.073430000000000),
		/** Fermium 243 */    Fm243(243.074460000000000),
		/** Fermium 244 */    Fm244(244.074040000000000),
		/** Fermium 245 */    Fm245(245.075350000000000),
		/** Fermium 246 */    Fm246(246.075350000000000),
		/** Fermium 247 */    Fm247(247.076940000000000),
		/** Fermium 248 */    Fm248(248.077186500000000),
		/** Fermium 249 */    Fm249(249.078927500000000),
		/** Fermium 250 */    Fm250(250.079521000000000),
		/** Fermium 251 */    Fm251(251.081540000000000),
		/** Fermium 252 */    Fm252(252.082467100000000),
		/** Fermium 253 */    Fm253(253.085184600000000),
		/** Fermium 254 */    Fm254(254.086854400000000),
		/** Fermium 255 */    Fm255(255.089964000000000),
		/** Fermium 256 */    Fm256(256.091774500000000),
		/** Fermium 258 */    Fm258(258.097080000000000),
		/** Fermium 259 */    Fm259(259.100600000000000),
		/** Fermium 260 */    Fm260(260.102810000000000),;

		private double atomicMass;

		Fm(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Fm; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Mendelevium (cf. {@link Element#Md}) isotopes. */
	public enum Md implements Isotope {

		/** Mendelevium 245 */Md245(245.080810000000000),
		/** Mendelevium 246 */Md246(246.081710000000000),
		/** Mendelevium 247 */Md247(247.081520000000000),
		/** Mendelevium 248 */Md248(248.082820000000000),
		/** Mendelevium 249 */Md249(249.082910000000000),
		/** Mendelevium 250 */Md250(250.084410000000000),
		/** Mendelevium 251 */Md251(251.084774000000000),
		/** Mendelevium 252 */Md252(252.086430000000000),
		/** Mendelevium 253 */Md253(253.087144000000000),
		/** Mendelevium 254 */Md254(254.089590000000000),
		/** Mendelevium 255 */Md255(255.091084100000000),
		/** Mendelevium 256 */Md256(256.093890000000000),
		/** Mendelevium 257 */Md257(257.095542400000000),
		/** Mendelevium 259 */Md259(259.100510000000000),
		/** Mendelevium 260 */Md260(260.103650000000000),
		/** Mendelevium 261 */Md261(261.105830000000000),
		/** Mendelevium 262 */Md262(262.109100000000000),;

		private double atomicMass;

		Md(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Md; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Nobelium (cf. {@link Element#No}) isotopes. */
	public enum No implements Isotope {

		/** Nobelium 248 */   No248(248.086550000000000),
		/** Nobelium 249 */   No249(249.087800000000000),
		/** Nobelium 250 */   No250(250.087560000000000),
		/** Nobelium 251 */   No251(251.088940000000000),
		/** Nobelium 252 */   No252(252.088967000000000),
		/** Nobelium 253 */   No253(253.090564100000000),
		/** Nobelium 254 */   No254(254.090956000000000),
		/** Nobelium 255 */   No255(255.093191000000000),
		/** Nobelium 256 */   No256(256.094282900000000),
		/** Nobelium 257 */   No257(257.096887800000000),
		/** Nobelium 258 */   No258(258.098210000000000),
		/** Nobelium 260 */   No260(260.102640000000000),
		/** Nobelium 261 */   No261(261.105700000000000),
		/** Nobelium 262 */   No262(262.107460000000000),
		/** Nobelium 263 */   No263(263.110710000000000),
		/** Nobelium 264 */   No264(264.112730000000000),;

		private double atomicMass;

		No(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.No; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Lawrencium (cf. {@link Element#Lr}) isotopes. */
	public enum Lr implements Isotope {

		/** Lawrencium 251 */ Lr251(251.094180000000000),
		/** Lawrencium 252 */ Lr252(252.095260000000000),
		/** Lawrencium 253 */ Lr253(253.095090000000000),
		/** Lawrencium 254 */ Lr254(254.096480000000000),
		/** Lawrencium 255 */ Lr255(255.096562000000000),
		/** Lawrencium 256 */ Lr256(256.098494000000000),
		/** Lawrencium 257 */ Lr257(257.099418000000000),
		/** Lawrencium 258 */ Lr258(258.101760000000000),
		/** Lawrencium 259 */ Lr259(259.102902000000000),
		/** Lawrencium 260 */ Lr260(260.105500000000000),
		/** Lawrencium 261 */ Lr261(261.106880000000000),
		/** Lawrencium 262 */ Lr262(262.109610000000000),
		/** Lawrencium 263 */ Lr263(263.111360000000000),
		/** Lawrencium 264 */ Lr264(264.114200000000000),
		/** Lawrencium 265 */ Lr265(265.116190000000000),;

		private double atomicMass;

		Lr(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Lr; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Rutherfordium (cf. {@link Element#Rf}) isotopes. */
	public enum Rf implements Isotope {

		/** Rutherfordium 253 */Rf253(253.100440000000000),
		/** Rutherfordium 254 */Rf254(254.100050000000000),
		/** Rutherfordium 255 */Rf255(255.101270000000000),
		/** Rutherfordium 256 */Rf256(256.101152000000000),
		/** Rutherfordium 257 */Rf257(257.102918000000000),
		/** Rutherfordium 258 */Rf258(258.103428000000000),
		/** Rutherfordium 259 */Rf259(259.105596000000000),
		/** Rutherfordium 260 */Rf260(260.106440000000000),
		/** Rutherfordium 261 */Rf261(261.108773000000000),
		/** Rutherfordium 262 */Rf262(262.109920000000000),
		/** Rutherfordium 263 */Rf263(263.112490000000000),
		/** Rutherfordium 264 */Rf264(264.113880000000000),
		/** Rutherfordium 265 */Rf265(265.116680000000000),
		/** Rutherfordium 266 */Rf266(266.118170000000000),
		/** Rutherfordium 268 */Rf268(268.123970000000000),;

		private double atomicMass;

		Rf(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Rf; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Dubnium (cf. {@link Element#Db}) isotopes. */
	public enum Db implements Isotope {

		/** Dubnium 255 */    Db255(255.107070000000000),
		/** Dubnium 256 */    Db256(256.107890000000000),
		/** Dubnium 257 */    Db257(257.107580000000000),
		/** Dubnium 258 */    Db258(258.109280000000000),
		/** Dubnium 259 */    Db259(259.109492000000000),
		/** Dubnium 260 */    Db260(260.111300000000000),
		/** Dubnium 261 */    Db261(261.111920000000000),
		/** Dubnium 262 */    Db262(262.114070000000000),
		/** Dubnium 263 */    Db263(263.114990000000000),
		/** Dubnium 264 */    Db264(264.117410000000000),
		/** Dubnium 265 */    Db265(265.118610000000000),
		/** Dubnium 266 */    Db266(266.121030000000000),
		/** Dubnium 267 */    Db267(267.122470000000000),
		/** Dubnium 269 */    Db269(269.127910000000000),
		/** Dubnium 270 */    Db270(270.131360000000000),;

		private double atomicMass;

		Db(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Db; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Seaborgium (cf. {@link Element#Sg}) isotopes. */
	public enum Sg implements Isotope {

		/** Seaborgium 258 */ Sg258(258.112980000000000),
		/** Seaborgium 259 */ Sg259(259.114400000000000),
		/** Seaborgium 260 */ Sg260(260.114384000000000),
		/** Seaborgium 261 */ Sg261(261.115949000000000),
		/** Seaborgium 262 */ Sg262(262.116337000000000),
		/** Seaborgium 263 */ Sg263(263.118290000000000),
		/** Seaborgium 264 */ Sg264(264.118930000000000),
		/** Seaborgium 265 */ Sg265(265.121090000000000),
		/** Seaborgium 266 */ Sg266(266.121980000000000),
		/** Seaborgium 267 */ Sg267(267.124360000000000),
		/** Seaborgium 268 */ Sg268(268.125390000000000),
		/** Seaborgium 270 */ Sg270(270.130430000000000),
		/** Seaborgium 271 */ Sg271(271.133930000000000),
		/** Seaborgium 272 */ Sg272(272.135890000000000),
		/** Seaborgium 273 */ Sg273(273.139580000000000),;

		private double atomicMass;

		Sg(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Sg; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Bohrium (cf. {@link Element#Bh}) isotopes. */
	public enum Bh implements Isotope {

		/** Bohrium 260 */    Bh260(260.121660000000000),
		/** Bohrium 261 */    Bh261(261.121450000000000),
		/** Bohrium 262 */    Bh262(262.122970000000000),
		/** Bohrium 263 */    Bh263(263.122920000000000),
		/** Bohrium 264 */    Bh264(264.124590000000000),
		/** Bohrium 265 */    Bh265(265.124910000000000),
		/** Bohrium 266 */    Bh266(266.126790000000000),
		/** Bohrium 267 */    Bh267(267.127500000000000),
		/** Bohrium 268 */    Bh268(268.129690000000000),
		/** Bohrium 269 */    Bh269(269.130420000000000),
		/** Bohrium 271 */    Bh271(271.135260000000000),
		/** Bohrium 272 */    Bh272(272.138260000000000),
		/** Bohrium 273 */    Bh273(273.140240000000000),
		/** Bohrium 274 */    Bh274(274.143550000000000),
		/** Bohrium 275 */    Bh275(275.145670000000000),;

		private double atomicMass;

		Bh(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Bh; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Hassium (cf. {@link Element#Hs}) isotopes. */
	public enum Hs implements Isotope {

		/** Hassium 263 */    Hs263(263.128520000000000),
		/** Hassium 264 */    Hs264(264.128357000000000),
		/** Hassium 265 */    Hs265(265.129793000000000),
		/** Hassium 266 */    Hs266(266.130046000000000),
		/** Hassium 267 */    Hs267(267.131670000000000),
		/** Hassium 268 */    Hs268(268.131860000000000),
		/** Hassium 269 */    Hs269(269.133750000000000),
		/** Hassium 271 */    Hs271(271.137170000000000),
		/** Hassium 272 */    Hs272(272.138500000000000),
		/** Hassium 273 */    Hs273(273.141680000000000),
		/** Hassium 274 */    Hs274(274.143300000000000),
		/** Hassium 275 */    Hs275(275.146670000000000),
		/** Hassium 276 */    Hs276(276.148460000000000),
		/** Hassium 277 */    Hs277(277.151900000000000),;

		private double atomicMass;

		Hs(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Hs; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Meitnerium (cf. {@link Element#Mt}) isotopes. */
	public enum Mt implements Isotope {

		/** Meitnerium 265 */ Mt265(265.136000000000000),
		/** Meitnerium 266 */ Mt266(266.137370000000000),
		/** Meitnerium 267 */ Mt267(267.137190000000000),
		/** Meitnerium 268 */ Mt268(268.138650000000000),
		/** Meitnerium 269 */ Mt269(269.138820000000000),
		/** Meitnerium 270 */ Mt270(270.140330000000000),
		/** Meitnerium 271 */ Mt271(271.140740000000000),
		/** Meitnerium 272 */ Mt272(272.143410000000000),
		/** Meitnerium 273 */ Mt273(273.144400000000000),
		/** Meitnerium 274 */ Mt274(274.147240000000000),
		/** Meitnerium 275 */ Mt275(275.148820000000000),
		/** Meitnerium 276 */ Mt276(276.151590000000000),
		/** Meitnerium 277 */ Mt277(277.153270000000000),
		/** Meitnerium 279 */ Mt279(279.158080000000000),;

		private double atomicMass;

		Mt(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Mt; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Darmstadtium (cf. {@link Element#Ds}) isotopes. */
	public enum Ds implements Isotope {

		/** Darmstadtium 267 */Ds267(267.143770000000000),
		/** Darmstadtium 268 */Ds268(268.143480000000000),
		/** Darmstadtium 269 */Ds269(269.144752000000000),
		/** Darmstadtium 270 */Ds270(270.144584000000000),
		/** Darmstadtium 271 */Ds271(271.145950000000000),
		/** Darmstadtium 272 */Ds272(272.146020000000000),
		/** Darmstadtium 273 */Ds273(273.148560000000000),
		/** Darmstadtium 274 */Ds274(274.149410000000000),
		/** Darmstadtium 275 */Ds275(275.152030000000000),
		/** Darmstadtium 276 */Ds276(276.153030000000000),
		/** Darmstadtium 277 */Ds277(277.155910000000000),
		/** Darmstadtium 278 */Ds278(278.157040000000000),
		/** Darmstadtium 279 */Ds279(279.160100000000000),
		/** Darmstadtium 280 */Ds280(280.161310000000000),;

		private double atomicMass;

		Ds(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ds; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Roentgenium (cf. {@link Element#Rg}) isotopes. */
	public enum Rg implements Isotope {

		/** Roentgenium 272 */Rg272(272.153270000000000),
		/** Roentgenium 273 */Rg273(273.153130000000000),
		/** Roentgenium 274 */Rg274(274.155250000000000),
		/** Roentgenium 275 */Rg275(275.155940000000000),
		/** Roentgenium 276 */Rg276(276.158330000000000),
		/** Roentgenium 277 */Rg277(277.159070000000000),
		/** Roentgenium 278 */Rg278(278.161490000000000),
		/** Roentgenium 279 */Rg279(279.162720000000000),
		/** Roentgenium 280 */Rg280(280.165140000000000),
		/** Roentgenium 281 */Rg281(281.166360000000000),
		/** Roentgenium 283 */Rg283(283.170540000000000),;

		private double atomicMass;

		Rg(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Rg; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Copernicium (cf. {@link Element#Cn}) isotopes. */
	public enum Cn implements Isotope {

		/** Copernicium 276 */Cn276(276.161410000000000),
		/** Copernicium 277 */Cn277(277.163640000000000),
		/** Copernicium 278 */Cn278(278.164160000000000),
		/** Copernicium 279 */Cn279(279.166540000000000),
		/** Copernicium 280 */Cn280(280.167150000000000),
		/** Copernicium 281 */Cn281(281.169750000000000),
		/** Copernicium 282 */Cn282(282.170500000000000),
		/** Copernicium 283 */Cn283(283.173270000000000),
		/** Copernicium 284 */Cn284(284.174160000000000),;

		private double atomicMass;

		Cn(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Cn; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Nihonium (cf. {@link Element#Nh}) isotopes. */
	public enum Nh implements Isotope {

		/** Nihonium 278 */   Nh278(278.170580000000000),
		/** Nihonium 279 */   Nh279(279.170950000000000),
		/** Nihonium 280 */   Nh280(280.172930000000000),
		/** Nihonium 281 */   Nh281(281.173480000000000),
		/** Nihonium 282 */   Nh282(282.175670000000000),
		/** Nihonium 283 */   Nh283(283.176570000000000),
		/** Nihonium 284 */   Nh284(284.178730000000000),
		/** Nihonium 285 */   Nh285(285.179730000000000),
		/** Nihonium 287 */   Nh287(287.183390000000000),;

		private double atomicMass;

		Nh(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Nh; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Flerovium (cf. {@link Element#Fl}) isotopes. */
	public enum Fl implements Isotope {

		/** Flerovium 285 */  Fl285(285.183640000000000),
		/** Flerovium 286 */  Fl286(286.184230000000000),
		/** Flerovium 287 */  Fl287(287.186780000000000),
		/** Flerovium 288 */  Fl288(288.187570000000000),;

		private double atomicMass;

		Fl(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Fl; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Moscovium (cf. {@link Element#Mc}) isotopes. */
	public enum Mc implements Isotope {

		/** Moscovium 287 */  Mc287(287.190700000000000),
		/** Moscovium 288 */  Mc288(288.192740000000000),
		/** Moscovium 289 */  Mc289(289.193630000000000),
		/** moscovium291 */   Mc291_291(291.197070000000000),;

		private double atomicMass;

		Mc(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Mc; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Livermorium (cf. {@link Element#Lv}) isotopes. */
	public enum Lv implements Isotope {

		/** Livermorium 289 */Lv289(289.198160000000000),
		/** Livermorium 290 */Lv290(290.198640000000000),
		/** Livermorium 291 */Lv291(291.201080000000000),
		/** Livermorium 292 */Lv292(292.201740000000000),;

		private double atomicMass;

		Lv(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Lv; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Tennessine (cf. {@link Element#Ts}) isotopes. */
	public enum Ts implements Isotope {

		/** Tennessine 291 */ Ts291(291.205530000000000),
		/** Tennessine 292 */ Ts292(292.207460000000000),
		/** Tennessine 293 */ Ts293(293.208240000000000),;

		private double atomicMass;

		Ts(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Ts; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	/** Oganesson (cf. {@link Element#Og}) isotopes. */
	public enum Og implements Isotope {

		/** Oganesson 293 */  Og293(293.213560000000000),
		/** Oganesson 295 */  Og295(295.216240000000000),;

		private double atomicMass;

		Og(double avgAtomicMass) { atomicMass = avgAtomicMass; }

		@Override public double mass() { return atomicMass; }
		@Override public Element element() { return Element.Og; }
		@Override public Set<Nuclide> nuclides() { return Set.of(this); }
	}

	@Override default boolean isIsotope() { return true; }

	/**
	 * Gets the isotopes for the requested element.
	 *
	 * @param elem the element for which the isotopes are requested
	 * @return the isotopes of elem
	 */
	public static List<Isotope> ofElement(Element elem) {
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
			throw new IllegalArgumentException("Found no isotope named \"" + name + "\"");
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
