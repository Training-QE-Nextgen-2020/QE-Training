package org.nextgen.pavani.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterClass {
	WebDriver driver;
	@Test
	@Parameters({"url","emailId"})
	public void isParameter(String url,String emailId ) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		driver=new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(emailId);
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
		
		
		
		
		
		
		
	}
	

}
