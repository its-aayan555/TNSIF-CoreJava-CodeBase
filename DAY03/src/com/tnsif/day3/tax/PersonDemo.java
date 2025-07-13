package com.tnsif.day3.tax;

import java.util.*;

public class PersonDemo 
{

	public static void main(String[] args) 
	{
		
		//	Scanner class object creation for Use Input
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("Enter person name: ");
		name = sc.next();
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter gender: ");
		String gender = sc.next();
		
		System.out.println("Enter Mobile Number: ");
		long mobileNumber = sc.nextLong();
		
		System.out.println("Enter income: ");
		int income = sc.nextInt();
		
		
		// Person object 
		Person person = new Person();
		
		// Values initialized using setter method
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		person.setMobileNumber(mobileNumber);
		
		// Reading the data using getter method
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		
		// Printing Person details using toSting() method
		
		System.out.println(person);
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(person);
		System.out.println("After calculation of Tax: ");
		System.out.println(person);
		
	}
}
