package com.thetestpeople.add;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestGreetings {
	@Test
	public void testUserLoggingInForTheFirstTime() {
		String expected = "0Hello, World!";
		Greetings systemUnderTest = new Greetings("Testy McTesterson", 0);
		assertEquals(expected, systemUnderTest.greet());
	}
}
