package com.tnsif.day12.threads;


public class ChildThread extends Thread
{

	
	// Data Members
	int n;
	String msg;
	
	//	Parameter Constructor
	public ChildThread(int n, String msg) 
	{
		super();
		this.n = n;
		this.msg = msg;
	}
	
	// Method
	public void run() 
	{
		
		for(int i=1; i<=n; i++) 
		{
			try 
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) 
			{
				System.err.println(e.getMessage());
			}
			
			System.out.println(i + msg);
		}
		
	}
	
	
}
