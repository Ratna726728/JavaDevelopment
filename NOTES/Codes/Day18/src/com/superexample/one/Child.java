package com.superexample.one;

public class Child extends Parent{

	int x = 25;
	
	public void test() {
		int x = 30;
		
		//scenario - 1
		Parent p = new Parent();
		System.out.println("Parent class x variable="+p.x);
		
		//scenario - 2
		System.out.println("Immediate super class of child class x variable="+ super.x);
	}
}
