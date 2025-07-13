package com.tnsif.day8.abstraction;


public class Rectangle extends Shape
{

	
	// Data Members
	float width;
	float length;
	
	// Default Constructor
	public Rectangle() 
	{
		width = 4.9f;
		length = 2.5f;	
	}

	// Para Constructor
	public Rectangle(float width, float length) 
	{	
		this.width = width;
		this.length = length;
	}

	// Abstract Method Body
	@Override
	public void calArea() 
	{
		this.area = width * length;
	}

		
}
