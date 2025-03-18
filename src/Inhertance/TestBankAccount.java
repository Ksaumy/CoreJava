package Assignment2Inhertance;

class BankAccount //Super Class
{
	int AccNum;
	float Balance;
	BankAccount(int AccNum, float Balance)
	{
		this.AccNum=AccNum;
		this.Balance=Balance;
	}
	void displayAccountDetails() 
	{
        System.out.println("Account Number: " + AccNum);
        System.out.println("Balance: " + Balance);
	}
}

class SavingsAccount extends BankAccount //subclass
{
	float interestRate;
    SavingsAccount(int AccNum, float Balance, float interestRate) 
    {
		super(AccNum, Balance);
		this.interestRate=interestRate;
		
	}
     void calculateBalance() 
     {
        Balance += Balance * (interestRate / 100);
        System.out.println("Balance after interest: " + Balance);
    }
}

class CheckingAccount extends BankAccount 
{
    int overdraftLimit;
    CheckingAccount(int AccNum, float Balance,int overdraftLimit)
    {
    	super(AccNum,Balance);
    	this.overdraftLimit=overdraftLimit;
    }
     void calculateBalance() 
    {
        if (Balance < 0 && Math.abs(Balance) > overdraftLimit)
        {
            System.out.println("Overdraft limit exceeded.");
        } 
        else 
        {
            System.out.println("Balance is within overdraft limit.");
        }
        System.out.println("Current balance: " + Balance);
    }
    
    
}
public class TestBankAccount {

	public static void main(String[] args) 
	{
		SavingsAccount sa = new SavingsAccount(12345, 3000.0f, 2);
        System.out.println("Savings Account:");
        sa.displayAccountDetails();
        sa.calculateBalance();
        
        
        CheckingAccount ca = new CheckingAccount(34567, 500.0f, 1000);
        System.out.println("\nChecking Account:");
        ca.displayAccountDetails();
        ca.calculateBalance();
        

	}

}
