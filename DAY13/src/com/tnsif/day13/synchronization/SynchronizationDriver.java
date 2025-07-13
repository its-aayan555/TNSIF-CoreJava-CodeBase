package com.tnsif.day13.synchronization;


public class SynchronizationDriver 
{

	
	public static void main(String[] args) throws InsufficientBalanceException 
	{
		
		
		Account aayan = new Account(101, "Aayan", 72000);
		System.out.println(aayan);
		
		
		AccountThread t[]=new AccountThread[10];
		
		
		for(int i = 0; i < 10; i++)
		{
			t[i] = new AccountThread(aayan, 1000 * (i + 1));
		}
		
		
		try 
		{
			for(int i = 0; i < 10; i++)
			{
				t[i].join();
			}
		}
		catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
		}
		
		
		System.out.println("----------------------");
		System.out.println(aayan);
		

	}
	
	
}
