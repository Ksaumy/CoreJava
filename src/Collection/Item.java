package Assignment3Collection;

import java.util.HashMap;
import java.util.Map;


 public class Item 
{
	String name;
	int quantity;
	double price;

	public Item(String name, int quantity, double price) 
	{
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Item [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
}

 class InventoryManagementSystem 
{
	HashMap<Integer, Item> inventory = new HashMap<>();
	void addItem(int itemId, Item item)
	{
		if(inventory.containsKey(itemId))
		{
			System.out.println("Error Item with Id :" +itemId );
		}
		else
		{
			inventory.put(itemId, item);
			System.out.println("Item added :"+item);
		}
	}
	void updateQuantity(int itemId, int newQuantity)
	{
		Item item = inventory.get(itemId);
		if(item != null)
		{
			item.quantity = newQuantity;
			System.out.println("Updated item quantity :"+item);
		}
		else
		{
		  System.out.println("Error Item with Id"+itemId);	
		}
	}
	Item getItem(int itemId)
	{
		Item item = inventory.get(itemId);
		if(item != null)
		{
			return item;
		}
		else
		{
			System.out.println("Error Item with Id :"+itemId);
			return null;
		}
	}
	void removeItem(int itemId)
	{
		Item removedItem = inventory.remove(itemId);
		if (removedItem != null)
		{
			System.out.println("Removed Item :"+removedItem);
		}
		else
		{
			System.out.println("Error Item with Id :"+itemId);
		}
	}
	void displayInventory()
	{
		if(inventory.isEmpty())
		{
			System.out.println("Inventory is empty.");
		}
		else
		{
			System.out.println("Current Inventory:");
			for(Map.Entry<Integer,Item> entry : inventory.entrySet())
			{
				System.out.println("ID :"+ entry.getKey() + ","+entry.getValue());
			}
		}
	}
	public static void main(String[] args) 
	{
		InventoryManagementSystem ims = new InventoryManagementSystem ();
		 ims.addItem(101,new Item("Widget", 50, 19.99));
		 ims.addItem(102,new Item("XYZ", 70, 99.99));
		 ims.addItem(103,new Item("Watch", 150,519.99));
		 
		 ims.updateQuantity(101,75);
		 
		 Item retrievedItem = ims.getItem(103);
	        if (retrievedItem != null)
	        {
	            System.out.println("Retrieved item: " + retrievedItem);
	        }
	        ims.removeItem(102);
	        
	        ims.addItem(101,new Item("Widget", 50, 19.99));
	        ims.displayInventory();
	        ims.removeItem(99);
	        
		
	}
}