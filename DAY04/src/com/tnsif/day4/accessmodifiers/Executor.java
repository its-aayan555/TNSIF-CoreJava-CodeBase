package com.tnsif.day4.accessmodifiers;

public class Executor 
{

	public static void main(String[] args) 
	{
		
		Base b1 = new Base();
		b1.methodDefault();
		b1.methodPublic();
		b1.methodProtected();
		// b1.methodPrivate(); Due to Private access it cannot be accessed in different class
		
		// Changes can be made
		System.out.println("\nAfter Changes - ");
		
		b1.varDefault = 11;
		b1.methodDefault();
		
		b1.varPublic = 21;
		b1.methodPublic();
		
		b1.varProtected = 31;
		b1.methodProtected();

	}

	
}
