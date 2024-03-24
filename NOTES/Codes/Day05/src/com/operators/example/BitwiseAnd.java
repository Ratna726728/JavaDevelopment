package com.operators.example;

public class BitwiseAnd {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		
		System.out.println(x < y & x < z);
		//10<20 == True, 10 < 30 == True i.e. T & T == T
		
		System.out.println(x > y & x < z);
		//10 > 20 == false, 10 < 30 == true i.e. F & T == F
	}
}

