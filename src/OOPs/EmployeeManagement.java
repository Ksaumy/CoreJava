package Assignment2OOPs;

class Employee
{
	int Empid;
	String Name;
	String Designation;
	float Sal;
	Employee(int Empid,String Name, String Designation,float Sal )
	{
		this.Empid=Empid;
		this.Name= Name;
		this.Designation=Designation;
		this.Sal=Sal;
	}
	void increaseSalary(double percentage)
	{
		Sal  += Sal*(percentage/100);
		System.out.println("Salary Increased " + percentage + "%. New Salary : " + Sal);
	}
	double calculateAnnualBonus(double bonouspercentage)
	{
		return Sal* bonouspercentage;
	}
	void displayDetails()
	{
		System.out.println("Employee Id : " +Empid);
		System.out.println("Employee Name : " +Name);
		System.out.println("Employee Designation : " +Designation);
		System.out.println("Employee Salary : " +Sal);
		
	}
	
}

public class EmployeeManagement {

	public static void main(String[] args) 
	{
		System.out.println("Employee 1");
		Employee e1 = new Employee(101, "Saumya", "Student",2500);
		e1.displayDetails();
		e1.increaseSalary(10);
		double annualBonus1 = e1.calculateAnnualBonus(5);
		System.out.println("Annual Bonous : " +annualBonus1);
		
		
		System.out.println("Employee 2");
		Employee e2 = new Employee(102, "Parul", "Software Eng",8500);
		e2.displayDetails();
		e2.increaseSalary(20);
		double annualBonus2 = e2.calculateAnnualBonus(15);
		System.out.println("Annual Bonous : " +annualBonus2);
		
		System.out.println("Employee 3");
		Employee e3 = new Employee(103, "Shrya", "Student",4500);
		e3.displayDetails();
		e3.increaseSalary(30);
		double annualBonus3 = e3.calculateAnnualBonus(25);
		System.out.println("Annual Bonous : " +annualBonus3);

	}

}
