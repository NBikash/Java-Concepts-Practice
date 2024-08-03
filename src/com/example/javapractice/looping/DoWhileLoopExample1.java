package com.example.javapractice.looping;

//WAJP to find sum of a integer i.e.45621 using do while loop
//i.e O/P should be 4+5+6+2+1=?
public class DoWhileLoopExample1 {
	public static void main(String[] args) {
		int a=45621;
		int sum=0;
		do {
			int rem=a%10;
			sum=sum+rem;
			a=a/10;
			
		}
		while(a>0);
		System.out.println(sum);
	}

}
