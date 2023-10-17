package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.TrainSchedule.getTrainArrivalTime;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Ex17TrainsTest {
	@Test
	public void validTime() {
		int[] result = getTrainArrivalTime(departure, duration);
		assertArrayEquals(expected, result);
	}

	@Test
	public void nextDayTime() {
		int[] result = getTrainArrivalTime(departure, duration);
		assertArrayEquals(expected, result);
	}

}
