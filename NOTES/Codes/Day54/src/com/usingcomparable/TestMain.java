package com.usingcomparable;

import java.util.ArrayList;
import java.util.Collections;


public class TestMain {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "ram",9000)); 
		al.add(new Employee(102, "Mahesh",6000));
		al.add(new Employee(103, "vinay",5000));
		
		Collections.sort(al);
		 
		for(Employee emp :al) {
			System.out.println("id : "+emp.getId()+" name : "+emp.getName()+ " salary : "+emp.getSalary());
		}
	}
}
