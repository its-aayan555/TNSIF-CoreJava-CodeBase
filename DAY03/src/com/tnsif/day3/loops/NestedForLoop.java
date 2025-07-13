package com.tnsif.day3.loops;

public class NestedForLoop 
{

	public static void main(String[] args) 
	{
		
		int num = 20;
		
		for(int i=10; i<=num; i++) 
		{
			
			for (int j=1; j<=10; j++) 
			{
				
				System.out.println(i + "*" + j + " = " + i * j);
				
			}
			
			System.out.println(" ");
			
		}

	}
	
}
