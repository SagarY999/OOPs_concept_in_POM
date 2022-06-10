package com.mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

public class LoginTest extends BaseTest {

	@Test (priority=1)
	public void verifyLoginPageTitleTest() {
		
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("title");
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test (priority=2)
	public void verifyLoginPageHeaderTest() {
		
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println("header");
		Assert.assertEquals(header, "Don't have an account?");
	
}
	@Test (priority=3)
	public void doLoginTest() {
		
		HomePage homePage = page.getInstance(LoginPage.class).doLogin("yamagar.sagar@gmail.com", "Sagar5324");
		String headerHome = homePage.getHomePageHeader();
		System.out.println(headerHome);
		Assert.assertEquals(headerHome, "User Guide");
	}
	
}