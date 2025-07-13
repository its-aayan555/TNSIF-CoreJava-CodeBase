package com.tnsif.day6.statickeyword;


public class MyClass 
{

	// Data members
	private int section;
	private static int srNo;
	
	// Static Block
	static 
	{
		System.out.println("----------- Static Block ------------");
		srNo = 1000;
		// section = 101; Cannot use no-static variable in Static Block
	}
	
	// Default Constructor
	public MyClass()
	{
		System.out.println("----------- Within Default Constructor -----------");
		srNo++;
		section++;
	}

	// toString() method
	@Override
	public String toString() {
		return "MyClass [serialNo ="+ srNo +", section=" + section + "]";
	}
	
	// Static Method
	static void display()
	{
		// System.out.println("Section : " + section); Can't access non-static member
		System.out.println("Serial No. : " + srNo);
	}
		
	
}


