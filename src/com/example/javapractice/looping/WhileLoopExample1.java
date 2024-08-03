package com.example.javapractice.looping;

//WAJP to print number of digits present in 475689
public class WhileLoopExample1 {
	public static void main(String[] args) {
		int num=475689;
		int dnum=num;
		int count=0;
		while(dnum>0) {
			dnum=dnum/10;
			count++;
		}
		System.out.println("Total number of digits present in "+num+" is "+count);
	}

}
