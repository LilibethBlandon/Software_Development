/*
Lilibeth Blandon
Due Date: 02/15/2018
CSC 295-01

Description: Problem 2/5: prime numbers and maximum divisors program
*/

import java.util.Scanner;

public class RepetitionAndMethods
{
	public static void printPrimes(int n)
	{
		int counter = 0;
		System.out.println();
		System.out.print("Prime Numbers: ");
		for(int i=2; i<=n; i++)
		{
			for(int j=i; j>0; j--)
			{
				if(i!=j && i%j==0)
				{
					counter++;
				}
				//System.out.print("Number" + i + "counter=" + counter + ", ");
			}
			if(counter<=1)
			{
				System.out.print(i + ",");
			}
			counter = 0;
		}
		System.out.println();
	}
	
	public static void maximumDivisors(int n)
	{
		int counter = 0;
		int maximumNumber = 0;
		int maximumNumberOfDivisors=0;
		
		String maximumNumbers = "";
		
		System.out.println("");
		for(int i=1; i<=n; i++)
		{
			//System.out.println("TESTING");
			for(int j=i; j>=1; j--)
			{
				if(i%j==0)
				{
					//System.out.println(i +  "/" + j + "COUNTER" + counter);
					counter++;
				}
			}
			if(counter>=maximumNumberOfDivisors)
			{
				maximumNumberOfDivisors = counter;
				maximumNumber = i;
			}
			counter=0;
		}
		System.out.println(maximumNumber + " is the number with the maximum number of divisors with the range [1, " + n + "]");
		System.out.println("It has " + maximumNumberOfDivisors + " of divisors.");	
	}
	
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number to print out all the prime numbers: ");
		int n = keyboard.nextInt();
		
		printPrimes(n);
		
		System.out.print("Enter a number to print maximum divisors: ");
		int m= keyboard.nextInt();
		
		maximumDivisors(m);
	}
}