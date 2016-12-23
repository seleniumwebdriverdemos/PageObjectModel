package com.twitter.pages;

import org.openqa.selenium.By;

import com.twitter.base.Page;

public class TopNavigation {

	
	
	public LandingPage gotoHome(){
		Page.driver.findElement(By.xpath(".//*[@id='global-nav-home']/a/span[2]")).click();
	
	return new LandingPage();
	}
	
	public void search(){
		
	}
	
	public void logout(){
		
		Page.driver.findElement(By.xpath(".//*[@id='user-dropdown-toggle']")).click();
		Page.driver.findElement(By.xpath(".//*[@id='signout-button']/button")).click();
	}
}
