package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.returnLowestNegativeNum;
import static org.junit.Assert.assertEquals;

public class Ex4LowestNumTest {
	@Test
	public void positiveNum(){
		byte expected = 0;
		int results =  returnLowestNegativeNum(20);
		assertEquals(expected, results);
	}

	@Test
	public void negativeNum(){
		byte expected = -20;
		int results =  returnLowestNegativeNum(-20);
		assertEquals(expected, results);
	}

	@Test
	public void sameNum(){
		byte expected = 0;
		int results =  returnLowestNegativeNum(0);
		assertEquals(expected, results);
	}
}
