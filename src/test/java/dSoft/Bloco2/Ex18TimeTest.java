package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.getFinishTime;
import static dSoft.dSoft2.isValidTime;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Ex18TimeTest {
	@Test
	public void finishTimeValidInput() {
		int[] startTime = {10, 30, 15};
		int duration = 90;
		int[] result = getFinishTime(startTime, duration);
		int[] expectedFinishTime = {10, 31, 45};
		assertArrayEquals(expectedFinishTime, result);
	}

	@Test
	public void finishTimeInvalidStartTime() {
		int[] startTime = {25, 70, 80};
		int duration = 90;
		int[] result = getFinishTime(startTime, duration);
		int[] expectedFinishTime = {-1};
		assertArrayEquals(expectedFinishTime, result);
	}

	@Test
	public void finishTimeNegativeDuration() {
		int[] startTime = {10, 30, 15};
		int duration = -30;
		int[] result = getFinishTime(startTime, duration);
		int[] expectedFinishTime = {-1};
		assertArrayEquals(expectedFinishTime, result);
	}

	@Test
	public void isValidTimeInvalidHour() {
		int[] startTime = {25, 30, 45}; // Invalid hour
		boolean result = isValidTime(startTime);
		assertFalse(result);
	}

	@Test
	public void isValidTimeInvalidMinute() {
		int[] startTime = {12, 60, 45}; // Invalid minute
		boolean result = isValidTime(startTime);
		assertFalse(result);
	}

	@Test
	public void isValidTimeInvalidSecond() {
		int[] startTime = {12, 30, 60}; // Invalid second
		boolean result = isValidTime(startTime);
		assertFalse(result);
	}
}
