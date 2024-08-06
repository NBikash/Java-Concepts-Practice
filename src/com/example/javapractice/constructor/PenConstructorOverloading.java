package com.example.javapractice.constructor;

public class PenConstructorOverloading {
	String brand;
	String colour;
	int price;
	PenConstructorOverloading(String brand){
		this.brand=brand;
	}
	PenConstructorOverloading(String brand,String colour){
		this.brand=brand;
		this.colour=colour;
	}
	PenConstructorOverloading(String brand,String colour,int price){
		this.brand=brand;
		this.colour=colour;
		this.price=price;
	}
	public static void main(String[] args) {
		PenConstructorOverloading c=new PenConstructorOverloading("Camlin");
		System.out.println("Brand-->"+c.brand);
		System.out.println("Colour-->"+c.colour);
		System.out.println("price-->"+c.price);
		System.out.println("-------------------------");
		PenConstructorOverloading c1=new PenConstructorOverloading("Apsara","Black");
		System.out.println("Brand-->"+c1.brand);
		System.out.println("Colour-->"+c1.colour);
		System.out.println("price-->"+c1.price);
		System.out.println("-------------------------");
		PenConstructorOverloading c2=new PenConstructorOverloading("Apsara","Black",25);
		System.out.println("Brand-->"+c2.brand);
		System.out.println("Colour-->"+c2.colour);
		System.out.println("price-->"+c2.price);
		
		
	}

}
