package com.test;

import java.util.Vector;

public class VectorDemo1 {
	
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("manish");
		vector.add("abhishek");
		vector.add("sumit");
		vector.add("Rajesh");
		System.out.println(vector);
		
		while(vector.contains("sumit")) {
			vector.remove("sumit");
		}
		System.out.println("new vector is :"+vector);
	}

}
