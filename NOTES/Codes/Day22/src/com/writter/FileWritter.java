package com.writter;

import java.io.FileWriter;

public class FileWritter {
	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("E://JavaDevelopment//JavaDevelopment//NOTES//Test//writter.txt");
			file.write("hey there this is ratnadeep!");
			file.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Success...");
	}

}
