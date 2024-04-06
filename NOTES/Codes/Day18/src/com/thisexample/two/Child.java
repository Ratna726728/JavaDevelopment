package com.thisexample.two;

public class Child extends Parent{

	void test() {
		System.out.println("Child class method");
	}
	void demo() {
		this.test();
	}
}
