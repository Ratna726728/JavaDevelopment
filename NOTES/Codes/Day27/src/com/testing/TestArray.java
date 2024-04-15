package com.testing;
//program to illustrate how to declare, instantiate, initialize
//an traverse array in Java array.
public class TestArray {
	public static void main(String[] args) {
		//delare and instantiate an array
		int arr[] = new int[5];
		
		//initialization of an array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//traversing of an array
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}
