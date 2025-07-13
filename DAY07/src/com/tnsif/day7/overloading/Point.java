package com.tnsif.day7.overloading;


public class Point 
{

	// Data Members
	private float x;
	private float y;
	
	// Constructor Overloading
	
	// Default Constructor
	public Point()
	{
		x = 0.0f;
		y = 0.0f;
	}

	// 1st Para Constructor
	public Point(float x) 
	{
		this.x = x;
		this.y = y;
	}

	// 2nd Para Constructor
	public Point(float x, float y) 
	{
		this.x = x;
		this.y = y;
	}

	// toString() method
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
