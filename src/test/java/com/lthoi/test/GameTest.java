package com.lthoi.test;

import com.lthoi.test.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class GameTest
{
	@Test
	public void test()
	{
		ArrayList<Game> test = new ArrayList<Game> ();
		PlayerAPI testAPI = new PlayerAPI();
		
		test = testAPI.getGames(1, 3);
		Assert.assertFalse(test.isEmpty());
		
	}
}