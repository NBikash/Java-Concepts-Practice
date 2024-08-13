package com.example.javapractice.OOPs;

public class ExplicitSuperCallStatement_Employee extends ExplicitSuperCallStatement_Company {
	int id;
	String name;
	Double salary;
	ExplicitSuperCallStatement_Employee(int id){
		super("XYZ Tech.");      // Call to parent constructor
		this.id=id;	
		System.out.println("Employee constructor 1");
	}
	ExplicitSuperCallStatement_Employee(int id,String name){
		this(id);              //Either need to call super call statement again or Make connection between previous constructor where super call statement used(that by using this call statement)
		this.name=name;
		System.out.println("Employee constructor 2");
	}
	ExplicitSuperCallStatement_Employee(int id,String name,Double salary){
		this(id,name);
		this.salary=salary;
		System.out.println("Employee constructor 3");
	}
		
	

}
