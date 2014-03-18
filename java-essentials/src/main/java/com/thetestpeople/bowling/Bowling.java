package com.thetestpeople.bowling;

public class Bowling {
	private int[] scores = new int[21];
	private int nextBall = 0;
	private int nextBallToScore = 0;
	private int total;

	public int score() {
		total = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (scores[nextBallToScore] == 10) {
				scoreStrikeFrame();
			} else {
				scoreNonStrikeFrame();
			}
		}
		scorePerfectGame();
		return total;
	}

	private void scorePerfectGame() {
		for (int i = 0; i < 11; i++) {
			if (scores[i] != 10) {
				return;
			}
		}
		total += 10;
	}

	private void scoreStrikeFrame() {
		total += 10 + scores[nextBallToScore + 1] + scores[nextBallToScore + 2];
		advance(1);
	}

	private void advance(int ballsToAdvance) {
		nextBallToScore += ballsToAdvance;
	}

	private void scoreNonStrikeFrame() {
		total += scores[nextBallToScore] + scores[nextBallToScore + 1];
		if ((scores[nextBallToScore] + scores[nextBallToScore + 1]) == 10) {
			total += scores[nextBallToScore + 2];
		}
		advance(2);
	}

	public void roll(int pins) {
		scores[nextBall] = pins;
		nextBall++;
	}

}
