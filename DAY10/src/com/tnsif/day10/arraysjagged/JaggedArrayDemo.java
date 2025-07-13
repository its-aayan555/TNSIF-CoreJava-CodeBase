package com.tnsif.day10.arraysjagged;


class JaggedArray
{
	
	static void printArray(int c[][])
	{
		
		System.out.println("Array Elements : ");
		
		for(int i = 0; i <= c.length ; i++)
		{
			for(int j = 0; j < c[i].length; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}


//Main Class
public class JaggedArrayDemo 
{

	
	public static void main(String[] args) 
	{
	
		int c[][] = { {12,34,67} , {10,20} , {01,02,03} , {78,87} , {34,49,76} };
		
		System.out.println("No. of rows in c Array : " + c.length);
		
		JaggedArray.printArray(c);
		
	}
	
	
}

