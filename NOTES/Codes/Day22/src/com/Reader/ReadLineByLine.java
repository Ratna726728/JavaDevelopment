package com.Reader;

import java.io.FileInputStream;
import java.util.Scanner;

public class ReadLineByLine {
	public static void main(String[] args) {
		
		try {
			//the file to be opened for reading
			FileInputStream fileInputStream = new FileInputStream("E://JavaDevelopment//JavaDevelopment//NOTES//Test//Reader.txt");
			Scanner scanner = new Scanner(fileInputStream);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
