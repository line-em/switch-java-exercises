package dSoft.Bloco3;

import org.junit.jupiter.api.Test;
import static dSoft.dSoft3.Ex06.getHourlyBonus;
import static dSoft.dSoft3.Ex06.getMonthlyWage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex06Test {

	@Test
	public void getValidHourlyBonus() {
		double baseSalary = 1000;
		int extraHours = 10;
		double expected = 200;
		double result = getHourlyBonus(baseSalary, extraHours);
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void noHourlyBonus() {
		double baseSalary = 1000;
		int extraHours = 0;
		double expected = 0;
		double result = getHourlyBonus(baseSalary, extraHours);
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void validMonthlyWage() {
		double baseSalary = 1000;
		int extraHours = 10;
		double expected = 1200;
		double result = getMonthlyWage(baseSalary, extraHours);
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void invalidMonthlyWage() {
		double baseSalary = -1000;
		int extraHours = 10;
		double expected = -1;
		double result = getMonthlyWage(baseSalary, extraHours);
		assertEquals(expected, result, 0.01);
	}

}