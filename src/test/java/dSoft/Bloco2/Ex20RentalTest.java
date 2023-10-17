package dSoft.Bloco2;

import org.junit.Test;
import java.time.DayOfWeek;
import static dSoft.dSoft2.RentalServices.*;
import static java.time.DayOfWeek.*;
import static org.junit.jupiter.api.Assertions.*;

public class Ex20RentalTest {
	@Test
	public void validDeliveryDistance() {
		int distance = 5;
		double expected = 10;
		double results = getDeliveryPrice(distance);
		assertEquals(expected, results);
	}

	@Test
	public void invalidDeliveryPrice() {
		int distance = -5;
		double expected = -1;
		double results = getDeliveryPrice(distance);
		assertEquals(expected, results);
	}

	@Test
	public void isNotWeekday() {
		boolean results = isWeekday(SUNDAY);
		assertFalse(results);
	}

	@Test
	public void isValidWeekday() {
		boolean results = isWeekday(FRIDAY);
		assertTrue(results);
	}

	@Test
	public void validRentalPriceA() {
		double expected = 40;
		double results = getRentalPrice(Kits.A, SUNDAY, false);
		assertEquals(expected, results);
	}

	@Test
	public void validRentalPriceB() {
		double expected = 50;
		double results = getRentalPrice(Kits.B, FRIDAY, false);
		assertEquals(expected, results);
	}

	@Test
	public void validRentalPriceC() {
		double expected = 100;
		double results = getRentalPrice(Kits.C, TUESDAY, false);
		assertEquals(expected, results);
	}

	@Test
	public void validRentalPriceHoliday() {
		double expected = 140;
		double results = getRentalPrice(Kits.C, TUESDAY, true);
		assertEquals(expected, results);
	}

	@Test
	public void validRentalPriceBWithDelivery() {
		double expected = 62;
		double results = getRentalPriceWithDelivery(6, Kits.B, FRIDAY, false);
		assertEquals(expected, results);
	}

	@Test
	public void validRentalPriceHolidayWithDelivery() {
		double expected = 160;
		double results = getRentalPriceWithDelivery(10, Kits.C, FRIDAY, true);
		assertEquals(expected, results);
	}
}