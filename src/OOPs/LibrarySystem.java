package Assignment2OOPs;

class Book   //Class for BOOK
{
	String title;
	String author;
	boolean isIssued;
	 Book(String title, String author, boolean isIssued)   //Constructor
	 {
		this.title = title;
		this.author = author;
		this.isIssued = isIssued;
	}
	// Getter and Setter for Title
	 String getTitle()
	 {
	        return title;
    }
	void setTitle(String title) 
	{
	        this.title = title;
    }
	// Getter and Setter for author
    String getAuthor()
    {
        return author;
    }

   void setAuthor(String author)
    {
        this.author = author;
    }
   // Getter and Setter for isIssued
   boolean getIsIssued()
   {
       return isIssued;
   }
   void setIsIssued(boolean isIssued)
   {
       this.isIssued = isIssued;
   }
}
//-----------------------------------------------------------------------------------------------------------------------
class Member   //class for member
{
    String name;
    String memberId;
    String issuedBook;
    Member(String name, String memberId, String issuedBook) //constructor
    {
		super();
		this.name = name;
		this.memberId = memberId;
		this.issuedBook = issuedBook;
	}
    // Getter and Setter for name
    String getName()
    {
        return name;
    }
    void setName(String name)
    {
        this.name = name;
    }
    // Getter and Setter for memberId
   String getMemberId() 
   {
        return memberId;
    }
   void setMemberId(String memberId)
   {
        this.memberId = memberId;
    }
    // Getter and Setter for issuedBook
   String getIssuedBook()
   {
        return issuedBook;
    }
   void setIssuedBook(String issuedBook) 
   {
        this.issuedBook = issuedBook;
    }
}
//-------------------------------------------------------------------------------------------------------------------
class Library   //class for library
{
     Book[] bookList;
     Member[] memberList;
	Library(Book[] bookList, Member[] memberList)   //constructor
	{
		this.bookList = bookList;
		this.memberList = memberList;
	}
	 void issueBook(String title, String memberId)  //method for issue book to member
	 {
	        for (Book book : bookList) 
	        {
	            if (book.getTitle().equalsIgnoreCase(title) && !book.getIsIssued())
	            {
	                for (Member member : memberList) 
	                {
	                    if (member.getMemberId().equals(memberId) && member.getIssuedBook() == null)
	                    {
	                        book.setIsIssued(true);
	                        member.setIssuedBook(book.getTitle());
	                        System.out.println("Book '" + title + "' issued to " + member.getName());
	                        return;
	                    }
	                }
	            }
	        }
	        System.out.println("Book is not available : ");
	    }
	 void returnBook(String title, String memberId) // method to return the book from a member
	 {
	        for (Member member : memberList) 
	        {
	            if (member.getMemberId().equals(memberId) && member.getIssuedBook().equals(title)) 
	            {
	                for (Book book : bookList) 
	                {
	                    if (book.getTitle().equalsIgnoreCase(title)) 
	                    {
	                        book.setIsIssued(false);
	                        member.setIssuedBook(null);
	                        System.out.println("Book '" + title + "' returned by " + member.getName());
	                        return;
	                    }
	                }
	            }
	        }
	        System.out.println("Book return failed. Please check the details.");
	    }
	 
	 void searchByTitle(String title) //method to search book by title
	 {
	        for (Book book : bookList)
	        {
	            if (book.getTitle().equalsIgnoreCase(title)) 
	            {
	                String status = book.getIsIssued() ? "Not Available" : "Available";
	                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Status: " + status);
	                return;
	            }
	        }
	        System.out.println("No book found with the title '" + title + "'");
	    }
	 void searchByAuthor(String author) //method to search book by author
	 {
	        for (Book book : bookList) 
	        {
	            if (book.getAuthor().equalsIgnoreCase(author))
	            {
	                String status = book.getIsIssued() ? "Not Available" : "Available";
	                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Status: " + status);
	            }
	        }
	    }
}
//---------------------------------------------------------------------------------------------------------------------------
public class LibrarySystem 
{
	public static void main(String[] args) 
	{
		Book[] b = new Book[3];
        b[0] = new Book("AS you Know", "P.khan",true);
        b[1] = new Book("To Kill a bad guy", "x.x.khan", false);
        b[2] = new Book("how to learn", "sudha",true);
        
        Member[] m = new Member[2];
        m[0] = new Member("Saumya", "M001","true");
        m[1] = new Member("Bobby", "M002","false");
        
        Library l = new Library(b, m);
        
        l.issueBook("xyz", "M001");
        
        l.issueBook("how to learn", "M002");
        
        l.returnBook("AS you Know", "M001");
        
        l.searchByTitle("To Kill a bad guy");
        l.searchByAuthor("P.khan");
    }

}


