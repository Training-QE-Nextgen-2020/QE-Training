/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author pkoduru
 *This class will store all the locators and methods of login page
 *
 *By is a class and id is a static method and it will store in the By class we store the variable in By class
 *
 *when ever u call the constructor it intializes the web diver
 */
public class LoginPage {
    WebDriver driver;
	By username=By.id("user_login");
	By password=By.xpath("//*[@id=\"user_pass\"]");
	By loginBtn=By.name("\"wp-submit\"");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;	
		
	}
	public void typeUserName() {
		driver.findElement(username).sendKeys("admin");
		
	}
    public void typePassWord() {
		driver.findElement(password).sendKeys("demo123");
	}
   public void clickOnLoginButton() {
	   driver.findElement(loginBtn).click();

   }
}
