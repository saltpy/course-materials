package com.thetestpeople.bowling;

public class Bowling {
	private int[] scores = new int[21];
	private int nextBall = 0;
	
	public int score() {
		int total = 0;
		for (int i = 0; i < 21; i++) {
			total += scores[i];
		}
		return total;
	}

	public void roll(int pins) {
		scores[nextBall] = pins;
		nextBall++;
	}

}
