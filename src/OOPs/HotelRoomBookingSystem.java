package Assignment2OOPs;
class Room
{
	int roomNumber;
	String roomType;
	double ratePerNight;
	boolean availabilityStatus;
	public Room(int roomNumber, String roomType, double ratePerNight)
	{
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.ratePerNight = ratePerNight;
		this.availabilityStatus = true;
	}
	void bookRoom()
	{
		if(availabilityStatus)
		{
			availabilityStatus = false;
			System.out.println("Room Booked Successfully : " + roomNumber + " ("
					+ roomType + ") ");
		}
		else
		{
			System.out.println("Room Already Booked : " + roomNumber);
		}
	}
	void cancelBooking()
	{
		if(!availabilityStatus)
		{
			availabilityStatus = true;
			System.out.println("Room Booking Cancel SUccesfully : " + roomNumber);
		}
		else 
		{
			System.out.println("Room is not Booked so it cannot Cancel : " + roomNumber);
		}
	}
	double calculateTotalAmount(int night)
	{
		return ratePerNight *night;
		}
	void displayRoomDetails()
	{
		String status = (availabilityStatus)? "Available" : "Booked";
		System.out.println("Room Number: " + roomNumber + ", Type: " + roomType + 
                ", Rate per Night: $" + ratePerNight + ", Status: " + status);
	}
}
//----------------------
public class HotelRoomBookingSystem {

	public static void main(String[] args) 
	{
		Room r1 = new Room(101,"Single",200.00);
		Room r2 = new Room(102,"Double",1200.00);
		Room r3 = new Room(103,"Suite",5200.00);
		
		r1.displayRoomDetails();
		r2.displayRoomDetails();
		r3.displayRoomDetails();
		
		r1.bookRoom();
		
		r1.bookRoom();
		 
		double totalAmount = r1.calculateTotalAmount(5);
		System.out.println("Total Cost for 5 Nights : " + r1.roomNumber + " $" + totalAmount );
		
		r1.cancelBooking();
		r1.displayRoomDetails();
		

	}

}
