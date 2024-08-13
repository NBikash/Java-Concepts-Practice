package com.example.javapractice.OOPs;

public class EarlyInstantiation_Driver {
	public static void main(String[] args) {
		EarlyInstantiation_Mobile m=new EarlyInstantiation_Mobile("OnePlus");
		System.out.println("Brand:"+m.brand);
		m.performance();
		System.out.println("Battery Capacity:"+m.b.capacity);
		m.b.battryLife();
	}

}
