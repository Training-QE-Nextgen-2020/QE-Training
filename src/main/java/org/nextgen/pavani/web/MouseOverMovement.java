package org.nextgen.pavani.web;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseOverMovement {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		//setting the system properties of gecodriver
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		
		//creating object instance for the Firefoxdriver
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void mouseMovement() throws InterruptedException {
		driver.get("http://mrbool.com");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Articles")).click();
	}
	

}
