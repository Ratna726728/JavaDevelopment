package com.stringconstantpool;

public class Scenario4 {

	public static void main(String[] args) {
		String s1 = "Ratnadeep";
		String s2 = new String("Akola");
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//false
	}
}
