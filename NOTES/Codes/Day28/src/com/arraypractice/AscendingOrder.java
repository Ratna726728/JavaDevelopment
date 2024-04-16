package com.arraypractice;
//program to sort the elements in an array in ascending order
public class AscendingOrder {
	public static void main(String[] args) {
		int arr[] = {24,56,84,07,05,95,58};
		int temp= 0;
		
		System.out.println("Elements in original array:");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Original array after sorting in asceding order:");
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
