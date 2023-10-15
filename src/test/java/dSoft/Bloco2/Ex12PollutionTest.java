package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.sendPollutionNotification;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex12PollutionTest {
	@Test
	public void invalidPollutionMetric() {
		String expected = "Error";
		String result = sendPollutionNotification(-2);
		assertEquals(expected, result);
	}

	@Test
	public void outsideBoundariesPollutionMetric() {
		String expected = "Error";
		String result = sendPollutionNotification(9);
		assertEquals(expected, result);
	}

	@Test
	public void noPollutionMetric() {
		String expected = "No pollution metric.";
		String result = sendPollutionNotification(0);
		assertEquals(expected, result);
	}

	@Test
	public void lowestPollutionMetric() {
		String expected = "Pollution within acceptable values";
		String result = sendPollutionNotification(0.1);
		assertEquals(expected, result);
	}

	@Test
	public void highestPollutionMetric() {
		String expected = "Industries from group 1, 2 & 3, seize your activities.";
		String result = sendPollutionNotification(1);
		assertEquals(expected, result);
	}
}
