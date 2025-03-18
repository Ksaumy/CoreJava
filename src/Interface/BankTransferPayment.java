package Assignment2Interface;

 class BankTransferPayment implements PaymentMethod
 {
	 String bankAccountNumber;
	 String bankName;
  BankTransferPayment(String bankAccountNumber, String bankName)
	{
		this.bankAccountNumber = bankAccountNumber;
		this.bankName = bankName;
	}
@Override
public boolean processPayment(double amount)
{
	System.out.println("Start Bank Transfer of amount :"+amount+ " to "+bankName + "Account :"+bankAccountNumber);
	return true;
}
@Override
public String getPaymentDetails() 
{
	return "Bank Account :" +bankAccountNumber +" ("+bankName + ")";
}
@Override
public void refunt(double amount) 
{
	System.out.println("Refunding amount :"+ amount + " to bank account "+ bankAccountNumber);
	
}
  
	 

}
