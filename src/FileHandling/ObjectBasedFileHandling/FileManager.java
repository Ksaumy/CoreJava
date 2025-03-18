package Assignment3FileHandling.ObjectBasedFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class FileManager 
{
	Scanner sc =new Scanner(System.in);
	String file ="output.txt";
	void writePersons(List<Person> persons, String fileName) throws IOException 
	{
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(persons);
		oos.close();
		System.out.println("Person saved file....."+file);
	}
	 List<Person> readPersons(String fileName) throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Person> persons = (List<Person>) ois.readObject();
		ois.close();
		return persons;
	}
	 void displayPersons(List<Person> persons)
	 {
		 if (persons.isEmpty()) 
		 {
	            System.out.println("No persons to display.");
	       } 
		 else 
		 {
	            for (Person person : persons) 
	            {
	                System.out.println(person);
	            }
	        }
	 }
	 public Person searchPersonByName(List<Person> persons, String name) 
	 {
	        for (Person person : persons) 
	        {
	            if (person.getName().equalsIgnoreCase(name)) 
	            {
	                return person;
	            }
	        }
	        return null;
	    }

}
