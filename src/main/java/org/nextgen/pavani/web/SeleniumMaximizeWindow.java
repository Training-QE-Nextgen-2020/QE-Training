package org.nextgen.pavani.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumMaximizeWindow {
	WebDriver driver=new ChromeDriver();
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		//the code to maximize  the window
		driver.manage().window().maximize();
	}
	@Test
	public void isGmailDisplayed() {
		driver.findElement(By.linkText("Gmail")).isDisplayed();
		Boolean isGmail=true;;
		WebElement click=driver.findElement(By.linkText("Gmail")).click();
	
	}
	@AfterMethod
	public void cleanUp() throws InterruptedException  {
		Thread.sleep(10000);
		driver.quit();
	}

}
