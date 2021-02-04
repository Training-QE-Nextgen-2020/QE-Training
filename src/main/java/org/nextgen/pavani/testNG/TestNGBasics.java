package org.nextgen.pavani.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasics {
	WebDriver driver;
	@BeforeMethod
	public void setUPTest() {
		System.setProperty("webdriver.chromeDriver", "chromeDriver");
	 driver=new ChromeDriver();	
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("https://www.google.com/");
		
	}
	@Test
	public void cgoogleTest() {
	 Boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test
	public void agoogleTestSearchBox() {
	driver.findElement(By.name("q")).sendKeys("black friday deals");
	//*[@id="hplogo"]
	}
	@Test
	public void bgoogleTitle() {
	String str=driver.getTitle();
	System.out.println("the tilte is"+str);
	}
	
	@AfterMethod
	public void terminate() {
		driver.close();
		
	}

}

