package com.example.javapractice.method;

public class MethodOverriding3_Driver {
	public  void travel(MethodOverriding3_Vehicle v) {
		v.start();
	}
	public static void main(String[] args) {
		MethodOverriding3_Vehicle obj;
		obj=new MethodOverriding3_Car();
		obj.start();
		obj=new MethodOverriding3_Bike();
		obj.start();
		System.out.println("*****************************");
		MethodOverriding3_Vehicle vehicle=new MethodOverriding3_Car();
		MethodOverriding3_Driver d=new MethodOverriding3_Driver();
		d.travel(vehicle);
		d.travel(new MethodOverriding3_Bike() );
		d.travel(new MethodOverriding3_Vehicle() );
	}

}
