package com.test;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("20", "Akola");
		treeMap.put("50", "Mumbai");
		treeMap.put("10", "Nagpur");
//		System.out.println(treeMap);
		Set<String> s = treeMap.keySet();
		for(String i: s) {
			System.out.println("key="+i);
			System.out.println("value="+treeMap.get(i));
		}
	}
}
