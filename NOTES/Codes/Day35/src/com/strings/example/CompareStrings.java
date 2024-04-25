package com.strings.example;
//program to compare two strings
public class CompareStrings {

	public static void main(String[] args) {
		//different strings
		String str1 = "This string";
		String str2 = "new String";
		//equal strings
		String str3 = "hello";
		String str4 = "hello";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str3.compareTo(str4));
		
	}
}
