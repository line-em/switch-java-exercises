package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.TrainSchedule.*;
import static org.junit.jupiter.api.Assertions.*;

public class Ex17TrainsTest {
	@Test
	public void testGetTrainArrivalTimeValidInput() {
		int[] arrivalTime = getTrainArrivalTime(12, 30, 2, 45);
		int[] expectedArrivalTime = {15, 15};
		assertArrayEquals(expectedArrivalTime, arrivalTime);
	}

	@Test
	public void testGetTrainArrivalTimeInvalidInput() {
		int[] arrivalTime = getTrainArrivalTime(25, 70, 2, 45);
		int[] expectedArrivalTime = {-1};
		assertArrayEquals(expectedArrivalTime, arrivalTime);
	}

	@Test
	public void testIsValidTimeValidTime() {
		boolean result = isValidTime(10, 30);
		assertTrue(result);
	}

	@Test
	public void testIsValidTimeInvalidHour() {
		boolean result = isValidTime(25, 30);
		assertFalse(result);
	}

	@Test
	public void testIsValidTimeInvalidMinute() {
		boolean result = isValidTime(10, 61);
		assertFalse(result);
	}

	@Test
	public void sameDayArrivalTrue() {
		boolean result = isSameDayArrival(10, 30, 9, 45);
		assertTrue(result);
	}

	@Test
	public void sameDayArrivalFalse() {
		boolean result = isSameDayArrival(9, 30, 20, 45);
		assertFalse(result);
	}
}
