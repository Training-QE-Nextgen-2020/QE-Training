package org.nextgen.pavani.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumLocatorClassName {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.kohls.com/");

	}

	@Test
	public void testTargetHomePage() throws InterruptedException {

		WebElement searchBar = driver.findElement(By.className("input-text"));
		searchBar.sendKeys("thanksgiving",Keys.ENTER);
		//searchBar.click();
		Thread.sleep(3000);
		driver.quit();

	}
}
