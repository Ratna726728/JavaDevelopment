package com.stringconstantpool;

public class Scenario7 {

	public static void main(String[] args) {
		String s1 = new String("RAJ");
		String s2 = new String("raj");
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//false
	}
}
