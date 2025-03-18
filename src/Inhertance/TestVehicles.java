package Assignment2Inhertance;

class Vehicle
{
    String make;
    String model;
	Vehicle(String make, String model)   //Constructor
	{
		this.make = make;
		this.model = model;
	}
	void displayDetails()    //Method
	{
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

//------------------------------------------------------

class Car extends Vehicle   //Sub Class
{
	int numberOfDoors;
	Car(String make, String model,int numberOfDoors) 
	{
		super(make , model);
		this.numberOfDoors = numberOfDoors;
	}
	void displayDetails() 
	{
        super.displayDetails(); 
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
//------------------------------------------------------------

class Truck extends Vehicle    //Sub Class
{
	double cargoCapacity;

	Truck(String make, String model, double cargoCapacity)
	{
		super(make, model);
		this.cargoCapacity = cargoCapacity;
	}
	void displayDetails()
	{
	        super.displayDetails(); 
	        System.out.println("Cargo Capacity: " + cargoCapacity );
	}
}
//--------------------------------------------------------------
public class TestVehicles
{
	public static void main(String[] args) 
	{
		Car car = new Car("Toyota", "ABC", 4);
        System.out.println("Car Details:");
        car.displayDetails(); 
        
        
        Truck truck = new Truck("XYZ", "A-50", 26);
        System.out.println("Truck Details:");
        truck.displayDetails();
	}

}
