package com.arraypractice;
//program to print elements of array
public class PrintElements {

	public static void main(String[] args) {
		int arr[] = {15,25,74,84,05,25};
		
		//printing the size of an array
		System.out.println("size of arr[]:" + arr.length);
		
		//printing the array elements
		System.out.println("Elements in arr[] : ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
