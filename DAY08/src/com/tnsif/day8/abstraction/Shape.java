package com.tnsif.day8.abstraction;


public abstract class Shape 
{

	// Data member
	protected float area;
	
	// Abstract method Declaration
	public abstract void calArea();
	
	// Method 
	public void show()
	{
		System.out.println("Shape Area : " + area);
	}
	
	
}
