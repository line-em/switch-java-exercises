package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.CubeSize.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class Ex5CubeTest {
	@Test
	public void positiveCubeArea() {
		double expected = 3.15;
		double result = getCubeVolume(12.9);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void negativeCubeArea() {
		int expected = -1;
		double result = getCubeVolume(-12);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void noCube() {
		int expected = 0;
		double result = getCubeVolume(0);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void allValidCubeDescriptions() {
		double bigCube = getCubeVolume(12.9);
		double smallCube = getCubeVolume(3);
		double regularCube = getCubeVolume(8);

		String expectedSmall = getCubeDescription(smallCube);
		String expectedRegular = getCubeDescription(regularCube);
		String expectedBig = getCubeDescription(bigCube);

		assertAll("Cube Descriptions", () -> assertEquals("Pequeno", expectedSmall),
					 () -> assertEquals("Médio", expectedRegular),
					 () -> assertEquals("Grande", expectedBig));
	}

	@Test
	public void invalidCubeDescription() {
		String expected = "Impossível";
		String result = getCubeDescription(0);
		assertEquals(expected, result);
	}

	@Test
	public void validDescription() {
		double volume = getCubeVolume(12.9);
		String description = getCubeDescription(volume);
		String expected = "O cubo de 12.9cm é " + description + ", e tem " + volume + "cm²";
		String result = describeCube(12.9);

		assertEquals(expected, result);
	}

	@Test
	public void invalidDescription() {
		String expected = "Error";
		String result = describeCube(-1);

		assertEquals(expected, result);
	}
}
