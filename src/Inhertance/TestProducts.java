package Assignment2Inhertance;

class Product  //super class
{
	int productId;
	String productName;
	Product(int productId, String productName)  //Constructor
	{
		this.productId = productId;
		this.productName = productName;
	}
	 void displayProductInfo()    //Method
	 {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
   }

}
//-----------------------------------------------------------------
class Electronics extends Product     //Sub Class
{
	int warrantyPeriod;

	Electronics(int productId, String productName, int warrantyPeriod) // Constructor
	{
		super(productId, productName);
		this.warrantyPeriod = warrantyPeriod;
	}
	void displayProductInfo()     //method
	{
        super.displayProductInfo();  
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}
//------------------------------------------------------------------
class Clothing extends Product    //Sub Class
{
	String size;
	Clothing(int productId, String productName, String size)   //Constructor
	{
		super(productId, productName);
		this.size = size;
	}
	  void displayProductInfo()    //Method
	  {
	        super.displayProductInfo();  
	        System.out.println("Size: " + size);
	  }
}

//-------------------------------------------------------------------
public class TestProducts 
{

	public static void main(String[] args) 
	{
		 Electronics ep = new Electronics(101, "Laptop", 2);
	     System.out.println("Electronics Product Info:");
	     ep.displayProductInfo();  

	     System.out.println("-----------------"); 
	        
	     Clothing cp = new Clothing(202, "T-Shirt", "L");
	     System.out.println("Clothing Product Info:");
	     cp.displayProductInfo(); 
	}
}
