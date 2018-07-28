/*
Lilibeth Blandon
Due Date: 02/15/2018
CSC 295-01

Description: Problem 1/5: Diamond with X's.
*/

import java.util.Scanner;

public class MorePictures
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int n;
		System.out.println("Enter an integer");
		n= keyboard.nextInt();
		
		//upper half
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i)-1; k++)
			{
				System.out.print("X");
			}
			System.out.println();
		}
		
		//Lower half
		for(int i=n; i>=1; i--)
		{
			for(int j=n; j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=(2*i)-1; k>=1; k--)
			{
				System.out.print("X");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}