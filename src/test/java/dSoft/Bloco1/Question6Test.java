package dSoft.Bloco1;

import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class Question6Test {
   @DisplayName("06. Building Height Tests (Theorem)")
   @Test
   public void positiveTimeValue() {
	  double expected = 8;
	  double result = dSoft1.getBuildingHeightWithTales(2,10,40);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void incorrectValues() {
	  double expected = 22;
	  double result = dSoft1.getBuildingHeightWithTales(0,25,40);
	  assertEquals(expected, result, 0.01);
   }
}
