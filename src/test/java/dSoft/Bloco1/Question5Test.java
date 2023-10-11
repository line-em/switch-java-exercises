package dSoft.Bloco1;

import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class Question5Test {
   @DisplayName("05. Building Height Tests")
   @Test
   public void positiveTimeValue() {
	  double expected = 19.6;
	  double result = dSoft1.getBuildingHeight(2);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void negativeValue() {
	  double expected = 22;
	  double result = dSoft1.getBuildingHeight(-2);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void zeroValue() {
	  double expected = 0;
	  double result = dSoft1.getBuildingHeight(0);
	  assertEquals(expected, result, 0.01);
   }
}
