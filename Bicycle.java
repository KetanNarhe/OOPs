package Inheritance;

public class Bicycle {

	public int gear;
	public int speed;
	
	
	
	
	public Bicycle() {
		
	}

	public Bicycle(int gear, int speed) {
	
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applayBreak(int decrement) {
		
		gear-=decrement;
	}
	
	public void speedup(int increment) {
		
		speed+=increment;
	}
	
//	public String toString()
//	{
//		return ("NO of grear is: "+gear +"\n" +"Speed bike is:"+speed);
//		
//	}
//	
	
	public void displayBike()
	{
		System.out.println("No Of Gears "+gear);
		System.out.println("Speed of Bike "+speed);
		
	}
	
	
}
