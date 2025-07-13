package com.tnsif.day8.interfacedemo;


public class BankDemo 
{

	
	public static void main(String[] args) 
	{
	
		SavingAccount sa = new SavingAccount("Aayan", "Pune", 501006352, 22000);
		System.out.println(sa);
		
		sa.deposit(5000);
		System.out.println(sa);
		
		sa.withdraw(4000);
		System.out.println(sa);
		
		sa.withdraw(25000);
		System.out.println(sa);
		
		sa.withdraw(20000);
		System.out.println(sa);
		
	}
	
	
}

