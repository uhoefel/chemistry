package eu.hoefel.chemistry;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Tests for molecules.
 * 
 * @author Udo Hoefel
 */
@DisplayName("Molecules")
class MoleculeTests {

	@DisplayName("Testing molecule validity")
	@ParameterizedTest
	@ValueSource(strings = { "h2o", "hydroxychloroquine", "water", "magnesium dioxide" })
	void testMoleculeValidity(String name) {
		assertDoesNotThrow(() -> new Molecule(name));
	}

	@DisplayName("Testing molecule invalidity")
	@ParameterizedTest
	@ValueSource(strings = { "no molecule", "wader" })
	void testMoleculeInvalidity(String name) {
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Molecule(name));
		assertEquals("Cannot fetch information for molecule named \"" + name + "\". Are you sure the spelling is correct?", e.getMessage());
	}

	@DisplayName("Testing molecule invalidity (no elements)")
	@ParameterizedTest
	@ValueSource(strings = { "hydrogen", "nitrogen" })
	void testMoleculeInvalidity_noElements(String name) {
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Molecule(name));
		assertEquals("You requested a nuclide (" + name + "), not a molecule. Please use the nuclide classes!", e.getMessage());
	}

	@DisplayName("Testing molecule masses")
	@Test
	void testMoleculeMasses() {
		assertEquals(18.01528, new Molecule("water").mass());
		assertEquals(2.01588, new Molecule("dihydrogen").mass());
	}
}
