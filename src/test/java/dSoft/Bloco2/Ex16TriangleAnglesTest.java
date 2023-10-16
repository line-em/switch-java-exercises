package dSoft.Bloco2;

import dSoft.dSoft2;
import org.junit.Test;
import static dSoft.dSoft2.TriangleAngles.*;
import static dSoft.dSoft2.TriangleSides.getTriangleType;
import static org.junit.jupiter.api.Assertions.*;

public class Ex16TriangleAnglesTest {
	@Test
	public void invalidSides() {
		int[] angles = {2, 2};
		boolean results = isTrianglePossible(angles);
		assertFalse(results);
	}

	@Test
	public void triangleNotPossibleNegative() {
		int[] angles = {2, 2, -1};
		boolean results = isTrianglePossible(angles);
		assertFalse(results);
	}

	@Test
	public void trianglePossible() {
		int[] angles = {45, 45, 90};
		boolean results = isTrianglePossible(angles);
		assertTrue(results);
	}

	@Test
	public void rectangleNotPossible() {
		int[] angles = {2, 2, -1};
		boolean results = isRectangle(angles);
		assertFalse(results);
	}

	@Test
	public void rectanglePossible() {
		int[] angles = {45, 45, 90};
		boolean results = isRectangle(angles);
		assertTrue(results);
	}

	@Test
	public void acuteNotPossible() {
		int[] angles = {10, 90, 80};
		boolean results = isAcute(angles);
		assertFalse(results);
	}

	@Test
	public void acutePossible() {
		int[] angles = {45, 55, 80};
		boolean results = isAcute(angles);
		assertTrue(results);
	}

	@Test
	public void obtuseNotPossible() {
		int[] angles = {10, 90, 80};
		boolean results = isObtuse(angles);
		assertFalse(results);
	}

	@Test
	public void obtusePossible() {
		int[] angles = {45, 35, 100};
		boolean results = isObtuse(angles);
		assertTrue(results);
	}

	@Test
	public void triangleIsError() {
		int[] angles = {2, 2, -2};
		TriangleTypes results = verifyTriangleType(angles);
		assertNull(results);
	}

	@Test
	public void triangleIsRectangle() {
		int[] angles = {45, 45, 90};
		TriangleTypes results = verifyTriangleType(angles);
		assertEquals(TriangleTypes.RECTANGLE, results);
	}

	@Test
	public void triangleIsAcute() {
		int[] angles = {45, 55, 80};
		TriangleTypes results = verifyTriangleType(angles);
		assertEquals(TriangleTypes.ACUTE, results);
	}

	@Test
	public void triangleIsObtuse() {
		int[] angles = {45, 35, 100};
		TriangleTypes results = verifyTriangleType(angles);
		assertEquals(TriangleTypes.OBTUSE, results);
	}
}
