package org.nextgen.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SynchornizationTest {
	
	//waits
	// implicit wait  - it's a static wait and waits regardsless of the conidtion
	/*
	 * 10 secs - waits 10 seconds regardless of the locator
	 */
	
	// explicit wait
	/*
	 * create a condition and give time-out
	 * 
	 */
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty(
                "webdriver.chrome.driver",  "chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
	}

	/*
	 * 
		<span class="a-color-base gb-size-small faceoutText aok-block">Top Brands</span>	
		 */
	@Test
	public void testUsingImplicitWait() throws InterruptedException {
		
		
		//Thread.sleep(10000);
		WebElement holidayLink = driver.findElement(By.linkText("U cannot find this"));
		holidayLink.click();
		//takes time to load holiday deal page
		//Thread.sleep(10000);  -- java wait
		//Thread.sleep(10000);
		WebElement topBrands =  driver.findElement(By.xpath("//*[@id=\'widgetFilters\']/div/div[3]/div[2]/a/div/div[2]/span"));
		
		topBrands.click();
		
		
        
	}
	
	/*
	 * Explicit with conditions
	 */
	
	//@Test
	public void testUsingExplictWait () {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
	}
	
	@AfterMethod
	public void cleanUp() throws InterruptedException  {
		Thread.sleep(10000);
		driver.quit();
	}
	

}
