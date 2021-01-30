package org.nextgen.pavani.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstFirefoxTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		//setting the system properties of gecodriver
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		
		//creating object instance for the Firefoxdriver
		driver = new FirefoxDriver();

		//driver.get("https://www.google.com");
		driver.get("https://www.ebay.com/");
		//thread.sleep(1000);
	}

	@Test
	public void startBrowser() {	
		WebElement searchBox =  driver.findElement(By.id("gh-ac"));
		Assert.assertNotNull(searchBox);
		
		
	

	}

}
