/**
 * 
 */
package com.wordpress.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

/**
 * @author pkoduru
 *
 */
public class VerifyWordpressLogin {
	@Test	
	public void verifyValidLogin() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		LoginPage login=new LoginPage(driver);
		login.typeUserName();
		login.typePassWord();
		login.clickOnLoginButton();
		driver.close();
		
	}
	

}
