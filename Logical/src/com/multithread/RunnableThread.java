package com.multithread;

public class RunnableThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My Custom Thread calling......");
	}

	public static void main(String[] args) {
		RunnableThread rt=new RunnableThread();
		Thread th=new Thread(rt);
		th.start();
		System.out.println("Main Thread calling........");
	}
}
