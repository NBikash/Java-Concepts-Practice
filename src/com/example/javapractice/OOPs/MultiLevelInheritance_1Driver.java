package com.example.javapractice.OOPs;

public class MultiLevelInheritance_1Driver {
	public static void main(String[] args) {
		MultiLevelInheritance_1A m=new MultiLevelInheritance_1A();
		m.work();
		System.out.println("***************************");
		MultiLevelInheritance_1B m1=new MultiLevelInheritance_1B();
		m1.work();
		m1.dev();
		System.out.println("***************************");
		MultiLevelInheritance_1C m2=new MultiLevelInheritance_1C();
		m2.work();
		m2.dev();
		m2.test();
	}

}
