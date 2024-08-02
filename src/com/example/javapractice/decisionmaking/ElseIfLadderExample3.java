package com.example.javapractice.decisionmaking;

//check whether the given character is a vowel or consonant
public class ElseIfLadderExample3 {
	public static void main(String[] args) {
	char ch='e';
	if(ch>='A'&&ch<='Z' || ch>='a'&&ch<='z') {
		if(ch=='A'||ch=='a'||ch=='e'||ch=='E'||ch=='I'||ch=='i'||ch=='o'||ch=='O'||ch=='U'||ch=='u') {
			System.out.println("Given character "+ch+" is a vowel");	
		}
		else {
			System.out.println("Given character "+ch+" is a consonent");
		}
	}
	else {
		System.out.println("Given character "+ch+" is not a alphabet");
	}

}
}
