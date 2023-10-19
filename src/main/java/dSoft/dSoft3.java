package dSoft;

import java.util.Arrays;
import static dSoft.dSoft3.Ex3.EvenOdd.EVEN;
import static dSoft.dSoft3.Ex3.EvenOdd.ODD;

public class dSoft3 {
	public static class Ex2 {
		public static int[] getMultiplesFromInterval(int min, int max, int multiple) {
			if (min < 0 || max < 0 || multiple <= 0) return new int[]{-1};
			if (min >= max) return new int[]{-2};

			int currentPosition = 0;
			int[] multiples = new int[(max - min) / multiple];

			for (int i = min; i < max; i++) {
				if (i % multiple == 0) {
					multiples[currentPosition] = i;
					currentPosition++;
				}
			}
			return multiples;
		}

		public static int[] concatenateTwoArrays(int[] array1, int[] array2) {
			if (array1.length == 0 || array2.length == 0) return new int[]{-1};

			int[] concatArray = new int[array1.length + array2.length];

			System.arraycopy(array1, 0, concatArray, 0, array1.length);
			System.arraycopy(array2, 0, concatArray, array1.length, array2.length);

			return concatArray;
		}

		public static int[] getMultiplesOfTwoNumbersFromInterval(int min, int max, int multiple1,
																					int multiple2) {
			if (min < 0 || max < 0 || multiple1 <= 0 || multiple2 <= 0) return new int[]{-1};
			if (min >= max) return new int[]{-2};

			int[] multiples1 = getMultiplesFromInterval(min, max, multiple1);
			int[] multiples2 = getMultiplesFromInterval(min, max, multiple2);

			int[] allMultiples = concatenateTwoArrays(multiples1, multiples2);
			return allMultiples;
		}

		public static int sumOfMultiples(int[]... arrays) {
			int totalSum = 0;
			for (int[] array : arrays) {
				for (int value : array) {
					totalSum += value;
				}
			}
			return totalSum;
		}
	}

	public static class Ex3 {
		public enum EvenOdd {
			EVEN, ODD
		}

		public static EvenOdd verifyEvenOdd(int num) {
			return num % 2 == 0 ? EVEN : ODD;
		}

		public static int sumOfEvenNumbers(int min, int max, EvenOdd evenOdd) {
			// generate array from min, max.
			// use for loop to check with verifyEvenOdd
			// push the new values to a new variable, totalSum += num
			return 0;
		}

	}
}
