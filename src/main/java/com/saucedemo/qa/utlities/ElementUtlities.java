package com.saucedemo.qa.utlities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.saucedemo.qa.base.BasePage;


public class ElementUtlities extends BasePage{
	
	WebDriver driver;
	
	public ElementUtlities(WebDriver driver) {
		 this.driver=driver;
				 
	}
	
	public WebElement getWebElement(By locater) {
		WebElement element=driver.findElement(locater);
		return element;
		
	}
	// Click
		public void doClick(By Locater) {
			getWebElement(Locater).click();
		}

		// SendKeys
		public void doSendKeys(By Locater, String Value) {
			getWebElement(Locater).sendKeys(Value);
		}

		// Get Title
		public String doGetTitle() {
			return driver.getTitle();
		}

		// IsDisplay
		public boolean DoIsDisplay(By Locater) {
			return getWebElement(Locater).isDisplayed();
		}

		// getText
		public String doGetText(By Locater) {
			return getWebElement(Locater).getText();
		}

		// navigate to page
		public void doNavigatePage(String URL) {
			driver.navigate().to(URL);
		}

		public String getAttribute(By locater, String value) {
			String attributeValue = getWebElement(locater).getAttribute(value);
			return attributeValue;

		}

		public List<WebElement> getwebelements(By locater) {
			List<WebElement> ele = driver.findElements(locater);
			return ele;
		}

		public void alertAccept() {
			driver.switchTo().alert().accept();
		}

		public void alertDismiss() {
			driver.switchTo().alert().dismiss();
		}

		public void selectValueByvisibleText(By locater, String value) {
			WebElement element = getWebElement(locater);
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
		}
		
		public void selectValueByIndex(By locater , int index) {
			WebElement element=getWebElement(locater);
			Select sel = new Select(element);
			sel.selectByIndex(index);
		}
	

}
