package Assignment3FileHandling.ObjectBasedFileHandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectBasedFileManagementSystem 
{
	public static void main(String[] args) throws IOException , ClassNotFoundException
	{
		 List<Person> persons = new ArrayList<>();
	        FileManager fileManager = new FileManager();
	         Scanner sc = new Scanner(System.in);
	         boolean exit = false;
	         
	         while (!exit) {
	             System.out.println("\n--- File Management System ---");
	             System.out.println("1. Add a new Person");
	             System.out.println("2. Save Persons to file");
	             System.out.println("3. Load Persons from file");
	             System.out.println("4. Display all Persons");
	             System.out.println("5. Search Person by name");
	             System.out.println("6. Exit");
	             System.out.print("Choose an option: ");
	             int choice = sc.nextInt();
	             sc.nextLine();
	             
	             switch (choice) 
	             {
	                case 1:
	                    
	                    System.out.print("Enter name: ");
	                    String name = sc.nextLine();
	                    
	                    System.out.print("Enter age: ");
	                    while (!sc.hasNextInt()) 
	                    {
	                        System.out.println("Invalid input. Please enter a valid age.");
	                        sc.next();  
	                    }
	                    int age = sc.nextInt();
	                    sc.nextLine(); 
	                    System.out.print("Enter email: ");
	                    String email = sc.nextLine();
	                    while (!email.contains("@") || !email.contains("."))
	                    {
	                        System.out.println("Invalid email. Please enter a valid email address.");
	                        email = sc.nextLine();
	                    }
	                    persons.add(new Person(name, age, email));
	                    System.out.println("Person added successfully.");
	                    break;
	                    
	                case 2:
	                    System.out.print("Enter file name to save (e.g., persons.dat): ");
	                    String saveFileName = sc.nextLine();
	                    try {
	                        fileManager.writePersons(persons, saveFileName);
	                    }
	                    
	                    catch (IOException e)
	                    {
	                        System.out.println("Error saving persons to file: " + e.getMessage());
	                    }
	                    break;

	                case 3:
	                    // Load Persons from file
	                    System.out.print("Enter file name to load (e.g., persons.dat): ");
	                    String loadFileName = sc.nextLine();
	                    try {
	                        persons = fileManager.readPersons(loadFileName);
	                        System.out.println("Persons loaded successfully from file.");
	                    } 
	                    catch (ClassNotFoundException e) 
	                    {
	                        System.out.println("Error loading persons from file: " + e.getMessage());
	                    }
	                    break;
	                    
	                case 4:
	                    fileManager.displayPersons(persons);
	                    break; 
	                    
	                case 5:
	                    System.out.print("Enter the name to search for: ");
	                    String searchName = sc.nextLine();
	                    Person foundPerson = fileManager.searchPersonByName(persons, searchName);
	                    if (foundPerson != null) {
	                        System.out.println("Person found: " + foundPerson);
	                    } else {
	                        System.out.println("No person found with the name " + searchName);
	                    }
	                    break;

	                case 6:
	                    exit = true;
	                    System.out.println("Exiting the system. Goodbye!");
	                    break;
	                    
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }
	        sc.close();
	    }

}
