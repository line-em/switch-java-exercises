package dSoft.Bloco1;

import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class Question11Test {
   @DisplayName("09. Calculate Expression Tests")
   @Test
   public void zeroValue() {
	  double expected = 1;
	  double result = dSoft1.getCalculationResult(0);
	  assertEquals(expected, result, 0.01);
   }
   @Test
   public void negativeValue() {
	  double expected = 5;
	  double result = dSoft1.getCalculationResult(-1);
	  assertEquals(expected, result, 0.01);
   }
   @Test
   public void positiveValue() {
	  double expected = 5;
	  double result = dSoft1.getCalculationResult(4);
	  assertEquals(expected, result, 0.01);
   }
}
