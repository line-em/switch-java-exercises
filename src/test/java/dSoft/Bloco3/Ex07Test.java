package dSoft.Bloco3;

import org.junit.jupiter.api.Test;
import static dSoft.dSoft3.Ex07.getPositionProductIsHigherThanNum;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex07Test {
	@Test
	public void successProductPositionPositiveNumbers() {
		int[] numArray = {2, 3, 4, 5};
		int num = 20;
		int expected = 2;
		int result = getPositionProductIsHigherThanNum(numArray, num);
		assertEquals(expected, result);
	}

	@Test
	public void failProductPositionNegativeNumbers() {
		int[] numArray = {2, -3, 4, 5};
		int num = 20;
		int expected = -1;
		int result = getPositionProductIsHigherThanNum(numArray, num);
		assertEquals(expected, result);
	}

	@Test
	public void productPositionNoPositionFound() {
		int[] numArray = {2, 3, 4, 5};
		int num = 120;
		int expected = -2;
		int result = getPositionProductIsHigherThanNum(numArray, num);
		assertEquals(expected, result);
	}

	@Test
	public void productPositionEmptyArray() {
		int[] numArray = {};
		int num = 20;
		int expected = -2;
		int result = getPositionProductIsHigherThanNum(numArray, num);
		assertEquals(expected, result);
	}
}
