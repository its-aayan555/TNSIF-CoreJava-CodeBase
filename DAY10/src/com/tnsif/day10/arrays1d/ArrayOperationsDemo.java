package com.tnsif.day10.arrays1d;

import java.util.Arrays;


public class ArrayOperationsDemo 
{

	
	public static void main(String[] args) 
	{
		
		
		// Get the array 
		int intArr[] = {69,20,12,40,35};
		
		// Print the array 
		System.out.println(Arrays.toString(intArr));

		
		for(int i=0; i<intArr.length;i++)
		{
			System.out.print(intArr[i]+ " ");
		}
	
		System.out.println();

		// Sort 
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		// Binary search
		System.out.println(Arrays.binarySearch(intArr, 15));
		
		// Comparison
		System.out.println(Arrays.toString(intArr));
		
		// Get the second Array
		int intArr1[] = {69,20,12,40,35};
		System.out.println(Arrays.toString(intArr1));
		
		//Arrays.sort(intArr1);
		
		// Comparison both the array
		if(Arrays.compare(intArr, intArr1)==0)
		{
			System.out.println("Both the arrays are same ");
		}
		else
		{
			System.out.println("Both arrays are not same ");
		}
		
		// Copy array
		int intArr2[] = Arrays.copyOf(intArr1, 2);
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[] = Arrays.copyOfRange(intArr1, 2, 4);
		System.out.println(Arrays.toString(intArr3));
		
		
		// Fill method 
		Arrays.fill(intArr3, 7);
		System.out.println(Arrays.toString(intArr3));
		
		
	}
	
	
}
