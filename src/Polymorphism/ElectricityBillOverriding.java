package Assignment2Polymorphism;

class ElectricityBill
{
	String cName;
	double unitsConsumed;
	ElectricityBill(String cName, double unitsConsumed) 
	{
		this.cName = cName;
		this.unitsConsumed = unitsConsumed;
	}
	double calculateBill()
	{
		return 0;
	}
	void displayElectricity()
	{
		System.out.println("Customer Name: " +cName + " " + "Consumed Units: " + unitsConsumed);
	}
}
//--------------------------------------------------------------------------------------------------------
class ResidentialCustomer extends ElectricityBill
{
	double ratePerunit;

	ResidentialCustomer(String cName, double unitsConsumed, double ratePerunit) 
	{
		super(cName, unitsConsumed);
		this.ratePerunit = ratePerunit;
	}
	double calculateBill()
	{
		return unitsConsumed*ratePerunit;
	}
}
//------------------------------------------------------------------------------------------------------------
class CommercialCustomer extends ElectricityBill
{
	double ratePerunit;
    double fixedCharge;
    
    CommercialCustomer(String cName, double unitsConsumed, double ratePerunit, double fixedCharge)
    {
		super(cName, unitsConsumed);
		this.ratePerunit = ratePerunit;
		this.fixedCharge = fixedCharge;
	}
    double calculateBill()
	{
		return (unitsConsumed*ratePerunit)+fixedCharge;
	} 
}
//---------------------------------------------------------------------------------------------------------------
class IndustrialCustomer extends ElectricityBill
{
	double bill;
    IndustrialCustomer(String cName, double unitsConsumed)
    {
		super(cName, unitsConsumed);
		
	}
    double calculateBill()
    {
    	if (unitsConsumed<=1000)
    	{
    		bill = unitsConsumed*0.10;
    	}
    	else if (unitsConsumed<=5000)
    	{
    		bill = (1000*0.10)+((unitsConsumed-1000)*0.08);
    	}
    	else
    	{
    		bill =(1000 * 0.10) + (4000 * 0.08) + ((unitsConsumed - 5000) * 0.05);
    	}
    	return bill;
    }
}
//------------------------------------------------------------------------------------------------------------
public class ElectricityBillOverriding 
{
	public static void main(String[] args) 
	{
		ResidentialCustomer re = new ResidentialCustomer("Abhi", 500,0.05);
		re.displayElectricity();
		System.out.println("Residential Customer Bill: " + re.calculateBill());
		System.out.println("   ");
		CommercialCustomer ce = new CommercialCustomer("Ravi",1200,0.08,2500);
		ce.displayElectricity();
		System.out.println("Commercial Customer Bill: " +ce.calculateBill());
		System.out.println("  ");
		 IndustrialCustomer ie=new  IndustrialCustomer("Simmi",7000);
		 ie.displayElectricity();
		 System.out.println("Industrial Customer Bill: " +ie.calculateBill());
	}
}
