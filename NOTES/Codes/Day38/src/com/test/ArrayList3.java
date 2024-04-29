package com.test;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("10");
		al.add("20");
		al.add("30");
		
		for(String str : al) {
			System.out.print(" "+str);
		}
	}
}
