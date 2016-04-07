package com.lthoi.test;

import org.junit.Assert;
import org.junit.Test;

public class BetTest 
{
	@Test
	public void Test()
	{
		Bet tester = new Bet(198);
		Assert.assertNotNull(tester);
	}
	
}
