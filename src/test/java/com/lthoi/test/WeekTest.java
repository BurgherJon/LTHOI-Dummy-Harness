package com.lthoi.test;

import com.lthoi.test.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class WeekTest
{
	@Test
	public void test()
	{
		PlayerAPI testAPI = new PlayerAPI();	
		Week test = new Week();
		
		Assert.assertNotNull(test);
		
		test = testAPI.getCurrentWeek();
		Assert.assertNotNull(test);
		
	}
}