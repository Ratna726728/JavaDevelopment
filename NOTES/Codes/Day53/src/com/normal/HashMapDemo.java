package com.normal;

import java.util.HashMap;
import java.util.Map;

//Program 1- How to return map to method

public class HashMapDemo {
	
	public HashMap<Integer, String> addEmployee(){
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(10, "rohan");
		hashMap.put(20, "manish");
		hashMap.put(30, "amdocs");
		return hashMap;
	}
	
	public static void main(String[] args) {
		HashMapDemo hashMapDemo = new HashMapDemo();
		System.out.println("first way="+hashMapDemo.addEmployee());//1st way
		HashMap<Integer, String> hashMap = hashMapDemo.addEmployee();//2nd way
		System.out.println("second way= "+hashMap);
		Map<Integer, String> map= hashMapDemo.addEmployee();//3rd way
		System.out.println("third way= "+map);
	}
}
