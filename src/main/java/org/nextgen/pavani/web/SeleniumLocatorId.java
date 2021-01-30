package org.nextgen.pavani.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumLocatorId {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		
		//creating object instance for the Firefoxdriver
		driver = new FirefoxDriver();

		driver.get("https://www.target.com");
	}

	@Test
	public void testTargetHomePage() {

		WebElement searchBox = driver.findElement(By.id("search"));
		Assert.assertNotNull(searchBox);
		driver.quit();

	}

}
