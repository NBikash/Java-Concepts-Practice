package com.example.javapractice.method;

public class MethodExample5A {
	public static void main(String[] args) {
		String bold = "\033[1m";
		String reset = "\033[0m";
		System.out.println(bold+"Calling methods from class---> 'MethodExample5'"+reset);
		MethodExample5.Test();
		MethodExample5 m=new MethodExample5();
		m.Devlopment();
		String res=m.Devops();
		System.out.println(res);
		
	}

}
