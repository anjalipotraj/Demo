package com.multithread;

public class MyThread extends Thread {

	
	@Override
	public void run() {
		for(int i=1;i<10;i++) {
		System.out.println("My Custom Thread calling....."+"I="+i);
		}
	}
	
	public static void main(String[] args) {
		MyThread mh=new MyThread();
		System.out.println("Main Thread calling....");
		mh.start();
		
		
	}
	
}
