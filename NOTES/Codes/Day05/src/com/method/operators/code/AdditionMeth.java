package com.method.operators.code;
//Write the java program to design static method for addition of two number which returns int results 
//to that method and result should be print into main method.
public class AdditionMeth {

	public static int addition(int a, int b) {
		int sum = a + b;
		System.out.println("Addition of a and b :" + sum);
		return sum;
	}
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		//using object of class
		AdditionMeth additionMeth = new AdditionMeth();
		AdditionMeth.addition(num1, num2);
	}
}
