package com.example.javapractice.constructor;

public class NoArguementConstructorExample {
	int quantity=10;
	String brand;
	int price;
	public void selling() {
		System.out.println("Sell starts Soon");
	}
	NoArguementConstructorExample(){
		System.out.println("Total Quantity Available--->"+quantity);
		if(brand==null) {
			brand="Not Mentioned !!!";
			System.out.println("Brand Name--->"+brand);
		}
		else {
			System.out.println("Brand Name--->"+brand);
		}
		System.out.println("Price PerUnit--->"+price);
	}
	public static void main(String[] args) {
		System.out.println("Product Details");
		NoArguementConstructorExample n=new NoArguementConstructorExample();
		n.selling();
	}

}
