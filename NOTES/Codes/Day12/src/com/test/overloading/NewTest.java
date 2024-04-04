package com.test.overloading;

public class NewTest {

	void test(Object object) {
		System.out.println("test-Object");
	}
	void test(String string) {
		System.out.println("test-String");
	}
	public static void main(String[] args) {
		NewTest newTest = new NewTest();
		
		newTest.test(new Object());
		newTest.test("rat");
		newTest.test(new NewTest());
		newTest.test(new String());
		//output
//		test-Object
//		test-String
//		test-Object
//		test-String
		 
		
	}
}
