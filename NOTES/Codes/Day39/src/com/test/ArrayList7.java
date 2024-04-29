package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList7 {
	public static void main(String[] args) {
		ArrayList<Employee7> arrayList = new ArrayList<Employee7>();
		
		arrayList.add(new Employee7(20,"ram","25000"));
		arrayList.add(new Employee7(30, "ramesh","15000"));
		
		//by using iterator
		Iterator<Employee7> itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			System.out.println("employee list: "+itr.next());
		}
		
		//by using for each loop
		for(Employee7 e1: arrayList) {
			System.out.println("data is :"+e1);
		}
	}
}
