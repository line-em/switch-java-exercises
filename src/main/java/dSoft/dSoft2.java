package dSoft;

public class dSoft2 {
	/////////////// QUESTION 01
	public static class GradeCalculator {
		// a =. Esse método é utilizado para calcular a média de notas de um aluno,
		// supondo provas diferentes, com diferentes pesos na média final.
		//Supoe-se uma média maxima limite de 20, e uma nota minima de 0.
		public static double getAverage(int[] grades, int[] weights) {
			if (grades.length != weights.length) return -1; //Should have same length

			double totalWeight = 0;
			double totalGrades = 0;

			for (int i = 0; i < grades.length; i++) {
				if (weights[i] <= 0 || grades[i] < 0) return 0; //Should not be negative
				totalWeight += weights[i];
				totalGrades += grades[i] * weights[i];
			}

			double mediaFinal = totalGrades / totalWeight;

			if (mediaFinal <= 20) return mediaFinal;
			else return -1;
		}

		public static boolean hasPassed(double studentAverage) {
			return studentAverage >= 8;
		}

		public static String assessStudent(int[] grades, int[] weights) {
			double studentGrades = getAverage(grades, weights);
			boolean studentResults = hasPassed(studentGrades);

			if (studentResults) return "O aluno passou com uma media de " + studentGrades;
			else return "O aluno reprovou com uma media de " + studentGrades;
		}
	}

	//////////////// QUESTION 02
	public static class DigitMethods {
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

		public enum EvenOdd {
			EVEN, ODD
		}

		public static EvenOdd evenOrOdd(int[] digits) {
			int lastDigit = digits[digits.length - 1];
			return (lastDigit % 2 == 0) ? EvenOdd.EVEN : EvenOdd.ODD;
		}
	}

	/////////////// QUESTION 03
	public static double getDistanceBetweenPoints(int x1, int x2, int y1, int y2) {
		double xDistance = Math.pow(x1 - x2, 2);
		double yDistance = Math.pow(y1 - y2, 2);

		double totalDistance = Math.sqrt(xDistance + yDistance);
		return totalDistance;
	}

	// QUESTION 04
	// TODO: TIRAR DUVIDA COM O PROFESSOR
	public static int returnLowestNum(int num) {
		return Math.min(num, 0);

	}

	// QUESTION 05
	public static double getCubeVolume(int area) {
		if (area < 0) return -1;

		double areaCalc = (double) area / 6;
		double side = Math.sqrt(areaCalc);
		double volume = Math.pow(side, 3);

		return volume;
	}

	public static String getCubeDescription(double volume) {
		if (volume < 0) {
			return "Impossível";
		} else if (volume <= 1) {
			return "Pequeno";
		} else if (volume > 2) {
			return "Grande";
		} else return "Médio";
	}

	public static String describeCube(int area) {
		double cubeVolume = getCubeVolume(area);
		String cubeDescription = getCubeDescription(cubeVolume);
		return "O cubo de " + area + "cm é " + cubeDescription + ", e tem " + cubeVolume + "cm²";
	}

	// QUESTION 6
}