package com.example.javapractice.decisionmaking;

//WAJP to print category of a person based on weight
//Requirement:
//41kg to 50kg (Category A),51kg to 60kg(Category B),61kg to 70kg(Category C),71kg to 80kg(Category D), >81(Category E), <40(not eligible)
public class ElseIfLadderExample {
	public static void main(String[] args) {
		double weight=65;
		if(weight>=41 && weight<=50) {
			System.out.println("Category A");
		}
		else if(weight>=51 && weight<=60) {
			System.out.println("Category B");
		}
		else if(weight>=61 && weight<=70) {
			System.out.println("Category C");
		}
		else if(weight>=71 && weight<=80) {
			System.out.println("Category D");
		}
		else if(weight>=81) {
			System.out.println("Category E");
		}
		else if(weight<=40) {
			System.out.println("Not Eligible");
		}
		
	}

}
