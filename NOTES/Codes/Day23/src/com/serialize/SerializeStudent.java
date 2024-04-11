package com.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeStudent {
	public static void main(String[] args) {
		Student student = new Student();
		Scanner scan = new Scanner(System.in);
		//setting the value for variables in student class.
		System.out.println("Enter the First Name: ");
		student.setFirstname(scan.nextLine());
		System.out.println("Enter the Last Name: ");
		student.setLastname(scan.nextLine());
		System.out.println("Enter the city name: ");
		student.setCity(scan.nextLine());
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("E://JavaDevelopment//JavaDevelopment//NOTES//Test//Serial.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);
			fileOutputStream.close();
			objectOutputStream.close();
			System.out.println("Serialization is done....");
		}catch(Exception e) {
			e.printStackTrace();	
		}	
	}
}
