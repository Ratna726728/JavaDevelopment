package com.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ram", "patil");
		map.put("manish", "desktop");
		
		map.forEach((k,v) -> System.out.println("Key = "+k+ ",Value = "+v));
	}
}
