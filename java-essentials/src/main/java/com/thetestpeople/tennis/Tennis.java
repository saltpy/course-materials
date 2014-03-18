package com.thetestpeople.tennis;

public class Tennis {
	private final Object[] possibleScores = new Object[] { 0, 15, 30, 40, 'A',
			'W' };
	private int playerOne = 0;
	private int playerTwo = 0;

	public Object[] score() {
		return new Object[] { possibleScores[playerOne],
				possibleScores[playerTwo] };
	}

	public void pointToServe() {
		if (isAdvantageAgainstServer()) {
			playerTwo = 3;
		} else {
			playerOne++;
		}
	}

	private boolean isAdvantageAgainstServer() {
		return playerOne == 3 && playerTwo == 4;
	}

	public void pointAgainstServe() {
		if (isAdvantageServer()) {
			playerOne = 3;
		} else {
			playerTwo++;
		}
	}

	private boolean isAdvantageServer() {
		return playerTwo == 3 && playerOne == 4;
	}

	public boolean isWon() {
		return playerOne == 5 || playerTwo == 5;
	}

}
