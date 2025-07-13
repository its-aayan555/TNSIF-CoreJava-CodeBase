package com.tnsif.day11.exceptionnested;


public class NestedTryCatch 
{

	
	public static void check()
	{
		
		String str = "TNS";
		int slength = str.length();  
		System.out.println("String Lenght : " + slength);
		
		String anotherString = null;
		
		int y = 6;
		
		// Outer Try Block
		try 
		{
			// Inner try block 
			try 
			{
				System.out.println(str.charAt(y));
			}
			
			// Inner Catch Block
			catch(StringIndexOutOfBoundsException e)
			{
				System.err.println(e.getMessage());
			}
			
			System.out.println("String length : "+ anotherString.length());
			
		}
		
		// Outer Catch Block
		catch (NullPointerException e)
		{
			System.err.println(e.getMessage());
		}
		
	}
	
	
}
