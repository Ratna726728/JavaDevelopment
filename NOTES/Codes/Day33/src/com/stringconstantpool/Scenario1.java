package com.stringconstantpool;

public class Scenario1 {

	public static void main(String[] args) {
		String s1="ratnadeep";
		String s2= new String("ratnadeep");
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
	}
}
