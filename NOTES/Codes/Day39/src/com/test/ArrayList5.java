package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("shubham");
		al.add("rahul");
		al.add("laxman");
		al.add("snehal");
		al.add("kishor");
		al.add("yogesh");
		al.add("piyush");
		al.add("raj");
		al.add("Akash");
		
		Collections.sort(al);
		
		System.out.println(al);
	}
}
