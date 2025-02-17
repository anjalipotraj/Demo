package com.join;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread 1 Is running.......");
		display();
		//System.out.println("Current Thread"+Thread.currentThread().getName());
	}

	 public void display() {
	        System.out.println("Thread 2 Called...");
	        for(int i=1;i<6;i++) {
	        	System.out.println("value of I="+i);
	        }
	        System.out.println("Current Thread"+Thread.currentThread().getName());
	    }
	public static void main(String[] args) {
		MyThread th1=new MyThread();
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyThread th2=new MyThread();
		th2.start();
		System.out.println("Main Thread is running........");
	}
}
