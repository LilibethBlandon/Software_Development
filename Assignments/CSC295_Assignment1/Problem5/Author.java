/*
Lilibeth Blandon
Due Date: 02/15/2018
CSC 295-01

Description: Problem 5/5: *Author Class* with 3 private global variables and 5 methods.
*/


public class Author
{
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public char getGender()
	{
		return gender;
	}
	public String toString()
	{
		return "Author:" + name + " | Email:" + email + " | Gender:" + Character.toString(gender) + " | ";
	}
}