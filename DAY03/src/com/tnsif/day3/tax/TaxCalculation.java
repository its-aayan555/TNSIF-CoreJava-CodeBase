package com.tnsif.day3.tax;


public class TaxCalculation 
{

	//	Function to Calculate Tax
	public void calculateTax(Person person) 
	{
		
		
		if(person.getAge() > 65 || person.getGender().equalsIgnoreCase("Female")) 
		{	
			person.setTax(0);
			System.out.println("Tax is not applicable.");
		}
		
		else 
		{
			if(person.getIncome() <= 160000)
			{	
				person.setTax(0);
				System.out.println("Tax is not applicable.");
			}
			
			else if(person.getIncome() > 160000 && person.getIncome() <= 500000)
			{
				person.setTax((person.getIncome() - 160000)* 10/100);
			}
			
			else if(person.getIncome() > 500000 && person.getIncome() <= 800000)
			{
				person.setTax((person.getIncome() - 500000)* 20/100 + 34000);
			}
			
			else 
			{
				person.setTax((person.getIncome() - 800000)* 30/100 + 94000);
			}
		}
		
		
	}
	
}
