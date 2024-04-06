package com.thisexample.three;

public class Test {

	public Test() {
		System.out.println("Test constructor called using"+" this keyword..");
	}
	public Test(int x) {
		this();
	}
	public static void main(String[] args) {
		Test test = new Test(10);
	}
}
