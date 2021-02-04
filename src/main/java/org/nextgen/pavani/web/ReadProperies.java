package org.nextgen.pavani.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperies {
	public static void main(String[] args) throws IOException {
	Properties prop=new Properties();
	FileInputStream ip=new FileInputStream("/Users/pkoduru/QE-Training/src/main/java/org/nextgen/pavani/web/config.properties");//it establishes the connection between java code to config file
	
	prop.load(ip);
	//to get data from config.propetries file
System.out.println(prop.getProperty("name"));
System.out.println(prop.getProperty("age"));
System.out.println(prop.getProperty("URL"));



}
	}
