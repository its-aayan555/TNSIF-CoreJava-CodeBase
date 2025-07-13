package com.tnsif.day7.overriding;

public class OverridingDemo 
{

	
	public static void main(String[] args) 
	{
	
		// Object Reference
		RBI rbi;
		
		// Dynamic Binding
		rbi = new RBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
		
	}
	
	
}
