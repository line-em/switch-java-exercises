package dSoft;

import static dSoft.dSoft3.Ex3.EvenOdd.EVEN;
import static dSoft.dSoft3.Ex3.EvenOdd.ODD;

public class dSoft3 {
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
