package org.nextgen.pavani.web;
import java.io.File;
import java.io.IOException;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TakeScreenShot {
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
		driver.get("http://www.gooogle.com");
		
	}
	@Test
	public static void takeScreenShot() throws IOException { 
		WebDriver driver;
		//take scree shot and store it as afile format
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(scrFile, new File("C:\\CaptureScreenshot\\google.jpg")
			
	public void tearDown() {
		driver.close();
	}
	

}
