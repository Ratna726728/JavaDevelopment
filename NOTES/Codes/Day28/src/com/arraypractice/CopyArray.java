package com.arraypractice;
//program to copy all elements of one array into another array.
public class CopyArray {
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		//new array
		int arr2[]= new int[arr1.length];
		
		//to copy all elements from arr1 to arr2
		for(int i=0; i<arr1.length; i++) {
			arr2[i] =arr1[i];
		}
		//printing both arrays 
		System.out.println("arr1 elements :");
		for(int i =0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		
		System.out.println("arr2 elements :");
		for(int j =0; j<arr2.length; j++) {
			System.out.print(arr2[j]+ " ");
		}
	}

}
