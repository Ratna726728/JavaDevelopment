package com.test;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("raj");
		linkedHashSet.add("virat");
		linkedHashSet.add(null);
		linkedHashSet.add(10);
		linkedHashSet.add("raj");// return false
		System.out.println(linkedHashSet);
	}
}
