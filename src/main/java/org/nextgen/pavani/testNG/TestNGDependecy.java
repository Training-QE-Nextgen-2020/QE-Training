package org.nextgen.pavani.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDependecy {
	@BeforeMethod
	public void setUPYTest() {
		System.out.println("open login page");
		
	}
	@Test
	public void  login() {
		System.out.println("the login information");
		
	}
	@Test(dependsOnMethods = "login")
	public void registerPage() {
		System.out.println("the registraation page");
	}
	@AfterMethod
	public void closeTest() {
		System.out.println("the close page");
		
	}
	
	

}
