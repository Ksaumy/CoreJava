package Assignment2Abstraction;

abstract class Vehicles
{
	String licensePlate;
	double rentalPricePerDay;
	
     Vehicles(String licensePlate, double rentalPricePerDay) 
	{
		this.licensePlate = licensePlate;
		this.rentalPricePerDay = rentalPricePerDay;
	}
     
     abstract double calculateRentalCost(int days);
     
     abstract void dispVehicles();
}
class Car extends Vehicles
{
	int numberofDoor;
	boolean isAutomatic;
	
	 Car(String licensePlate, double rentalPricePerDay, int numberofDoor, boolean isAutomatic) 
	 {
		super(licensePlate, rentalPricePerDay);
		this.numberofDoor = numberofDoor;
		this.isAutomatic = isAutomatic;
	}
	 double calculateRentalCost(int days)
	 {
		 double cost = rentalPricePerDay*days;
		 if(isAutomatic)
		 {
			 cost +=50;
		 }
		 return cost;
	 }
	 void dispVehicles()
	 {
		 System.out.println("Car License Plate: " + licensePlate+ "  "+"Rental Price Per Day: $" + rentalPricePerDay+ "    "+"Number of Doors: " + numberofDoor+"   "+"Automatic: " + (isAutomatic ? "Yes" : "No"));
	 }
}
class Motorcycle extends Vehicles
{
  int engineDisplacement;
  boolean hasSidecar;
  
  Motorcycle(String licensePlate, double rentalPricePerDay, int engineDisplacement, boolean hasSidecar)
  {
		super(licensePlate, rentalPricePerDay);
		this.engineDisplacement = engineDisplacement;
		this.hasSidecar = hasSidecar;
	}
  double calculateRentalCost(int days)
  {
	  double cost = rentalPricePerDay * days;
	  if (hasSidecar) 
	  {
          cost += 30; 
  }
	  return cost;
  
}
  void dispVehicles()
  {
	  System.out.println("Motorcycle License Plate: " + licensePlate+ "  "+"Rental Price Per Day: $" + rentalPricePerDay+ "    "+"Engine Displacement :"+engineDisplacement+"     "+"Has SideCar :"+(hasSidecar ? "Yes" : "No"));
  }
}
class RentalService
{
 	Car c;
 	Motorcycle m;
 	void setCar(Car c)
 	{
 		this.c=c;
 	}
 	void setMotorcycle(Motorcycle m)
 	{
 		this.m=m;
 	}
 	double calculateTotalRentalCost(int days)
 	{
        double totalCost = 0;
        if (c != null) {
            totalCost += c.calculateRentalCost(days);
        }
        if (m != null) {
            totalCost += m.calculateRentalCost(days);
        }
        return totalCost;
    }
 	
}
public class VehicleRentalService 
{
	public static void main(String[] args)
	{
		RentalService r = new RentalService();
		
		Vehicles cv = new Car("ABC123",100,4,true);
		cv.calculateRentalCost(6);
		cv.dispVehicles();
		
		Vehicles cv1 = new Car("MPQ23",500,6,false);
		cv1.calculateRentalCost(3);
		cv1.dispVehicles();
		
		Vehicles mv = new Motorcycle("SUDHA21",600,70,false);
		mv.calculateRentalCost(4);
		mv.dispVehicles();	
		
		Vehicles mv1 = new Motorcycle("Raj321",800,90,true);
		mv1.calculateRentalCost(8);
		mv1.dispVehicles();
		
		int rentalDays = 3;
        double totalCost = r.calculateTotalRentalCost(rentalDays);
        System.out.println("Total Rental Cost for " + rentalDays + " days: $" + totalCost);
    
		
	}

}
