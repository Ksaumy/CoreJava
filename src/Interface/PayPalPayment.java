package Assignment2Interface;

class PayPalPayment implements PaymentMethod
{
	String email;

	 PayPalPayment(String email)
	 {
		this.email = email;
	}

	@Override
	public boolean processPayment(double amount) 
	{
		System.out.println("Processing PayPal Payment :"+amount+" for "+email);
		return true;
	}

	@Override
	public String getPaymentDetails() 
	{
		return "PayPal account :" + email;
	}

	@Override
	public void refunt(double amount) 
	{
		System.out.println("Refunding :"+amount+" to PayPal account "+email);
		
	}
	 
	
}
