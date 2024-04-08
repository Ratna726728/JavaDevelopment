package com.possibilities;

public class OnlyTry {
	public static void main(String[] args) {
		
		//scenario - 1 only try block.
		//not allowed as it will throw syntax error.
//		try {
//			int a =20;
//		}
		
		//scenario - 2 try and catch block
		//allowed
//		try {
//			int a = 10/0;
//		}catch(Exception e) {
//			System.out.println("success");
//		}
		//output:
//		success

		//scenario - 3 a try block with finally block
		//allowed
//		try {
//			int a = 10/0;
//		}finally {
//			System.out.println("do this");
//		}
		//output
//		Exception in thread "main" do this
//		java.lang.ArithmeticException: / by zero
//			at com.possibilities.OnlyTry.main(OnlyTry.java:23)
	
		//scenario - 4 a try block with catch and finally block
		//allowed
//		try {
//			int a =10/0;
//		}catch(Exception e) {
//			System.out.println("Done");
//		}finally {
//			System.out.println("in finally block");
//		}
//		output:
//			Done
//			in finally block
		
		//scenario - 5 one try block two catch block
		//allowed
//		try {
//			int a =10/0;
//		}catch(ArithmeticException e1) {
//			System.out.println("no worries i will handle exception");
//		}catch(Exception e) {
//			System.out.println("If my sub class wont do then i will do definetly");
//		}
		//output
		//no worries i will handle exception
		
		
	}
	

}
