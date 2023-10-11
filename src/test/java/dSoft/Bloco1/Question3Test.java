package dSoft.Bloco1;

import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.assertEquals;

public class Question3Test {
   @Test
   public void bothCylinderValuesPositive() {
	  double expected = 25120;
	  double result = dSoft1.getCylinderVolume(2, 2);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void cylinderRadiusIsZero() {
	  double expected = 0;
	  double result = dSoft1.getCylinderVolume(0, 2);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void cantBeNegative() {
	  double expected = 22;
	  double result = dSoft1.getCylinderVolume(2,-2);
	  assertEquals(expected, result, 0.01);
   }
}
