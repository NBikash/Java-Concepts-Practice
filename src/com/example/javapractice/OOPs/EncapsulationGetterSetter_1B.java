package com.example.javapractice.OOPs;

public class EncapsulationGetterSetter_1B {
	public static void main(String[] args) {
		EncapsulationGetterSetter_1A employee1=new EncapsulationGetterSetter_1A(1265,"Rudra","Male",35000);
		//Application of Getter method
		System.out.println("Emp ID-->"+employee1.getId());
		System.out.println("Emp Name-->"+employee1.getName());
		System.out.println("Emp Gender-->"+employee1.getGender());
		System.out.println("Emp Salary-->"+employee1.getSalary());
		System.out.println("-------------------------------------------------");
		
		//Application of Setter method
		employee1.setId(1549);
		employee1.setName("Sanajy");
		employee1.setGender("Male");
		employee1.setSalary(52000.20);
		
		System.out.println("**After Modifying data Using setter method**");
		System.out.println("Emp ID-->"+employee1.getId());
		System.out.println("Emp Name-->"+employee1.getName());
		System.out.println("Emp Gender-->"+employee1.getGender());
		System.out.println("Emp Salary-->"+employee1.getSalary());
	}

}
