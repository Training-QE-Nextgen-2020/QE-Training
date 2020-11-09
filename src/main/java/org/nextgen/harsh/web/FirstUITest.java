package org.nextgen.harsh.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstUITest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty(
                "webdriver.gecko.driver",  "geckodriver-windows.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}

	
	@Test
	public void testGoogleHomePage() {	
		
		WebElement searchBox =  driver.findElement(By.name("q"));
		Assert.assertNotNull(searchBox);
		driver.quit();

        
	}
}

