package Assignment2Interface;

interface PaymentMethod 
{
	boolean processPayment(double amount);
	String getPaymentDetails();
	void refunt(double amount);

}
