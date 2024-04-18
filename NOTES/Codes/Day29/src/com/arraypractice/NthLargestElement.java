package com.arraypractice;
//program to find the nth largest element in an array.
import java.util.Scanner;

public class NthLargestElement {
	public static void main(String[] args) {

		int arr[]= {36,87,24,17,78,07};
		int size = arr.length;
		int temp=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the index number between 0 to "+(size-1)+" range: ");
		int element_index=scanner.nextInt();
		
		if(element_index < size) {
			//let's sort elements in ascending order first
			for(int i=0; i<size; i++) {
				for(int j=i+1; j<size; j++) {
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println("New sorted array :");
			for(int i=0; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			//find the element at specific index
			int element = arr[element_index];
			System.out.println("The Nth largest element at index "+element_index+" is : "+ element);
		}else {
			System.out.println("Invalid index...");
		}
	}
}
