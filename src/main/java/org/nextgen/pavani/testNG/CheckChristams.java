package org.nextgen.pavani.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckChristams {

	WebDriver driver;
	@Test
	
	public void isChristmas() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement textbox=driver.findElement(By.name("q"));
		textbox.clear();
		textbox.sendKeys("christmas in the park");
		
		
		
	}
	

}
