package com.tnsif.day12.multithreading;


public class ThreadLifeCycleDemo extends Thread
{
	
	
	public void run() 
	{ 
		
		System.out.println("Inside run(), thread is alive or not ? \n" + this.isAlive());
		int num = 0;
		
		while(num<4) 
		{
			num++;
			System.out.println("Num " + num);
		}
		
		try 
		{
			sleep(1000);
			System.out.println("In not runnabe state, thread is alive or not ? \n" + this.isAlive());
		}
		
		catch(InterruptedException e) 
		{
			System.err.println("Thread is interrupted " + e.getMessage());
		}
	
	}

		
}
