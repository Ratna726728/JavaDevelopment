package com.decisionmaking.example.practice;
//write a program  to check whether  year is leap year or not. (If else stmt).
public class LeapYear {
	
	public static void main(String[] args) {
		
		int year = 2024;
		
		if(((year % 4 ==0)&& (year % 100 !=0)) ||(year % 400 == 0)) {
			System.out.println("Its a leap year");
		}else {
			System.out.println("Its not a leap year");
		}
	}

}