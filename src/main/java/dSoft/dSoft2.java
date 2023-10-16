package dSoft;

import java.util.Arrays;

public class dSoft2 {
	/////////////// QUESTION 01 + 11
	public static class GradeCalculator {
		public static double getAverage(int[] grades, int[] weights) {
			if (grades.length != weights.length) return -1; //Should have same length

			double totalWeight = 0;
			double totalGrades = 0;

			for (int i = 0; i < grades.length; i++) {
				if (weights[i] <= 0 || grades[i] < 0) return 0; //Should not be negative
				totalWeight += weights[i];
				totalGrades += grades[i] * weights[i];
			}

			double finalGrade = totalGrades / totalWeight;

			if (finalGrade <= 20) return finalGrade;
			else return -1;
		}

		public static boolean isApproved(double studentAverage) {
			return studentAverage >= 8;
		}

		public static boolean assessStudent(int[] grades, int[] weights) {
			double studentGrades = getAverage(grades, weights);
			return isApproved(studentGrades);
		}

		public static String assessStudentMessage(int[] grades, int[] weights) {
			double studentGrades = getAverage(grades, weights);
			boolean approved = isApproved(studentGrades);

			if (approved) return "O aluno passou com uma media de " + studentGrades;
			else return "O aluno reprovou com uma media de " + studentGrades;
		}

		// QUESTION 11
		public static double getPercentApproved(boolean... isApproved) {
			int numOfStudents = isApproved.length;
			int isApprovedCount = 0;

			for (boolean approved : isApproved) {
				if (approved) isApprovedCount++;
			}

			return ((double) isApprovedCount / numOfStudents);
		}

		public static String getClassAssessment(double percentApproved, double upperLimit,
															 double lowerLimit) {
			if (lowerLimit > upperLimit || lowerLimit == upperLimit || lowerLimit < 0) return "Error";
			if (percentApproved > upperLimit || percentApproved < lowerLimit) return "Error";
			else if (percentApproved < 0.2 + lowerLimit) return "Turma má";
			else if (percentApproved < 0.5 + lowerLimit) return "Turma fraca";
			else if (percentApproved < 0.7 + lowerLimit) return "Turma razoável";
			else if (percentApproved < 0.9 + lowerLimit) return "Turma boa";
			else return "Turma Excelente";
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
				return new int[]{-1};
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

	// QUESTION 05
	public static class CubeSize {
		public static double getCubeVolume(double area) {
			if (area < 0) return -1;

			double areaCalc = area / 6;
			double side = Math.sqrt(areaCalc);
			return Math.pow(side, 3);
		}

		public static String getCubeDescription(double volume) {
			if (volume <= 0) return "Impossível";
			else if (volume <= 1) return "Pequeno";
			else if (volume > 2) return "Grande";
			else return "Médio";
		}

		public static String describeCube(double area) {
			if (area <= 0) return "Error";
			double cubeVolume = getCubeVolume(area);
			String cubeDescription = getCubeDescription(cubeVolume);
			return "O cubo de " + area + "cm é " + cubeDescription + ", e tem " + cubeVolume + "cm²";
		}
	}

	// QUESTION 6
	// Constraint: Limited to a 24h-range. Get greetings
	public static class Time {
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
			boolean afternoon = hour == 12 || hour == 20 ? second <= 1 : hour < 20 && hour > 12;

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

	// QUESTION 7
	public static class BuildingPaintingJob {
		public static double getPaintingCosts(double buildingSize, double paintCost,
														  double paintEfficiency) {
			if (buildingSize < 0 || paintEfficiency < 0 || paintCost < 0) return -1;
			double paintAmountInL = buildingSize / paintEfficiency;
			return paintAmountInL * paintCost;
		}

		public static double getWorkCosts(double buildingSize, double salary) {
			if (buildingSize <= 0 || salary <= 0) return -1;
			double workTime = daysNeeded(buildingSize);
			return workTime * salary;
		}

		public static int daysNeeded(double buildingSize) {
			if (buildingSize < 0) return -1;
			int workHours = 8;
			int dailyShift = 2 * workHours;
			int painters = getPainters(buildingSize);
			float totalDays = (float) buildingSize / (dailyShift * painters);

			return Math.round(totalDays);
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
			if (buildingSize < 0 || paintEfficiency < 0 || salary < 0 || paintCost < 0) return -1;
			double totalWorkCost = getWorkCosts(buildingSize, salary);
			double totalPaintingCost = getPaintingCosts(buildingSize, paintCost, paintEfficiency);
			return totalPaintingCost + totalWorkCost;
		}
	}

	// QUESTION 8
	public static boolean isMultiple(int x, int y) {
		return y != 0 && x % y == 0;
	}

	public static String getMultipleMessage(int num1, int num2) {
		if (isMultiple(num1, num2)) return num1 + " é múltiplo de " + num2;
		else if (isMultiple(num2, num1)) return num2 + " é múltiplo de " + num1;
		else return num1 + " não é múltiplo de " + num2;
	}

	// QUESTION 9
	// Returns the errors and conditions
	public static int verifySequence(int num) {
		boolean isThreeDigits = DigitMethods.verifyLength(num);
		if (!isThreeDigits) return -2;

		int[] digits = DigitMethods.getDigits(num);
		boolean firstCondition = digits[1] == digits[0] + 1;
		boolean secondCondition = digits[2] == digits[1] + 1;

		return firstCondition && secondCondition ? 0 : -1;
	}

	// a boolean method that is easier to use.
	public static boolean isSequence(int num) {
		return verifySequence(num) == 0;
	}

	// QUESTION 10
	public static class DiscountCalculator {
		public static double getDiscount(double price) {
			if (price <= 0) return -1;
			if (price > 200) return 0.6;
			if (price > 100) return 0.4;
			if (price > 50) return 0.3;
			return 0.2;
		}

		public static double getDiscountPrice(double price) {
			if (price <= 0) return -1;

			double discount = getDiscount(price);
			double currentDiscount = price * discount;
			return price - currentDiscount;
		}
	}

	// QUESTION 11 - see GradeCalculator

	// QUESTION 12
	public static String sendPollutionNotification(double pollution) {
		if (pollution < 0 || pollution > 1) return "Error";
		boolean none = pollution == 0;
		boolean acceptable = pollution <= 0.3;
		boolean light = pollution > 0.3 && pollution < 0.4;
		boolean moderate = pollution >= 0.4 && pollution < 0.5;

		if (none) return "No pollution metric.";
		if (acceptable) return "Pollution within acceptable values";
		if (light) return "Industries from group 1, seize your activities.";
		if (moderate) return "Industries from group 1 & 2, seize your activities.";
		return "Industries from group 1, 2 & 3, seize your activities.";
	}

	// question 13
	public static class GardenCostCalculator {
		final static double grassCost = 10;
		final static int grassTimeInSquareMeters = 300;
		final static double treeCost = 10;
		final static int treeTimeForEach = 600;
		final static double bushCost = 15;
		final static int bushTimeForEach = 400;
		final static int hourlyWage = 10;

		public static double getGrassCost(int areaInSquareMeters) {
			if (areaInSquareMeters <= 0) return -1;
			return grassCost * areaInSquareMeters;
		}

		public static int getGrassTime(int areaInSquareMeters) {
			if (areaInSquareMeters < 0) return -1;
			return grassTimeInSquareMeters * areaInSquareMeters;
		}

		public static double getTreeCost(int quantity) {
			if (quantity < 0) return -1;
			return treeCost * quantity;
		}

		public static int getTreeTime(int quantity) {
			if (quantity < 0) return -1;
			return treeTimeForEach * quantity;
		}

		public static double getBushCost(int quantity) {
			if (quantity < 0) return -1;
			return bushCost * quantity;
		}

		public static int getBushTime(int quantity) {
			if (quantity < 0) return -1;
			return bushTimeForEach * quantity;
		}

		public static int getSalary(int totalTimeInSeconds) {
			if (totalTimeInSeconds < 0) return -1;
			int time = totalTimeInSeconds / 3600;
			return time * hourlyWage;
		}

		public static int getTotalTime(int treeQuantity, int bushQuantity, int areaInSquareMeters) {
			if (bushQuantity < 0 || areaInSquareMeters < 0 || treeQuantity < 0) return -1;
			int treeTime = getTreeTime(treeQuantity);
			int bushTime = getBushTime(bushQuantity);
			int grassTime = getGrassTime(areaInSquareMeters);
			return treeTime + bushTime + grassTime;
		}

		public static String getTotalTimeInHours(int totalTimeInSeconds) {
			if (totalTimeInSeconds < 0) return "Error";
			int[] time = Time.convertTime(totalTimeInSeconds);
			return Time.formatTime(time);
		}

		public static double getTotalCost(int areaInSquareMeters, int treeQuantity,
													 int bushQuantity) {
			if (bushQuantity < 0 || areaInSquareMeters <= 0 || treeQuantity < 0) return -1;
			double totalBushCost = getBushCost(bushQuantity);
			double totalGrassCost = getGrassCost(areaInSquareMeters);
			double totalTreeCost = getTreeCost(treeQuantity);
			int totalTime = getTotalTime(treeQuantity, bushQuantity, areaInSquareMeters);
			double salary = getSalary(totalTime);
			return totalTreeCost + totalGrassCost + totalBushCost + salary;
		}
	}

	// QUESTION 14
	public static class DistanceCalculator {
		public static double getAverageTravelledDistanceInKm(int[] distanceInMiles) {
			if (distanceInMiles.length < 1) return -1;
			double distance = getAverageTravelledDistanceInMiles(distanceInMiles);
			if (distance == -1) return -1;
			else return convertMilesToKm(distance);
		}

		public static double convertMilesToKm(double distanceInMiles) {
			if (distanceInMiles < 0) return -1;
			double distanceInM = distanceInMiles * 1069;
			return distanceInM / 1000;
		}

		public static double getAverageTravelledDistanceInMiles(int[] distanceInMiles) {
			if (distanceInMiles.length < 1) return -1;
			int totalDistance = 0;
			int totalDays = distanceInMiles.length;

			for (int distance : distanceInMiles) {
				if (distance < 0) return -1;
				totalDistance += distance;
			}
			return (double) totalDistance / totalDays;
		}
	}

	// QUESTION 15
	public static class TriangleSides {

		public static TriangleTypes getTriangleType(int[] sides) {
			if (!isTrianglePossible(sides)) return null;
			if (isEquilateral(sides)) return TriangleTypes.EQUILATERAL;
			if (isIsosceles(sides)) return TriangleTypes.ISOSCELES;
			if (isScalene(sides)) return TriangleTypes.SCALENE;
			return null;
		}

		public enum TriangleTypes {
			ISOSCELES, EQUILATERAL, SCALENE
		}

		public static boolean hasEnoughSides(int[] sides) {
			return sides.length == 3;
		}

		public static boolean isTrianglePossible(int[] sides) {
			if (!hasEnoughSides(sides)) return false;
			if (sides[0] < 0 || sides[1] < 0 || sides[2] < 0) return false;

			boolean conditionA = sides[0] < sides[1] + sides[2];
			boolean conditionB = sides[1] < sides[2] + sides[0];
			boolean conditionC = sides[2] < sides[0] + sides[1];

			return conditionA && conditionB && conditionC;
		}

		public static boolean isEquilateral(int[] sides) {
			if (isTrianglePossible(sides)) return sides[0] == sides[1] && sides[2] == sides[1];
			return false;
		}

		public static boolean isScalene(int[] sides) {
			if (isTrianglePossible(sides)) {
				boolean conditionA = sides[0] != sides[1];
				boolean conditionB = sides[1] != sides[2];
				boolean conditionC = sides[2] != sides[0];

				return conditionA && conditionB && conditionC;
			}
			return false;
		}

		public static boolean isIsosceles(int[] sides) {
			if (isTrianglePossible(sides)) {
				boolean conditionA = sides[0] == sides[1];
				boolean conditionB = sides[1] == sides[2];
				boolean conditionC = sides[2] == sides[0];

				return conditionA || conditionB || conditionC;
			}
			return false;
		}
	}

	// Question 16

	public static class TriangleAngles {
		public enum TriangleTypes {
			RECTANGLE, ACUTE, OBTUSE
		}

		public static boolean isTrianglePossible(int[] angles) {
			if (angles.length != 3) return false;
			if (angles[0] < 0 && angles[1] < 0 && angles[2] < 0) return false;

			return angles[0] + angles[1] + angles[2] == 180;
		}

		public static boolean isRectangle(int[] angles) {
			return angles[0] == 90 || angles[1] == 90 || angles[2] == 90;
		}

		public static boolean isAcute(int[] angles) {
			return angles[0] < 90 && angles[1] < 90 && angles[2] < 90;
		}

		public static boolean isObtuse(int[] angles) {
			return angles[0] > 90 || angles[1] > 90 || angles[2] > 90;
		}

		public static TriangleTypes verifyTriangleType(int[] angles) {
			if (!isTrianglePossible(angles)) return null;
			if (isRectangle(angles)) return TriangleTypes.RECTANGLE;
			if (isAcute(angles)) return TriangleTypes.ACUTE;
			if (isObtuse(angles)) return TriangleTypes.OBTUSE;
			return null;
		}
	}

	// QUESTION 17
	// INCOMPLETE
	public static class TrainSchedule {
		public static int[] getTrainArrivalTime(int departureHour, int departureMinute,
															 int travelHours, int travelMinutes) {
			if (isValidTime(departureHour, departureMinute) &&
				 isValidTime(travelHours, travelMinutes)) {
				int overflowMinutes = (departureMinute + travelMinutes) / 60;
				int arrivalHours = (departureHour + travelHours + overflowMinutes) % 24;
				int arrivalMinutes = (departureMinute + travelMinutes) % 60;
				return new int[]{arrivalHours, arrivalMinutes};
			}
			return new int[]{-1};
		}

		public static boolean isValidTime(int hour, int minute) {
			return hour >= 0 && hour < 24 && minute >= 0 && minute < 60;
		}

		public static boolean isSameDayArrival(int arrivalHour, int arrivalMinute, int departureHour,
															int departureMinute) {
			if (arrivalHour > departureHour) return true;
			if (arrivalHour == departureHour && arrivalMinute > departureMinute)
				return true; // Train with only minutes of duration.
			return false;

		}
	}

	// QUESTION 18
	// INCOMPLETE
	public static int[] getFinishTime(int[] startTime, int duration) {
		if (startTime.length != 3) return new int[]{-1};
		if (startTime[0] < 0 || startTime[0] >= 24 || startTime[1] < 0 || startTime[1] >= 59 ||
			 startTime[2] < 0 || startTime[2] >= 59) return new int[]{-1};
		if (duration < 0) return new int[]{-2};

		int[] durationTime = Time.convertTime(duration);
		int[] finishTime = new int[3];
		finishTime[0] = durationTime[0] + startTime[0];
		finishTime[1] = durationTime[1] + startTime[1];
		finishTime[2] = durationTime[2] + startTime[2];

		return finishTime;
	}
}