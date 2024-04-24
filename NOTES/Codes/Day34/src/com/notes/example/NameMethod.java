package com.notes.example;

import java.util.Scanner;

//design the method to return the name.
public class NameMethod {

	private static String getName(String name) {
		return name;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the Name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String s =getName(name);
		System.out.println(s);
	}
}
