package com.lthoi.test;

import com.lthoi.test.*;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class UserTest
{
	@Test
	public void test()
	{
		PlayerAPI testAPI = new PlayerAPI();	
		User test = new User("Jonathan");
		ArrayList<User> tests = new ArrayList<User>();
		
		Assert.assertNotNull(test);
		
		tests = testAPI.getUsers(1);
		Assert.assertFalse(tests.isEmpty());
		
	}
}