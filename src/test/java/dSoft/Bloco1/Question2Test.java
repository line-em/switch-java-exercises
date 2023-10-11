package dSoft.Bloco1;

import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

@DisplayName("Bouquet Tests")
public class Question2Test {
   // Expected
   @Test
   public void bothFlowerValuesPositive() {
	  double expected = 5;
	  double result = dSoft1.getBouquetPrice(2, 1, 2, 1);
	  assertEquals(expected, result, 0.01);
   }

   // Edge Cases
   @Test
   public void oneValueIsZero() {
	  double expected = 1.5;
	  double result = dSoft1.getBouquetPrice(0, 1, 2, 1.5);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void noFlowersOrdered() {
	  double expected = 0;
	  double result = dSoft1.getBouquetPrice(0, 0, 2.5, 1.1);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void freeFlowers() {
	  double expected = 0;
	  double result = dSoft1.getBouquetPrice(10, 25, 0, 0);
	  assertEquals(expected, result, 0.01);
   }

   // Incorrect Values
   @Test
   public void hasNegativeValue() {
	  double expected = 22;
	  double result = dSoft1.getBouquetPrice(-1, 1, 0, -1);
	  assertEquals(expected, result, 0.01);
   }
}
