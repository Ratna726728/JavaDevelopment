package com.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialStudent {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("E://JavaDevelopment//JavaDevelopment//NOTES//Test//Serial.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Object object = objectInputStream.readObject();
			Student student = (Student) object;
			System.out.println(student.getFirstname());
			System.out.println(student.getLastname());
			System.out.println(student.getCity());
			fileInputStream.close();
			objectInputStream.close();	
			System.out.println("Deserialization done....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
