package com.stringconstantpool;

public class Scenario2 {

	public static void main(String[] args) {
		String s1 = "ratnadeep";
		String s2 = new String("Akola");
		s2=s1;
		System.out.println(s1 == s2);//true
		System.out.println(s1.equals(s2));//true
	}
}
