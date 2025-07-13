package com.tnsif.day7.overriding;


// Parent Class
class Color 
{
	
	protected Color getColor()
	{
		Color c = new Color();
		return c;
	}
	
}


// Child Class
class Red extends Color
{
	
	// Method Overriding
	@Override
	protected Color getColor()
	{
		// Changing return type of Overriden method, Cannot change if return type is Primitive
		Red c = new Red();
		return c;
	}
	
}


//Child Class
class Blue extends Color
{
	
	// Method Overriding
	@Override
	protected Color getColor()
	{
		Blue c = new Blue();
		return c;
	}
	
}


// Main Class
public class CovariantOverriding 
{

	public static void main(String[] args) 
	{
	
		// TODO Auto-generated method stub
		
	}
	
}

