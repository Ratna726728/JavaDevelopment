package com.unbox;
//process of converting object into primitive's data type
public class Unboxing {
	
	public static void main(String[] args) {
		
		int a = 30;
		
		Integer j = new Integer(a); //autoboxing
		System.out.println("Autoboxing:: j : "+j);
		
		int c = j.intValue(); //unboxing
		System.out.println("Unboxing:: c : "+c);
	}

}
