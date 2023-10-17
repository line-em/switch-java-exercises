package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.weeklySalary.getBonus;
import static dSoft.dSoft2.weeklySalary.getWeeklySalary;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex19WeeklyWageTest {
	@Test
	public void invalidBonus() {
		int extraHours = -1;
		double expected = -1;
		double results = getBonus(extraHours);
		assertEquals(expected, results);
	}

	@Test
	public void noBonus() {
		int extraHours = 0;
		double expected = 0;
		double results = getBonus(extraHours);
		assertEquals(expected, results);
	}

	@Test
	public void validSmallBonus() {
		int extraHours = 2;
		double expected = 20;
		double results = getBonus(extraHours);
		assertEquals(expected, results);
	}

	@Test
	public void validBigBonus() {
		int extraHours = 6;
		double expected = 65;
		double results = getBonus(extraHours);
		assertEquals(expected, results);
	}

	@Test
	public void invalidSalary() {
		int extraHours = -1;
		double expected = -1;
		double results = getWeeklySalary(extraHours);
		assertEquals(expected, results);
	}

	@Test
	public void validSalaryNoBonus() {
		int extraHours = 0;
		double expected = 270;
		double results = getWeeklySalary(extraHours);
		assertEquals(expected, results);
	}

	@Test
	public void validSalarySmallBonus() {
		int extraHours = 5;
		double expected = 320;
		double results = getWeeklySalary(extraHours);
		assertEquals(expected, results);
	}

	@Test
	public void validSalaryBigBonus() {
		int extraHours = 7;
		double expected = 350;
		double results = getWeeklySalary(extraHours);
		assertEquals(expected, results);
	}
}
