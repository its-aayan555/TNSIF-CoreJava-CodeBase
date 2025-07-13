package com.tnsif.day6.statickeyword;


public class Employee 
{
	
	// Data Members
	private String name;
	private int id;
	
	// Static Data Member
	static String companyName = "TNSIF";

	// Para Constructor
	public Employee(String name, int id) 
	{
		super();
		this.name = name;
		this.id = id;
	}

	// toString() method to Display Data
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company Name="+ companyName +"]";
	}
		
	
}
