package dSoft.Bloco1;

import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class Question13Test {
   @DisplayName("09. How much time has passed in minutes")
   @Test
   public void positiveValue() {
	  double expected = 162;
	  double result = dSoft1.getMinutes(2,42);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void noTimePassed() {
	  double expected = 0;
	  double result = dSoft1.getMinutes(0,0);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void invalidValues() {
	  double expected = 22;
	  double result = dSoft1.getMinutes(-10,0);
	  assertEquals(expected, result, 0.01);
   }
}
