package com.example.javapractice.looping;

//   * * * * * 
//   * * * * * 
//   * * * * *
//   * * * * * 
public class NestedForLoopExample {
	public static void main(String[] args) {
		int row=4;
		int col=5;
		for(int a=1;a<=row;a++)
		{
			for(int b=1;b<=col;b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
