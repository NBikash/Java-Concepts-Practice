package com.example.javapractice.OOPs;

public class SingleLevelInheritance_1B extends SingleLevelInheritance_1A {
	static {
		System.out.println("Child class Static block");
	}
	{
		System.out.println("Child class Non-Static block");
	}
	SingleLevelInheritance_1B(){
		System.out.println("Child class Constructor");
	}
	public void Sound() {
        System.out.println("Dog sound");
    }
	

}
