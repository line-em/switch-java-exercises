package dSoft.Bloco1;
//TODO: Make tests for all 3 expressions.
import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class Question7Test {
	@DisplayName("05. Time in Seconds")
	@Test
	public void positiveTimeValue() {
		double expected = 3760;
		double result = dSoft1.getTimeInSeconds(1, 2, 40);
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void negativeTimeValue() {
		double expected = -1;
		double result = dSoft1.getTimeInSeconds(-20, 25, 40);
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void positiveDistanceMoveSpeed() {
		double expected = 2.5;
		double result = dSoft1.getMoveSpeed(4500, 0, 30, 0);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void negativeDistanceMoveSpeed() {
		double expected = -1;
		double result = dSoft1.getMoveSpeed(-100, 0, 30, 0);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void noMovement() {
		double expected = 0;
		double result = dSoft1.getMoveSpeed(0, 4, 30, 0);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void validRunDistance() {
		double expected = 11.25;
		double result = dSoft1.getRunDistance(1.25, 2, 30, 0);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void invalidRunDistance() {
		double expected = -1;
		double result = dSoft1.getRunDistance(-20, 2, 30, 0);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void validRunDistanceNegativeTime() {
		double expected = -1;
		double result = dSoft1.getRunDistance(2, -2, 20, 20);
		assertEquals(expected, result, 0.1);
	}
}
