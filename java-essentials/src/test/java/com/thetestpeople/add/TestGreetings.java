package com.thetestpeople.add;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGreetings {
	private final String name = "Testy McTesterson";

	@Test
	public void testUserLoggingInForTheFirstTime() throws Exception {
		int timesLoggedIn = 0;
		String expected = timesLoggedIn + "Hello, World!";
		Greetings systemUnderTest = new Greetings(name, timesLoggedIn);
		assertEquals(expected, systemUnderTest.greet());
	}

	@Test
	public void testUserLoggingInForTheSecondTime() throws Exception {
		int timesLoggedIn = 1;
		String expected = timesLoggedIn + "Hey, " + name;
		Greetings systemUnderTest = new Greetings(name, timesLoggedIn);
		assertEquals(expected, systemUnderTest.greet());
	}

	@Test
	public void testUserLoggingInForTheNintyEighthTime() throws Exception {
		int timesLoggedIn = 98;
		String expected = timesLoggedIn + "Hey, " + name;
		Greetings systemUnderTest = new Greetings(name, timesLoggedIn);
		assertEquals(expected, systemUnderTest.greet());
	}

	@Test
	public void testUserLoggingInForTheOneHundredthTime() throws Exception {
		int timesLoggedIn = 100;
		String expected = timesLoggedIn + "Greetings " + name
				+ ", how the devil are you?";
		Greetings systemUnderTest = new Greetings(name, timesLoggedIn);
		assertEquals(expected, systemUnderTest.greet());
	}

	@Test
	public void testUserLoggingInForTheNintyNinthTime() throws Exception {
		int timesLoggedIn = 99;
		String expected = timesLoggedIn + "Greetings " + name
				+ ", how the devil are you?";
		Greetings systemUnderTest = new Greetings(name, timesLoggedIn);
		assertEquals(expected, systemUnderTest.greet());
	}

	@Test
	public void testUserWithTimesLoggedInLessThanZeroThrowsError() {
		boolean passed = false;
		try {
			@SuppressWarnings("unused")
			Greetings systemUnderTest = new Greetings(name, -1);
		} catch (Exception e) {
			passed = true;
		}
		if (!passed) {
			throw new AssertionError(
					"Expected Exception to be thrown when timesLoggedIn is less than 0.");
		}
	}

}
