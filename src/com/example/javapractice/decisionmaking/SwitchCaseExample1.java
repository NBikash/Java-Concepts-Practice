package com.example.javapractice.decisionmaking;

public class SwitchCaseExample1 {
	public static void main(String[] args) {
		int dayno=5;
		String day;
		switch(dayno) {
		case 1:day="Monday";
		break;
		case 2:day="Tuesday";
		break;
		case 3:day="Wednesday";
		break;
		case 4:day="Thursday";
		break;
		case 5:day="Friday";
		break;
		case 6:day="Saturday";
		break;
		case 7:day="Sunday";
		break;
		default:day="Invalid dayno";
		}
		System.out.println(day);
		
	}

}
