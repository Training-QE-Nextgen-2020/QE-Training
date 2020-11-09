package org.nextgen.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstUITest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty(
                "webdriver.chrome.driver",  "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
	}

	
	@Test(enabled = false)
	public void testGoogleHomePage() {	
		
		WebElement searchBox =  driver.findElement(By.name("q"));
		Assert.assertNotNull(searchBox);

        
	}
	
	
	@Test
	public void testWalmartHomePage()  {
		//Locator - id
		//WebElement searchBox =  driver.findElement(By.id("global-search-input"));
		//searchBox.sendKeys("iphone 12");
		//searchBox.submit();
		
		
		//Locator name
		// see example for google test above
		
		//Locator - linkText
		//WebElement aboutLink = driver.findElement(By.linkText("Learn about Walmart+"));
		//aboutLink.click();
		
		
		//Locator partialLinkText
		//driver.findElement(By.partialLinkText("Collectibles")).click();;
		
		//locator tagName 
		//driver.findElement(By.tagName(tagName))
		
		//Locator XPath
		driver.findElement(By.xpath("//*[@id=\"gh-p-1\"]/a")).click();;
		
		
		
		
	}
	
	@AfterMethod
	public void cleanUp() throws InterruptedException  {
		Thread.sleep(10000);
		driver.quit();
	}
}
