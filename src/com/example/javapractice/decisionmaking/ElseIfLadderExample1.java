package com.example.javapractice.decisionmaking;


//DAY	SPORTS/GAME
//Monday	Cricket
//Tuesday	Football
//Wednesday	Hockey
//Thursday	Kabbadi
//Friday	Tennis
//Sat-Sun	Weekly off
public class ElseIfLadderExample1 {
	public static void main(String[] args) {
		String day="Sunday";
		if(day=="Monday") {
			System.out.println("Play Cricket");
		}
		else if(day=="Tuesday") {
			System.out.println("Play Football");
		}
		else if(day=="Wednesday") {
			System.out.println("Hockey");
		}
		else if(day=="Thursday") {
			System.out.println("Kabbadi");
		}
		else if(day=="Friday") {
			System.out.println("Tennis");
		}
		else if(day=="Saturday" || day=="Sunday") {
			System.out.println("Weekly off");
		}
			
			
	}

}
