package com.statics;
//within different class
public class StaticVar1 {
	public static void main(String[] args) {
		TestVar testVar = new TestVar();
		
		System.out.println("using class name");
		System.out.println("value of a : "+ TestVar.a);
		System.out.println();
		System.out.println("using object of class");
		System.out.println("value of a : "+ testVar.a);
	}

}
//output
//using class name
//value of a : 30
//
//using object of class
//value of a : 30

