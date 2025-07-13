package com.tnsif.day4.accessmodifiers2;

import com.tnsif.day4.accessmodifiers.*;

public class Executor extends Base
{

	public static void main(String[] args) 
	{
	
		Base b1 = new Base();
		
		b1.methodPublic();
		b1.varPublic = 1234;
		b1.methodPublic();
		
		// Protected method and variable can also accessed outside the package using Child class (using Inheritance)
		Executor e = new Executor();
		e.methodProtected();
		e.varProtected = 789;
		e.methodProtected();
		
		
	}

}
