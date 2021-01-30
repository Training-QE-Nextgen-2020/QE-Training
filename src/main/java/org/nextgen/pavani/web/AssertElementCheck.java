package org.nextgen.pavani.web;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertElementCheck {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	}
//to disable the test case
	//@Test(enabled = true)
	//public void verifyTitle() 
//	{
//		String actualTitle=driver.getTitle();
//		String expectedTitle="https://www.google.com ";
//	//Assert.assertEquals(actualTitle, expectedTitle);
//		Assert.assertEquals(actualTitle, expectedTitle);
//	System.out.println("the test is passed");				
//	}
	@Test
	public void isDropDown() {
	WebElement isDropDown=driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]/div[1]/div[1]/div[9]"));
	isDropDown.click();
	isDropDown.isDisplayed();
	
	}
	@AfterMethod
	public void closeWindow() {
		driver.close();
	}
}


