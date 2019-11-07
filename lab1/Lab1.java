//Daniel Wang 89303114
//Victoria Lai 49451704

package lab1;

public class Lab1
{
	public static void main(String[] args)
	{
		System.out.println("--CREATION OF A BOOK--");
		// Create a new book with default values for all attributes
		Book book = new Book();
		// Set the appropriate fields for the book�s objects
		book.setTitle("Harry Potter and the Goblet of Fire");
		book.setPrice(12.99);
		book.setYearPub(2000);
		book.setNumOfPages(734);
		book.setAuthor("J.K.", "Rowling", 1965, 7);
		// Prints out the state of the book.
		System.out.println(book.toString());
		
		//makes a copy of first book and prints
		System.out.println();
		System.out.println();
		System.out.println("--COPY CONTRUCTOR TEST--");
		Book book2 = new Book(book);
		System.out.println(book2.toString());
		
		//increments number of publications by author of book2
		//then prints each book
		System.out.println();
		System.out.println();
		System.out.println("--INCREMENTED PUBLICATION--");
		book2.incrementPub();
		System.out.println();
		System.out.println("-ORIGINAL BOOK-");
		System.out.println(book.toString());
		System.out.println();
		System.out.println("-BOOK2-");
		System.out.println(book2.toString());
	}
}
