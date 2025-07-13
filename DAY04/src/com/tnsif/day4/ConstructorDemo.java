package com.tnsif.day4;

import java.util.Scanner;

public class ConstructorDemo 
{

	public static void main(String[] args) 
	{

		Scanner sc  = new Scanner(System.in);
		
		String name, city;
		int id;
		
		System.out.println("Enter Customer Id : ");
		id =  sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name : ");
		name = sc.nextLine();
		
		System.out.println("Enter Customer City : ");
		city = sc.nextLine();
		
		System.out.println(" ");
		
		Customer c1 = new Customer();
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		c1.setCustomerName(name);
		System.out.println(c1);
		
		Customer c2 = new Customer(name, id, city);
		c2.setCustomerCity(city);
		c2.setCustomerId(id);
		c2.setCustomerName(name);
		System.out.println(c2);
		
	}

}
