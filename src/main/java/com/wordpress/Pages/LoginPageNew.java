/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author pkoduru
 *the driver which is an argument in the coonstructor that comes from the pagefactory ,that argumet will be intialized to the local driver
 */
public class LoginPageNew {
	WebDriver driver;
	
	public LoginPageNew(WebDriver ldriver) {
		this.driver=ldriver;
		
	}

	@FindBy(how=How.ID ,using="user_login")WebElement username;
	@FindBy(how=How.NAME ,using="log")WebElement password;
	@FindBy(id="user_login")WebElement login_btn;
	public void login_wordpress(String uid,String pass){
		
		username.sendKeys(uid);
		password.sendKeys(pass);
		login_btn.click();
	}
}

