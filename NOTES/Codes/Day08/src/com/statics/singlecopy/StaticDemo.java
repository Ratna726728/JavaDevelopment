package com.statics.singlecopy;

public class StaticDemo {
	int a =5;
	static int b =5;
	
	public static void main(String[] args) {
		
		StaticDemo staticDemo = new StaticDemo();
		System.out.println("Non static : "+staticDemo.a++);
		System.out.println("Static : "+staticDemo.b++);
		
		StaticDemo staticDemo1 = new StaticDemo();
		System.out.println("Non static : "+staticDemo1.a++);
		System.out.println("Static : "+staticDemo1.b++);
		
		StaticDemo staticDemo2 = new StaticDemo();
		System.out.println("Non static : "+staticDemo2.a++);
		System.out.println("Static : "+staticDemo2.b++);
		
		StaticDemo staticDemo3 = new StaticDemo();
		System.out.println("Non static : "+staticDemo3.a++);
		System.out.println("Static : "+staticDemo3.b++);
	}

}
