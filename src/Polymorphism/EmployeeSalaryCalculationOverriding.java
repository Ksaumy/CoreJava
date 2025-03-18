package Assignment2Polymorphism;

class Employee
{
	String name;
	int empId;
	Employee(String name, int empId) 
	{
		this.name = name;
		this.empId = empId;
	
	}
	double calculateSal()
	{
		return 0;
	}
	 void displayEmployee()
	 {
		 System.out.println("Employee ID: " +empId + " " + "Name: " +name);
	 }
	
}
//------------------------------------------------------
class FullTimeEmployee extends Employee
{
	double basicSal;

	FullTimeEmployee(String name, int empId, double basicSal) 
	{
		super(name, empId);
		this.basicSal = basicSal;
	}
	double calculateSal(int bonus)
	{
		return basicSal+bonus;
	}
//	double calculateSal(int amt)
//	{
//		double Sal =amt*15;
//		System.out.println("fulltime: " +Sal);
//		return basicSal;
//	}
}
//---------------------------------------------------------
class PartTimeEmployee extends Employee
{
	double hourlyRate;
    int hoursWorked;
    
	PartTimeEmployee(String name, int empId, double hourlyRate, int hoursWorked) 
	{
		super(name, empId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	double calculateSal()
	{
		return hourlyRate*hoursWorked;
	}
//	double calculateSal(int amt)
//	{
//		double Sal = ((amt *55)+(hourlyRate*hoursWorked));
//		System.out.println("PartTimeSal : " +Sal);
//		return hourlyRate*hoursWorked;
//	}
}
//-------------------------------------------------------
class ContractEmployee extends Employee
{
	double contractAmount;

	 ContractEmployee(String name, int empId, double contractAmount)
	 {
		super(name, empId);
		this.contractAmount = contractAmount;
	}
	 double calculateSal()
	 {
		 return contractAmount;
	 }
//	 double calculateSal(int amt)
//	 {
//		 double Sal=amt+contractAmount;
//		 System.out.println("ContractSal: " +Sal);
//		 return contractAmount;
//	 }
}
//---------------------------------------------------------
public class EmployeeSalaryCalculationOverriding
{

	public static void main(String[] args) 
	{
		FullTimeEmployee fe=new FullTimeEmployee("Richa",101,2500.0);
		fe.displayEmployee();
		System.out.println("Basic : " + fe.calculateSal(2000));
		
		PartTimeEmployee pe = new PartTimeEmployee("Parul",201,40.2,16);
		pe.displayEmployee();
		System.out.println("PartTimeFixSal: " + pe.calculateSal());
		
		ContractEmployee ce = new ContractEmployee("Parul",301,6000.0);
		ce.displayEmployee();
		System.out.println("ContractBasedSal: "+ ce.calculateSal());
		

	}

}
