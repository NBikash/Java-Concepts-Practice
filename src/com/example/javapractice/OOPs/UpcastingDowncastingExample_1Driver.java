package com.example.javapractice.OOPs;

public class UpcastingDowncastingExample_1Driver {
	public static void main(String[] args) {
		System.out.println("*****************UPCASTING****************");
		UpcastingDowncastingExample_1A up=new UpcastingDowncastingExample_1B();
		up.Employee();
		System.out.println("*****************UPCASTING****************");
		UpcastingDowncastingExample_1A up1=new UpcastingDowncastingExample_1C();
		up1.Employee();
		System.out.println("****************DOWNCASTING*****************");
		UpcastingDowncastingExample_1B dc=(UpcastingDowncastingExample_1B)up;
		dc.Employee();
		dc.Developers();
		System.out.println("****************DOWNCASTING*****************");
		UpcastingDowncastingExample_1C dc2=(UpcastingDowncastingExample_1C)up1;
		dc2.Employee();
		dc2.Tester();
		
		
	}

}
