package com.practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();//16 internally size increase
		hs.add("10");//16*0.75 =12
		hs.add("20");
		hs.add("30");//13th element
		hs.add(null);
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
