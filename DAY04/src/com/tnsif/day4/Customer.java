package com.tnsif.day4;

public class Customer 
{

	private String customerName;
	private int customerId;
	private String customerCity;
	
	// Default Constructor
	public Customer()
	{
		System.out.println("Default Constructor");
	}

	// Parameterized Constructor
	public Customer(String customerName, int customerId, String customerCity) 
	{
		// this(); Calling Default Constructor
		System.out.println("Parameterized Constructor");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}

	// Getter-Setter method used
	public String getCustomerName() 
	{
		return customerName;
	}
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public int getCustomerId() 
	{
		return customerId;
	}
	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}

	public String getCustomerCity() 
	{
		return customerCity;
	}
	public void setCustomerCity(String customerCity) 
	{
		this.customerCity = customerCity;
	}

	// toString() method
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	

}
