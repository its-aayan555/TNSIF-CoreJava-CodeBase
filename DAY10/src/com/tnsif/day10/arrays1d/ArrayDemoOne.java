package com.tnsif.day10.arrays1d;


class ArrayOperations
{
	
	
	// Print int array 
	static void printArray(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + "\t");
			System.out.println();
		}
	}
	
	// Varible argument function
	public static int getSum(int... n)
	{
		int sum=0;
		for(int no : n)
			sum +=no;
		return sum;
	}
	
	// Count no. of odd elements
	public static int getOddCount(int b[])
	{
		int count=0;
		for(int i=0; i<b.length; i++)
		{
			if(b[i] % 2 !=0)
				count++;
		}
		return count;
	}
	
	// Count no. even elements 
	public static int getEvenCount(int b[])
	{
		return b.length-getOddCount(b);
		
	}
	
	
}


public class ArrayDemoOne 
{

	
	public static void main(String[] args) 
	{
		
		int n = 10;
		int a[]; 
		a = new int[n]; 
		
		// Displaying the array 
		ArrayOperations.printArray(a);
		
		// Assigning values in array a
		for(int i = 0; i < a.length; i++)
		{
			a[i] = 5 * i;
			ArrayOperations.printArray(a);
			
		}
		
		int b[] = {10,20,30,40,50}; 
		ArrayOperations.printArray(b);
		
		// Calling of varibles argument function 
		System.out.println("Sum of array elements is :"+ ArrayOperations.getSum(b));
		System.out.println("Sum of array elements is : "+ ArrayOperations.getSum(10,20,30,40,60,80));
		
		b[2] = 999; 
		
		ArrayOperations.printArray(b);
		
		// Displaying total odd and even no 
		System.out.println("Odd number : " + ArrayOperations.getOddCount(b) + "\t Even no " + ArrayOperations.getEvenCount(b));
	
		System.out.println();
		

	}

	
}
