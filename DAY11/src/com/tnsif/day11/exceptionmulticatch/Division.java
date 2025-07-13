package com.tnsif.day11.exceptionmulticatch;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Division 
{

	
	public static void divide()
	{
		
		// Variable Declaration
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers : ");
		
		// Try Block
		try
		{ 
			// Input Values
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = a / b;
			
			System.out.println("Division : " + c);
		}
		
		// Catch Blocks
		catch(InputMismatchException im)
		{
			System.err.println(im);
			System.err.println(im.getMessage());
		}
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e);
			System.err.println(e.getMessage());
		}
		
		catch(Exception ex)
		{
			System.err.println(ex);
			System.err.println(ex.getMessage());
		}
		
		// Finally Block
		finally
		{
			System.out.println("Thank You");
		}
		
	}
	
	
}

