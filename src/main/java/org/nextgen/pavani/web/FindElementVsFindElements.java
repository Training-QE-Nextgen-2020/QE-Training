package org.nextgen.pavani.web;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class FindElementVsFindElements {
	
	WebDriver driver;
//Open browser
	
@BeforeMethod
public void setup() {
System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
WebDriver driver = new FirefoxDriver();
// To maximize the window
driver.manage().window().maximize();
// Open application
driver.get("https://www.google.co.in/?gws_rd=ssl#q=softwaretestingmaterial.com");
}
@Test
public void findElements() {
// Get the list of all links

List<WebElement> link = driver.findElements(By.xpath("//*[@id='rso']/div/div/div/h3/a"));
// Using for loop to display the text of all the links
for(WebElement element:link)
{
System.out.println(element.getText());
}
// Click on the first link
driver.findElement(By.xpath("//*[@id='rso']/div/div/div/h3/a")).click();
}
}
 