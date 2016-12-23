package com.twitter.pages;

import org.openqa.selenium.By;


import com.twitter.base.Page;

public class LandingPage  extends Page{
	

	
	public MyProfilePage gotoProfile(){
		driver.findElement(By.xpath(".//*[@id='page-container']/div[1]/div[1]/div/div[1]/div/a")).click();
	return new MyProfilePage();
	}
	
	public void addtweets(String tweets){
		driver.findElement(By.xpath(".//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[1]/a/span[1]")).sendKeys(tweets);;
	}
	
	public void gotoFollwing(){
		
	}
	
	public void gotFollowers(){
		
	}

}
