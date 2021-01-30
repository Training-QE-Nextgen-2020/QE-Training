package org.nextgen.pavani.web;import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stubpackage org.nextgen.pavani.web;
	Properties prop=new Properties(); //creating an object for the Properties class
	FileInputStream input=new FileInputStream("/Users/pkoduru/QE-Training/src/main/java/org/nextgen/pavani/web/config.properties");//givding exact path of the config.properties file
	prop.load(input);
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("age"));
	
	




	}

}
