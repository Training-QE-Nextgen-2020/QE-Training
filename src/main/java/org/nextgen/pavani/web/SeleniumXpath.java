package org.nextgen.pavani.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumXpath {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.Costco.com/");
	}

	@Test
	public void XpathTestOnButton() throws InterruptedException {
//		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
//		searchBox.sendKeys("thanks giving offers",Keys.ENTER);
//		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text' and @name='keyword']"));
		searchBox.sendKeys("blackfriday deals",Keys.ENTER);
		searchBox.click();
		Thread.sleep(3000);
		
	}

	@AfterMethod
	public void cleanUP() {
		driver.quit();

	}

}
