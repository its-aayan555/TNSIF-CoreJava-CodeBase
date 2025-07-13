package com.tnsif.day13.synchronization;


public class InsufficientBalanceException extends Exception 
{

	
	public InsufficientBalanceException()
	{
		System.out.println("Insufficient Balance !");
	}
	
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
	
	
}
