package com.strings.example;
//convert the given string into upper case and then lower case
public class UpperLower {

	public static void main(String[] args) {
		String str = "Need tO dO UPPER case LOWEr casE";
		System.out.println("ORIGINAL STRING:");
		System.out.println(str);
		System.out.println();
		
		System.out.println("UPPER CASE:");
		System.out.println(str.toUpperCase());
		System.out.println();
		
		System.out.println("LOWER CASE:");
		System.out.println(str.toLowerCase());
	}
}
