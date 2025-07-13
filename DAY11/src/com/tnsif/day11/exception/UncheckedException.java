package com.tnsif.day11.exception;


public class UncheckedException 
{

	
	public static void main(String[] args) 
	{
	
		// Array 
		int x[];
		
		// Try Block
		try
		{
			x = new int[] {1,2,3,4,5};
			System.out.println(x[7]);
		}
		
		// Catch Block
		catch(ArrayIndexOutOfBoundsException arrEx)
		{
			System.out.println("No. you are searching for is Not available");
			System.err.println(arrEx.getMessage());
		}
		
		
	}
	
	
}
