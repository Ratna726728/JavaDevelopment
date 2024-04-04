package com.test.override;

public class B extends A{

	@Override
	void m1() {
		System.out.println("class B - m1 method");
	}
	void m2() {
		System.out.println("class B - m2 method");
	}
}
