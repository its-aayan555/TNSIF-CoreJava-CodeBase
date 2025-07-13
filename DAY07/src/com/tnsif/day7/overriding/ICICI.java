package com.tnsif.day7.overriding;

public class ICICI extends RBI
{

	
	// Overriden method
	@Override
	public float getRateOfInterest()
	{
		System.out.println("Base Rate of Interest of ICICI - ");
		float cgst = 0.4f;
		float sgst = 0.4f;
		return 6.7f + cgst + sgst;
	}
	
	
}
