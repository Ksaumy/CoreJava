package Assignment2OOPs;


import java.util.Scanner;

class BookManage
{
	String title;
	String author;
	Double price;
	String ISBN;
	
	void readBookManage()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter title : ");
		title = s.nextLine();
		
		System.out.println("Enter author :");
		author = s.nextLine();
		
		System.out.println("Enter price :");
		price = s.nextDouble();
		
		System.out.println("Enter ISBN :");
		ISBN = s.next();

	}
	void getBookManage(String tit, String auth, double pr, String isbm)
	{
		title = tit;
	    author = auth;
		price = pr;
		ISBN = isbm;
	
	}
	void setBookManage(String tit, String auth, double pr, String isbm)
	{
		title = tit;
	    author = auth;
		price = pr;
		ISBN = isbm;	
	}
	void displayBookManage()
	{
		 System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: $" + price);
	        System.out.println("ISBN: " + ISBN);
	}
	void applyDiscountBookManage(double discount)
	{
		if(discount>0 && discount<100)
		{
			price -= price*(discount/100);
		}
		else
		{
			System.out.println("Invalid Discount ");
		}
		
	}

}

public class BookManagementSystem {

	public static void main(String[] args)
	{
		BookManage b = new BookManage();
		
		b.readBookManage();
		System.out.println("Original Book Details:");
		
		b.displayBookManage();
		System.out.println("Applying 10% Discount:");
		
		b.applyDiscountBookManage(10);
		System.out.println("Book Details after Discount:");
		
        b.displayBookManage();
	
	}

}