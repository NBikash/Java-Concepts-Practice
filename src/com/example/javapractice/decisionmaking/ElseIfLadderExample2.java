package com.example.javapractice.decisionmaking;

//Check whether the given character is a alphabet or special character or digit
public class ElseIfLadderExample2 {
	public static void main(String[] args) {
		char ch='4';
		if(ch>='A' && ch<='Z'||ch>='a' && ch<='z') {
			System.out.println("Given character "+ch+" is a alphabet");			
		}
		else if(ch>='1'&&ch<='9') {
			System.out.println("Given character "+ch+" is a digit");
		}
		else {
			System.out.println("Given character "+ch+" is a special character");
		}
	}

}
