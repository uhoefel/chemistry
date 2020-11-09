package eu.hoefel.chemistry;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/**
 * Tests for nuclides.
 * 
 * @author Udo Hoefel
 */
@DisplayName("Nuclides")
@SuppressWarnings("javadoc")
class NuclideTests {

	@DisplayName("Testing isotopes")
	@ParameterizedTest
	@EnumSource(Element.class)
	void testIsotopes(Element element) {
		List<Isotope> isotopes = Isotope.ofElement(element);
		int numIsotopes = isotopes.size();

		// +0.5 due to rounding
		double maxWeightDeviation = numIsotopes + 0.5;

		for (Isotope isotope : isotopes) {
			assertEquals(element.mass(), isotope.mass(), maxWeightDeviation);
			assertTrue(isotope.isIsotope());
			assertEquals(1, isotope.nuclides().size());
			assertTrue(isotope.nuclides().contains(isotope));
		}
	}

	@DisplayName("Testing elements")
	@ParameterizedTest
	@EnumSource(Element.class)
	void testElements(Element element) {
		assertFalse(element.isIsotope());
		assertEquals(1, element.nuclides().size());
		assertTrue(element.nuclides().contains(element));
		assertEquals(element, element.element());
		assertEquals(element, Element.withAtomicNumber(element.atomicNumber()));
	}
}
