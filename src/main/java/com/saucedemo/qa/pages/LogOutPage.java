package com.saucedemo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.saucedemo.qa.base.BasePage;
import com.saucedemo.qa.utlities.ElementUtlities;

public class LogOutPage extends BasePage  {
	
	public WebDriver driver;
	public ElementUtlities utils;
	

	public LogOutPage(WebDriver driver) {
		this.driver= driver;
		utils= new ElementUtlities(driver);
	}
	
	

}
