package com.decisionmaking.example.practice;
//Write a program to swap the two numbers.
public class SwapTwoNum {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = 0;
		
		System.out.println("Before Swapping:");
		System.out.println("Value of a : " +a);
		System.out.println("Value of b : " +b);
		
		System.out.println();
		System.out.println("After Swapping:");
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Value of a : "+ a);
		System.out.println("Value of b : "+ b);
	}

}
