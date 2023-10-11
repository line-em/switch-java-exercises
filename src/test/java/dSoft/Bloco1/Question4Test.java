package dSoft.Bloco1;

import dSoft.dSoft1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.DisplayName;

public class Question4Test {
   @DisplayName("04. Thunder Tests")
   @Test
   public void invalidValues() {
	  double expected = 22;
	  double result = dSoft1.getThunderDistance(30, 20);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void shouldCalculateDistance() {
	  double expected = 3.4;
	  double result = dSoft1.getThunderDistance(10, 20);
	  assertEquals(expected, result, 0.01);
   }
}
