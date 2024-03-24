package com.operators.example;

public class TernaryExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		int num1 = (x>y)?x:y;
		//if(x>y)==> 10>20 if true then it will print 10 else 20.
		System.out.println(num1);//20
		
		int num2 = (x<y)?x:y;
		//if(x<y)==> 10<20 if true then it will print 10 else 20.
		System.out.println(num2);//10
	}
}
