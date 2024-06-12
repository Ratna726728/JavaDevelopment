package com.genral;

import java.util.ArrayList;
import java.util.Collections;

//program to sort array in ascending order
public class SortingArray {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(25);
		arrList.add(15);
		arrList.add(12);
		arrList.add(4);
		
		System.out.println("Before Sorting: "+arrList);
		Collections.sort(arrList);
		System.out.println("After Sorting: "+arrList);
	}

}
