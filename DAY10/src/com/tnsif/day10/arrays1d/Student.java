package com.tnsif.day10.arrays1d;


public class Student 
{

	
	// Data members
	private int rollNo;
	private String name;
	
	// Para Constructor
	public Student(int rollNo, String name) 
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	// Getter-Setter
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
