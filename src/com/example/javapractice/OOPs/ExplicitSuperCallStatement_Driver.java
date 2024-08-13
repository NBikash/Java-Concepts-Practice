package com.example.javapractice.OOPs;

public class ExplicitSuperCallStatement_Driver {
	public static void main(String[] args) {
		ExplicitSuperCallStatement_Employee e=new ExplicitSuperCallStatement_Employee(101,"Akhil",50000.0);
		System.out.println("Company Name:"+e.cname);
		System.out.println("Employee ID:"+e.id);
		System.out.println("Employee Name:"+e.name);
		System.out.println("Employee Salary: Rs "+e.salary+" only");
		
	}

}
