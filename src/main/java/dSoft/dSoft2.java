package dSoft;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dSoft2 {
	/////////////// QUESTION 03
	public static double getDistanceBetweenPoints(int x1, int x2, int y1, int y2) {
		double xDistance = Math.pow(x1 - x2, 2);
		double yDistance = Math.pow(y1 - y2, 2);

		return Math.sqrt(xDistance + yDistance);
	}

	// QUESTION 04 TODO: DUVIDA
	public static int returnLowestNegativeNum(int num) {
		return Math.min(num, 0);
	}

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

		public static boolean isApproved(double studentAverage) {
			return studentAverage >= 8;
		}

		public static String assessStudent(int[] grades, int[] weights) {
			double studentGrades = getAverage(grades, weights);
			boolean approved = isApproved(studentGrades);

			if (approved) return "O aluno passou com uma media de " + studentGrades;
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
			}
			else {
				return null;
			}
		}

		public static EvenOdd evenOrOdd(int[] digits) {
			int lastDigit = digits[digits.length - 1];
			return (lastDigit % 2 == 0) ? EvenOdd.EVEN : EvenOdd.ODD;
		}

		public enum EvenOdd {
			EVEN, ODD
		}
	}

	// QUESTION 05
	public static class CubeSize {
		public static double getCubeVolume(double area) {
			if (area < 0) return -1;

			double areaCalc = area / 6;
			double side = Math.sqrt(areaCalc);
			return Math.pow(side, 3);
		}

		public static String getCubeDescription(double volume) {
			if (volume <= 0) {
				return "Impossível";
			}
			else if (volume <= 1) {
				return "Pequeno";
			}
			else if (volume > 2) {
				return "Grande";
			}
			else return "Médio";
		}

		public static String describeCube(double area) {
			if (area <= 0) return "Error";
			double cubeVolume = getCubeVolume(area);
			String cubeDescription = getCubeDescription(cubeVolume);
			return "O cubo de " + area + "cm é " + cubeDescription + ", e tem " +
					 cubeVolume + "cm²";
		}
	}

	// QUESTION 6
	// Contraint: Limited to a 24h-range.
	public static class Greetings {
		public static int[] convertTime(int totalSeconds) {
			if (totalSeconds < 0 || totalSeconds >= 24 * 3600) return new int[]{-1};
			int hours = totalSeconds / 3600;
			int secondsLeft = totalSeconds % 3600;
			int minutes = secondsLeft / 60;
			int seconds = secondsLeft % 60;

			return new int[]{hours, minutes, seconds};
		}

		public static String formatTime(int[] time) {
			if (time.length != 3) return "Error";

			int hour = time[0];
			int minute = time[1];
			int second = time[time.length - 1];

			if (hour < 0 || minute < 0 || second < 0) return "Error";
			return hour + ":" + minute + ":" + second;
		}

		public static String getGreeting(int[] time) {
			if (time.length != 3) return "Error";

			int hour = time[0];
			int second = time[time.length - 1];
			boolean morning = hour == 12 ? second <= 1 : hour > 6 && hour < 12;
			boolean afternoon =
					hour == 12 || hour == 20 ? second <= 1 : hour < 20 && hour > 12;

			if (hour < 0 || second < 0) return "Error";
			if (morning) return "Bom dia! ☺️";
			else if (afternoon) return "Boa tarde! 😁";
			else return "Boa noite! 😴";
		}

		public static String getWelcomeMessageByTotalSeconds(int seconds) {
			int[] time = convertTime(seconds);
			String currentTime = formatTime(time);
			String currentGreeting = getGreeting(time);
			return currentGreeting + "\nAgora é " + currentTime;
		}

		public static String getWelcomeMessageByTimeArray(int[] time) {
			String currentTime = formatTime(time);
			String currentGreeting = getGreeting(time);
			return currentGreeting + "\nAgora é " + currentTime;
		}
	}

	public static class BuildingPaintingJob {
		public static double getPaintingCosts(double buildingSize, double paintCost,
														  double paintEfficiency) {
			double paintAmountInL = buildingSize / paintEfficiency;
			return paintAmountInL * paintCost;
		}

		public static double getWorkCosts(double buildingSize, double salary) {
			double workTime = daysNeeded(buildingSize);
			return workTime * salary;
		}

		public static int daysNeeded(double buildingSize) {
			int workHours = 8;
			int dailyShift = 2 * workHours;
			int painters = getPainters(buildingSize);
			float totalDays = (float) buildingSize / (dailyShift * painters);

			return Math.round(totalDays); //Pois mesmo que seja
		}

		public static int getPainters(double buildingSize) {
			if (buildingSize < 0) return -1;
			if (buildingSize < 100) return 1;
			else if (buildingSize > 100 && buildingSize < 300) return 2;
			else if (buildingSize > 300 && buildingSize < 1000) return 3;
			return 4;
		}

		public static double getFullCost(double buildingSize, double paintCost,
													double paintEfficiency, double salary) {
			double totalWorkCost = getWorkCosts(buildingSize, salary);
			double totalPaintingCost = getPaintingCosts(buildingSize, paintCost,
																	  paintEfficiency);
			return totalPaintingCost + totalWorkCost;
		}
	}
}