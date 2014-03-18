package com.thetestpeople.tennis;

public class Tennis {
	private final Object[] possibleScores = new Object[] { 0, 15, 30, 40, 'A', 'W' };
	private int playerOne = 0;
	private int playerTwo = 0;

	public Object[] score() {
		return new Object[] { possibleScores[playerOne], possibleScores[playerTwo] };
	}

	public void pointToServe() {
		playerOne++;
	}

}
