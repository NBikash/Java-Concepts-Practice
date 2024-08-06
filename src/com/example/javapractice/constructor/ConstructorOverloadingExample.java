package com.example.javapractice.constructor;

public class ConstructorOverloadingExample {
	int id;
	String name;
	long mobno;
	
	ConstructorOverloadingExample(int id){
		this.id=id;	
	}
	ConstructorOverloadingExample(int id,String name){
		this.id=id;
		this.name=name;
	}
	ConstructorOverloadingExample(int id,String name,long mobno){
		this.id=id;
		this.name=name;
		this.mobno=mobno;	
	}
	public static void main(String[] args) {
		ConstructorOverloadingExample c=new ConstructorOverloadingExample(23);
		System.out.println("ID-->"+c.id);
		System.out.println("Name-->"+c.name);
		System.out.println("MobNo-->"+c.mobno);
		System.out.println("-------------------------------");
		ConstructorOverloadingExample c1=new ConstructorOverloadingExample(14,"Test");
		System.out.println("ID-->"+c1.id);
		System.out.println("Name-->"+c1.name);
		System.out.println("MobNo-->"+c1.mobno);
		System.out.println("-------------------------------");
		ConstructorOverloadingExample c2=new ConstructorOverloadingExample(20,"Dev",8989898989l);
		System.out.println("ID-->"+c2.id);
		System.out.println("Name-->"+c2.name);
		System.out.println("MobNo-->"+c2.mobno);
	}

}
