package com.test;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		for(int i=1;i<=10;i++) {
			vector.addElement(i);
		}
		System.out.println(vector);
	}
}
