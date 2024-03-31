package com.inheritance;

public class TestMain extends SimpleInherit {

	public static void main(String[] args) {
		TestMain testMain = new TestMain();
		
		System.out.println("Train Details :");
		System.out.println(testMain.passenger_name);
		System.out.println(testMain.train_name);
		System.out.println(testMain.train_num);
		System.out.println(testMain.coach_num);
		System.out.println(testMain.seat_num);
		
	}
}
