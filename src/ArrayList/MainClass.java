package Assignment3ArrayList;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		LibraryManagementSystem lm = new LibraryManagementSystem();
		Scanner sc = new Scanner(System.in);
		boolean continueRunning = true;
		 while(continueRunning)
		 {
			 System.out.println("\nLibrary Management System");
	            System.out.println("1. Add Book");
	            System.out.println("2. Remove Book");
	            System.out.println("3. Search Book");
	            System.out.println("4. Display All Books");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();
	            if(choice==1)
	            {
	            	System.out.println("ENTER TITLE :");
	            	 String title = sc.nextLine();
	                 System.out.print("Enter author: ");
	                 String author = sc.nextLine();
	                 System.out.print("Enter ISBN: ");
	                 String isbn = sc.nextLine();
	                 System.out.print("Enter publication year: ");
	                 int year = sc.nextInt();
	                 sc.nextLine();
	                 Book book = new Book(title, author, isbn, year);
	                 lm.addBook(book);
	            }
	            else if (choice == 2)
	            {
	                System.out.print("Enter ISBN of the book to remove: ");
	                String isbnToRemove = sc.nextLine();
	                lm.removeBook(isbnToRemove);
	            }
	            else if (choice == 3) {
	                System.out.print("Enter title to search: ");
	                String searchTitle = sc.nextLine();
	                Book foundBook = lm.searchBook(searchTitle);
	                if (foundBook != null) {
	                    System.out.println("Book found: " + foundBook);
	                } else {
	                    System.out.println("Book not found.");
	                }

	            } else if (choice == 4) {
	                lm.displayAllBooks();

	            } else if (choice == 5) {
	                System.out.println("Exiting the system.");
	                continueRunning = false;  // Exit the loop

	            } else {
	                System.out.println("Invalid choice. Please try again.");
	            }
	            
		 }
		
	}

}
