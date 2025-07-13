package com.tnsif.day8.interfacedemo;


public class Customer 
{

	
	// Data Members
	private String name;
	private String city;
	
	// Getter-Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	// Default Constructor
	public Customer() {
		super();
	}
	
	// Para Constructor
	public Customer(String name, String city) 
	{
		this.name = name;
		this.city = city;
	}
	
	
}
