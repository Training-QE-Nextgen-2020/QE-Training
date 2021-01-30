package org.nextgen.pavani.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigationsBackAndForward {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		//setting the system properties of gecodriver
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		
		//creating object instance for the Firefoxdriver
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void startBrowser() throws InterruptedException {	
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.get("https://www.google.com");
		//to refresh the page
		driver.navigate().refresh();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
		
}




	
