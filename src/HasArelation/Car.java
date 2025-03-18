package Assignment2HasArelation;

 class Car
{
	String model;
	String make;
	Engine eg;
	
	public Car(String model, String make, Engine eg)
	{
		this.model = model;
		this.make = make;
		this.eg = eg;
	}
	void dispCar()
	{
		System.out.println("Car Details : ");
	System.out.println("Model Name :"+ model + "   "+"Car Made By :" + make);
		System.out.println("Engine Details : ");
		System.out.println("Engine Number :"+ eg.engineNumber + "   "+"Engine Type :" + eg.type + "   "+"Engine Power :" + eg.power);
	}


	public static void main(String[] args)
	{
		Engine eg1 = new Engine(101,"xyz",34);
		Engine eg2 = new Engine(102,"abc",12);

		Car c1 = new Car("erhyt","tyuo6g",eg1);
		c1.dispCar();
		Car c2 = new Car("gtyu", "grwis",eg2);
		c2.dispCar();
	}

}
