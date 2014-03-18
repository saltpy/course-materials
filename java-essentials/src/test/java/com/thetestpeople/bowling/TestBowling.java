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
	
	@Test
	public void testSpare() {
		Bowling game = new Bowling();
		rollMany(game, 5, 2);
		game.roll(1);
		assertEquals(12, game.score());
	}

	@Test
	public void testStrike() {
		Bowling game = new Bowling();
		game.roll(10);
		rollMany(game, 1, 2);
		assertEquals(14, game.score());
	}
	
	@Test
	public void testPerfectGame() {
		Bowling game = new Bowling();
		rollMany(game, 10, 11);
		assertEquals(300, game.score());
	}
	
	private void rollMany(Bowling game, int pins, int times) {
		for (int i = 0; i < times; i++) {
			game.roll(pins);
		}
	}
}
