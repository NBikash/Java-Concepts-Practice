package com.example.javapractice.constructor;

public class ParametarizedConstructorExample {
	int classno;
	String topic;
	ParametarizedConstructorExample(int classserial,String topics){
		classno=classserial;
		topic=topics;
		
	}
	public static void main(String[] args) {
		ParametarizedConstructorExample p=new ParametarizedConstructorExample(3,"Constructor");
		System.out.println(p.classno);
		System.out.println(p.topic);
	}

}
