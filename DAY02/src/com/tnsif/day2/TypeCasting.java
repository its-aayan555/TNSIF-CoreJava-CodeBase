package com.tnsif.day2;

public class TypeCasting 
{

	public static void main(String[] args) 
	{
		
		// Widening
		// Implicit TypeCasting
		
		byte b = 10;
		int i = b;
		System.out.println("Byte : " + b);
		System.out.println("Int : " + i);
		
		float f = 78.34f;
		double d = f;
		System.out.println("Float : " + f);
		System.out.println("Double : " + d);
		
		
		// Narrowing
		// Explicit TypeCasting
		
		double d2 = 67.43d;
		long l = (long) d2;
		System.out.println("Double : " + d2);
		System.out.println("Long : " + l);
		
		long l2 = 768963986879287l;
		int i2 = (int) l2;
		System.out.println("Int : " + i2);
		
		
	}

}
