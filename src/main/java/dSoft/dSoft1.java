package dSoft;

// ERROR CODE: 22 (Invalid parameters)
// TODO: Refazer os erros e etc de acordo com feedback da aula 2.

public class dSoft1 {
   // Question 02
   public static double getBouquetPrice(int roses, int tulips, double roseValue, double tulipValue) {
	  if (roseValue == 0 && tulipValue == 0) return 0;
	  if (roses < 0 || tulips < 0) return 22;

	  return (roses * roseValue) + (tulips * tulipValue);
   }

   // Question 03
   public static double getCylinderVolume(int radius, int height) {
	  if (radius < 0 || height < 0) return 22;
	  if (radius == 0 || height == 0) return 0; //No Cylinder

	  double volume = (3.14 * Math.pow(radius, 2)) * height;
	  return volume * 1000;
   }

   // Question 04
   public static double getThunderDistance(int thunderStrike, int thunderHearing) {
	  if (thunderStrike > thunderHearing || thunderHearing < 0 || thunderStrike < 0) {
		 return 22;
	  }

	  if (thunderStrike == 0 && thunderHearing == 0) return 0; // No thunder

	  int soundSpeedMs = (1224 * 1000) / 3600;
	  int timeInterval = thunderHearing - thunderStrike;
	  double totalDistance = (soundSpeedMs * timeInterval);

	  return totalDistance / 1000;//m to km
   }

   // Question 05
   public static double getBuildingHeight(double timeInSeconds) {
	  if (timeInSeconds > 0) {
		 final double gravity = 9.8;
		 double timeSquare = timeInSeconds * timeInSeconds;
		 return (gravity * timeSquare) / 2;
	  } else if (timeInSeconds == 0) {
		 return 0; // It didn't fall
	  } else {
		 return 22;
	  }
   }

   // Question 06
   public static double getBuildingHeightWithTales(double humanHeight, double humanShadow, double buildingShadow) {
	  if (humanHeight <= 0 || humanShadow <= 0 || buildingShadow <= 0)
		 return 22; //Invalid values
	  if (humanHeight == 0 || humanShadow == 0 || buildingShadow == 0)
		 return 0; //Too short
	  return (buildingShadow * humanHeight) / humanShadow;
   }

   // Question 07
   public static int getTimeInSeconds(int hours, int minutes, int seconds) {
	  if (hours < 0 || minutes < 0 || seconds < 0)
		 return 22; //Should be at least 0
	  return (hours * 3600) + (minutes * 60) + seconds;
   }

   public static double getMoveSpeed(double totalDistance, int hours, int minutes, int seconds) {
	  if (totalDistance < 0)
		 return 22; //Time is validated at getTimeInSeconds();
	  if (totalDistance == 0) return 0; //Stayed in place, so 0m/s
	  double totalTime = getTimeInSeconds(hours, minutes, seconds);
	  return (totalDistance / totalTime);
   }

   public static double getRunDistance(double moveSpeed, int hours, int minutes, int seconds) {
	  if (moveSpeed < 0) return 22;
	  if (moveSpeed == 0) return 0; //Stayed in place, so 0m.
	  int totalTime = getTimeInSeconds(hours, minutes, seconds);
	  return (moveSpeed * totalTime) / 1000;
   }

   // Question 08
   public static double getDistanceFromCos(int angle, int side1, int side2) {
	  if (angle > 0 && side1 > 0 && side2 > 0) {
		 double radianAngle = Math.toRadians(angle);
		 return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2) - 2 * side1 * side2 * Math.cos(radianAngle));
	  } else if (angle == 0 && side1 == 0 && side2 == 0) {
		 return 0; //No triangle, no distance to spoke for.
	  } else {
		 return 22;
	  }
   }

   // Question 09
   public static double getPerimeter(double a, double b) {
	  if (a == 0 || b == 0) return 0; //Empty
	  if (a < 0 || b < 0) return 22;
	  return 2 * (a + b);
   }

   // Question 10
   public static double getHypotenuse(int side1, int side2) {
	  if (side1 == 0 || side2 == 0) return 0;
	  if (side1 < 0 || side2 < 0)
		 return 0; //Impossible to calculate if any side is invalid.
	  return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
   }

   // Question 11
   public static double getCalculationResult(int value) {
	  return Math.pow(value, 2) - (3 * value) + 1;
   }

   // Question 12
   public static double celsiusToFahrenheit(double temperature) {
	  return 32 + 1.8 * temperature;
   }

   // Question 13
   public static double getMinutes(int hours, int minutes) {
	  if (hours > 24 || minutes > 60 || hours < 0 || minutes < 0) return 22;
	  if (hours == 0 && minutes == 0) return 0; //No time passed.
	  return (hours * 60) + minutes;
   }

}