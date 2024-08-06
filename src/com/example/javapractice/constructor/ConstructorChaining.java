package com.example.javapractice.constructor;

//Constructor chaining , Application of this(),, [This call statement]
public class ConstructorChaining {
	String brand;
	String colour;
	int price;
	ConstructorChaining(String brand){
		this.brand=brand;
	}
	ConstructorChaining(String brand,String colour){
		this(brand);
		this.colour=colour;
	}
	ConstructorChaining(String brand,String colour,int price){
		this(brand,colour);
		this.price=price;
	}
	public static void main(String[] args) {
		ConstructorChaining c=new ConstructorChaining("Camlin");
		System.out.println("Brand-->"+c.brand);
		System.out.println("Colour-->"+c.colour);
		System.out.println("price-->"+c.price);
		System.out.println("-------------------------");
		ConstructorChaining c1=new ConstructorChaining("Apsara","Black");
		System.out.println("Brand-->"+c1.brand);
		System.out.println("Colour-->"+c1.colour);
		System.out.println("price-->"+c1.price);
		System.out.println("-------------------------");
		ConstructorChaining c2=new ConstructorChaining("Apsara","Black",25);
		System.out.println("Brand-->"+c2.brand);
		System.out.println("Colour-->"+c2.colour);
		System.out.println("price-->"+c2.price);
		
		
	}

}



