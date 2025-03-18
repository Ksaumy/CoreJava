package Assignment2Polymorphism;

class BankAccount
{
	String accountHolder;
    double balance;
	BankAccount(String accountHolder, double balance)
	{
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	double calculateInterest()
	{
		return 0;
	}
	void displayBank()
	{
		System.out.println("Account Holder Name: " +accountHolder + " " + "Balance: " + balance);
	}
}
//-------------------------------------------------------------
class SavingsAccount extends BankAccount
{
	double roi ;

    SavingsAccount(String accountHolder, double balance, double roi) 
    {
		super(accountHolder, balance);
		this.roi = roi;
	}
    double calculateInterest()
    {
    	return balance*roi;
    }
}
//---------------------------------------------------
class CheckingAccount extends BankAccount
{
	double monthlyFee;

	CheckingAccount(String accountHolder, double balance, double monthlyFee)
	{
		super(accountHolder, balance);
		this.monthlyFee = monthlyFee;
	}
	double calculateInterest()
	{
		return balance*monthlyFee;
	}
}
//--------------------------------------------------
class BusinessAccount extends BankAccount
{
	double roi;
	double transectionFee;
	
	BusinessAccount(String accountHolder, double balance, double roi, double transectionFee) 
	{
		super(accountHolder, balance);
		this.roi = roi;
		this.transectionFee = transectionFee;
	}
	double calculateInterest()
	{
		return (balance+roi)-transectionFee;
	}
}
//------------------------------------------------------------------


public class BankAccountOverriding
{

	public static void main(String[] args) 
	{
		SavingsAccount sa = new SavingsAccount("Saumya",2500.0,0.02);
		sa.displayBank();
		System.out.println("Saving Account: " + sa.calculateInterest());
		System.out.println("  ");
		
		CheckingAccount ca = new CheckingAccount("Parul",5500.5,25.75);
		ca.displayBank();
		System.out.println("Checking Account: " + ca.calculateInterest());
		System.out.println("  ");
		
		BusinessAccount ba = new BusinessAccount("Raj",4500.3,0.03,45.5);
		ba.displayBank();
		System.out.println("Business Account: " + ba.calculateInterest());
		
		

	}

}
