package week2.day1;

public class LibraryManagement 
{
	public static void main (String[]args) 
	{
		Library bookManagement = new Library();
		bookManagement.addBook("Book added successfully");
		bookManagement.issueBook();
	}
}
