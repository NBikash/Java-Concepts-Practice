package com.example.javapractice.OOPs;

public class SingleLevelInheritance_1A {
	static{
		System.out.println("Parent Class Static block");
	}
	{
		System.out.println("Parent class Non-Static block");
	}
	static String kingdom = "Animalia";
	int lifespanInYears=10;
	SingleLevelInheritance_1A(){
		System.out.println("Parent class Constructor");
	}
	 public static void displayKingdom() {
	        System.out.println("Kingdom: " + kingdom);
	    }
	 public void makeSound() {
	        System.out.println("Animal sound");
	    }

}
