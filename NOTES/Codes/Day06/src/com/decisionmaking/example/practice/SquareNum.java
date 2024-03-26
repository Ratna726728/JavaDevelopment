package com.decisionmaking.example.practice;
// Write the program to print the square of any number.
public class SquareNum {
	public int Square(int a) {
		int result = a*a;
		System.out.println("The square of "+a+" is : "+result);
		return result;
	}
	public static void main(String[] args) {
		int num = 8;
		SquareNum squareNum = new SquareNum();
		if(num != 0) {
			squareNum.Square(num);
		}else {
			System.out.println("the number is 0");
		}
	}

}
