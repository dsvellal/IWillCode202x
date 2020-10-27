package com.sample.test;

public class SimpleThread extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	
	public static void main(String [] args)
	{
		SimpleThread t1 = new SimpleThread();
		t1.start();
	}

}
