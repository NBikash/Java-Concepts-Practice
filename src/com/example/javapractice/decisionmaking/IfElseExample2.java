package com.example.javapractice.decisionmaking;

//Check whether given character is an Uppercase or not
public class IfElseExample2 {
	public static void main(String[] args) {
		char ch='S';
		if(ch>='A'&& ch<='Z') {
			System.out.println("Given character "+ch+" is a Uppercase character");
		}
		else {
			System.out.println("That may be number or lowercase or special character or Given character is not a Uppercase character");
		}
		
	}

}
