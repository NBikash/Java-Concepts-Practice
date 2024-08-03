package com.example.javapractice.method;

//Static block will execute before main method and only once and from top to button order
public class StaticBlockExample {
	static int a=101;   //single line static initializer
	static {                              //static block
		System.out.println(a+"**Kindly Verify All Pre-Condition before start Testing**");
	}
	public void Test() {
		System.out.println("Start Smoke Testing ");
	}
	public static void main(String[] args) {
		System.out.println("Main block start");
		StaticBlockExample s=new StaticBlockExample();
		s.Test();
	}
	static {
		System.out.println(a+1+"**Verify internet connection also**");
	}

}
