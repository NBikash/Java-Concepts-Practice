package com.example.javapractice.interfaces;

public class InterfaceExample1_Developer implements InterfaceExample1_Employee{

	@Override
	public void work() {
		System.out.println("Developing Application");
		
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {		
		InterfaceExample1_Developer i=new InterfaceExample1_Developer();
		System.out.println("ID: "+InterfaceExample1_Employee.id);
		System.out.println("Employee ID: "+i.id);
		i.work();
	}
	

}
