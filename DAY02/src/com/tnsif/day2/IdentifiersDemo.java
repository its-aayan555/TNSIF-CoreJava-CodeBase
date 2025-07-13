package com.tnsif.day2;

public class IdentifiersDemo 
{

	public static void main(String[] args) 
	{
		
		// int for = 23; Keyword cannot used as a variable, it will result Error
		// int num 1 = 2; Variable name cannot have space
		// int @num = 12; Special symbols are not allowed, except $ and _ 
		
		// Valid Declaration 
		int num;
		
		// Valid Initialization 
		
		int $num1 = 23;
		String StudentName = "Aayan";
		int FOR = 45; // It will not result Error, as the variable name is in Uppercase and Java is Case Sensitive
		
		System.out.println("Values of the number variable is " + $num1 + " " + FOR);
		System.out.println("Student name is "+StudentName);
		
	}
	

}