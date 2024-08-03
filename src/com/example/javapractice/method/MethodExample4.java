package com.example.javapractice.method;

//WAJP to design method for add,sub and multiplication of two numbers 
public class MethodExample4 {
	public static void Add(int a,int b) {
		int res=a+b;
		System.out.println("Addition of two numbers "+res);
	}
	public static void Sub(int a,int b) {	
		int res=a-b;
		System.out.println("Substraction of two numbers "+res);
		
	}
	public static void Mul(int a,int b) {
		int res=a*b;
		System.out.println("Multiplication of two numbers "+res);
	}
	public static void main(String[] args) {
		Add(4,6);
		Sub(5,8);
		Mul(8,9);
		
	}
	

}
