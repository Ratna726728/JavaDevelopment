package com.thisexample.four;

public class Example {

	Example(){
		this("Java");
		System.out.println("Inside constructor without parameter");
	}

	public Example(String string) {
		System.out.println("Inside Constructor with parameter"+string);
	}
	public static void main(String[] args) {
		Example object = new Example();
	}
}
