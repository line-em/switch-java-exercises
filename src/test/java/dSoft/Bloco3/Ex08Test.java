package dSoft.Bloco3;

import org.junit.Test;
import static dSoft.dSoft3.Ex08.getPossibleSums;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex08Test {
	@Test
	public void invalidNum() {
		int expected = -1;
		int result = getPossibleSums(30);
		assertEquals(expected, result);
	}

	@Test
	public void negativeNum() {
		int expected = -1;
		int result = getPossibleSums(-30);
		assertEquals(expected, result);
	}

	@Test
	public void ZeroNum() {
		int expected = -1;
		int result = getPossibleSums(0);
		assertEquals(expected, result);
	}

	@Test
	public void validNum() {
		int expected = 3;
		int result = getPossibleSums(5);
		assertEquals(expected, result);
	}

	@Test
	public void maxNum() {
		int expected = 11;
		int result = getPossibleSums(20);
		assertEquals(expected, result);
	}
}
