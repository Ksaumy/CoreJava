package Assignment2Interface;

class CreditCardPayment implements PaymentMethod
{
	String cardNumber;
	String cardHolderName;
	String expirationDate;
	String cvv;
	
	 CreditCardPayment(String cardNumber, String cardHolderName, String expirationDate, String cvv) 
	 {
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.expirationDate = expirationDate;
		this.cvv = cvv;
	}
	@Override
	public boolean processPayment(double amount) 
	{
		if(validateCard())
		{
			System.out.println(" Processes the payment for the specified amount...."+amount);
			return true;
		}
		
		return false;
	}
	private boolean validateCard()
	{
		return cardNumber.length()==16 && expirationDate != null && cvv.length()==3;
	}
	@Override
	public String getPaymentDetails()
	{
		return "**** **** ****" + cardNumber.substring(cardNumber.length()-4);
	}
	@Override
	public void refunt(double amount) 
	{
		System.out.println("Refunding :"+amount+"  "+"To Credit Card "+getPaymentDetails());
	}

}
