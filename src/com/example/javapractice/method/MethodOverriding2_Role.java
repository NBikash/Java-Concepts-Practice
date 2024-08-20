package com.example.javapractice.method;

public class MethodOverriding2_Role {
	public static void main(String[] args) {
		MethodOverriding2_Employee e=new MethodOverriding2_Tester();
		e.work();
		System.out.println("******************************");
		MethodOverriding2_Employee e1=new MethodOverriding2_Developer();
		e1.work();
		System.out.println("******************************");
		MethodOverriding2_Developer d=new MethodOverriding2_Tester();
		d.work();
		System.out.println("******************************");
		MethodOverriding2_Employee e2=new MethodOverriding2_Employee(); 
		e2.work();
		System.out.println("******************************");
		MethodOverriding2_Developer d1=new MethodOverriding2_Developer();
		d1.work();
		System.out.println("******************************");
		MethodOverriding2_Tester t=new MethodOverriding2_Tester();
		t.work();
		System.out.println("******************************");
		
		
	}

}
