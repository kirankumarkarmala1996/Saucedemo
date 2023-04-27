package com.saucedemo.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
  import org.testng.annotations.BeforeSuite;

import com.saucedemo.qa.pages.LogOutPage;
import com.saucedemo.qa.pages.LoginPage;

public class BaseTest {

	public WebDriver driver;
	public Properties prop;
	public BasePage base;
	public LoginPage login;
	public LogOutPage logout;
	
	@BeforeSuite
	public void setUp() {
		base= new BasePage();
		prop=base.init_properties();
		driver=base.init_Browser(prop.getProperty("browser"));
		login= new LoginPage(driver);
		logout = new LogOutPage(driver);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}
//	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
