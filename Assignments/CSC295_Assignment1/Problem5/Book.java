/*
Lilibeth Blandon
Due Date: 02/15/2018
CSC 295-01

Description: Problem 5/5: *Book Class* with 4 private global variables and 7 methods. It uses encapsulation.
*/

public class Book  
{
	private String name;
	private Author author;
	private double price;
	private int qty=0;
	
	public Book(String name, Author author, double price)
	{
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book(String name, Author author, double price, int qty)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public String getName()
	{
		return name;
	}
	public Author getAuthor()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public int getQty()
	{
		return qty;
	}
	public void setQty(int qty)
	{
		this.qty = qty;
	}
	public String toString()
	{
		return "Book:" + this.name + " | Author: " + author.getName() + " | Price: " + this.price + " | Quantity: " + this.qty; 
	}
	
	
}