package com.test;

import java.util.LinkedHashMap;

public class Test {
	
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		System.out.println(lhm.size());
	
		lhm.put(10, "raju");
		lhm.put(20, "sham");
		lhm.put(30, "baburao");
		
		System.out.println(lhm);
		lhm.put(10, "raju"); // duplicates are not allowed.
		System.out.println(lhm);
		System.out.println(lhm.size());
		System.out.println(lhm.containsKey(20));//for key
		System.out.println(lhm.containsValue("raju"));//for value
		//output
//		0
//		{10=raju, 20=sham, 30=baburao}
//		{10=raju, 20=sham, 30=baburao}
//		3
//		true
//		true
	}

}
