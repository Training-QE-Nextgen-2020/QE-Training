package org.nextgen.pavani.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstFirefoxTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		//setting the system properties of gecodriver
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		
		//creating object instance for the Firefoxdriver
		driver = new FirefoxDriver();

		//driver.get("https://www.google.com");
		driver.get("https://www.ebay.com/?norover=1&mkevt=1&mkrid=711-158810-934349-9&mkcid=2&keyword=ebay&crlp=431466732167_&MT_ID=&geo_id=&rlsatarget=kwd-11021220&adpos=&device=c&mktype=&loc=9032008&poi=&abcId=&cmpgn=9834622244&sitelnk=&adgroupid=98381287885&network=g&matchtype=e&gclid=EAIaIQobChMI18Hbp4Ti7AIVhT6tBh1dzAQMEAAYASAAEgJnw_D_BwE");
	}

	@Test
	public void startBrowser() {	
		WebElement searchBox =  driver.findElement(By.id("gh-ac"));
		Assert.assertNotNull(searchBox);
		
		driver.close();
		System.exit(0);

	}

}
