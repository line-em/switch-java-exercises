package dSoft.Bloco2;

import dSoft.dSoft2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex8MultipleTest {
	@Test
	public void getMultipleMessage() {
		int num1 = 123;
		int num2 = 1;
		String expected = "123 é múltiplo de 1";
		String result = dSoft2.getMultipleMessage(num1, num2);

		assertEquals(expected, result);
	}

	@Test
	public void getNotMultipleMessage() {
		int num1 = 7;
		int num2 = 8;
		String expected = "7 não é múltiplo de 8";
		String result = dSoft2.getMultipleMessage(num1, num2);

		assertEquals(expected, result);
	}

	@Test
	public void isMultiple() {
		int x = 123;
		int y = 123;
		boolean expected = true;
		boolean result = dSoft2.isMultiple(x, y);

		assertEquals(expected, result);
	}

	@Test
	public void isNotMultiple() {
		int x = 7;
		int y = 8;
		boolean expected = false;
		boolean result = dSoft2.isMultiple(x, y);

		assertEquals(expected, result);
	}

	@Test
	//TODO: Does this make sense
	public void zeroDivider() {
		int x = 0;
		int y = 5;
		boolean expected = true;
		boolean result = dSoft2.isMultiple(x, y);

		assertEquals(expected, result);
	}

	@Test
	public void zeroMultiple() {
		int x = 5;
		int y = 0;
		boolean expected = false;
		boolean result = dSoft2.isMultiple(x, y);

		assertEquals(expected, result);
	}
}
