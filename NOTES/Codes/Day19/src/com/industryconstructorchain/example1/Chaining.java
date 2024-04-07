package com.industryconstructorchain.example1;

public class Chaining {
	
	Chaining(){
		this(5);
		System.out.println("This is default constructor");
	}
	
	Chaining(int x){
		this("Java");
		System.out.println(x);
	}
	Chaining(String str){
		System.out.println(str);
	}
	public static void main(String[] args) {
		Chaining chaining = new Chaining();
	}

}
