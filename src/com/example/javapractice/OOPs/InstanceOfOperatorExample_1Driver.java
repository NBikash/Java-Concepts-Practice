package com.example.javapractice.OOPs;

public class InstanceOfOperatorExample_1Driver {
	public static void main(String[] args) {
		InstanceOfOperatorExample_1A i=new InstanceOfOperatorExample_1B();
		i.Work();
		if(i instanceof InstanceOfOperatorExample_1B)
		{
			InstanceOfOperatorExample_1B in=(InstanceOfOperatorExample_1B)i;
			in.Work();
			in.Test();
		}
		else if(i instanceof InstanceOfOperatorExample_1C) {
			InstanceOfOperatorExample_1C in=(InstanceOfOperatorExample_1C)i;
			in.Work();
			in.dev();			
		}
		else
		{
			System.out.println("i is not having any intance");
		}
	
		
		
		
	}

}
