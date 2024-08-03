package com.example.javapractice.looping;

//   *  *  *  *  *
//   *           *
//   *           *
//   *  *  *  *  *
public class NestedForLoopExample1 {
	public static void main(String[] args) {
		int row=4;
		int col=5;
		for(int a=1;a<=row;a++)
		{
			for(int b=1;b<=col;b++)
			{
				if(a==1||a==row || b==1||b==col)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
