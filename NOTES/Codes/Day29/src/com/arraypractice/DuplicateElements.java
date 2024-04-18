package com.arraypractice;
//program to print duplicate elements in an array.
public class DuplicateElements {

	public static void main(String[] args) {
		int arr[]= {14,56,84,24,14,56};
		
		//finding duplicate element
		System.out.println("Duplicate elements are: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
