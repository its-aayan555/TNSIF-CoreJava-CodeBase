package com.tnsif.day7.overloading;

public class ConstructorOverloadingDemo 
{

	
	public static void main(String[] args) 
	{
	
		Point p1 = new Point();
		System.out.println(p1);
		
		Point p2 = new Point(23);
		System.out.println(p2);
		
		Point p3 = new Point(17.35f, 34.56f);
		System.out.println(p3);
		
	}
	
	
}
