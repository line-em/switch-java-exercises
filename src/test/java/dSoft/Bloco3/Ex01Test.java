package dSoft.Bloco3;

import org.junit.jupiter.api.Test;
import static dSoft.dSoft3.Ex01.calculateAlgorithm;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex01Test {
	@Test
	public void calculateAlgorithmZero() {
		int num = 0;
		int expected = 1;
		int actual = calculateAlgorithm(num);

		assertEquals(expected, actual);
	}

	@Test
	public void calculateAlgorithmOne() {
		int num = 1;
		int expected = 1;
		int actual = calculateAlgorithm(num);

		assertEquals(expected, actual);
	}

	@Test
	public void calculateAlgorithmNegative() {
		int num = -1;
		int expected = 1;
		int actual = calculateAlgorithm(num);

		assertEquals(expected, actual);
	}

	@Test
	public void calculateAlgorithmPositiveNum() {
		int num = 5;
		int expected = 120;
		int actual = calculateAlgorithm(num);

		assertEquals(expected, actual);
	}
}
