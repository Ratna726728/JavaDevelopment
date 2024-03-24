package com.method.operators.code;
//Write the java program to design static method for multiplication of two number
//which returns int value to that method and result should be print into main method.
public class MultiplicationMeth {
	public static int multiplication(int a, int b) {
		int mult = a*b;
		System.out.println("Multiplication of both variables is :"+mult);
		return mult;
	}
	public static void main(String[] args) {
		int num1 =40;
		int num2 =3;
		
		multiplication(num1, num2);
	}

}
