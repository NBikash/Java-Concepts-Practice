package com.example.javapractice.method;

public class MethodOverloadingExample {
	public void Test() {
		System.out.println("Manual Testing");
	}
	public void Test(int a) {
		System.out.println("Automation Testing");
	}
	public void Test(int a,char b) {
		System.out.println("API Testing");
	}
	public void Test(String res) {
		System.out.println("Database atesting");
	}
	public void Test(char a,int b) {
		System.out.println("Embedded Testing");
	}
	public static void main(String[] args) {
		MethodOverloadingExample m=new MethodOverloadingExample();
		m.Test(1,'j');
		m.Test('g', 5);
		m.Test("ETL DB");
		m.Test(9);
		m.Test();
	}

}
