package com.tnsif.day12.runnable;


public class RunnableDemo 
{

	
	public static void main(String[] args) 
	{
	
		
		Runnable r = new UsingRunnable(10, 1, " Hi");
		
		Thread t1=new Thread(r);
		t1.start();
		
		// Runnable r1=() -> System.out.println("Runnable with lamba expression !");
		// new Thread(r1).start();
		
		

	}

}
