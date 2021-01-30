package org.nextgen.pavani.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumLocatorXPath {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

	}

	@Test
	public void testTargetHomePage() throws InterruptedException {

		WebElement searchBtn = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

		searchBtn.sendKeys("black friday deals", Keys.ENTER);
		Thread.sleep(3000);

		driver.quit();

	}
}
