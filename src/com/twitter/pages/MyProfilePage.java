package com.twitter.pages;

import org.openqa.selenium.By;


import com.twitter.base.Page;

public class MyProfilePage extends Page{

	
	public MyProfilePage addPhoto(){
		System.out.println("Add photo");
		return this;
	}
	
	public MyProfilePage editProfile(){
		driver.findElement(By.xpath(".//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[6]/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[6]/div/div/button[2]")).click();
	return this;
	}
	
	
	public void gotTweetsandFollowings(){
		
		
	}
	

	
}
