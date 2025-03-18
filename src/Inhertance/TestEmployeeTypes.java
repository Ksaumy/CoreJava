package Assignment2Inhertance;

class Employee //Super Class
{
	String name;
	int employeeId;
	double basicSalary;
	Employee(String name, int employeeId, double basicSalary) //Constructor
	{
		this.name = name;
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
	}
	void displayEmployeeDetails()  // Method
	{
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
    }
	 double getTotalCompensation() 
	 {
		 return basicSalary;
	 }	
}
//---------------------------------------------------------------
	 class FullTimeEmployee extends Employee //Sub Class
	 {
	  double annualBonus;
	   FullTimeEmployee(String name, int employeeId, double basicSalary, double annualBonus)
	 {
		super(name, employeeId, basicSalary);
		this.annualBonus = annualBonus;
	 }
	   double getTotalCompensation() 
	   {
	        return basicSalary + annualBonus;
	    }    
	 }
//---------------------------------------------------------------------	 
	 class PartTimeEmployee extends Employee  //Sub Class
	 {
	     int hoursWorked;
		 double hourlyRate;
		public PartTimeEmployee(String name, int employeeId, double basicSalary, int hoursWorked, double hourlyRate) 
		{
			super(name, employeeId, basicSalary);
			this.hoursWorked = hoursWorked;
			this.hourlyRate = hourlyRate;
		}
		double getTotalCompensation() 
		{
	        return basicSalary + (hoursWorked * hourlyRate);
	    }
		 
	 }
//-----------------------------------------------------------------------------
public class TestEmployeeTypes
{
	public static void main(String[] args)
	{
		FullTimeEmployee fte = new FullTimeEmployee("Saumya", 101, 70000.0, 30000.0);
        System.out.println("Full-Time Employee:");
        fte.displayEmployeeDetails();
        System.out.println("Total Compensation: " + fte.getTotalCompensation());
        System.out.println("----------");
        
        PartTimeEmployee pte = new PartTimeEmployee("Raj", 102, 60000.0, 30, 10.0);
        System.out.println("\nPart-Time Employee:");
        pte.displayEmployeeDetails();
        System.out.println("Total Compensation: " + pte.getTotalCompensation());
    }		
}
		

