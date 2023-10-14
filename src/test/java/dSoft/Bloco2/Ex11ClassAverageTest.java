package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.GradeCalculator.*;
import static org.junit.Assert.assertEquals;

public class Ex11ClassAverageTest {
	double defaultLowerLimit = 0;
	double defaultUpperLimit = 1;
	@Test
	public void allApprovedRatio() {
		boolean studentX = assessStudent(new int[]{12, 8, 15}, new int[]{5, 3, 2});
		boolean studentY = assessStudent(new int[]{10, 5, 17}, new int[]{5, 3, 2});
		boolean studentZ = assessStudent(new int[]{15, 9, 10}, new int[]{5, 3, 2});

		double expected = 1.0;
		double result = getPercentApproved(studentX, studentY, studentZ);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void noApprovedRatio() {
		boolean studentX = assessStudent(new int[]{10, 8, 2}, new int[]{5, 3, 2});
		boolean studentY = assessStudent(new int[]{2, 5, 7}, new int[]{5, 3, 2});
		boolean studentZ = assessStudent(new int[]{5, 9, 0}, new int[]{5, 3, 2});

		double expected = 0.0;
		double result = getPercentApproved(studentX, studentY, studentZ);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void someApprovedRatio() {
		boolean studentX = assessStudent(new int[]{10, 8, 2}, new int[]{5, 3, 2});
		boolean studentY = assessStudent(new int[]{2, 5, 7}, new int[]{5, 3, 2});
		boolean studentZ = assessStudent(new int[]{7, 9, 15}, new int[]{5, 3, 2});

		double expected = 0.3;
		double result = getPercentApproved(studentX, studentY, studentZ);
		assertEquals(expected, result, 0.1);
	}

	@Test
	public void classAssessmentBad() {
		double badPercentage = 0.1;
		String result = getClassAssessment(badPercentage, defaultUpperLimit, defaultLowerLimit);
		assertEquals("Turma má", result);
	}

	@Test
	public void classAssessmentWeak() {
		double weakPercentage = 0.4;
		String result = getClassAssessment(weakPercentage, defaultUpperLimit, defaultLowerLimit);
		assertEquals("Turma fraca", result);
	}

	@Test
	public void classAssessmentAverage() {
		double averagePercentage = 0.6;
		String result = getClassAssessment(averagePercentage, defaultUpperLimit, defaultLowerLimit);
		assertEquals("Turma razoável", result);
	}

	@Test
	public void classAssessmentGood() {
		double goodPercentage = 0.8;
		String result = getClassAssessment(goodPercentage, defaultUpperLimit, defaultLowerLimit);
		assertEquals("Turma boa", result);
	}

	@Test
	public void classAssessmentExcellent() {
		double excellentPercentage = 0.95;
		String result = getClassAssessment(excellentPercentage, defaultUpperLimit, defaultLowerLimit);
		assertEquals("Turma Excelente", result);
	}

	@Test
	public void classAssessmentInvalid() {
		double invalidInput = -1;
		String result = getClassAssessment(invalidInput, defaultUpperLimit,
													  defaultLowerLimit);
		assertEquals("Error", result);
	}

	@Test
	public void validCustomLimits() {
		double percentage = 1.95;
		double upperLimit = 2;
		double lowerLimit = 1;
		String result = getClassAssessment(percentage, upperLimit,
													  lowerLimit);
		assertEquals("Turma Excelente", result);
	}

	@Test
	public void limitsOutOfOrder() {
		double percentage = 0.95;
		double upperLimit = 1;
		double lowerLimit = 2;
		String result = getClassAssessment(percentage, upperLimit,
													  lowerLimit);
		assertEquals("Error", result);
	}

	@Test
	public void invalidLowerLimit() {
		double percentage = 0.95;
		double upperLimit = 5;
		double lowerLimit = -5;
		String result = getClassAssessment(percentage, upperLimit,
													  lowerLimit);
		assertEquals("Error", result);
	}
}
