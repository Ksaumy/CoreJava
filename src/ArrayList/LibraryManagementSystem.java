package Assignment3ArrayList;

import java.util.ArrayList;

public class LibraryManagementSystem
{
	ArrayList<Book> bookCollection;

	 LibraryManagementSystem()
	 {
		 bookCollection = new ArrayList<>();
	 }
	void addBook(Book book)
	{
		bookCollection.add(book);
		System.out.println("Book added :"+book.getTitle());
	}
	void removeBook(String isbn)
	{
		Book bookToRemove = null;
		for(Book book : bookCollection)
		{
			if(book.getIsbn().equals(isbn))
			{
				bookToRemove = book;
				break;
			}
		}
		if (bookToRemove != null)
		{
			bookCollection.remove(bookToRemove);
			System.out.println("Book removed :" + bookToRemove.getTitle());
		}
		else
		{
			System.out.println("Book with ISBN " +isbn + "not found");
		}
	}

       public Book searchBook(String title) 
       {
         for (Book book : bookCollection)  
          {
            if (book.getTitle().equalsIgnoreCase(title))
            {
              return book;
            }
           }
         return null;
      }

       public void displayAllBooks() 
       {
         if (bookCollection.isEmpty()) 
         {
            System.out.println("No books in the collection.");
         } 
         else 
         {
           System.out.println("Book Collection:");
           for (Book book : bookCollection) 
           {
             System.out.println(book);
         }
        }
       }
}
    
