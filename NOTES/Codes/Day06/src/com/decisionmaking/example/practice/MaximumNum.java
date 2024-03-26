package com.decisionmaking.example.practice;
//.write a program to find out maximum number among three number(if else if ladder statement)
public class MaximumNum {
	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		int c = 20;
		
		if(a>b && a>c) {
			System.out.println("Greatest number is :"+a);
		}else if(b>a && b>c) {
			System.out.println("Greatest number is :"+b);
		}else if(c>a && c>b) {
			System.out.println("Greatest number is :"+c);
		}else {
			System.out.println("invalid");
		}
	}

}
