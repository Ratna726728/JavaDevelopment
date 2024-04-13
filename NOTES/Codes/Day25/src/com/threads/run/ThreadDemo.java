package com.threads.run;

public class ThreadDemo implements Runnable {
	public static void main(String[] args) {
		ThreadDemo thread = new ThreadDemo();
		Thread t = new Thread(thread);
		t.start();
		
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}

}
