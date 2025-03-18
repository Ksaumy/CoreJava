package Assignment2OOPs;

class Product  //Product Class
{
	int productID;
	String productName;
	double price;
	int quantity;
	
	public Product(int productID, String productName, double price, int quantity)  //Constructor
	{
		this.productID = productID;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
   public String toString()   //method from object class
   {
		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
}
//---------------------------------------------------------
class ShoppingCart  //shopping class
{
	Product[] cart;
	int itemCount;
	final int MaxItem=5;
	
  
	public ShoppingCart() //constructor
	{
		cart = new Product[MaxItem];
		 itemCount=0;
	}

	void addToCart(Product p)  //method for adding item in cart
	{
		if (itemCount < MaxItem) 
		{
			cart[itemCount] =p;
			itemCount++;
			System.out.println("Add to the Cart : " +p.productName);
		}
		else 
		{
			System.out.println("Cart cannot add more producs:");
		}	
	}
	
	void removeFromCart(int productID)  //method for removing item from cart
	{
		boolean found = false;
		for (int i = 0; i<itemCount; i++)
		{
			if(cart[i].productID==productID)
			{
				found =true;
				for(int j =i; j<itemCount-1;j++)
				{
					cart[j]=cart[j+1];
				}
				cart[itemCount-1]=null;
				itemCount--;
				System.out.println("Prpduct with ID " +productID + "removed from cart ");
				break;
			}
		}
		if (!found)
		{
			System.out.println("Prpduct with ID " +productID + "not found in cart ");
		}
	}
	
	double calculateTotalBill()  //method for calculating bill
	{
		double total = 0;
		for(int i =0; i<itemCount; i++)
		{
			total += cart[i].price*cart[i].quantity;
		}
		return total;
	}
	void displayCart()   //method for display cart
	{
		if (itemCount == 0) 
		{
            System.out.println("Cart is empty.");
        } else
        {
            System.out.println("Shopping Cart:");
            for (int i = 0; i < itemCount; i++) 
            {
                System.out.println(cart[i].toString());
            }
	}

}
}

//----------------------------------------

public class ShoppingCartSystem    //Main class
{
	public static void main(String[] args) 
	{
		 ShoppingCart sc = new ShoppingCart();
		 Product p1 = new Product(101, "Iphone", 4500.00, 1);
	        Product p2 = new Product(102, "Smartphone", 5500.00, 2);
	        Product p3 = new Product(103, "Headphones", 570.00, 3);

	        
	        sc.addToCart(p1);
	        sc.addToCart(p2);
	        sc.addToCart(p3);
	        
	        sc.displayCart();
	        
	        sc.removeFromCart(102);
	        
	        sc.displayCart();
	        
	        double totalBill = sc.calculateTotalBill();
	        System.out.println("Total Bill: $" + totalBill);
	}

}
