package com.example.javapractice.method;

//Method with returntype and without formal arguments
public class MethodExample1 {
	public static int test() {
		int a=10;
		return a;
	}
	public static void main(String[] args) {
		int res=test();
		System.out.println(res);
		//or
		System.out.println(test());
	}

}
