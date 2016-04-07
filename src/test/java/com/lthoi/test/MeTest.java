package com.lthoi.test;

import com.lthoi.test.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class MeTest
{
	@Test
	public void test()
	{
		PlayerAPI testAPI = new PlayerAPI();	
		Me test = new Me();
		
		Assert.assertNotNull(test);
		
		test = testAPI.getMe();
		Assert.assertNotNull(test);
		
	}
}