package com.operators.example;

public class ShiftExample {

	public static void main(String[] args) {
		int a = 10;
		
		System.out.println(a<<2); //10*2^2 == 10*4 = 40
		System.out.println(a<<3); //10*2^3 == 10*8 = 80
		System.out.println(a>>2); //10/2^2 == 10/4 = 2
		System.out.println(a>>3); //10/2^3 == 10/8 = 1
	}
}
