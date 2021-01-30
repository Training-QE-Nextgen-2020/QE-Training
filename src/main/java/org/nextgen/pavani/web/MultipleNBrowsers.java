package org.nextgen.pavani.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleNBrowsers {
	WebDriver driver;
	@BeforeMethod
	public void setUP() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);	
		driver.get("https://www.toolsqa.com/");
		WebElement clickElement=driver.findElement(By.id("button1"));
		for(int i=0;i<3;i++) {
			clickElement.click();
			
		}
		
		
	}
	@Test
	public void multipleWindows() {
		
		
	}
	
	

}
