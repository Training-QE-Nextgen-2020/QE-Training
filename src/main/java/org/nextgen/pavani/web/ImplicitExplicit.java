package org.nextgen.pavani.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class ImplicitExplicit {
	WebDriver driver;
	@BeforeMethod
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver=new ChromeDriver();	
		driver.navigate().to("https://www.facebook.com/");
	}
	
	
	
	

}
