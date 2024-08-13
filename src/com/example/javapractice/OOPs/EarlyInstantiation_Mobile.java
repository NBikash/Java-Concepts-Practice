package com.example.javapractice.OOPs;

public class EarlyInstantiation_Mobile {
	String brand;
	EarlyInstantiation_Mobile(String brand){
		this.brand=brand;
	}
	EarlyInstantiation_Battery b=new EarlyInstantiation_Battery("5000Hz");
	public void performance() {
		System.out.println("Mobile Performance is Overall Good");
	}

}
