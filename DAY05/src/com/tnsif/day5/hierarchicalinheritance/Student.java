package com.tnsif.day5.hierarchicalinheritance;

public class Student extends Person 
{
	
	private String clas;
	private float percentage;
	
	public Student() {
		System.out.println("Default value of Student class");
		clas = "TE";
		percentage = 6.98f;
		
	}

	public Student(String name, String city,String clas, float percentage) {
		super(name, city);
		this.clas = clas;
		this.percentage = percentage;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [clas=" + clas + ", percentage=" + percentage + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}

	
	
}