package dSoft;

import dSoft.dSoft2.GardenCostCalculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static dSoft.dSoft2.GardenCostCalculator.DecorType.BUSH;
import static dSoft.dSoft2.GardenCostCalculator.DecorType.TREE;

public class Ex13GardenTest {

	@Test
	public void grassAreaIsNegative() {
		int areaInSquareMeters = -1;
		double expected = -1;
		double actual = GardenCostCalculator.getGrassCost(areaInSquareMeters);

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void grassAreaIsZero() {
		int areaInSquareMeters = 0;
		double expected = -1;
		double actual = GardenCostCalculator.getGrassCost(areaInSquareMeters);

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void grassAreaIsPositive() {
		int areaInSquareMeters = 200;
		double expected = 2000;
		double actual = GardenCostCalculator.getGrassCost(areaInSquareMeters);

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void grassTimeAreaIsNegative() {
		int areaInSquareMeters = -1;
		int expected = -1;
		int actual = GardenCostCalculator.getGrassTime(areaInSquareMeters);

		assertEquals(expected, actual);
	}

	@Test
	public void grassTimeAreaIsZero() {
		int areaInSquareMeters = 0;
		int expected = 0;
		int actual = GardenCostCalculator.getGrassTime(areaInSquareMeters);

		assertEquals(expected, actual);
	}

	@Test
	public void grassTimeAreaIsPositive() {
		int areaInSquareMeters = 200;
		int expected = 60000;
		int actual = GardenCostCalculator.getGrassTime(areaInSquareMeters);

		assertEquals(expected, actual);
	}

	@Test
	public void treeQntdIsNegative() {
		int quantity = -1;
		double expected = -1.0;
		double actual = GardenCostCalculator.getDecorCost(TREE, quantity);

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void treeCostPositive() {
		int quantity = 5;
		double expected = 50;
		double actual = GardenCostCalculator.getDecorCost(TREE, quantity);

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void treeQntdIsNegativeTimeCalc() {
		int quantity = -1;
		int expected = -1;
		int actual = GardenCostCalculator.getDecorTime(TREE, quantity);
		;

		assertEquals(expected, actual);
	}

	@Test
	public void treeQntdPositiveTimeCalc() {
		int quantity = 5;
		int expected = 3000;
		int actual = GardenCostCalculator.getDecorTime(TREE, quantity);
		;

		assertEquals(expected, actual);
	}

	@Test
	public void bushQntdIsNegative() {
		int quantity = -1;
		double expected = -1.0;
		double actual = GardenCostCalculator.getDecorCost(BUSH, quantity);

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void bushQntdIsZero() {
		int quantity = 0;
		double expected = 0;
		double actual = GardenCostCalculator.getDecorCost(BUSH, quantity);

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void bushCostPositive() {
		int quantity = 5;
		double expected = 75;
		double actual = GardenCostCalculator.getDecorCost(BUSH, quantity);

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void bushQntdIsNegativeTimeCalc() {
		int quantity = -1;
		int expected = -1;
		double actual = GardenCostCalculator.getDecorTime(BUSH, quantity);

		assertEquals(expected, actual);
	}

	@Test
	public void bushQntdPositiveTimeCalc() {
		int quantity = 5;
		int expected = 2000;
		double actual = GardenCostCalculator.getDecorTime(BUSH, quantity);

		assertEquals(expected, actual);
	}

	@Test
	public void salaryTimeNegative() {
		int totalTimeInSeconds = -1;
		int expected = -1;
		int actual = GardenCostCalculator.getSalary(totalTimeInSeconds);

		assertEquals(expected, actual);
	}

	@Test
	public void salaryTimeZero() {
		int totalTimeInSeconds = 0;
		int expected = 0;
		int actual = GardenCostCalculator.getSalary(totalTimeInSeconds);

		assertEquals(expected, actual);
	}

	@Test
	public void salaryTimePositive() {
		int totalTimeInSeconds = 60000;
		int expected = 160;
		int actual = GardenCostCalculator.getSalary(totalTimeInSeconds);
		assertEquals(expected, actual);
	}

	@Test
	public void totalTimeInvalid() {
		int areaInSquareMeters = -1;
		int treeQuantity = 5;
		int bushQuantity = 0;
		double expected = -1;
		double actual = GardenCostCalculator.getTotalTime(areaInSquareMeters, treeQuantity,
																		  bushQuantity);
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void totalTimeValid() {
		int areaInSquareMeters = 200;
		int treeQuantity = 5;
		int bushQuantity = 5;
		double expected = 65000;
		double actual = GardenCostCalculator.getTotalTime(treeQuantity, bushQuantity,
																		  areaInSquareMeters);
		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void totalTimeInvalidHours() {
		int time = -1;
		String expected = "Error";
		String actual = GardenCostCalculator.getTotalTimeInHours(time);
		assertEquals(expected, actual);
	}

	@Test
	public void totalTimeValidHours() {
		int time = 65000;
		String expected = "18:3:20";
		String actual = GardenCostCalculator.getTotalTimeInHours(time);
		assertEquals(expected, actual);
	}

	@Test
	public void invalidTotalCostNegative() {
		int areaInSquareMeters = -1;
		int treeQuantity = 0;
		int bushQuantity = 0;
		double expected = -1.0;
		double actual = GardenCostCalculator.getTotalCost(areaInSquareMeters, treeQuantity,
																		  bushQuantity);

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void invalidTotalCostAreaZero() {
		int areaInSquareMeters = 0;
		int treeQuantity = 0;
		int bushQuantity = 0;
		double expected = -1;
		double actual = GardenCostCalculator.getTotalCost(areaInSquareMeters, treeQuantity,
																		  bushQuantity);

		assertEquals(expected, actual, 0.1);
	}

	@Test
	public void validTotalCost() {
		int areaInSquareMeters = 200;
		int treeQuantity = 5;
		int bushQuantity = 5;
		double expected = 2305;
		double actual = GardenCostCalculator.getTotalCost(areaInSquareMeters, treeQuantity,
																		  bushQuantity);

		assertEquals(expected, actual, 0.1);
	}
}
