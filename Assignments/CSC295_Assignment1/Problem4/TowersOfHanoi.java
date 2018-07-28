/*
Lilibeth Blandon
Due Date: 02/15/2018
CSC 295-01

Description: Problem 4/5: Recursive towers of hanoi
*/

import java.util.Scanner;

public class TowersOfHanoi
{
	
	public static void hanoi(int n, char source, char destination, char temp)
	{
		if(n==1)
		{
			System.out.println("Move a disk from " + source + " to " + destination);
			return;
		}
		else
		{
			hanoi((n-1), source, temp, destination);
			System.out.println("Move a disk from " + source + " to " + destination);
			
			hanoi((n-1), temp, destination, source);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number of pegs: ");
		int pegs = keyboard.nextInt();
		
		
		hanoi(pegs, 'A', 'B', 'C');
		
		
		
		
		
	}
}