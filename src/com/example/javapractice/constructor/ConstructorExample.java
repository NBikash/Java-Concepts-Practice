package com.example.javapractice.constructor;

public class ConstructorExample {
	int a;
	ConstructorExample(){
		System.out.println("Constructor Excuting");
		a=10;
	}
	{
		System.out.println("Non static block");
	}
	public static void main(String[] args) {
		System.out.println("Testing Constructor");
		ConstructorExample c=new  ConstructorExample();
		System.out.println(c.a);
	}

}
