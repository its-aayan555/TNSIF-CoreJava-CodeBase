package com.tnsif.day7.overloading;

public class MethodOverloading 
{

	
	// Method Overloading
	
	// addition() method for 2 int vars
	public static int addition(int a, int b)
	{
		return a + b;
	}
	
	// addition() method for 2 float vars
	public static int addition(float a, float b)
	{
		return (int) (a + b);
	}
	
	// addition() method for 3 int vars
	public static int addition(int a, int b, int c)
	{
		return a + b + c;
	}
	
	// addition() method for 2 vars (int, float)
	public static int addition(int a, float b)
	{
		return (int) (a + b);
	}
	
	// Sequence change for parameters
	public static int addition(float b, int a)
	{
		return (int) (a + b);
	}
	
	
}
