package Assignment3FileHandling.ObjectBasedFileHandling;

import java.io.Serializable;

public class Person implements Serializable
{
	String name;
	int age;
	String email;
	public Person(String name, int age, String email)
	{
		this.name = name;
		this.age = age;
		this.email = email;
	}
	 public String getName() 
	 {
	        return name;
	    }

	    public int getAge() 
	    {
	        return age;
	    }

	    public String getEmail() 
	    {
	        return email;
	    }
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	 
}
