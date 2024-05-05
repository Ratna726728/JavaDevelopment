package com.test;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hashset = new HashSet();
		hashset.add("ram");
		hashset.add("shyam");
		hashset.add(null);
		hashset.add(10);
		hashset.add("ram");
		System.out.println(hashset);
	}
}
