package com.example.javapractice.method;

public class MainMethodOverloading {
	public static void main() {
		System.out.println("Main Method Overloading");
	}
    public static void main(int a) {
		System.out.println(a);
	}
    public static void main(String[] args) {
		main();
		main(10);
	}

}
