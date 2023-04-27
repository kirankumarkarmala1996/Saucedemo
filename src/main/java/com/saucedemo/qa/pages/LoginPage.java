package com.saucedemo.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.saucedemo.qa.base.BasePage;
import com.saucedemo.qa.utlities.ElementUtlities;

public class LoginPage extends BasePage{
	
	public  WebDriver driver;
	
	public ElementUtlities utils;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		utils= new ElementUtlities(driver);
		
	}
	By swaghHeader_Title=By.xpath("//div[text()='Swag Labs']");
	By UserName = By.id("user-name");
	By PassWord = By.id("password");
	By loginButton = By.name("login-button");
	
	
	public String getLoginPageTitle() {
		return utils.doGetTitle();
	}
	
	public boolean loginPageHeaderIsDisplay() {
		return utils.DoIsDisplay(swaghHeader_Title);
	}
	
	public void doLogin(String userName, String password) {
		utils.doSendKeys(UserName, userName);
		utils.doSendKeys(PassWord, password);
		utils.doClick(loginButton);
	}
	
	
	
	
	
}
