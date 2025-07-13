package com.tnsif.day6.finalkeyword;


public class FinalVariables 
{

	// Cannot declare final variable, it must be initialized
	// final int x;
	
	final int x = 100;
	
	// Declaring final static variable
	// Cannot declare final static variable also, it must be initialized
	final static int y;
	
	final static int z = 300;
	
	// Instance Method
	void change()
	{
		// final variable's value cannot be changed or reassigned
		// x = 30;
		// z = 50;
	}
	
	// Static Block
	static 
	{
		// final static variable can be initialized once
		y = 200;
		// final static variable cannot be reassigned
		// z = 500;
	}
	

	// toString() method
	@Override
	public String toString() 
	{
		return "FinalVariables [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
}

