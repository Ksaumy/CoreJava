package Assignment2Polymorphism;

class Book // main class for book detail
{
	String title;
	String author;
	int year;
	String genre;
	
	 Book(String title, String author) //constructor for only title and author
	 {
		this.title = title;
		this.author = author;
	}

	 Book(String title, String author, int year) //constructor for  title,author and year
	 {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	 Book(String title, String author, int year, String genre) //constructor for title, author,year and genre
	 {
		this.title = title;
		this.author = author;
		this.year = year;
		this.genre = genre;
	}

	public String toString() // Help to print book detail
	 {
	        return "Title: " + title + ", Author: " + author + 
	               (year != 0 ? ", Year: " + year : "") + 
	               (genre != null ? ", Genre: " + genre : "");
	    }
}
//------------------------------------------------------------------
	 class ABook //class for adding the book 
	 {
	 void addBook(String title, String author)
	 {
		 Book book = new Book(title,author);
		 System.out.println("Book Added : " +book);
	 }
	 
	 void addBook(String title, String author, int year)
	 {
		 Book book = new Book(title,author,year);
		 System.out.println("Book Added : " +book);
	 }
	 void addBook(String title, String author, int year,String genre)
	 {
		 Book book = new Book(title,author,year,genre);
		 System.out.println("Book Added : " +book);
	 }
}
//------------------------------------------------------
public class LibraryManagementOverloading
{

	public static void main(String[] args)
	{
		ABook ab = new ABook(); //create object
		
		System.out.println("Method 1 ");
		ab.addBook("Java","Tej Sinha");
		
		
		System.out.println("Method 2 ");
		ab.addBook("Python","S.Kumar", 1985);
		
		
		System.out.println("Method 2 ");
		ab.addBook("c++","Sudha Kumari",1865,"Educational");
	}

}
