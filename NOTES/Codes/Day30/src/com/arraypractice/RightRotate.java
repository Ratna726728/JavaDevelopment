package com.arraypractice;
//program to right rotate the element in an array
public class RightRotate {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};     
		//n determine the number of times an array should be rotated.    
		int n = 3;    

		//Displays original array    
		System.out.println("Original array: ");    
		for (int i = 0; i < arr.length; i++) {     
			System.out.print(arr[i] + " ");     
		}      

		//Rotate the given array by n times toward right    
		for(int j = 0; j < n; j++){    
			int k, last;    
			//Stores the last element of array    
			last = arr[arr.length-1];    

			for(k = arr.length-1; k > 0; k--){    
				//Shift element of array by one    
				arr[k] = arr[k-1];    
			}    
			//Last element of array will be added to the start of array.    
			arr[0] = last;    
		}    

		System.out.println();    

		//Displays resulting array after rotation    
		System.out.println("Array after right rotation: ");    
		for(int l = 0; l< arr.length; l++){    
			System.out.print(arr[l] + " ");    
		}    

	}

}
