package com.tnsif.day11.exception;


public class TryCatchExample 
{

	
	public void performDivision(int num1, int num2)
	{
		
		System.out.println("I am in Method");
		int div;
		
		// Try Block
		try 
		{
			System.out.println("I am in Try Block");
			div = num1 / num2;
			System.out.println("Division : " + div);
		}
		
		// Catch Block
		catch(ArithmeticException ae)
		{
			System.out.println("I am in Catch Block " + ae);
		}
		
	}
	
	
}
