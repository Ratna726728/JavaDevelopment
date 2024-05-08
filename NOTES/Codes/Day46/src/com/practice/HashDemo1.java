package com.practice;

import java.util.HashSet;

public class HashDemo1 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		for(int j : hs) {
			System.out.println(j);
		}
	}
}
