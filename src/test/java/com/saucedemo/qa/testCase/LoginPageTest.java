package com.saucedemo.qa.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.qa.base.BaseTest;
import com.saucedemo.qa.utlities.Constants;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void verifyLoginPageTitle() {
		String loginPage_Title=login.getLoginPageTitle();
		Assert.assertEquals(loginPage_Title, Constants.LoginPageTitle);
	}
	
	@Test
	public void verifyLoginWithValidCredentials() {
		login.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
}
