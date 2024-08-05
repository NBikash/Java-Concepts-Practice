package com.example.javapractice.constructor;

public class EmployeeConstructorExample {
	String name;
	int empid;
	String dept;
	EmployeeConstructorExample(String name,int empid,String dept){
		this.name=name;
		this.empid=empid;
		this.dept=dept;
		
	}
	public static void main(String[] args) {
		EmployeeConstructorExample Employee1=new EmployeeConstructorExample("Amar",1236,"Software Dev");	
		EmployeeConstructorExample Employee2=new EmployeeConstructorExample("Rishab",1520,"Software QA");
		EmployeeConstructorExample Employee3=new EmployeeConstructorExample("Rudresh",1254,"Devops");
		
	 System.out.println("**EMPLOYEE DETAILS**");
	 System.out.println("Employee Name-->"+Employee1.name);
		System.out.println("Employee EmpID-->"+Employee1.empid);
		System.out.println("Employee Department-->"+Employee1.dept);
		System.out.println("---------------------------");
		System.out.println("Employee Name-->"+Employee2.name);
		System.out.println("Employee EmpID-->"+Employee2.empid);
		System.out.println("Employee Department-->"+Employee2.dept);
		System.out.println("---------------------------");
		System.out.println("Employee Name-->"+Employee3.name);
		System.out.println("Employee EmpID-->"+Employee3.empid);
		System.out.println("Employee Department-->"+Employee3.dept);
	}


}
