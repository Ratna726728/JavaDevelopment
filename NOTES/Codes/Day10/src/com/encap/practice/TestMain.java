package com.encap.practice;

import java.util.Scanner;

public class TestMain {
	
	public static void getStudentDetails() {
		// creating a scanner class object for taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the student ID : ");
		int id = scanner.nextInt();
		System.out.println("Enter the student First Name : ");
		String fname = scanner.next();
		System.out.println("Enter the student Last Name : ");
		String lname = scanner.next();
		System.out.println("Enter the student city Name : ");
		String city = scanner.next();
		
		//creating Student class object
		Student student = new Student();
		
		// setting values to student variables
		student.setId(id);
		student.setFirstName(fname);
		student.setLastName(lname);
		student.setCity(city);
		
		//getting student details
		System.out.println("Student ID : " + student.getId());
		System.out.println("Student First Name : " + student.getFirstName());
		System.out.println("Student Last Name : " + student.getLastName());
		System.out.println("Student City Name : " + student.getCity());
		
	}
	
	public static void main(String[] args) {
		getStudentDetails();
		
	}

}
