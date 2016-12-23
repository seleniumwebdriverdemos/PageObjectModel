package com.twitter.testcases;


import org.testng.annotations.DataProvider;

import com.twitter.base.Page;
import com.twitter.pages.LandingPage;
import com.twitter.pages.LoginPage;
import com.twitter.pages.MyProfilePage;

public class LoginTest{
public static void main(String[] args) {
	

	/*
				LoginPage login=new LoginPage();
				login.doLogin("seleniumwebdriver.demos@gmail.com", "*****");
				LandingPage landpage=new LandingPage();
				landpage.gotoProfile();
				MyProfilePage mp= new MyProfilePage();
				mp.editProfile();
				mp.addPhoto();
				Page.topNav.logout();*/
				
			/*	LoginPage login=new LoginPage();
				LandingPage lp = login.doLogin("seleniumwebdriver.demos@gmail.com", "*****");
				MyProfilePage mp =lp.gotoProfile()
				mp.editProfile().addPhoto();*/
	
	new LoginPage().doLogin("username", "password").gotoProfile().editProfile().addPhoto();
	Page.topNav.logout();

}

@DataProvider
public static Object[][] getData()
{
	

	return Page.getData("LoginTest");
	
}
}
