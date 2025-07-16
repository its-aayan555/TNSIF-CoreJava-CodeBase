package com.tnsif.day14.queues;

import java.util.ArrayDeque;
import java.util.Deque;


public class ExDequeueDemo 
{

	
	public static void main(String[] args) 
	{
	
		
		Deque<String> deque1 = new ArrayDeque<String>();
		deque1.add("Aayan");
		deque1.add("Datta");
		deque1.add("Sahil");
		deque1.add("Rajesh");
		deque1.add("Mahesh");
		
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque1);
		
		deque1.pollFirst();
		System.out.println(deque1);
		
		for(String str : deque1)
		{
			System.out.println("Queue is : " + str);
		}
		
		System.out.println(deque1);
		

	}

	
}

