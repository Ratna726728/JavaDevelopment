package com.multi;

public class MultithreadExample extends Thread{
	
	public void run() {
		for(int i=1 ;i<= 5; i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		MultithreadExample multi1 = new MultithreadExample();
		MultithreadExample multi2 = new MultithreadExample();
		
		multi1.start();
		multi2.start();
	}

}
