package com.tnsif.day11.exceptionthrows;

import java.util.Scanner;


public class UsingThrow 
{

	// Method to get User Input
	static int acceptNumber()
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	
	
	// Main Method
	public static void main(String[] args) 
	{
	
		// Data Member for Percentage
		int per;
		System.out.println("Enter your Percentage : ");
		
		per = acceptNumber();
		
		// Try Block
		try 
		{
			if(per < 0)
			{
				throw new negativeException();
			}
			else if(per > 100)
			{
				throw new greatervalueException();
			}
			else 
			{
				System.out.println("Valid Percentage !");
			}
			
		}
		
		// Catch Block
		catch (negativeException | greatervalueException e) 
		{
			System.err.println("Error...\n" + e.getMessage());
			
		}
		
		
	}
	
	
}

