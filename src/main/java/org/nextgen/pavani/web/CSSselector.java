package org.nextgen.pavani.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CSSselector {
	WebDriver driver;
	@Test
	public void checkCSS() throws InterruptedException {
		
		driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		WebElement username=driver.findElement(By.cssSelector("input#firstName"));
		
		username.sendKeys("Loka Pavani");
		WebElement passWord=driver.findElement(By.xpath(" //input[@name='lastName']"));
		passWord.sendKeys("Koduru");
		Thread.sleep(1000);
		WebElement userName=driver.findElement(By.xpath("//input[@type='email'] "));
		userName.sendKeys("pavani.btech2k9");
		Thread.sleep(1000);
		WebElement passCode=driver.findElement(By.xpath("//input[@type='password' and @name='Passwd']"));
		passCode.sendKeys("Harshika@28");
		Thread.sleep(1000);
		WebElement conPassCose=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		conPassCose.sendKeys("Harshika@28");
		Thread.sleep(1000);
		WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		Thread.sleep(1000);
		driver.close();
		
	}
	
}

