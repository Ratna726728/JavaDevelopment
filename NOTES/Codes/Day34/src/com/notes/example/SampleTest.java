package com.notes.example;
//design the program to counting space into string
public class SampleTest {

	public static void main(String[] args) {
		String str = "My name is raj and i am from India";
		
		int counter = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == ' ') {
				counter++;
			}
		}
		System.out.println("Total spaces are : "+counter);
	}
}
