package com.industryconstructorchain.example2;

public class Base {
	String name;
	Base(){
		this("");
		System.out.println("No-arguement constructor of base class...");
	}
	Base(String name){
		this.name = name;
		System.out.println("calling parameterized constructor of base class..");
	}

}
