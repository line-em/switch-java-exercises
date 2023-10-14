package dSoft.Bloco2;

import dSoft.dSoft2;
import org.junit.Test;
import static dSoft.dSoft2.DigitMethods.EvenOdd;
import static dSoft.dSoft2.DigitMethods;
import static org.junit.Assert.*;

public class Ex2DigitsTest {
	@Test
	public void validLength() {
		int providedNum = 123;
		boolean result = DigitMethods.verifyLength(providedNum);
		assertTrue(result);
	}

	@Test
	public void validNumberDigits() {
		int providedNum = 123;
		int[] expected = {1, 2, 3};
		int[] result = DigitMethods.getDigits(providedNum);
		assertArrayEquals(expected, result);
	}

	@Test
	public void invalidLength() {
		int providedNum = 5;
		boolean result = DigitMethods.verifyLength(providedNum);
		assertFalse(result);
	}

	@Test
	public void invalidInput() {
		int providedNum = 5;
		int[] expected = {-1};
		int[] result = DigitMethods.getDigits(providedNum);
		assertArrayEquals(expected, result);
	}

	@Test
	public void isOdd() {
		int[] providedNum = {1, 2, 3};
		EvenOdd result = DigitMethods.evenOrOdd(providedNum);
		assertEquals(EvenOdd.ODD, result);
	}

	@Test
	public void isEven() {
		int[] providedNum = {1, 2, 2};
		EvenOdd result = DigitMethods.evenOrOdd(providedNum);
		assertEquals(EvenOdd.EVEN, result);
	}
}
