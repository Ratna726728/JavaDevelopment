package com.example;

public class GetClass {
	public static void main(String[] args) {
		GetClass getClass = new GetClass();
		
		System.out.println(getClass.getClass().getName());//package name
		System.out.println(getClass.getClass().getSimpleName());// class name
	}

}
