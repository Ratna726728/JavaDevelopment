package com.strings.example;
//program to remove particular letter from the string.
public class RemoveLetter {

	public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	}
	public static void main(String[] args) {
		String str = "this is String";
		System.out.println(removeCharAt(str, 3));
	}
}
