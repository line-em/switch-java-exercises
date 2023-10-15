package dSoft.Bloco2;

import org.junit.Test;
import static dSoft.dSoft2.Time.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class Ex6GreetingsTest {
	@Test
	public void convertValidTime() {
		int currentSeconds = 22500;
		int[] expected = {6, 15, 0};
		int[] results = convertTime(currentSeconds);
		assertArrayEquals(expected, results);
	}

	@Test
	public void convertNegativeTime() {
		int currentSeconds = -22500;
		int[] expected = {-1};
		int[] results = convertTime(currentSeconds);
		assertArrayEquals(expected, results);
	}

	@Test
	public void convertInvalidTime() {
		int currentSeconds = 24 * 3600;
		int[] expected = {-1};
		int[] results = convertTime(currentSeconds);
		assertArrayEquals(expected, results);
	}

	@Test
	public void formatValidTime() {
		int[] currentTime = {6, 15, 0};
		String expected = "6:15:0";
		String results = formatTime(currentTime);
		assertEquals(expected, results);
	}

	@Test
	public void formatInvalidLength() {
		int[] currentTime = {15, 0};
		String expected = "Error";
		String results = formatTime(currentTime);
		assertEquals(expected, results);
	}

	@Test
	public void formatInvalidTime() {
		int[] currentTime = {-2, 15, 0};
		String expected = "Error";
		String results = formatTime(currentTime);
		assertEquals(expected, results);
	}

	@Test
	public void correctGreetings() {
		String morningGreeting = getGreeting(new int[]{8, 30, 20});
		String afternoonGreeting = getGreeting(new int[]{15, 12, 0});
		String eveningGreeting = getGreeting(new int[]{23, 59, 59});
		String dawnGreeting = getGreeting(new int[]{3, 0, 59});

		assertAll("Time Greetings", () -> assertEquals("Bom dia! ☺️", morningGreeting),
					 () -> assertEquals("Boa tarde! 😁", afternoonGreeting),
					 () -> assertEquals("Boa noite! 😴", eveningGreeting),
					 () -> assertEquals("Boa noite! 😴", dawnGreeting));
	}

	@Test
	public void invalidTimeGreetings() {
		String results = getGreeting(new int[]{-8, -30, -20});
		String expected = "Error";
		assertEquals(expected, results);
	}

	@Test
	public void invalidLengthGreeting() {
		String results = getGreeting(new int[]{9, 30});
		String expected = "Error";
		assertEquals(expected, results);
	}

	@Test
	public void validWelcomeMessageBySeconds() {
		int currentSeconds = 35020;
		int[] currentTime = convertTime(currentSeconds);
		String formattedTime = formatTime(currentTime);
		String results = getWelcomeMessageByTotalSeconds(currentSeconds);
		String expected = "Bom dia! ☺️\nAgora é " + formattedTime;
		assertEquals(expected, results);
	}

	@Test
	public void validWelcomeMessageByTimeArray() {
		int[] currentTime = {0, 0, 0};
		String formattedTime = formatTime(currentTime);
		String results = getWelcomeMessageByTimeArray(currentTime);
		String expected = "Boa noite! 😴\nAgora é " + formattedTime;
		assertEquals(expected, results);
	}
}
