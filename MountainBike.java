package Inheritance;

//Single level inheritance...

public class MountainBike extends Bicycle {

	public int seatHeight;

	
	public MountainBike() {
		
	}


	public MountainBike(int gear, int speed, int seatHeight) {
		
		
		super(gear,speed);
		
//		this.gear=gear;
//		this.speed=speed;
		
		this.seatHeight = seatHeight;
	}   


	public void setHeight(int newValue)
	 {
	     seatHeight = newValue;
	 }
	
	
//	public String toString()
//	 {
//	     return (super.toString() + "\nseat height is "
//	             + seatHeight);
//	   
//	}
//	
//	
//	
	
	public void displayMbike()
	{
		 displayBike();
		System.out.println("seatHight Of Bike"+seatHeight);
		System.out.println("---------------------------");
		
	}
}
	
	
	
	
	
	
	
	
