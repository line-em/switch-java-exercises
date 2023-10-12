package dSoft.Bloco2;

import dSoft.dSoft2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ex3PointsTest {
	@Test
	public void positivePoints() {
		int expected = 4;
		double result = dSoft2.getDistanceBetweenPoints(2, 2, 6, 2);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void negativePoints() {
		int expected = 4;
		double result = dSoft2.getDistanceBetweenPoints(-2, -2, -2, 2);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void noDistance() {
		int expected = 0;
		double result = dSoft2.getDistanceBetweenPoints(0, 0, 0, 0);
		assertEquals(expected, result, 0.1);
	}
}
