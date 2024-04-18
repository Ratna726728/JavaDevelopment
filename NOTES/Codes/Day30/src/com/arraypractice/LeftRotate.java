package com.arraypractice;
//program to left rotate the elements of array.
public class LeftRotate {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n = 3;
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int j=0;j<n;j++) {
			int k,first;
			first=arr[0];

			for(k=0;k<arr.length-1;k++) {
				arr[k]=arr[k+1];
			}
			arr[k]=first;
		}
		System.out.println();
		System.out.println("Array after rotating:");
		for(int l=0;l<arr.length;l++) {
			System.out.print(arr[l]+" ");
		}

	}

}
