package com.tnsif.day4.oops;

public class OOPSConceptDemo 
{

	// private variables
	private int serialNum;
	private String name;
	private int age;
	
	
	public int getSerialNum() 
	{
		return serialNum;
	}
	
	public void setSerialNum(int serialNum) 
	{
		this.serialNum = serialNum;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}

	// toString() method
	@Override
	public String toString() 
	{
		return "OOPSConceptDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
