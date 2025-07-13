package com.tnsif.day8.functionalinterface;


public class GreetDemo implements GreetInterface 
{

	@Override
	public void greet() 
	{
		System.out.println("Hellooooooooo...");
		
	}
	
	public static void main(String[] args) 
	{
		
		GreetDemo gm = new GreetDemo();
		gm.greet();
		
	}

	
}
