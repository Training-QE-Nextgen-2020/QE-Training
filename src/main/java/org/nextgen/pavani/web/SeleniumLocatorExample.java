package org.nextgen.pavani.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumLocatorExample {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		;
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@Test
	public void testAmazon() throws InterruptedException {
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("instant pot", Keys.ENTER);

		WebElement brand = driver.findElement(By.xpath("//*[@id=\'p_89/Instant Pot\']/span/a/span"));
		brand.click();

		WebElement primeTab = driver.findElement(By.xpath("//*[@id=\"p_85/2470955011\"]/span/a/i"));
		primeTab.click();

		WebElement dealsToday = driver.findElement(By.xpath("//*[@id=\"p_n_specials_match/21213697011\"]/span/a/span"));
		dealsToday.click();

		WebElement imagePot = driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/h2/a/span"));
		imagePot.click();
		Thread.sleep(3000);
		WebElement addTOCart = driver.findElement(By.id("add-to-cart-button"));
		addTOCart.click();

		WebElement noThanks = driver.findElement(By.id("attachSiNoCoverage-announce"));
		noThanks.click();

		WebElement proceedToCheckout = driver.findElement(By.className("a-button-input"));
		proceedToCheckout.click();

	}

	@AfterMethod
	public void cleanUP() {
		driver.quit();

	}

}
