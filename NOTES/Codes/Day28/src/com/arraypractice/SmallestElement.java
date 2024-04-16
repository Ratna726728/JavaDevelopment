package com.arraypractice;
//program to find the smallest element in an given array.
public class SmallestElement {
	
	public static void main(String[] args) {
	
		int arr[] = {10,83,07,45,32,01};
		int element = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<element) {
				element = arr[i];
			}
		}
		System.out.println("Smallest Element: "+element);
	}

}
