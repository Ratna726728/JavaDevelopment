package com.industryconstructorchain.example2;

public class Derived extends Base{

	Derived(){
		System.out.println("No-argument constructor of derived class");
	}
	Derived(String name){
		super(name);
		System.out.println("calling parameterized constructor of derived class");
	}
	public static void main(String[] args) {
		Derived derived = new Derived("test");
	}
}
