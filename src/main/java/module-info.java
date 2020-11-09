/**
 * This module provides (mostly type) support for chemical compounds.
 * <p>
 * The {@link eu.hoefel.chemistry} is the package containing the base classes
 * needed to describe chemical compounds, molecules, nuclides, isotopes and
 * elements.
 * 
 * @author Udo Hoefel
 */
module eu.hoefel.chemistry {
	exports eu.hoefel.chemistry;

	// ugh...
	opens eu.hoefel.chemistry to org.junit.platform.commons;

	requires javafx.graphics;
	requires javafx.web;
	requires org.junit.jupiter.api;
	requires eu.hoefel.utils;
	requires transitive eu.hoefel.jatex;
}