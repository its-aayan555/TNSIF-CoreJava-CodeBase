package com.tnsif.day14.sets;


public class Student 
{

	
	// Data members
	private int id;
	private String name;
	private double per;
	
	// Getter Setter method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	// Parameter Constructor
	public Student(int id, String name, double per) 
	{
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	// toString() method
	@Override
	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	
}
