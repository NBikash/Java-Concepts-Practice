package com.example.javapractice.OOPs;

public class EarlyInstantiation1_Engine {
	private double cc;
	public double getCc() {
		return cc;		
	}
	public void setCc(double cc) {
		this.cc=cc;
	}
	EarlyInstantiation1_Engine(double cc){
		this.cc=cc;
		System.out.println("Engine Constructor");
	}

}
