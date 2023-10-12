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

	@Test
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

	@Test
	public void assessPositiveResults() {
		int[] studentGrades = {5, 8, 20};
		int[] testWeights = {5, 3, 2};

		String result = dSoft2.assessStudent(studentGrades, testWeights);
		String expected = "O aluno passou!";

		assertEquals(expected, result);
	}
}
