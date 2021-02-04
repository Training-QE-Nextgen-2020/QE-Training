package org.nextgen.pavani.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidetClass {
	
	   @BeforeClass
	   public void beforeClass() 
	   {
	      System.out.println("Before class executed");
	   }
	   @DataProvider
	   public Object[][] message()
	   {
	      return new Object [][]{{“Mayank” , new Integer (321)}, {“Dileep”, new Integer (282)}};
	   }
	   @Test (dataProvider=”message”)
	   public void PrintMsg(String name, Integer id)
	   {
	      System.out.println(“Names are: “+name+” “+id);
	   }
	

}
