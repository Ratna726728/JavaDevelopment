package com.customexception;

public class TestMain {
	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("Current balance : "+account.balance());
		account.withdraw(3500);
		System.out.println("Current balance : "+account.balance());
	}

}
