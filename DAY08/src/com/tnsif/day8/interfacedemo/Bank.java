package com.tnsif.day8.interfacedemo;


public interface Bank 
{

	// Data Members
	final static float MinBal = 5000;
	final static float Deposit_Limit = 25000;
	
	// Interface methods declaration body will be defined in child class
	public void deposit(float amount);
	public void withdraw(float amount);
	
	
}
