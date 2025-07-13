package com.tnsif.day11.exceptionthrows;


public class greatervalueException extends Exception 
{

	
	public greatervalueException (String string) 
	{
		
		super(string);
		
	}
	
	public greatervalueException() 
	{
		
		super("Percentage should not be More than 100 !");
		
	}
	
	
	
}
