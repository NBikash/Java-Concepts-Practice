package com.example.javapractice.method;


//Method with returntype and with formal arguments
public class MethodExample3 {
	public static String test(String name) {
		return name;
	}
	public static void main(String[] args) {
		String res=test("Testing");
		System.out.println(res);
		//or
		System.out.println(test("Development"));
	}

}
