package com.example.javapractice.decisionmaking;

//check whether the given character is a vowel or consonant using switch case
public class SwitchCaseExample2 {
	public static void main(String[] args) {
		char ch='t';
		if(ch>='A' && ch<='Z'||ch>='a' && ch<='z') {
			switch(ch) {
			case 'A':System.out.println(ch+" is Vowel");
			break;
			case 'I':System.out.println(ch+" is Vowel");
			break;
			case 'O':System.out.println(ch+" is Vowel");
			break;
			case 'U':System.out.println(ch+" is Vowel");
			break;
			case 'a':System.out.println(ch+" is Vowel");
			break;
			case 'e':System.out.println(ch+" is Vowel");
			break;
			case 'i':System.out.println(ch+" is Vowel");
			break;
			case 'o':System.out.println(ch+" is Vowel");
			break;
			case 'u':System.out.println(ch+" is Vowel");
			break;
			default:System.out.println(ch+" is consonant");
			}
		}
			
	}

}
