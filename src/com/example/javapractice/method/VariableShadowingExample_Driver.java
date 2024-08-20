package com.example.javapractice.method;

public class VariableShadowingExample_Driver {
	public static void main(String[] args) {
		VariableShadowingExample_Father f=new VariableShadowingExample_Son();
		System.out.println(f.age);
		System.out.println(f.name);
		VariableShadowingExample_Son s=(VariableShadowingExample_Son)f;
		System.out.println(s.age);
		System.out.println(s.name);
	}

}
