package com.tnsif.day12.multithreading;


public class Demo 
{

	
	public static void main(String[] args) 
	{
		
		
		Thread myThread = new ThreadLifeCycleDemo();
		System.out.println("Before Runnable State Thread is Alive");
		myThread.isAlive();
		
		myThread.start();
		
		try 
		{
			Thread.sleep(450);
		}
		
		catch(InterruptedException e) 
		{
			System.err.println(e.getMessage());
		}

		System.out.println("After Completion Execution, it is alive or not ? " + myThread.isAlive());

		
	}
	
	
}
