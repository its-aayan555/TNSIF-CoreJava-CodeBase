package com.tnsif.day5.hierarchicalinheritance;


public class HierachicalnheritanceDemo 
{

	
	public static void main(String[] args) 
	{
		
		Person p1 = new Person();
		System.out.println("-------Person Details--------");
		System.out.println(p1);
		System.out.println("------------------------------");
		
		Person p;
		p = new Person ("Prem", "Pune");
		System.out.println("Person Details: "+ p);
		
		p = new Student ("Prem", "Pune", "TE", 6.46f);
		System.out.println("Student Details "+p);
		
	    p = new Employee("Prem", "Pune", "123", 116545, "Mech");
		System.out.println("Employee Details "+p);
		
		
	}

	
}