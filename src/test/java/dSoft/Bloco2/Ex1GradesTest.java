package dSoft.Bloco2;

import dSoft.dSoft2.GradeCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ex1GradesTest {
	@Test
	public void positiveGrade() {
		int[] studentGrades = {5, 8, 20};
		int[] testWeights = {5, 3, 2};

		double expected = 8.9;
		double result = GradeCalculator.getAverage(studentGrades, testWeights);

		assertEquals(expected, result, 0.1);
	}

	@Test
	public void invalidGrade() {
		int[] studentGrades = {-2, -3, 20};
		int[] testWeights = {-1, 3, 2};

		double expected = 0;
		double result = GradeCalculator.getAverage(studentGrades, testWeights);

		assertEquals(expected, result, 0.1);
	}

	@Test //Fronteira Maxima
	public void averageIsTooHigh() {
		int[] studentGrades = {20, 50, 30};
		int[] testWeights = {1, 1, 1};

		double expected = -1;
		double result = GradeCalculator.getAverage(studentGrades, testWeights);

		assertEquals(expected, result, 0.1);
	}

	@Test //Fronteira Minima
	public void noTestsGiven() {
		int[] studentGrades = {0, 0, 0};
		int[] testWeights = {0, 0, 0};

		double expected = 0;
		double result = GradeCalculator.getAverage(studentGrades, testWeights);

		assertEquals(expected, result, 0.1);
	}

	@Test
	public void hasPassedTrue() {
		int[] studentGrades = {5, 8, 20};
		int[] testWeights = {5, 3, 2};

		double positiveGrades = GradeCalculator.getAverage(studentGrades, testWeights);
		boolean result = GradeCalculator.isApproved(positiveGrades);

		assertTrue(result);
	}

	@Test
	public void hasPassedFalse() {
		int[] studentGrades = {5, 8, 3};
		int[] testWeights = {5, 3, 2};

		double badGrades = GradeCalculator.getAverage(studentGrades, testWeights);
		boolean result = GradeCalculator.isApproved(badGrades);

		assertFalse(result);
	}

	@Test
	public void assessStudentPositiveGrade() {
		int[] studentGrades = {8, 9, 8};
		int[] testWeights = {2, 1, 3};
		boolean result = GradeCalculator.assessStudent(studentGrades, testWeights);
		assertTrue(result);
	}

	@Test
	public void assessStudentBadGrade() {
		int[] studentGrades = {5, 6, 4};
		int[] testWeights = {2, 1, 3};
		boolean result = GradeCalculator.assessStudent(studentGrades, testWeights);
		assertFalse(result);
	}

	@Test
	public void assessStudentInvalid() {
		int[] studentGrades = {5, 6, 4};
		int[] testWeights = {2, 1};
		boolean result = GradeCalculator.assessStudent(studentGrades, testWeights);
		assertFalse(result);
	}

	@Test
	public void testAssessStudentEmpty() {
		int[] studentGrades = {};
		int[] testWeights = {};
		boolean result = GradeCalculator.assessStudent(studentGrades, testWeights);
		assertFalse(result);
	}

	@Test //Baseado no teste 1.
	public void assessPositiveResultsMessage() {
		int[] studentGrades = {5, 8, 20};
		int[] testWeights = {5, 3, 2};

		double studentAverage = GradeCalculator.getAverage(studentGrades, testWeights);
		String result = GradeCalculator.assessStudentMessage(studentGrades, testWeights);
		String expected = "O aluno passou com uma media de " + studentAverage;

		assertEquals(expected, result);
	}

	@Test
	public void assessNegativeResultsMessage() {
		int[] studentGrades = {5, 8, 3};
		int[] testWeights = {5, 3, 2};

		double studentAverage = GradeCalculator.getAverage(studentGrades, testWeights);
		String result = GradeCalculator.assessStudentMessage(studentGrades, testWeights);
		String expected = "O aluno reprovou com uma media de " + studentAverage;

		assertEquals(expected, result);
	}
}
