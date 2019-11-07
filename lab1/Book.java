//Daniel Wang 89303114
//Victoria Lai 49451704

package lab1;

public class Book
{
	private int numOfPages = 0;
	private int yearPub	= 0;
	private double price = 0.0;
	private String title = "";
	private Author author;
	
	//default constructor
	public Book()
	{
		this.author = new Author();
	}
	// copy constructor
	public Book(Book b)
	{
		this.numOfPages = b.numOfPages;
		this.yearPub = b.yearPub;
		this.price = b.price;
		this.title = b.title;
		this.author = new Author(b.author);
	}
	////Getters/Accessors
	//returns number of pages in the book
	public int getNumOfPages()
	{
		return numOfPages;
	}
	//returns year the book was published
	public int getYearPub()
	{
		return yearPub;
	}
	//returns the price of the book
	public double getPrice()
	{
		return price;
	}
	//returns title of the book
	public String getTitle()
	{
		return title;
	}
	//returns Book's author information
	public Author getAuthor()
	{
		return author;
	}
	
	////Setters/Mutators
	//changes number of pages
	public void setNumOfPages(int numOfPages)
	{
		this.numOfPages = numOfPages;
	}
	//changes value year the book was published
	public void setYearPub(int yearPub)
	{
		this.yearPub = yearPub;
	}
	//changes the price of the book
	public void setPrice(double price)
	{
		this.price = price;
	}
	//changes title of the book
	public void setTitle(String title)
	{
		this.title = title;
	}
	//changes Book's author information given an "Author"
	public void setAuthor(String firstName, String lastName, int birthYear, int numOfPub)
	{
		this.author.setFirstName(firstName);
		this.author.setLastName(lastName);
		this.author.setBirthYear(birthYear);
		this.author.setNumOfPub(numOfPub);
	}
	//increments number of author's publications by one
	public void incrementPub()
	{
		this.author.setNumOfPub(this.author.getNumOfPub()+1);
	}
	//overloaded .toString method
	public String toString()
	{
		return "Title: " + this.title + "\n" + 
		"Published in: " + this.yearPub + "\n" +
		"Number of Pages: " + this.numOfPages + "\n" +
		"Price: " + this.price + "\n" + 
		"Written by " + this.author.getFirstName() + " " + this.author.getLastName() + 
		", who was born in " + this.author.getBirthYear() + 
		" and has " + this.author.getNumOfPub() + " publications";
	}
}
 