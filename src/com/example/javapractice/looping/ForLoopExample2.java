package com.example.javapractice.looping;

//Print all even numbers present in between 1 to 10 using for loop
public class ForLoopExample2 {
	public static void main(String[] args) {
		for(int a=1;a<=10;a++)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
		}
	}

}
