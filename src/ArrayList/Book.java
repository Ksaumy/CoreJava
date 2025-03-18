package Assignment3ArrayList;

public class Book 
{
	String title;
	String author;
	String isbn;
	int publicationYear;
    Book(String title, String author, String isbn, int publicationYear) 
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publicationYear = publicationYear;
	}
	
	String getTitle()
	{
		return title;
	}
	String getAuthor()
	{
		return author;
	}
	String getIsbn()
	{
		return isbn;
	}
	int getPublicationYear()
	{
		return publicationYear;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", publicationYear=" + publicationYear
				+ "]";
	}
	

}
