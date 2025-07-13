package com.tnsif.day3;

public class ContinueDemo 
{

	public static void main(String[] args) 
	{
		
		for (int i = 8; i < 25; i++) 
		{
			
			// Odd no's will not be printed
		
			if(i%2 != 0) 
				continue;
			
			// Even number will be printed
			
			System.out.println(i+ " ");
		
		}
		
	}

}