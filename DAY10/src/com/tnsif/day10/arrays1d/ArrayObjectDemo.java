package com.tnsif.day10.arrays1d;

public class ArrayObjectDemo 
{

	
	public static void main(String[] args) 
	{
	
		Student [] arr;
		
		// Declared memory for 5 object or student
		arr = new Student[5];
		
		// Initializing values in the Array
		arr[0] = new Student(101, "Aayan");
		arr[1] = new Student(103, "Yash");
		arr[2] = new Student(119, "Shantanu");
		arr[3] = new Student(131, "Datta");
		arr[4] = new Student(1001, "Sahil");
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Elements At " + i + " : " + arr[i].getRollNo() + "\t" + arr[i].getName());
		}
		
		
	}
	
	
}
