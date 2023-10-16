package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.TriangleSides.*;
import static org.junit.jupiter.api.Assertions.*;

public class Ex15TriangleSidesTest {
	@Test
	public void invalidSides() {
		int[] sides = {2, 2};
		boolean results = hasEnoughSides(sides);
		assertFalse(results);
	}

	@Test
	public void triangleNotPossibleNegative() {
		int[] sides = {2, 2, -2};
		boolean results = isTrianglePossible(sides);
		assertFalse(results);
	}

	@Test
	public void triangleNotPossibleInvalidConditions() {
		int[] sides = {2, 2, 5};
		boolean results = isTrianglePossible(sides);
		assertFalse(results);
	}

	@Test
	public void trianglePossible() {
		int[] sides = {7, 7, 5};
		boolean results = isTrianglePossible(sides);
		assertTrue(results);
	}

	@Test
	public void scaleneInvalid() {
		int[] sides = {2, 2, 5};
		boolean results = isScalene(sides);
		assertFalse(results);
	}

	@Test
	public void scaleneValid() {
		int[] sides = {4, 7, 5};
		boolean results = isScalene(sides);
		assertTrue(results);
	}

	@Test
	public void isoscelesInvalid() {
		int[] sides = {2, 3, 5};
		boolean results = isIsosceles(sides);
		assertFalse(results);
	}

	@Test
	public void isoscelesValid() {
		int[] sides = {7, 7, 5};
		boolean results = isIsosceles(sides);
		assertTrue(results);
	}

	@Test
	public void equilateralInvalid() {
		int[] sides = {2, 2, 5};
		boolean results = isEquilateral(sides);
		assertFalse(results);
	}

	@Test
	public void equilateralValid() {
		int[] sides = {7, 7, 7};
		boolean results = isEquilateral(sides);
		assertTrue(results);
	}

	@Test
	public void triangleIsError() {
		int[] sides = {2, 2, -2};
		TriangleTypes results = getTriangleType(sides);
		assertNull(results);
	}

	@Test
	public void triangleIsIsosceles() {
		int[] sides = {7, 7, 5};
		TriangleTypes results = getTriangleType(sides);
		assertEquals(TriangleTypes.ISOSCELES, results);
	}

	@Test
	public void triangleIsEquilateral() {
		int[] sides = {7, 7, 7};
		TriangleTypes results = getTriangleType(sides);
		assertEquals(TriangleTypes.EQUILATERAL, results);
	}

	@Test
	public void triangleIsScalene() {
		int[] sides = {5, 6, 7};
		TriangleTypes results = getTriangleType(sides);
		assertEquals(TriangleTypes.SCALENE, results);
	}
}
