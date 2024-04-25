package com.strings.example;
//program to search letter in an string
public class SearchWord {

	public static char getCharFromString(String str, int index) {
	        return str.charAt(index); 
	}
	public static void main(String[] args) {
		String str = "This is a word string";
		int index = 6;
		
		char ch = getCharFromString(str, index);
		System.out.println("Character from " + str+ " at index " + index + " is " + ch);
	}
}
