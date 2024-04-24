package com.notes.example;

import java.util.Scanner;

//Design the program to display a user provided message on console.
public class PrintMessage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your name:");
		String message = scanner.next();
		System.out.println("Hi My name is "+message);
	}
}
