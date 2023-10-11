package dSoft.Bloco1;

import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class Question9Test {
   @DisplayName("09. Calculate Perimeter Tests")
   @Test
   public void shouldReturnZero() {
	  double expected = 0;
	  double result = dSoft1.getPerimeter(20, 0);
	  assertEquals(expected, result, 0.01);
   }
   @Test
   public void bothPositiveValues() {
	  double expected = 60;
	  double result = dSoft1.getPerimeter(10, 20);
	  assertEquals(expected, result, 0.01);
   }
}
