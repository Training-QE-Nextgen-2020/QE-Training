package org.nextgen.pavani.web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumXpathLink {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.target.com/");
	}

	@Test
	public void XpathTestOnButton() throws InterruptedException {
//		WebElement searchBox = driver.findElement(By.xpath(" //input[@class='nav-input' and @name='field-keywords']"));
//		searchBox.sendKeys("thanks giving offers", Keys.ENTER);
		Thread.sleep(3000);
//		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text' and @name='keyword']"));
//		searchBox.sendKeys("blackfriday deals",Keys.ENTER);
//		searchBox.click();
//		Thread.sleep(3000);

//		WebElement linkFindAGift = driver.findElement(By.xpath(" //a[contains(text(),'Find a Gift')]"));
//		linkFindAGift.click();
//		Thread.sleep(3000);
//		
//		WebElement linkFindAGift = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7] "));
//		linkFindAGift.click();
//		Thread.sleep(3000);
		
		WebElement linkFindAGift = driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]//parent::li"));
		linkFindAGift.click();
		Thread.sleep(3000);

	}

	@AfterMethod
	public void cleanUP() {
		driver.quit();

	}

}
