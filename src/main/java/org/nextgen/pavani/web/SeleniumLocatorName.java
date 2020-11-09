package org.nextgen.pavani.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumLocatorName {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
	}

	@Test
	public void testTargetHomePage() throws InterruptedException {

		WebElement searchBox = driver.findElement(By.name("_nkw"));
		searchBox.sendKeys("thanks giving deals", Keys.ENTER);
		Assert.assertNotNull(searchBox);
		Thread.sleep(3000);

	}

	@AfterMethod
	public void ceanUP() {
		driver.quit();

	}

}
