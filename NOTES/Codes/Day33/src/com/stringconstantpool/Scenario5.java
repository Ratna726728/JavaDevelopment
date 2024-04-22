package com.stringconstantpool;

public class Scenario5 {

	public static void main(String[] args) {
		String s1 = new String("Ratnadeep");
		String s2 = new String("Akola");
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//false
	}
}
