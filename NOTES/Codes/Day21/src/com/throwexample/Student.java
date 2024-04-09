package com.throwexample;

import java.util.Scanner;

public class Student {
	public static void validate(int age) {
		if(age<18) {
			throw new  ArithmeticException("Student is not eligible for vote");
		}else {
			System.out.println("Student is eligible to vote!!");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age of Student :");
		int stuAge = scanner.nextInt();
		validate(stuAge);
	}

}
