package com.tnsif.day9.strings;


public class StringOperations 
{

	
	public static void main(String[] args) 
	{
	
		
		String s1 = new String(" Indian ");
		System.out.println(s1);
		
		System.out.println(" Length : " + s1.length());
		
		String s2 = new String(s1.toUpperCase());
		System.out.println(" UpperCase : " + s2);
		
		String s3 = new String(s1.toLowerCase());
		System.out.println(" LowerCase : " + s3);
		
		String s4 = new String(s1.substring(1, 7));
		System.out.println(" Sub String : " + s4);
		
		System.out.println(s1.trim());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.isEmpty());
		
		//	String comparison
		s2 = new String (s1);
		
		//	== --> check object reference
		//	equals --> check data
		
		System.out.println("case 1: "+s1.equals(s2));
		System.out.println("case 2: "+ s1==s2);
		
		
	}
	
	
}
