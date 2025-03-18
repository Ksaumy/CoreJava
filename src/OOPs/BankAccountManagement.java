package Assignment2OOPs;

class BankAccount
{
	 long accountNumber;
	 String accountHolderName;
	 float balance;
	 void readBankAccount(long Ano, String AHName, float Bal)
	 {
		accountNumber=Ano;
		accountHolderName= AHName;
		balance=Bal;
	 }
	 void displayBankAccount()
	 {
		 
		 System.out.println(accountNumber);
		 System.out.println(accountHolderName);
		 System.out.println(balance);
	 }
	 void depositBankAccount(double amount)
	 {
		 if (amount > 0) 
		 {
	        balance += amount;
	        System.out.println("Deposit: " + amount);
		 }
		 else
		 {
			 System.out.println("Invalid deposit: ");
		 }
	 }
	 void withdrawBankAccount(double amount)
	 {
		 if(amount > 0 && amount <= balance)
		 {
			 balance -= amount;
			 System.out.println("withdraw: " + amount);
		 }
		 else
		 {
			 System.out.println("Invalid Withdraw : ");
		 } 
	 }
	 void displayBalanceBankAccount()
	 {
		 System.out.println("Current balance: " + balance); 
	 }
   
}

public class BankAccountManagement {

	public static void main(String[] args) 
	{
		BankAccount b1 = new BankAccount();
		 
		b1.readBankAccount(123456, "Saumya", 4500);
		b1.displayBankAccount();
		b1.depositBankAccount(500);
		b1.withdrawBankAccount(200);
		b1.displayBalanceBankAccount();
		System.out.println();
		
		BankAccount b2 = new BankAccount();
		 
		b2.readBankAccount(342156, "Shreya", 5500);
		b2.displayBankAccount();
		b2.depositBankAccount(1000);
		b2.withdrawBankAccount(500);
		b2.displayBalanceBankAccount();
		System.out.println();
		
		BankAccount b3 = new BankAccount();
		 
		b3.readBankAccount(432167, "Shivam", 6500);
		b3.displayBankAccount();
		b3.depositBankAccount(1500);
		b3.withdrawBankAccount(100);
		b3.displayBalanceBankAccount();
		
	}

}