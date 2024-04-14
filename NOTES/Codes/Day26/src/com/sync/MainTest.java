package com.sync;

public class MainTest {

	public static void main(String[] args) {
		AccountDetails accountDetails = new AccountDetails();
		Thread thread1 = new Thread(accountDetails);
		Thread thread2 = new Thread(accountDetails);
		thread1.setName("Raj");
		thread2.setName("Sam");
		thread1.start();
		thread2.start();
	}
}
