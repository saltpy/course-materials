package com.thetestpeople.tennis;

import org.junit.Assert;
import org.junit.Test;

public class TestTennis {
	@Test
	public void testLoveAll() {
		Tennis game = new Tennis();
		Assert.assertArrayEquals(new Object[] { 0, 0 }, game.score());
	}
	
}
