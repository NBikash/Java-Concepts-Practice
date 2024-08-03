package com.example.javapractice.method;

//Print all numbers from 1 to 5 using Method recursion
public class MethodRecurssionExample {
	public void num(int start,int end) {
		if(start<=end) {
			System.out.println(start);
			start++;
			num(start,end);
		}
		
	}
	public static void main(String[] args) {
		MethodRecurssionExample ms=new MethodRecurssionExample();
		ms.num(1,5);
	}

}
