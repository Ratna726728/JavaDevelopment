package com.method.operators.code;
//Write the java program to design static method for division of two number 
//which returns int value to that method and result should be print into main method.
public class DivisionMeth {

	public static int division(int a, int b) {
		int div = a/b;
		System.out.println("The division of both variables is : "+div);
		return div;
	}
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 3;
		
		DivisionMeth.division(num1, num2);
	}
}
