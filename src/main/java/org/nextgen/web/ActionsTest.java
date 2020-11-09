package org.nextgen.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest {
	/*
	 * To operate mouse actions and keyboard action on a web/mob application , Action is used
	 * 
	 */
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty(
                "webdriver.chrome.driver",  "chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
	}
	
	@Test
	public void testDragAndDrop() {
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target);
		action.moveByOffset(5, 5);
		action.build().perform();
	}
	
	@AfterMethod
	public void cleanUp() throws InterruptedException  {
		Thread.sleep(10000);
		driver.quit();
	}
	


}
