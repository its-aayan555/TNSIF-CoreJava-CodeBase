package com.tnsif.day9.strings;


public class SampleStrings 
{

	
	public static void main(String[] args) 
	{
		
	
		// String
		String str = "Aayan";
		
		// String Initialization using Chars
		char c[] = {'I', 'n', 'd', 'i', 'a'};
		
		// Initialize string	
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String(s1);
		System.out.println(s2);
		
		
		//\t    
		//concatenation to prevent long lines
		String longstr="This is to show "
		+" how long sentences"+ "\t"+" can be printed";
		System.out.println(longstr);
		
		
	}
	
	
}
