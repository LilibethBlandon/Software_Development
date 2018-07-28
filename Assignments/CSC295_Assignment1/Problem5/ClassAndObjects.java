/*
Lilibeth Blandon
Due Date: 02/15/2018
CSC 295-01

Description: Problem 5/5: *Tester Class* it tests Book and Author Class
*/


import java.util.Scanner;

public class ClassAndObjects
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Author lily = new Author("Lily", "lilybee@gmail.com", 'f');
		
		String author = lily.toString();
		
		System.out.println(author + "\n");
		
		
		Book b = new Book("Harry Potter", lily, 15.50, 2);
		
		String bookInformation = b.toString();
		
		System.out.println(bookInformation);
		
		
		
	}
}