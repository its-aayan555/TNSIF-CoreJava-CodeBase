package com.tnsif.day7.overriding;

public class HDFC extends RBI
{

	
	// Overriden method
	@Override
	public float getRateOfInterest()
	{
		System.out.println("Base Rate of Interest of HDFC - ");
		float cgst = 0.5f;
		float sgst = 0.5f;
		return 6.7f + cgst + sgst;
	}
	
	
}
