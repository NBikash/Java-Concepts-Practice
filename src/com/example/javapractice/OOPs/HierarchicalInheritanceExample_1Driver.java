package com.example.javapractice.OOPs;

public class HierarchicalInheritanceExample_1Driver {
	public static void main(String[] args) {
		HierarchicalInheritanceExample_1B h=new HierarchicalInheritanceExample_1B();
		System.out.println("Bike cost--->"+h.cost);
		h.bike();
		System.out.println("*********************************");
		HierarchicalInheritanceExample_1C h1=new HierarchicalInheritanceExample_1C();
		System.out.println("Car cost--->"+h1.cost);
		h1.car();
		
		
	}

}
