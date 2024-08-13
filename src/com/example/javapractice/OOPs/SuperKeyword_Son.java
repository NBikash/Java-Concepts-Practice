package com.example.javapractice.OOPs;

public class SuperKeyword_Son extends SuperKeyword_Father{
	int age=22;
	String name="Rudra";
	
	public void display()
	{
		System.out.println("Son's age:"+this.age);   //Display current class object 
		System.out.println("Father's age:"+super.age);   //Display current Parent class object 
		System.out.println("Son's Name:"+this.name);
		System.out.println("Fathers Name:"+super.name);
	}

}
