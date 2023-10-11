package labProj;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LabProj1Test {
   @Test
   public void positiveValue() {
	  long expected = 120;
	  long result = LabProj1.calculateFactorial(5);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void zeroShouldReturn1() {
	  long expected = 1;
	  long result = LabProj1.calculateFactorial(0);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void shouldNotOverflow() {
	  //	  Error Code Expected.
	  long expected = -1;
	  long result = LabProj1.calculateFactorial(26);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void negativeParameters() {
	  //	  Error Code Expected.
	  long expected = -1;
	  long result = LabProj1.calculateFactorial(-10);
	  assertEquals(expected, result, 0.01);
   }
}
