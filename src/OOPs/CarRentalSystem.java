package Assignment2OOPs;

class Car
{
	String carModel;
	String registrationNumber;
	double rentalRatePerDay;
	Boolean isAvailable;
	Car(String carModel, String registrationNumber, double rentalRatePerDay)
	{
		this.carModel = carModel;
        this.registrationNumber = registrationNumber;
        this.rentalRatePerDay = rentalRatePerDay;
        this.isAvailable = true;
	}
	void rentaCar()
	{
		  if (isAvailable)
		  {
	            isAvailable = false;
	            System.out.println("Car " + carModel + " with registration number " + registrationNumber + " has been rented.");
	        } 
		  else 
		  {
	            System.out.println("Sorry, the car " + carModel + " is currently unavailable.");
	        }
	}
	void returnCar(int daysRented)
	{
        if (!isAvailable)
        {
            isAvailable = true;
            double rentalCharge = daysRented * rentalRatePerDay;
            System.out.println("Car " + carModel + " has been returned. Total rental charges: $" + rentalCharge);
        } 
        else 
        {
            System.out.println("The car " + carModel + " is already available. It cannot be returned unless rented.");
        }
	}
	void displayDetails()
	{
        String availabilityStatus = isAvailable ? "Available" : "Not Available";
        System.out.println("Car Model: " + carModel);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Rental Rate per Day: $" + rentalRatePerDay);
        System.out.println("Availability: " + availabilityStatus);
    }
	
}
public class CarRentalSystem {

	public static void main(String[] args)
	{
		System.out.println("Car1");
		Car c1 = new Car("Toyota ", "ABC1234", 90.0);
		c1.displayDetails();   
        c1.rentaCar();        
        c1.displayDetails();       
        c1.returnCar(3);      
        c1.displayDetails();
        
        System.out.println("Car2");
		Car c2 = new Car("Maruti ", "XYZ1234", 60.0);
		c2.displayDetails();   
        c2.rentaCar();        
        c2.displayDetails();       
        c2.returnCar(7);      
        c2.displayDetails();
        
        
        
        
        System.out.println("Car3");
		Car c3 = new Car("Ola ", "PQRS24", 40.0);
	  
        c3.rentaCar();        
        c3.displayDetails();       
        c3.returnCar(5);      
        c3.displayDetails();

	}

}
