package dSoft;

import java.util.Arrays;

public class dSoft2 {
	/////////////// QUESTION 01
	// a. Esse método é utilizado para calcular a média de notas de um aluno,
	// supondo provas diferentes, com diferentes pesos na média final.
	public static double getAverage(int[] grades, int[] weights) {
		if (grades.length != weights.length) return -1; //Should have same length

		double totalWeight = 0;
		double totalGrades = 0;

		for (int i = 0; i < grades.length; i++) {
			if (weights[i] <= 0 || grades[i] < 0) return 0; //Should not be negative
			totalWeight += weights[i];
			totalGrades += grades[i] * weights[i];
		}

		return totalGrades / totalWeight;
	}

	public static boolean hasPassed(double studentAverage) {
		return studentAverage >= 8;
	}

	public static String resultMessage(boolean success){
		if (success)
			return "O aluno passou!";
		else
			return "O aluno reprovou.";
	}

	public static String assessStudent(int[] grades, int[] weights){
		double studentGrades = getAverage(grades, weights);
		boolean assessGrades = hasPassed(studentGrades);
		String result = resultMessage(assessGrades);

		return result;
	}

	//////////////// QUESTION 02
	public static boolean verifyLength(int number) {
		return (number > 100) && (number < 999);
	}

	public static int[] getDigits(int number) {
		boolean metConditions = verifyLength(number);
		int[] digits = new int[3];

		if (metConditions) {
			digits[0] = (number / 100) % 10;
			digits[1] = (number / 10) % 10;
			digits[2] = number % 10;
			return digits;
		} else {
			return null;
		}
	}

	public static boolean isEven(int number) {
		return (number % 2 == 0);
	}

	//	TODO: Criar uma função para juntar os dois.

	/////////////// QUESTION 03
	public static double getDistanceBetweenPoints(int x1, int x2, int y1, int y2) {
		double xDistance = Math.pow(x1 - x2, 2);
		double yDistance = Math.pow(y1 - y2, 2);

		double totalDistance = Math.sqrt(xDistance + yDistance);
		return totalDistance;
	}
}