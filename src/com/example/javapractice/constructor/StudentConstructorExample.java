package com.example.javapractice.constructor;

public class StudentConstructorExample {
	String name;
	int std;
	long mobno;
	StudentConstructorExample(String name,int std,long mobno){
		this.name=name;
		this.std=std;
		this.mobno=mobno;
		
	}
	public static void main(String[] args) {
		StudentConstructorExample student1=new StudentConstructorExample("Amar",9,8989898989l);	
		StudentConstructorExample student2=new StudentConstructorExample("Rishab",10,7545626565l);
		StudentConstructorExample student3=new StudentConstructorExample("Rudresh",6,8752216684l);
		
	 System.out.println("**STUDENT DETAILS**");
	 System.out.println("Student Name-->"+student1.name);
		System.out.println("Student Class-->"+student1.std);
		System.out.println("Student MobNo.-->"+student1.mobno);
		System.out.println("---------------------------");
		System.out.println("Student Name-->"+student2.name);
		System.out.println("Student Class-->"+student2.std);
		System.out.println("Student MobNo.-->"+student2.mobno);
		System.out.println("---------------------------");
		System.out.println("Student Name-->"+student3.name);
		System.out.println("Student Class-->"+student3.std);
		System.out.println("Student MobNo.-->"+student3.mobno);
	}

}
