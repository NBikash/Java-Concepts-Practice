package com.example.javapractice.OOPs;

public class EarlyInstantiation1_Driver {
	public static void main(String[] args) {
		EarlyInstantiation1_Car c=new EarlyInstantiation1_Car("Volkswagen");
		System.out.println("Brand:"+c.getBrand());
		System.out.println("Cubic capacity:"+c.getEngine().getCc());
	}

}
