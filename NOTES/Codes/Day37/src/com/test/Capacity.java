package com.test;

import java.util.ArrayList;

public class Capacity {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		System.out.println(al);
		//lets add one more element to check the 
		//growable nature of ArrayList
		al.add(11);
		System.out.println(al);
	}
}
