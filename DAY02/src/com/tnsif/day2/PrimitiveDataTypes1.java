package com.tnsif.day2;

public class PrimitiveDataTypes1 
{

	public static void main(String[] args) 
	{
	
		// 1 byte = 2 nibbles
		// 1 nibble = 4 bits
		// 1 byte = 8 bits	
		// Byte - 1 byte
		byte bytemin = -128;
		byte bytemax = 127;
		System.out.println(" Byte - \n MinRange : " + bytemin + "\n MaxRange : " + bytemax);
		
		// Short - 2 byte
		short shortmin = -32768;
		short shortmax = 32767;
		System.out.println("\n Short - \n MinRange : " + shortmin + "\n MaxRange : " + shortmax);
		
		// Int - 4 byte
		int intmin = -2147483648;
		int intmax = 2147483647;
		System.out.println("\n Int - \n MinRange : " + intmin + "\n MaxRange : " + intmax);
		
		// Long - 8 byte
		long longmin = -9223372036854775808l;
		long longmax = 9223372036854775807l;
		System.out.println("\n Long - \n MinRange : " + longmin + "\n MaxRange : " + longmax);
		
		// Float
		float f = 3234.141243278345f;
		System.out.println("\n Float - \n " + f);
		
		// Double
		double d1 = 3456.14124512345678902345678914f;
		System.out.println("\n Double - \n " + d1);
		
		// Boolean
		boolean flag1 = true;
		boolean flag2 = false;
		System.out.println("\n Boolean - \n It can be " + flag1 + " or " + flag2);
		
		
	}

}
