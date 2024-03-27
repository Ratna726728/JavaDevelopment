package com.statics.singlecopy;
//how to access static members from non-static members
public class StaticTest {

	void a1() {
		System.out.println("This is non static method");
		x1();
	}
	static void x1() {
		System.out.println("This is static method");
	}
	
	public static void main(String[] args) {
		StaticTest staticTest = new StaticTest();
		staticTest.a1();
	}
}
