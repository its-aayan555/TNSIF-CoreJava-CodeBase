package com.tnsif.day10.arraysmultid;


class MLDArray
{
	
	static void printArray(int c[][])
	{
		
		System.out.println("Array Elements : ");
		
		for(int i = 0; i < c.length ; i++)
		{
			for(int j = 0; j < c[i].length; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}


// Main Class
public class MultiDArrayDemo 
{

	
	public static void main(String[] args) 
	{
	
		int c[][] = { {12,34} , {10,20} , {01, 02} , {78,87} };
		
		System.out.println("No. of rows in c Array : " + c.length);
		
		MLDArray.printArray(c);
		
	}
	
	
}
