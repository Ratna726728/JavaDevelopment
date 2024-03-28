package com.constructors.example;

public class DefaultsExample {

	String employeeName;
	public DefaultsExample() {
		employeeName= "Rakesh";
	}
	public static void main(String[] args) {
		DefaultsExample defaultsExample = new DefaultsExample();
		
		System.out.println("name is : "+defaultsExample.employeeName);
	}
}
