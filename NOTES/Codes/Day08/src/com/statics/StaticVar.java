package com.statics;
//within same class
public class StaticVar {
	
	static int a =10; //static global variable
	
	public static void main(String[] args) {
		
		StaticVar staticVar = new StaticVar();
		System.out.println("Direct calling");
		System.out.println("value of a : "+a);
		System.out.println();
		System.out.println("By using class name");
		System.out.println("value of a : "+ StaticVar.a);
		System.out.println();
		System.out.println("By using class object");
		System.out.println("value of a : "+staticVar.a);
	}

}

/* output
 * Direct calling
 * value of a : 10
 * 
 * By using class name
 * value of a : 10
 *
 * By using class object
 * value of a : 10
 */
