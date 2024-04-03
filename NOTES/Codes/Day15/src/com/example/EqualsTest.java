package com.example;

public class EqualsTest {

	int empId;
	String empName;
	
	public static void main(String[] args) {
	
		EqualsTest equalTest = new EqualsTest();
		
		equalTest.empId=1;
		equalTest.empName="Rajiv";
		
		EqualsTest equalTest1 = new EqualsTest();
		
		equalTest1.empId=2;
		equalTest1.empName="Indra";
		
		System.out.println(equalTest.equals(equalTest1)); //false
		
		//but if we do something like this
		equalTest = equalTest1;
		
		System.out.println(equalTest.equals(equalTest1));//true
	}
}
