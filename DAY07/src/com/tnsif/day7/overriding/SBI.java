package com.tnsif.day7.overriding;

public class SBI extends RBI
{

	// Overriden method
	@Override
	public float getRateOfInterest()
	{
		System.out.println("Base Rate of Interest of SBI - ");
		float cgst = 0.2f;
		float sgst = 0.2f;
		return 6.7f + cgst + sgst;
	}
	
	
}
