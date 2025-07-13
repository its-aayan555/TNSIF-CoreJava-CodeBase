package com.tnsif.day13.synchronization;


public class Account implements Bank
{

	
	// Data Members
	private int accNo;
	private String name;
	private double balance;

	
	// Getter-Setter
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	// toString() 
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	// Default Constructor
	public Account() 
	{
		super();
	}
	
	
	// Para Constructor
	public Account(int accNo, String name, double balance) 
	{
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	
	// Interface Methods
	// For Amount Deposit
	@Override
	public void deposit(int amt) throws DepositLimitException 
	{
		
		if(amt > 25000)
		{
			throw new DepositLimitException("Daily Limit exceed .....");
		}
		
		else
		{
			balance += amt;
			System.out.println("Amount Deposited..." + amt);
		}
		
	}

	// For Amount Withdraw
	@Override
	public void withdraw(int amt) throws InsufficientBalanceException 
	{
		
		if (balance - amt < MIN_BAL)
		{
			throw new InsufficientBalanceException();
		}
		
		else
		{
			balance = balance - amt;
			System.out.println("After withdrawing Rs: " + amt + " Current balance is Rs: " + balance);
		}
		
	}
	
	
}
