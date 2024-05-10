package com.test;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		//put() method.
		hashMap.put(10, "Hitesh");
		hashMap.put(20, "Raj");
		
		System.out.println(hashMap);//{20=Raj, 10=Hitesh}
		//size() method
		System.out.println(hashMap.size());//2
		//clone() method
		Object obj = hashMap.clone();
		System.out.println(obj);//{20=Raj, 10=Hitesh}
		//clear() method
		hashMap.clear();
		System.out.println(hashMap);//{}
		
	}
}
