
package com.tnsif.day8.nestedinterface;


// Interface
public interface OuterInterface 
{
	
	void calArea();

	// Nested Interface
	interface InnerInterface
	{
		
		int id = 20;
		void print();
		
	}
	
}
