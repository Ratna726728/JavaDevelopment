package com.test;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("j");
		stack.push("k");
		stack.push("l");
		stack.push("m");
		
		System.out.println("original stack :"+stack);
		
		System.out.println(stack.search("X"));
	}

}
