package Assignment2Interface;

public class PaymentProcessingSystem 
{

	public static void main(String[] args)
	{
		PaymentMethod cc= new CreditCardPayment("3261234578965432","Saumya Katiyar","09/2026","897");
		PaymentMethod pp=new PayPalPayment("saumya@gmail.com");
		PaymentMethod bp=new BankTransferPayment("321675849753","SBI");
		
		processPayment(cc,12345);
		processPayment(pp,45673);
		processPayment(bp,76843);
	}
	static void processPayment(PaymentMethod pm,double amount)
	{
		if(pm.processPayment(amount))
		{
			System.out.println("Payment Successful :"+pm.getPaymentDetails());
		}
		else
		{
			System.out.println("Payment failed :");
		}
	}

}
