package com.thetestpeople.bowling;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBowling {
	@Test
	public void testGutterGame() {
		Bowling game = new Bowling();
		rollMany(game, 0, 20);
		assertEquals(0, game.score());
	}

	private void rollMany(Bowling game, int pins, int times) {
		for (int i = 0; i < times; i++) {
			game.roll(pins);
		}
	}
}
