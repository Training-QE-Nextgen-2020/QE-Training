package org.nextgen.pavani.web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumLocatorPartialLink {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.target.com");

	}

	@Test
	public void testTargetHomePage() throws InterruptedException {

	WebElement partialWeekllink=driver.findElement(By.partialLinkText("Weekly "));
	partialWeekllink.click();
	
	
		Thread.sleep(2000);

		driver.quit();

	}
}




