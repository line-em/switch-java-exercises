package dSoft.Bloco2;

import dSoft.dSoft2.BuildingPaintingJob;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex7BuildingTest {

	@Test
	public void validDaysNeeded() {
		double buildingSize = 123.4;
		int expected = 4;
		int results = BuildingPaintingJob.daysNeeded(buildingSize);
		assertEquals(expected, results);
	}

	@Test
	public void invalidDaysNeeded() {
		double buildingSize = -123.4;
		int expected = -1;
		int results = BuildingPaintingJob.daysNeeded(buildingSize);
		assertEquals(expected, results);
	}

	@Test
	public void validFullCost() {
		double buildingSize = 123.4;
		double paintCost = 12;
		double paintEfficiency = 2;
		double salary = 200;
		double expected = 1540.4;
		double results = BuildingPaintingJob.getFullCost(buildingSize, paintCost, paintEfficiency,
																		 salary);

		assertEquals(expected, results, 0.1);
	}

	@Test
	public void invalidFullCost() {
		double buildingSize = 800;
		double paintCost = -12;
		double paintEfficiency = 0;
		double salary = 0;
		double expected = -1;
		double results = BuildingPaintingJob.getFullCost(buildingSize, paintCost, paintEfficiency,
																		 salary);

		assertEquals(expected, results, 0.1);
	}

	@Test
	public void smallestFullCost() {
		double buildingSize = 1;
		double paintCost = 1;
		double paintEfficiency = 1;
		double salary = 1;
		double expected = 1;
		double results = BuildingPaintingJob.getFullCost(buildingSize, paintCost, paintEfficiency,
																		 salary);

		assertEquals(expected, results, 0.1);
	}

	@Test
	public void validGetPainters() {
		double buildingSize = 123.4;
		int expected = 2;
		int results = BuildingPaintingJob.getPainters(buildingSize);
		assertEquals(expected, results);
	}

	@Test
	public void invalidGetPainters() {
		double buildingSize = -200;
		int expected = -1;
		int results = BuildingPaintingJob.getPainters(buildingSize);
		assertEquals(expected, results);
	}

	@Test
	public void validPaintingCosts() {
		double buildingSize = 123.4;
		double paintCost = 10;
		double paintEfficiency = 2;
		double expected = 617;
		double results = BuildingPaintingJob.getPaintingCosts(buildingSize, paintCost,
																				paintEfficiency);

		assertEquals(expected, results, 0.1);
	}

	@Test
	public void invalidPaintingCosts() {
		double buildingSize = 123.4;
		double paintCost = 0;
		double paintEfficiency = -2;
		double expected = -1;
		double results = BuildingPaintingJob.getPaintingCosts(buildingSize, paintCost,
																				paintEfficiency);

		assertEquals(expected, results, 0.1);
	}

	@Test
	public void validWorkCosts() {
		double buildingSize = 222;
		double salary = 250;
		double expected = 1750;
		double actual = BuildingPaintingJob.getWorkCosts(buildingSize, salary);

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void invalidWorkCosts() {
		double buildingSize = 222;
		double salary = 0;
		double expected = -1;
		double actual = BuildingPaintingJob.getWorkCosts(buildingSize, salary);

		assertEquals(expected, actual, 0.1);
	}
}
