package com.thetestpeople.bowling;

public class Bowling {
	private int[] scores = new int[21];
	private int nextBall = 0;
	private int nextBallToScore = 0;
	private int total;

	public int score() {
		total = 0;
		for (int frame = 0; frame < 10; frame++) {
			doSpares();
			doFaceValues();
			advance();
		}
		return total;
	}

	private void advance() {
		nextBallToScore += 2;
	}

	private void doFaceValues() {
		total += scores[nextBallToScore] + scores[nextBallToScore + 1];
	}

	private void doSpares() {
		if ((scores[nextBallToScore] + scores[nextBallToScore + 1]) == 10) {
			total += scores[nextBallToScore + 2];
		}
	}

	public void roll(int pins) {
		scores[nextBall] = pins;
		nextBall++;
	}

}
