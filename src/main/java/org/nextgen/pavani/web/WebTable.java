package org.nextgen.pavani.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTable {
	WebDriver driver;
	@Test
	public void setup() {
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
	
	//creating object instance for the Firefoxdriver
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("http://demo.guru99.com/test/table.html");
	WebElement table=driver.findElement(by)
	
	
}
}
