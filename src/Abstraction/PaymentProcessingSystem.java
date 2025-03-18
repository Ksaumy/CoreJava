package Assignment2Abstraction;

abstract class PaymentMethod
{
    abstract void processPayment(double amount);
	
}
class CreditCard extends PaymentMethod
{
	String cardHolder;
	int cardNumber;
	int expiryDate;
	
	CreditCard(String cardHolder, int cardNumber, int expiryDate)
	{
		this.cardHolder = cardHolder;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}

	void processPayment(double amount)
	{
		System.out.println("Processing the Payment of Credit Card :");
		System.out.println("Card Holder Name :" +cardHolder +"   "+ "Card Number :" + cardNumber + "   " +"Card Expiry Date :"+expiryDate);
		System.out.println("Amount :" + "$"+amount);
		System.out.println("Payment Successfully Done......");
	}
}

class PayPal extends PaymentMethod
{
  String email;

 PayPal(String email) 
{
	this.email = email;
}
  void processPayment(double amount)
  {
	  System.out.println("Processing Payment via Paypal :");
	  System.out.println("Email of Paypal :"+ email + "   " +"Amount :"+ "$ "+amount);
	  System.out.println("Payment Successfully Done....");
  }
}


public class PaymentProcessingSystem 
{

	public static void main(String[] args) 
	{
		PaymentMethod cc = new CreditCard("Saumya",12345,9);
		
	    cc.processPayment(1000);
	    
	    PaymentMethod pp = new PayPal("saumya@gmail.com");
	    pp.processPayment(3000);

	}

}
