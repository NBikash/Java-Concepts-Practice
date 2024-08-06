package com.example.javapractice.OOPs;

public class EncapsulationSimpleExample {
	private int qty;
	private String name;
	EncapsulationSimpleExample(int qty,String name){
		this.qty=qty;
		this.name=name;
	}
	public static void main(String[] args) {
		EncapsulationSimpleExample e=new EncapsulationSimpleExample(5,"Test");
		System.out.println(e.qty);
		System.out.println(e.name);
	}

}
