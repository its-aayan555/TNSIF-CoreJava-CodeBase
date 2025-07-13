package com.tnsif.day13.synchronization;


public class AccountThread extends Thread 
{

	
	// Data Members
	private Account acc;
	private int amt;
	
	
	// Para constructor 
	public AccountThread(Account acc, int amt) 
	{
		super();
		this.acc = acc;
		this.amt = amt;
		start();
	}
	
	
	// Overriding run() method
	@Override
	public void run()
	{
		
		try
		{
			acc.withdraw(amt);
		}
		
		catch(InsufficientBalanceException e)
		{
			System.err.println(e.getMessage());
		}
		
	}
	
	
}
