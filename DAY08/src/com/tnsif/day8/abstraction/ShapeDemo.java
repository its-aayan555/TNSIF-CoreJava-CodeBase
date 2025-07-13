package com.tnsif.day8.abstraction;


public class ShapeDemo 
{

	
	public static void main(String[] args) 
	{
		
		Shape s;
		
		// Area calculation using Default Value
		s=new Square();
		s.calArea();
		s.show();
		
		s=new Rectangle();
		s.calArea();
		s.show();
		
		// Area calculation using Para Value
		s=new Square(42.21f);
		s.calArea();
		s.show();
		
		s=new Rectangle(27, 13);
		s.calArea();
		s.show();

	}

	
}
