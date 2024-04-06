package com.thisexample.one;

public class Child extends Parent{
	int x = 25;
	void test() {
	
		int x = 30;
		Child c = new Child();
		
		//scenario - 1
		System.out.println("By creating objects="+c.x);
		//scenario - 2
		System.out.println("By using this keyword="+ this.x);
	}

}
