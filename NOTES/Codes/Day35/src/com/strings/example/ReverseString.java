package com.strings.example;
//program to reverse a string.
public class ReverseString {

	public static void main(String[] args) {
		String str = "This string";
		String rev = "";
		char c ;
		
		System.out.println("Original String:");
		System.out.println(str);
		
		System.out.println("Reverse string:");
		for(int i=0; i<str.length();i++) {
			c=str.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);
	}
}
