package com.tnsif.day13.synchronization;


public interface Bank 
{

	
	// Data Members
	static final int MIN_BAL = 5000;
	static final int DAILY_LIMIT = 25000;
	
	// Method Declaration
	void deposit(int amt) throws  DepositLimitException;
	void withdraw(int amt) throws InsufficientBalanceException;
	
	
}
