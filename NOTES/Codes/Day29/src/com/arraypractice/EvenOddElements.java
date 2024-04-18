package com.arraypractice;
//program to print the even and odd elements from an array
public class EvenOddElements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		//Let's print even and odd elements
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.println("Element at index "+i+" is "+arr[i]+" Even number.");
			}else {
				System.out.println("Element at index "+i+" is "+arr[i]+" odd number.");
			}
		}
	}
}
