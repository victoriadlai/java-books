//Daniel Wang 89303114
//Victoria Lai 49451704

package lab1;

public class Author
{
	private String firstName = "blah";
	private String lastName = "blah";
	private int birthYear = 0;
	private int numOfPub = 0;
	
	//default constructor
	public Author()
	{}
	//copy constructor
	public Author( Author a)
	{
		this.firstName = a.firstName;
		this.lastName = a.lastName;
		this.birthYear = a.birthYear;
		this.numOfPub = a.numOfPub;
	}
	////Getter/Accessor
	//returns first name of author
	public String getFirstName()
	{
		return firstName;
	}
	//returns last name of author
	public String getLastName()
	{
		return lastName;
	}
	//returns birth year of author
	public int getBirthYear()
	{
		return birthYear;
	}
	//returns number of publications by author
	public int getNumOfPub()
	{
		return numOfPub;
	}
	////Setter/Mutator
	//changes value of author's first name
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	//changes value of author's last name
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	//changes value of author's birth year
	public void setBirthYear(int birthYear)
	{
		this.birthYear = birthYear;
	}
	//changes value of author's number of publications
	public void setNumOfPub(int numOfPub)
	{
		this.numOfPub = numOfPub;
	}
}
