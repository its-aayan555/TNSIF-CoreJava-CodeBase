package com.tnsif.day13.synchronization;


public class DepositLimitException extends Exception 
{

	
	public DepositLimitException()
	{
		System.out.println("Daily Limit of Deposit is Exceeded !");
	}
	
	public DepositLimitException(String msg)
	{
		super(msg);
	}
	
	
}
