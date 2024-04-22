package com.stringconstantpool;

public class Scenario6 {

	public static void main(String[] args) {
		String s1 = "RAJ";
		String s2 = "raj";
		
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//false
	}
}
