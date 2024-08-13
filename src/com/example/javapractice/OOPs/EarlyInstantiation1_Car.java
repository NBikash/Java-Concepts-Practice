package com.example.javapractice.OOPs;

public class EarlyInstantiation1_Car {
	private String brand;
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	private EarlyInstantiation1_Engine e=new EarlyInstantiation1_Engine(1000);
	public EarlyInstantiation1_Engine getEngine() {
		return e;
	}
	EarlyInstantiation1_Car(String brand){
		this.brand=brand;
		System.out.println("Car Constructor");
	}

}
