package com.sync;

public class AccountDetails implements Runnable{

	Account account = new Account();
	
	@Override
	public void run() {
		for(int x =0; x<5 ; x++) {
			makeWithdrawal(500);
			if (account.getBalance() <= 0) {
				System.out.println("Account is overdrawn...");
			}
		}
	}
	
	private void makeWithdrawal(int amt) {
		if(account.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + "is going to withdraw = ");
		}
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		int bal = account.withdraw(amt);
		System.out.println(Thread.currentThread().getName() + "complete the withdrawal = "+bal);
	}

}
