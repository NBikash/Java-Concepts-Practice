package com.example.javapractice.decisionmaking;

//Check whether the given character is a special character or not 
public class IfElseExample4 {
	public static void main(String[] args) {
		char ch='$';
		if(ch>='A' && ch<='Z'||ch>='a' && ch<='z'||ch>='0' && ch<='9')
		{
			System.out.println("Given character "+ch+" is not a special character");
		}
		else
		{
			System.out.println("Given character "+ch+" is  a special character");
		}
	}

}
