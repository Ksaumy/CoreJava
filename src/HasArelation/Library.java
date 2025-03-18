package Assignment2HasArelation;

public class Library 
{
	String name;
	String location;
	Book b;

	public Library(String name, String location, Book b)
	{
		this.name = name;
		this.location = location;
		this.b = b;
	}
	void dispLibrary()
	{
		System.out.println("Display Details of Library : "); 
		System.out.println("Library Name :" +name + "    "+ "Library Location :" +location );
		System.out.println("Display Details of Book : ");
		System.out.println("Book Title :" + b.title + "     "+"Book Author :"+ b.author+"    " +"Book ISBN :"+b.isbn);
	}
	
	public static void main(String[] args)
	{
		Book b1 = new Book("As you say","Sudha Murty",978);
		Book b2=new Book("Complete Java","Sumita Arora",8796);
		
		Library l1=new Library("DAC","BLR",b1);
		Library l2=new Library("SRMCEM","LUCKNOW",b2);
		l1.dispLibrary();
		l2.dispLibrary();

	}

}
