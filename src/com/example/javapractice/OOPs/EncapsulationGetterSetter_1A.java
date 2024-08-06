package com.example.javapractice.OOPs;

public class EncapsulationGetterSetter_1A {
	private int id;
	private String name;
	private String gender;
	private double salary;
	EncapsulationGetterSetter_1A(int id,String name,String gender,double salary){
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
	}
	
	//Getter methods 
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public double getSalary() {
		return salary;
	}
	
	//setter method 
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	

}
