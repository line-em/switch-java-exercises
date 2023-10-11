package labProj;

public class LabProj1 {
   // Extra Questions
   public static long getFactorial(int x) {
	  long r = 1;
	  for (int i = 1; i <= x; i++)
		 r *= i;
	  return r;
   }

   public static long recursiveFactorial(int x) {
	  if (x == 1) return 1;
	  if (x >= 26)
		 return 22; //because it's gonna overflow - though it overflows at 21?
	  return x * recursiveFactorial(x - 1);
   }

   //PS: 1*1 is redundant, so we start multiplying by 2
   public static long calculateFactorial(int limit) {
	  if (limit < 0) return -1; //Error: Invalid Input
	  long factorial = 1L;

	  for (int currentNum = 1; currentNum <= limit; currentNum++) {
		 factorial = 1;
		 int multiplier = 2;
		 while (multiplier <= currentNum) {
			factorial *= multiplier;
			multiplier++;
		 }
		 System.out.println(currentNum + "! is " + factorial);
	  }

	  if (factorial < 0) return -1; //Error: Overflow
	  return factorial;
   }
}





