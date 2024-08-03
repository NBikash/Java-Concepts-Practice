package com.example.javapractice.method;

public class MethodOverloadingExample1 {
	public void amazonLogin(long contactNo,int OTP) {
		System.out.println("Mobile number --> "+contactNo);
		System.out.println("OTP --> "+OTP);
	}
	public void amazonLogin(String email,String Password) {
		System.out.println("E-Mail --> "+email);
		System.out.println("Password --> "+Password);
	}
	public static void main(String[] args) {
		MethodOverloadingExample1 m=new MethodOverloadingExample1();
		m.amazonLogin("test12@gmail.com","Password@123");
		m.amazonLogin(9999999999L, 1878);
	}

}
