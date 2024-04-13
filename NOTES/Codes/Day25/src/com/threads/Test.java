package com.threads;

public class Test extends Thread{

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.getId());
		System.out.println(test.getName());
		System.out.println(test.getPriority());
		System.out.println(test.getState());
	}
}
