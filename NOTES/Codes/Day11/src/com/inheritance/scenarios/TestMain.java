package com.inheritance.scenarios;

public class TestMain {
	
	public static void main(String[] args) {		
		//System.out.println("Scenarion 1 :");
		//TestOne test1 = new TestOne();
		//System.out.println();
		//System.out.println(test1.a);
		//System.out.println(test1.b);
		//// System.out.println(test1.c); 
		//// System.out.println(test1.d);
		//test1.x1();
		//test1.x2();
		//test1.x3();
		//test1.x4();
		
		/*
		 * output
		 * Scenarion 1 :

			10
			20
			Hi, Hello! 
			Hi There!
		 */
		
		//System.out.println();
		//System.out.println("Scenario 2 :");
		//TestTwo test2 = new TestTwo();
		//System.out.println();
		//

		/*
		 * output
		 * Scenario 2 :

			10
			20
			40
			50
			Hi, Hello!
			Hi There!
			Let's go out.
			cool!
		 */
		
		//System.out.println();
		//System.out.println("Scenario 3 :");
		//TestOne test1 = new TestTwo();
		//System.out.println();
		//System.out.println(test1.a);
		//System.out.println(test1.b);
		////System.out.println(test1.c); 
		////System.out.println(test1.d);
		//test1.x1();
		//test1.x2();
		////test1.x3();
		////test1.x4();
		
		/*
		 * Scenario 3 :

			10
			20
			Hi, Hello!
			Hi There!
		 */
		
//		System.out.println();
//		System.out.println("Scenario 4 :");
//		TestOne test1 = new TestOne();
//		TestTwo test2 = new TestTwo();
//		test1 = test2;
//		System.out.println();
//		System.out.println(test1.a);
//		System.out.println(test1.b);
//		//System.out.println(test1.c); 
//		//System.out.println(test1.d);
//		test1.x1();
//		test1.x2();
//		//test1.x3();
//		//test1.x4();
		
		/* output
		 * Scenario 4 :

			10
			20
			Hi, Hello!
			Hi There!
		 */
		System.out.println();
		System.out.println("Scenario 5 :");
		TestOne test1 = new TestTwo();
		TestTwo test2 = new TestTwo();
		test2 = (TestTwo) test1;
		System.out.println();
		System.out.println(test2.a);
		System.out.println(test2.b);
		System.out.println(test2.c); 
		System.out.println(test2.d);
		test2.x1();
		test2.x2();
		test2.x3();
		test2.x4();
		
		/*
		 * Scenario 5 :

			10
			20
			40
			50
			Hi, Hello!
			Hi There!
			Let's go out.
			cool!
		 */
	}

}
