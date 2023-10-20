package dSoft.Bloco3;

import static dSoft.dSoft3.Ex12salaryTaxes.getNetSalary;
import static dSoft.dSoft3.Ex12salaryTaxes.getSalaryTaxes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ex12Test {
	@Test
	public void salaryTaxesBelowZero() {
		double expected = -1;
		double result = getSalaryTaxes(-100);
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void salaryTaxesBelow500() {
		double expected = 0.10;
		double result = getSalaryTaxes(300);
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void salaryTaxesBetween500And1000() {
		double expected = 0.15;
		double result = getSalaryTaxes(750);
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void salaryTaxesAbove1000() {
		double expected = 0.20;
		double result = getSalaryTaxes(1200);
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void validNetSalary() {
		double salary = 800;
		double expected = 680;
		double result = getNetSalary(salary);
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void invalidNetSalary() {
		double salary = -100;
		double expected = -1;
		double result = getNetSalary(salary);
		assertEquals(expected, result, 0.01);
	}
}