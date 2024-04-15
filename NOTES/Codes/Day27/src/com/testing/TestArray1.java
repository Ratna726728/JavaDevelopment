package com.testing;
//program to illustrate the use of declaration, instantiation,
//and initilization of a java array in single line.
public class TestArray1 {
	public static void main(String[] args) {
		//declaration, instantiation, initialization
		int arr[] = {10,20,30,40,50,60};
		
		//traversing of a array
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}
