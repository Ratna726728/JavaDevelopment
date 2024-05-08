package com.practice;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);//duplicates are not allowed.
		System.out.println(hs);
		
		for(Object j: hs) {
			System.out.println(j);
		}
		
	}
}
