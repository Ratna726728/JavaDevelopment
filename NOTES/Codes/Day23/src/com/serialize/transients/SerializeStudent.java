package com.serialize.transients;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeStudent {
	
	public static void main(String[] args) {
		Student student = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		student.setFirstname(scan.nextLine());
		System.out.println("Enter the last name : ");
		student.setLastname(scan.nextLine());
		System.out.println("Enter the salary : ");
		student.setSalary(scan.nextInt());
		
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
