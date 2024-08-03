package com.example.javapractice.method;

//Non static block will execute once per object creation ,from top to button order
public class Non_StaticBlockExample {
	{                                      //Non_Static block
		System.out.println("Non static block-1");
	}
	public void Test() {
		System.out.println("Testing Software");
	}
	public static void main(String[] args) {
		System.out.println("Main block start");
		Non_StaticBlockExample n=new Non_StaticBlockExample();
		n.Test();
		Non_StaticBlockExample nr=new Non_StaticBlockExample();
		nr.Test();
	}
	{
		System.out.println("Non static block-2");
	}

}
