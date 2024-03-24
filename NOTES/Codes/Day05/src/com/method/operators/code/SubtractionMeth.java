package com.method.operators.code;
//Write the java program to design method for substraction of two 
//number which returns int value to that method and result should be print into main method.
public class SubtractionMeth {

	public int subtraction(int a, int b) {
		int sub = a - b;
		System.out.println("The value of substration is "+ sub);
		return sub;
	}
	public static void main(String[] args) {
		int num1 = 40;
		int num2 = 30;
		
		SubtractionMeth subtractionMeth = new SubtractionMeth();
		subtractionMeth.subtraction(num1, num2);
	}
}
