package dSoft.Bloco1;

import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class Question10Test {
   @DisplayName("09. Calculate Hypotenuse Tests")
   @Test
   public void shouldReturnZero() {
	  double expected = 0;
	  double result = dSoft1.getHypotenuse(20, 0);
	  assertEquals(expected, result, 0.01);
   }
   @Test
   public void bothPositiveValues() {
	  double expected = 5;
	  double result = dSoft1.getHypotenuse(3, 4);
	  assertEquals(expected, result, 0.01);
   }
}
