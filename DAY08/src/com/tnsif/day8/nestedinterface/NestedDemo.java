package com.tnsif.day8.nestedinterface;


// Nested Interface Implementation

public class NestedDemo implements OuterInterface, OuterInterface.InnerInterface
{

	
	// OuterInterface Method
	@Override
	public void calArea()
	{
		System.out.println("Outer Interface");
	}
	
	// InnerInterface Method
	@Override
	public void print()
	{
		System.out.println("Inner Interface");
	}
	
	
}
