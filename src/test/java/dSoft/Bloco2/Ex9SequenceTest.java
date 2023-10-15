package dSoft.Bloco2;

import dSoft.dSoft2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex9SequenceTest {
	@Test
	public void noSequence() {
		boolean results = dSoft2.isSequence(0);
		assertFalse(results);
	}

	@Test
	public void threeDigitsNoSequence() {
		boolean results = dSoft2.isSequence(101);
		assertFalse(results);
	}


	@Test
	public void correctSequence() {
		boolean results = dSoft2.isSequence(123);
		assertTrue(results);
	}

	@Test
	public void limitSequence() {
		boolean results = dSoft2.isSequence(999);
		assertFalse(results);
	}

	@Test
	public void notEnoughDigits() {
		byte expected = -2;
		int results = dSoft2.verifySequence(0);
		assertEquals(expected, results);
	}

	@Test
	public void noSequenceError() {
		byte expected = -1;
		int results = dSoft2.verifySequence(101);
		assertEquals(expected, results);
	}

	@Test
	public void isSequence() {
		byte expected = 0;
		int results = dSoft2.verifySequence(123);
		assertEquals(expected, results);
	}

	@Test
	public void verifySequence12() {
		byte expected = -2;
		int results = dSoft2.verifySequence(-999);
		assertEquals(expected, results);
	}
}
