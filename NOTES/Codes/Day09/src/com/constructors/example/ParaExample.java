package com.constructors.example;

import java.util.Scanner;

public class ParaExample {

	int empId;
	String empName;
	int empSalary;
	
	public ParaExample(int id, String name, int sal) {
		empId = id;
		empName = name;
		empSalary = sal;
		System.out.println("Employee ID : "+empId);
		System.out.println("Emoloyee Name : "+empName);
		System.out.println("Employee Salary : "+ empSalary);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the details:");
		System.out.print("ID : ");
		int id = scanner.nextInt();
		System.out.print("Name : ");
		String name = scanner.next();
		System.out.print("Salary : ");
		int sal = scanner.nextInt();
		ParaExample paraExample = new ParaExample(id, name, sal);
	}
}
