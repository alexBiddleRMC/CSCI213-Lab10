package lab10;


public class Car extends Vehicle 
{

	private int doors ;
	private int passengers ;
	
	
	public Car(String make, String model, String plate, int doors, int passengers) 
	{
		super(make, model, plate) ;
		this.doors = doors ;
		this.passengers = passengers ;
	}
	
	
	int getDoors()
	{
		return this.doors ;
	}
	
	int getPassengers()
	{
		return this.passengers ;
	}
	
	public Car copy() 
	{
		// Copying current instance variable data
		int copyDoors = this.doors ;
		int copyPassengers= this.passengers ;
		String copyPlate = super.getPlate() ;
		String copyMake = super.getMake() ;
		String copyModel = super.getModel() ;
		
		// Creating a new copy of the current instance variable 
		return new Car (copyMake, copyModel, copyPlate, copyDoors, copyPassengers) ;
	}
	
	@Override
	public String toString() 
	{
		// Building the string with the proper sentence format 
		return String.format("%d-door %s %s with license %s", this.doors, super.getMake(), super.getModel(), super.getPlate()) ;
	}
	
	@Override
	public boolean equals(Object car2)
	{
		// Checks if the object is the right type
		if (!(car2 instanceof Car)){
			return false;
		}
		// Casts the Car type to obj and assigns it to a variable
		Car otherCar = (Car) car2 ;
		
		// Checking if the doors, passengers, plate, make, and model are all equal.
		return (this.doors == otherCar.doors && this.passengers == otherCar.passengers && super.equals(otherCar)) ;				
	}
	
}
