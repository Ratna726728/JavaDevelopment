package com.test;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		System.out.println(arrayList);
		//adding duplicate element
		arrayList.add(10);
		//adding heterogenous element
		arrayList.add("kolkata");
		//adding null 
		arrayList.add(null);
		System.out.println(arrayList);
	}
}
