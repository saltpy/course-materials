package com.thetestpeople.add;

public class Greetings {
	private int timesLoggedIn;
	private final String firstLogInGreeting = "Hello, World!";
	private final String normalGreeting;
	private final String vipGreeting;

	public Greetings(String name, int timesLoggedIn) throws Exception {
		if (timesLoggedIn < 0) {
			throw new Exception("A user cannot have logged in " + timesLoggedIn + " times!");
		}
		this.timesLoggedIn = timesLoggedIn;
		this.vipGreeting = "Greetings " + name + ", how the devil are you?";
		this.normalGreeting = "Hey, " + name;
	}

	public void login() {
		timesLoggedIn++;
	}

	public void display(String greeting) {
		System.out.println(greeting);
	}

	public String greet() {
		// When the user first logs in use Hello, World but otherwise use Hey
		// and their name
		if (isNewUserLogin()) {
			return timesLoggedIn + firstLogInGreeting;
		} else if (isVip()) {
			return timesLoggedIn + vipGreeting;
		} else {
			return timesLoggedIn + normalGreeting;
		}
	}

	private boolean isVip() {
		return timesLoggedIn >= 99;
	}

	private boolean isNewUserLogin() {
		return timesLoggedIn == 0;
	}

}
