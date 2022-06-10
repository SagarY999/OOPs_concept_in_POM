package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	private By emailID = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.id("loginBtn");
	private By header = By.xpath("//i18n-string[@data-key='login.signupLink.text']");
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		}

			//public getters

	public WebElement getEmailID() {
		return getElement (emailID);
	}


	public WebElement getPassword() {
		return getElement (password);
	}


	public WebElement getLoginButton() {
		return getElement (loginButton);
	}


	public WebElement getHeader() {
		return getElement (header);
	}
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
		
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public HomePage doLogin (String username, String pwd)	{
		getEmailID().sendKeys(username);
		getPassword().sendKeys(pwd);
		getLoginButton().click();
		
		return getInstance(HomePage.class);
	}
	
	//for negative testing
	
	public void doLogin()	{
		getEmailID().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
				}
	
	//username : yamagar.sagar@gmail.com
	
	public void doLogin (String userCred)	
	{
		if (userCred.contains ("username")) {
			getEmailID().sendKeys(userCred.split(":")[1].trim());}
		else if (userCred.contains ("password")); {
			getEmailID().sendKeys(userCred.split(":")[1].trim());}
	
	getLoginButton().click();
}
}