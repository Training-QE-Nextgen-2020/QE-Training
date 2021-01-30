package org.nextgen.pavani.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumLocatorLinkText {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		
		//creating object instance for the Firefoxdriver
		driver = new FirefoxDriver();

		driver.get("https://www.amazon.com");
		
		
	}

	@Test
	public void testTargetHomePage() throws InterruptedException {

		driver.findElement(By.linkText("Free Shipping")).click();
		Thread.sleep(2000);

		driver.quit();

	}

}
