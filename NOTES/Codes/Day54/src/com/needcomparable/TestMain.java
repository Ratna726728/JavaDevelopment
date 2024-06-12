package com.needcomparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestMain {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "ram",9000));
		al.add(new Employee(102, "Mahesh",6000));
		al.add(new Employee(103, "vinay",5000));
		
		//Collections.sort(al);
		//Error:: The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Employee>)
		
		//here, We are getting error at Collections.sort(al);
		//to resolve this issue, need to implement comparable<Employee> into 
		//Employee class.
	}

}
