package com.tnsif.day8.abstraction;


public class Square extends Shape
{

	
	// Data Member
	float side;

	// Default Constructor
	public Square() 
	{	
		side = 5.7f;		
	}
	
	// Para Constructor
	public Square(float side) 
	{
		this.side = side;
	}

	// Abstract Method Body
	@Override
	public void calArea() 
	{
		this.area = side * side;	
	}

	
}
