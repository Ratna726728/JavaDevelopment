package com.test;

import java.util.Arrays;
import java.util.List;

//program to ArrayList using for loop
public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		for(int i = 0; i< numbers.size(); i++) {
			System.out.println(numbers.get(i)+" ");
		}
	}
}
