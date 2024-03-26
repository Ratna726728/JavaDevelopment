package com.test;
//write a program  to print all even number from 50 to 75.
public class FindEven {

	public static void main(String[] args) {
		int num =50;
		System.out.println("Even Numbers are: ");
		while(num<=75) {
			
			if(num % 2 ==0) {
				
				System.out.println(num);
			}
			num++;
		}
	}
}
