package dSoft.Bloco2;

import dSoft.dSoft2;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ex1GradesTest {
	@Test
	public void positiveGrade() {
		int[] studentGrades = {5, 8, 20};
		int[] testWeights = {5, 3, 2};

		double expected = 8.9;
		double result = dSoft2.getAverage(studentGrades, testWeights);

		assertEquals(expected, result, 0.1);
	}

	@Test
	public void invalidGrade() {
		int[] studentGrades = {-2, -3, 20};
		int[] testWeights = {-1, 3, 2};

		double expected = 0;
		double result = dSoft2.getAverage(studentGrades, testWeights);

		assertEquals(expected, result, 0.1);
	}

	@Test //Fronteira Maxima
	public void averageIsTooHigh() {
		int[] studentGrades = {20, 50, 30};
		int[] testWeights = {1, 1, 1};

		double expected = -1;
		double result = dSoft2.getAverage(studentGrades, testWeights);

		assertEquals(expected, result, 0.1);
	}

	@Test //Fronteira Minima
	public void noTestsGiven() {
		int[] studentGrades = {0, 0, 0};
		int[] testWeights = {0, 0, 0};

		double expected = 0;
		double result = dSoft2.getAverage(studentGrades, testWeights);

		assertEquals(expected, result, 0.1);
	}

	@Test
	public void hasPassedTrue() {
		int[] studentGrades = {5, 8, 20};
		int[] testWeights = {5, 3, 2};

		double positiveGrades = dSoft2.getAverage(studentGrades, testWeights);
		boolean result = dSoft2.hasPassed(positiveGrades);

		assertTrue(result);
	}

	@Test
	public void hasPassedFalse() {
		int[] studentGrades = {5, 8, 3};
		int[] testWeights = {5, 3, 2};

		double badGrades = dSoft2.getAverage(studentGrades, testWeights);
		boolean result = dSoft2.hasPassed(badGrades);

		assertFalse(result);
	}

	@Test //Baseado no teste 1.
	public void assessPositiveResults() {
		int[] studentGrades = {5, 8, 20};
		int[] testWeights = {5, 3, 2};

		double studentAverage = dSoft2.getAverage(studentGrades, testWeights);
		String result = dSoft2.assessStudent(studentGrades, testWeights);
		String expected = "O aluno passou com uma media de " + studentAverage;

		assertEquals(expected, result);
	}

	@Test
	public void assessNegativeResults() {
		int[] studentGrades = {5, 8, 3};
		int[] testWeights = {5, 3, 2};

		double studentAverage = dSoft2.getAverage(studentGrades, testWeights);
		String result = dSoft2.assessStudent(studentGrades, testWeights);
		String expected = "O aluno reprovou com uma media de " + studentAverage;

		assertEquals(expected, result);
	}
}
