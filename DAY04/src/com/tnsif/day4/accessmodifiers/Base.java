package com.tnsif.day4.accessmodifiers;

public class Base 
{

	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	// Declare Default, Public, Private, Protected Methods
	
	void methodDefault()
	{
		System.out.println("Default Access Base Class");
		System.out.println("Default : " + varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public Access Base Class");
		System.out.println("Public : " + varPublic);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private Access Base Class");
		System.out.println("Private : " + varPrivate);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected Access Base Class");
		System.out.println("Protected : " + varProtected);
	}
	
	
}
