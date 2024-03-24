package com.method.operators.code;
//Write the Java Program to calculate total of five subject marks and average of it.
public class AverageResult {
	
	public void average(int a, int b, int c, int d, int e) {
		int result = (a+b+c+d+e)/5;
		System.out.println("the average is :"+result);
	}
	
	public static void main(String[] args) {
		int english = 70;
		int math = 78;
		int chemistry = 80;
		int physics = 74;
		int biology = 83;
		
		AverageResult averageResult = new AverageResult();
		averageResult.average(english, math, chemistry, physics, biology);
	}

}
