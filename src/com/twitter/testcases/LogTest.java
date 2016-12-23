package com.twitter.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.twitter.base.Page;
import com.twitter.pages.LoginPage;



public class LogTest {
	
	@Test(dataProvider="getData")
	public void doLoginTest(String username,String password){
		
		LoginPage login=new LoginPage();
		login.doLogin("username", "password");
	}
	
	@DataProvider
	public static Object[][] getData()
	{
		
	
		return Page.getData("LoginTest");
		
	}

}
