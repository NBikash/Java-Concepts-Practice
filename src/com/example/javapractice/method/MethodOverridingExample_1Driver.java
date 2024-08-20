package com.example.javapractice.method;

public class MethodOverridingExample_1Driver {
	public static void main(String[] args) {
		//Upcasting
		MethodOverridingExample_1A m=new MethodOverridingExample_1B();
		m.software();
		MethodOverridingExample_1A m1=new MethodOverridingExample_1A();
		m1.software();
	}

}
