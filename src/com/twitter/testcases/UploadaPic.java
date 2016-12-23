package com.twitter.testcases;

import org.testng.annotations.Test;

import com.twitter.base.Page;
import com.twitter.pages.LandingPage;
import com.twitter.pages.MyProfilePage;


public class UploadaPic {

	@Test
	public void uploadaPic(){
		//LandingPage lp= new LandingPage();
		
		
		LandingPage lp=Page.topNav.gotoHome();
		MyProfilePage mp =lp.gotoProfile();
		mp.editProfile().addPhoto();
	}
}
