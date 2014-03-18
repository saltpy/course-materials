package com.thetestpeople.tennis;

import org.junit.Assert;
import org.junit.Test;

public class TestTennis {
	@Test
	public void testLoveAll() {
		Tennis game = new Tennis();
		Assert.assertArrayEquals(new Object[] { 0, 0 }, game.score());
	}

	@Test
	public void testFifteenLove() {
		Tennis game = new Tennis();
		game.pointToServe();
		Assert.assertArrayEquals(new Object[] { 15, 0 }, game.score());
	}

	@Test
	public void testLoveFifteen() {
		Tennis game = new Tennis();
		game.pointAgainstServe();
		Assert.assertArrayEquals(new Object[] { 0, 15 }, game.score());
	}

	@Test
	public void testFourPointsToServeIsAWonGame() {
		Tennis game = new Tennis();
		game.pointToServe();
		game.pointToServe();
		game.pointToServe();
		game.pointToServe();
		Assert.assertTrue(game.isWon());
	}
	
	@Test
	public void testFourPointsAgainstServeIsAWonGame() {
		Tennis game = new Tennis();
		game.pointAgainstServe();
		game.pointAgainstServe();
		game.pointAgainstServe();
		game.pointAgainstServe();
		Assert.assertTrue(game.isWon());
	}
	
	@Test
	public void testReturnToDeuceAfterAdvantageServer() {
		Tennis game = new Tennis();
		game.pointToServe();
		game.pointAgainstServe();
		game.pointToServe();
		game.pointAgainstServe();
		game.pointToServe();
		game.pointAgainstServe();
		game.pointToServe();
		game.pointAgainstServe();
		Assert.assertArrayEquals(new Object[] { 40,  40 }, game.score());
	}
	
	@Test
	public void testReturnToDeuceAfterAdvantageAgainstServer() {
		Tennis game = new Tennis();
		game.pointAgainstServe();
		game.pointToServe();
		game.pointAgainstServe();
		game.pointToServe();
		game.pointAgainstServe();
		game.pointToServe();
		game.pointAgainstServe();
		game.pointToServe();
		Assert.assertArrayEquals(new Object[] { 40,  40 }, game.score());
	}
}
