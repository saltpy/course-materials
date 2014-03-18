package com.thetestpeople.bowling;

public class Bowling {
	private int[] scores = new int[21];
	private int nextBall = 0;
	
	public int score() {
		int total = 0;
		int next = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (scores[next] + scores[next + 1] == 10) {
				total += 10 + scores[next + 2];
				next += 2;
			} else {
				total += scores[next];
				total += scores[next + 1];
				next += 2;
			}
		}
		return total;
	}

	public void roll(int pins) {
		scores[nextBall] = pins;
		nextBall++;
	}

}
