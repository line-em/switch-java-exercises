package dSoft.Bloco1;
//TODO: Make tests for all 3 expressions.
import dSoft.dSoft1;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class Question7Test {
   @DisplayName("05. Time in Seconds")
   @Test
   public void positiveTimeValue() {
	  double expected = 3760;
	  double result = dSoft1.getTimeInSeconds(1,2,40);
	  assertEquals(expected, result, 0.01);
   }

   @Test
   public void negativeTimeValue() {
	  double expected = 22;
	  double result = dSoft1.getTimeInSeconds(-20,25,40);
	  assertEquals(expected, result, 0.01);
   }
}
