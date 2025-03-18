package Assignment2Inhertance;

class Institutions   //Super Class
{
	String name;
    String location;
     Institutions(String name, String location) //Constructor
	{
    	this.name = name;
		this.location = location;
	}
     String getSummary()  //Method or Function
     {
         return "Institution Name: " + name + "\nLocation: " + location;
     }
}
//---------------------------------------------------------

class School extends Institutions  //Sub Class
{
	int numberOfStudents;
	
	School(String name, String location, int numberOfStudents) //Constructor
	{
		super(name, location);
		this.numberOfStudents = numberOfStudents;
	}
	String getSummary() //Method
	{
        return super.getSummary() + "Number of Students: " + numberOfStudents;
    }
}
//---------------------------------------------------------
class Collage extends Institutions // Sub Class
{
	int numberOfFaculties;

	Collage(String name, String location, int numberOfFaculties)  //Constructor
	{
		super(name, location);
		this.numberOfFaculties = numberOfFaculties;
	}
	String getSummary()  //Method
	{
		 return super.getSummary() + "\nNumber of Faculties: " + numberOfFaculties;
	}
}
//------------------------------------------------------------
public class TestEducationalInstitutions 
{
	public static void main(String[] args)
	{
		 School sc = new School("SPS", "Kanpur", 1500);
	     System.out.println("School Summary:");
	     System.out.println(sc.getSummary());
	        
	        
	        Collage co = new Collage("AKTU University", "Lucknow",14);
	        System.out.println("College Summary:");
	        System.out.println(co.getSummary());

	}

}
