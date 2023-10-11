package dSoft.Bloco1;

import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class Question8Test {
   @Test
   public void positiveCos() {
	  double expected = 52.91;
	  double result = dSoft1.getDistanceFromCos(60, 40, 60);
	  assertEquals(expected, result, 0.01);

   }

   @Test
   public void negativeCos() {
	  double expected = 22;
	  double result = dSoft1.getDistanceFromCos(-60, -40, -60);
	  assertEquals(expected, result, 0.01);
	     }
}
