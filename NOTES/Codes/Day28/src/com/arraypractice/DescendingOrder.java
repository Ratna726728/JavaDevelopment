package com.arraypractice;
//program to sort the elements of an array in Descending order
public class DescendingOrder {
	
	public static void main(String[] args) {
		int arr[]= {63,68,56,93,07};
		int temp=0;
		
		System.out.println("Elements in original array:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		//sorting
		for(int i=0; i<arr.length ; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements after sorting in descending order:");
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
