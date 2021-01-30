package org.nextgen.pavani.web;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class FramesSelenium {
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
		driver.get.


}
	}
