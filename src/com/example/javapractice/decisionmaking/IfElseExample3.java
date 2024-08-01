package com.example.javapractice.decisionmaking;

//Check whether the given character is an alphabet or not 
public class IfElseExample3 {
	public static void main(String[] args) {
		char ch='x';
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			System.out.println("Given character "+ch+" is an alphabet");
		}
		else {
			System.out.println("Given character "+ch+" is not an alphabet");
			
		}
		
	}

}
