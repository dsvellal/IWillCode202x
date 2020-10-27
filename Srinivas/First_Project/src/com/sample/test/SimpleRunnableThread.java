package com.sample.test;

public class SimpleRunnableThread implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	
	public static void main(String [] args)
	{
		SimpleRunnableThread t1 = new SimpleRunnableThread();
		Thread t = new Thread(t1);
		t.start();
		
	}

}
