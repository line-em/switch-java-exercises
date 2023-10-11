package dSoft.Bloco2;

import dSoft.dSoft2;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ex2DigitsTest {
	@Test
	public void validLength() {
		int providedNum = 123;
		boolean result = dSoft2.verifyLength(providedNum);
		assertTrue(result);
	}

	@Test
	public void validNumberDigits() {
		int providedNum = 123;
		int[] expected = {1, 2, 3};
		int[] result = dSoft2.getDigits(providedNum);
		assertArrayEquals(expected, result);
	}

	@Test
	public void invalidLength() {
		int providedNum = 5;
		boolean result = dSoft2.verifyLength(providedNum);
		assertFalse(result);
	}

	@Test
	public void invalidInput() {
		int providedNum = 5;
		int[] result = dSoft2.getDigits(providedNum);
		assertNull(result);
	}

	@Test
	public void isOdd() {
		int providedNum = 201;
		boolean result = dSoft2.isEven(providedNum);
		assertFalse(result);
	}
	@Test
	public void isEven() {
		int providedNum = 200;
		boolean result = dSoft2.isEven(providedNum);
		assertTrue(result);
	}
}
