package com.tnsif.day11.exceptionthrows;


public class negativeException extends Exception 
{

	
	public negativeException (String string) 
	{
		
		super(string);
		
	}
	
	public negativeException() 
	{
		
		super("Percentage should not be Negative !");
		
	}
	
	
}
