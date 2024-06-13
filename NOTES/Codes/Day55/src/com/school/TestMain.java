package com.school;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain {
	
	public static void main(String[] args) {
		ArrayList<Student> arrList = new ArrayList<Student>();
		arrList.add(new Student(101,"manish", 8999));
		arrList.add(new Student(102,"rob", 10000));
		arrList.add(new Student(103,"vikas", 4000));
		
		Collections.sort(arrList, new NameComparator());
		
		for(Student student : arrList) {
			System.out.println(" id : "+student.getId()+ " name : "+student .getName()+ " salary : "+student.getSalary());
		}
	}

}
