package com.twitter.pages;

import org.openqa.selenium.By;
import com.twitter.base.Page;


public class LoginPage extends Page{

	


	
		public LandingPage doLogin(String username,String password){
			
			driver.findElement(By.xpath(OR.getProperty("btnLogin"))).click();
			driver.findElement(By.xpath(OR.getProperty("txtUsername"))).sendKeys(username);
			driver.findElement(By.xpath(OR.getProperty("txtPassword"))).sendKeys(password);
			driver.findElement(By.xpath(OR.getProperty("clickLogin"))).click();
			
			return new LandingPage();
			
		}
	
		public void doSignup(String name,String email,String Pass){
			
			
		}
		
		public void doValidate(){
			
			
		}
}
