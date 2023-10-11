package dSoft.Bloco1;

import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class Question12Test {
   @DisplayName("09. Convert to Fahrenheit")
   @Test
   public void zeroValue() {
	  double expected = 32;
	  double result = dSoft1.celsiusToFahrenheit(0);
	  assertEquals(expected, result, 0.01);
   }
   @Test
   public void negativeValue() {
	  double expected = 14;
	  double result = dSoft1.celsiusToFahrenheit(-10);
	  assertEquals(expected, result, 0.01);
   }
   @Test
   public void positiveValue() {
	  double expected = 41;
	  double result = dSoft1.celsiusToFahrenheit(5);
	  assertEquals(expected, result, 0.01);
   }
}
