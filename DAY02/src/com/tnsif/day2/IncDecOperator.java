package com.tnsif.day2;

public class IncDecOperator 
{
	public static void main(String[] args) 
	{
		
		int z = 10;
		
		System.out.println(++z); //Pre increment 
		
		System.out.println(z++);  // Post increment 
		
  		//   			     11		12		13		14		14
		System.out.println((z++) + (++z) - (z++) + (++z) - (z));
		//					 10	 +	12	 -  12 	 +	14	 - 	14
		
		
		int a = -1; int b = 1; int c = 0;
		
		System.out.println((--c) + (++b) - (a++) -(++b) + (b++) - (a) + (--a) + (--c) + (c++) + (--c) - (++b) + (c) + (b--));
		
		
		int n1 = 10;
		int n2 = 20;
		int n3 = 10;
		
		System.out.println("A and B value before the operation : "+ n1 +" "+n2);
		
		++n1;
		
		int n4 = ++n1 + n2 + n1--;
		System.out.println("C value after the operation : "+n3);
		
		int n5 = n4++ + n1 + n2--;
		System.out.println("D value after the operation : "+n5);
			
	}
	
}
