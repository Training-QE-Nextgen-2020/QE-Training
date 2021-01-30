package org.nextgen.pavani.web;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumPopUPAlert {
	WebDriver driver=new ChromeDriver();
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
}
	@Test
	public void signinTest() throws InterruptedException {
	driver.findElement(By.name("proceed")).click();
	Thread.sleep(30000);
	Alert alertObj=driver.switchTo().alert();//to handle alerts in selenium ,we have Alert class and create an object
	System.out.println(alertObj.getText());	 //it gives the text of the alert/popup message
	alertObj.accept();// it clicks on okay button
	
	}

//@AfterMethod
//public void tearDown() throws InterruptedException  {
//	Thread.sleep(80000);
//	driver.quit();

}