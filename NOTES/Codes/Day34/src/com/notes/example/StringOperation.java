package com.notes.example;

public class StringOperation {

	public static void main(String[] args) {
		String str = "MesSagE";
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.compareTo("message"));
		System.out.println(str.concat("from me"));
		System.out.println(str.hashCode());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}
}
