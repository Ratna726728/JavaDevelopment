package com.arraypractice;
//program to print the elements of an array in reverse order.
public class ReverseOrderElement {
	public static void main(String[] args) {
		int arr[]= {90,34,23,100,56};
		System.out.println("the original array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("The reverse order array: ");
		for(int j=arr.length-1; j>=0; j--) {
			System.out.print(arr[j]+" ");
		}
	}

}
