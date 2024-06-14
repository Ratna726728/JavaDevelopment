package com.example;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(3);
		hs.add("ram");
		hs.add("pune");
		
		System.out.println("without duplicate: "+hs);
		
		//after adding duplicate
		hs.add(3);
		hs.add("pune");
		
		System.out.println("after adding duplicate: "+hs);
		
	}
}
