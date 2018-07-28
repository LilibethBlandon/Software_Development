/*
Lilibeth Blandon
Due Date: 02/15/2018
CSC 295-01

Description: Problem 3/5: Reverse an array recursively.
*/

import java.util.Scanner;

public class ReverseAnArray
{
	public static int [] reverseArray(int [] a, int beginning, int end)
	{
		int temp = 0;
		if(beginning==(a.length/2)-1) //BASE CASE
		{
			//System.out.println("IF STATEMENT"+"Beginning=" + beginning + "End=" + end);
			temp = a[beginning];
			a[beginning] = a[end];
			a[end] = temp;
			return a;
		}
		temp = a[beginning];
		a[beginning] = a[end];
		a[end] = temp;
		//System.out.println("Beginning=" + beginning + "End=" + end);
		return reverseArray(a, beginning+1, end-1); //RECURSION
		
	}	
	
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int [] a = new int[10];
		int [] b = new int[a.length];
		
		System.out.println("Enter 10 numbers. Press enter for every number you type");
		
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = keyboard.nextInt();
		}
		
		
		
		
		System.out.println("OLD ARRAY");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + ",");
		}
		
		System.out.println();
		b = reverseArray(a, 0, a.length-1);
		
		System.out.println();
		System.out.println("NEW ARRAY");
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i] + ",");
		}
		
		
	}
}