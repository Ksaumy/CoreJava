package Assignment2OOPs;

class ProductInventory
{
	int productID;
	String productName;
	int stockQuantity;
	double price;
	public ProductInventory(int productID, String productName, int stockQuantity, double price)
	{
		this.productID = productID;
		this.productName = productName;
		this.stockQuantity = stockQuantity;
		this.price = price;
	}
	void addStock(int quantity)
	{
		if(quantity>0)
		{
			stockQuantity +=quantity;
			System.out.println(quantity + "units added to : " + productName + " Current Stock: " + stockQuantity);
		}
		else
		{
			System.out.println("Invalid quantity ");
		}
	}
	void removeStock(int quantity)
	{
		if (quantity > 0 && stockQuantity >= quantity)
		{
			stockQuantity -= quantity;
			System.out.println(quantity + " units removed form : " + productName + ". Current Stock: " + stockQuantity);
		}
		else if (quantity > stockQuantity)
		{
			System.out.println("Insufficient stock to remove " + quantity + " units. Current Stock: " + stockQuantity);
		}
		else
		{
			System.out.println("Invalid Quantity");
		}
	}
	void displayStock()
	{
		System.out.println("Product ID: " + productID + ", Product Name: " + productName +
                ", Stock Quantity: " + stockQuantity + ", Price: $" + price);
	}
}
//--------------------------------------------------------


public class InventoryManagementSystem {

	public static void main(String[] args)
	{
		ProductInventory p1 = new ProductInventory(101,"Iphone",30,30000.0);
		ProductInventory p2 =new ProductInventory(201,"Watch",20,4000.0);
		ProductInventory p3 =new ProductInventory(301,"Laptop",10,50000.0);

		p1.displayStock();
		p2.displayStock();
		p3.displayStock();
		
		p1.addStock(50);
		p2.removeStock(10);
		p3.removeStock(2);
		
		p1.displayStock();
		p2.displayStock();
		p3.displayStock();
	}

}
