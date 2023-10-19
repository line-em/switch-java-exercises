package dSoft.Bloco3;

import org.junit.Test;
import static dSoft.dSoft3.Ex2.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex02Test {
	@Test
	public void multipleCantBeNegative() {
		int[] expected = {-1};
		int[] results = getMultiplesFromInterval(0, 0, -2);
		assertArrayEquals(expected, results);
	}

	@Test
	public void minMaxCantHaveSameValue() {
		int[] expected = {-2};
		int[] results = getMultiplesFromInterval(0, 0, 2);
		assertArrayEquals(expected, results);
	}

	@Test
	public void validInputsSingleMultipleCalc() {
		int[] expected = {6, 9, 12, 15, 18};
		int[] results = getMultiplesFromInterval(5, 20, 3);
		assertArrayEquals(expected, results);
	}

	@Test
	public void concatenateTwoValidArrays() {
		int[] arr1 = {6, 9, 12, 15, 18};
		int[] arr2 = {10, 12};
		int[] expected = {6, 9, 12, 15, 18, 10, 12};
		int[] results = concatenateTwoArrays(arr1, arr2);
		assertArrayEquals(expected, results);
	}

	@Test
	public void sumOfTwoValidArrays() {
		int[] arr1 = {6, 9, 12, 15, 18};
		int[] arr2 = {10, 12};
		int expected = 82;
		int results = sumOfMultiples(arr1, arr2);
		assertEquals(expected, results);
	}
}
