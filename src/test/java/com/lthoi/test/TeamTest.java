package com.lthoi.test;

import com.lthoi.test.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class TeamTest
{
	@Test
	public void test()
	{
		PlayerAPI testAPI = new PlayerAPI();	
		Team test = new Team();
		
		Assert.assertNotNull(test);
		
		test = testAPI.getTeam(1, "Pittsburgh", "Steelers");
		Assert.assertNotNull(test);
		
	}
}