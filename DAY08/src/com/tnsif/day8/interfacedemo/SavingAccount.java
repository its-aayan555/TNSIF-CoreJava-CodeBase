package com.tnsif.day8.interfacedemo;


public class SavingAccount extends Customer implements Bank 
{
	
	// Data Members
	private int accNo;
	private float balance;
	
	// Para Constructor
	public SavingAccount(String name, String city, int accNo, float balance) 
	{
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// Getter-Setter
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}

	// Interface Methods Body
	@Override
	public void deposit(float amount) 
	{
		if(amount <0 || amount > Deposit_Limit)
		{
			System.out.println("Please deposit valid amount");
		}
		else
		{
			balance += amount;
			System.out.println("Rs. " + amount + " is deposited");
		}
	}

	@Override
	public void withdraw(float amount) 
	{
		if(amount <= balance-MinBal)
		{
			balance -= amount;
			System.out.println("Rs. " + amount + " withdrawn");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}
	
	// toString() method
	@Override
	public String toString() 
	{
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	

}

