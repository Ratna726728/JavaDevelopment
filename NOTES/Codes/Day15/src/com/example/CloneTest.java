package com.example;

public class CloneTest implements Cloneable{
	
	int x;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneTest cloneTest = new CloneTest();
		cloneTest.x=50;
		
		System.out.println("first Object is : "+cloneTest.x);//first Object is : 50
		
		
		Object test = cloneTest.clone();
		System.out.println("Second object is : "+test.toString());//Second object is : com.example.CloneTest@7852e922
		
		
	}

	//now to make output human understandable use toString method
	//after toString :  Second object is : CloneTest [x=50]
	@Override
	public String toString() {
		return "CloneTest [x=" + x + "]";
	}

}
