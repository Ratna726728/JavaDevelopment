package com.property;

import java.io.FileInputStream;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("E://JavaDevelopment//JavaDevelopment//NOTES//Test//test.properties");
			
			//locate the properties file
			Properties prop = new Properties();
			prop.load(fileInputStream);
			
			//load properties file by using load() of properties class
			
			String name = prop.getProperty("username");
			String password = prop.getProperty("password");
			
			//get the data by using getProperty()
			
			System.out.println("Username = "+ name);
			System.out.println("Password = "+ password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
