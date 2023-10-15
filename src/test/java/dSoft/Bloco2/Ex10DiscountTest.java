package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.DiscountCalculator.getDiscount;
import static dSoft.dSoft2.DiscountCalculator.getDiscountPrice;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex10DiscountTest {
	@Test
	public void priceShouldNotBeZero() {
		byte expected = -1;
		double results = getDiscount(0);
		assertEquals(expected, results);
	}

	@Test
	public void priceShouldNotBeNegative() {
		byte expected = -1;
		double results = getDiscount(-20.50);
		assertEquals(expected, results);
	}

	@Test
	public void validDiscountLowestResult() {
		double expected = 0.2;
		double results = getDiscount(20.50);
		assertEquals(expected, results);
	}

	@Test
	public void validDiscountHighestResult() {
		double expected = 0.6;
		double results = getDiscount(201);
		assertEquals(expected, results);
	}

	@Test
	public void invalidDiscountedPrice() {
		double expected = -1;
		double results = getDiscountPrice(-201);
		assertEquals(expected, results);
	}

	@Test
	public void validDiscountedPrice() {
		double expected = 80.4;
		double results = getDiscountPrice(201);
		assertEquals(expected, results);
	}

	@Test
	public void validLowDiscountPrice() {
		double expected = 16;
		double results = getDiscountPrice(20);
		assertEquals(expected, results);
	}
}
