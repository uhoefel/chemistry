package eu.hoefel.chemistry;

import java.util.stream.Stream;

import eu.hoefel.chemistry.Isotope.H;
import eu.hoefel.chemistry.Isotope.He;
import eu.hoefel.chemistry.Isotope.Li;
import eu.hoefel.chemistry.Isotope.Be;
import eu.hoefel.chemistry.Isotope.B;
import eu.hoefel.chemistry.Isotope.C;
import eu.hoefel.chemistry.Isotope.N;
import eu.hoefel.chemistry.Isotope.O;
import eu.hoefel.chemistry.Isotope.F;
import eu.hoefel.chemistry.Isotope.Ne;
import eu.hoefel.chemistry.Isotope.Na;
import eu.hoefel.chemistry.Isotope.Mg;
import eu.hoefel.chemistry.Isotope.Al;
import eu.hoefel.chemistry.Isotope.Si;
import eu.hoefel.chemistry.Isotope.P;
import eu.hoefel.chemistry.Isotope.S;
import eu.hoefel.chemistry.Isotope.Cl;
import eu.hoefel.chemistry.Isotope.Ar;
import eu.hoefel.chemistry.Isotope.K;
import eu.hoefel.chemistry.Isotope.Ca;
import eu.hoefel.chemistry.Isotope.Sc;
import eu.hoefel.chemistry.Isotope.Ti;
import eu.hoefel.chemistry.Isotope.V;
import eu.hoefel.chemistry.Isotope.Cr;
import eu.hoefel.chemistry.Isotope.Mn;
import eu.hoefel.chemistry.Isotope.Fe;
import eu.hoefel.chemistry.Isotope.Co;
import eu.hoefel.chemistry.Isotope.Ni;
import eu.hoefel.chemistry.Isotope.Cu;
import eu.hoefel.chemistry.Isotope.Zn;
import eu.hoefel.chemistry.Isotope.Ga;
import eu.hoefel.chemistry.Isotope.Ge;
import eu.hoefel.chemistry.Isotope.As;
import eu.hoefel.chemistry.Isotope.Se;
import eu.hoefel.chemistry.Isotope.Br;
import eu.hoefel.chemistry.Isotope.Kr;
import eu.hoefel.chemistry.Isotope.Rb;
import eu.hoefel.chemistry.Isotope.Sr;
import eu.hoefel.chemistry.Isotope.Y;
import eu.hoefel.chemistry.Isotope.Zr;
import eu.hoefel.chemistry.Isotope.Nb;
import eu.hoefel.chemistry.Isotope.Mo;
import eu.hoefel.chemistry.Isotope.Tc;
import eu.hoefel.chemistry.Isotope.Ru;
import eu.hoefel.chemistry.Isotope.Rh;
import eu.hoefel.chemistry.Isotope.Pd;
import eu.hoefel.chemistry.Isotope.Ag;
import eu.hoefel.chemistry.Isotope.Cd;
import eu.hoefel.chemistry.Isotope.In;
import eu.hoefel.chemistry.Isotope.Sn;
import eu.hoefel.chemistry.Isotope.Sb;
import eu.hoefel.chemistry.Isotope.Te;
import eu.hoefel.chemistry.Isotope.I;
import eu.hoefel.chemistry.Isotope.Xe;
import eu.hoefel.chemistry.Isotope.Cs;
import eu.hoefel.chemistry.Isotope.Ba;
import eu.hoefel.chemistry.Isotope.La;
import eu.hoefel.chemistry.Isotope.Ce;
import eu.hoefel.chemistry.Isotope.Pr;
import eu.hoefel.chemistry.Isotope.Nd;
import eu.hoefel.chemistry.Isotope.Pm;
import eu.hoefel.chemistry.Isotope.Sm;
import eu.hoefel.chemistry.Isotope.Eu;
import eu.hoefel.chemistry.Isotope.Gd;
import eu.hoefel.chemistry.Isotope.Tb;
import eu.hoefel.chemistry.Isotope.Dy;
import eu.hoefel.chemistry.Isotope.Ho;
import eu.hoefel.chemistry.Isotope.Er;
import eu.hoefel.chemistry.Isotope.Tm;
import eu.hoefel.chemistry.Isotope.Yb;
import eu.hoefel.chemistry.Isotope.Lu;
import eu.hoefel.chemistry.Isotope.Hf;
import eu.hoefel.chemistry.Isotope.Ta;
import eu.hoefel.chemistry.Isotope.W;
import eu.hoefel.chemistry.Isotope.Re;
import eu.hoefel.chemistry.Isotope.Os;
import eu.hoefel.chemistry.Isotope.Ir;
import eu.hoefel.chemistry.Isotope.Pt;
import eu.hoefel.chemistry.Isotope.Au;
import eu.hoefel.chemistry.Isotope.Hg;
import eu.hoefel.chemistry.Isotope.Tl;
import eu.hoefel.chemistry.Isotope.Pb;
import eu.hoefel.chemistry.Isotope.Bi;
import eu.hoefel.chemistry.Isotope.Po;
import eu.hoefel.chemistry.Isotope.At;
import eu.hoefel.chemistry.Isotope.Rn;
import eu.hoefel.chemistry.Isotope.Fr;
import eu.hoefel.chemistry.Isotope.Ra;
import eu.hoefel.chemistry.Isotope.Ac;
import eu.hoefel.chemistry.Isotope.Th;
import eu.hoefel.chemistry.Isotope.Pa;
import eu.hoefel.chemistry.Isotope.U;
import eu.hoefel.chemistry.Isotope.Np;
import eu.hoefel.chemistry.Isotope.Pu;
import eu.hoefel.chemistry.Isotope.Am;
import eu.hoefel.chemistry.Isotope.Cm;
import eu.hoefel.chemistry.Isotope.Bk;
import eu.hoefel.chemistry.Isotope.Cf;
import eu.hoefel.chemistry.Isotope.Es;
import eu.hoefel.chemistry.Isotope.Fm;
import eu.hoefel.chemistry.Isotope.Md;
import eu.hoefel.chemistry.Isotope.No;
import eu.hoefel.chemistry.Isotope.Lr;
import eu.hoefel.chemistry.Isotope.Rf;
import eu.hoefel.chemistry.Isotope.Db;
import eu.hoefel.chemistry.Isotope.Sg;
import eu.hoefel.chemistry.Isotope.Bh;
import eu.hoefel.chemistry.Isotope.Hs;
import eu.hoefel.chemistry.Isotope.Mt;
import eu.hoefel.chemistry.Isotope.Ds;
import eu.hoefel.chemistry.Isotope.Rg;
import eu.hoefel.chemistry.Isotope.Cn;
import eu.hoefel.chemistry.Isotope.Nh;
import eu.hoefel.chemistry.Isotope.Fl;
import eu.hoefel.chemistry.Isotope.Mc;
import eu.hoefel.chemistry.Isotope.Lv;
import eu.hoefel.chemistry.Isotope.Ts;
import eu.hoefel.chemistry.Isotope.Og;

/**
 * Utility methods for the {@link Isotope isotopes}.
 *
 * @see Isotope
 */
final class Isotopes {

	/** Represents all isotopes. */
	private static final Isotope[] values;

	static {
		Isotope[][] isotopes = {
			 H.values(), He.values(), Li.values(), Be.values(),  B.values(),  C.values(),  N.values(),  O.values(),  F.values(), Ne.values(),
			Na.values(), Mg.values(), Al.values(), Si.values(),  P.values(),  S.values(), Cl.values(), Ar.values(),  K.values(), Ca.values(),
			Sc.values(), Ti.values(),  V.values(), Cr.values(), Mn.values(), Fe.values(), Co.values(), Ni.values(), Cu.values(), Zn.values(),
			Ga.values(), Ge.values(), As.values(), Se.values(), Br.values(), Kr.values(), Rb.values(), Sr.values(),  Y.values(), Zr.values(),
			Nb.values(), Mo.values(), Tc.values(), Ru.values(), Rh.values(), Pd.values(), Ag.values(), Cd.values(), In.values(), Sn.values(),
			Sb.values(), Te.values(),  I.values(), Xe.values(), Cs.values(), Ba.values(), La.values(), Ce.values(), Pr.values(), Nd.values(),
			Pm.values(), Sm.values(), Eu.values(), Gd.values(), Tb.values(), Dy.values(), Ho.values(), Er.values(), Tm.values(), Yb.values(),
			Lu.values(), Hf.values(), Ta.values(),  W.values(), Re.values(), Os.values(), Ir.values(), Pt.values(), Au.values(), Hg.values(),
			Tl.values(), Pb.values(), Bi.values(), Po.values(), At.values(), Rn.values(), Fr.values(), Ra.values(), Ac.values(), Th.values(),
			Pa.values(),  U.values(), Np.values(), Pu.values(), Am.values(), Cm.values(), Bk.values(), Cf.values(), Es.values(), Fm.values(),
			Md.values(), No.values(), Lr.values(), Rf.values(), Db.values(), Sg.values(), Bh.values(), Hs.values(), Mt.values(), Ds.values(),
			Rg.values(), Cn.values(), Nh.values(), Fl.values(), Mc.values(), Lv.values(), Ts.values(), Og.values() 
		};

		values = Stream.of(isotopes).flatMap(Stream::of).toArray(Isotope[]::new); // TODO maybe use collections instead?
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
}