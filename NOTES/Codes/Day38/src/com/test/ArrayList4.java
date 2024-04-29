package com.test;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Mumbai");
		al.add("pune");
		al.add("Delhi");
		al.add(50);
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.remove("pune"));
		System.out.println("After removing :"+al);
		System.out.println(al.contains("pune"));
	}
}
