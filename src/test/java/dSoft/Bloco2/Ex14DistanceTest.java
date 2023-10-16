package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.DistanceCalculator.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex14DistanceTest {

	@Test
	public void positiveTravelDistances() {
		int[] travelDistances = {15, 20, 16, 30, 45};
		double expected = 25.2;
		double results = getAverageTravelledDistanceInMiles(travelDistances);
		assertEquals(expected, results, 0.1);
	}

	@Test
	public void emptyTravelDistances() {
		int[] travelDistances = {};
		double expected = -1;
		double results = getAverageTravelledDistanceInMiles(travelDistances);
		assertEquals(expected, results, 0.1);
	}

	@Test
	public void negativeTravelDistances() {
		int[] travelDistances = {-1, 2, -3};
		double expected = -1;
		double results = getAverageTravelledDistanceInMiles(travelDistances);
		assertEquals(expected, results, 0.1);
	}

	@Test
	public void convertInvalidDistance() {
		double travelDistance = -15;
		double expected = -1;
		double results = convertMilesToKm(travelDistance);
		assertEquals(expected, results, 0.1);
	}

	@Test
	public void convertValidDistance() {
		double travelDistance = 25;
		double expected = 26.725;
		double results = convertMilesToKm(travelDistance);
		assertEquals(expected, results, 0.1);
	}

	@Test
	public void positiveTravelDistanceKm() {
		int[] travelDistances = {200, 150, 40};
		double expected = 138.97;
		double results = getAverageTravelledDistanceInKm(travelDistances);
		assertEquals(expected, results, 0.1);
	}

	@Test
	public void negativeTravelDistanceKm() {
		int[] travelDistances = {-2, -5, -360};
		double expected = -1;
		double results = getAverageTravelledDistanceInKm(travelDistances);
		assertEquals(expected, results, 0.1);
	}
}
