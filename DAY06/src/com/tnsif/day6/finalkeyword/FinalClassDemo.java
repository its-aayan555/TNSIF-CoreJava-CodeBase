package com.tnsif.day6.finalkeyword;

import com.tnsif.day6.finalkeyword.FinalClass;


// Final Class
final class FinalClass
{
	
	void show()
	{
		System.out.println("Final class method");
	}
	
}

// Cannot Inherit the Class declared as Final Class
// class Student extends FinalClass
// {
//	
// }


// Normal Class 
public class FinalClassDemo 
{

	
	public static void main(String[] args) 
	{
	
		FinalClass fc = new FinalClass();
		fc.show();
		
	}
	
	
}

