package OOPS;
// Runtime polymorphisum

public class Pubg 
{
   String username;
   String pass;
   

   int bullets=30;
   
   public Pubg() 
   {
	
   }

   public Pubg(String username, String pass)
   {
	
	super();
	this.username = username;
	this.pass = pass;
	
	System.out.println("Login Succesfully");
	
  
   }
   
     
     public void forward()
     {
    	 System.out.println("Moved 1 step forward");
     }
     
     public void backward()
     {
    	 System.out.println("Moved 1 step forward");
     }
     
     public void turnRight()
     {
    	 System.out.println("Turn Left");
     }
     
     public void turnLeftt()
     {
    	 System.out.println("Turn Left");
     }
     
     public void fire()
     {
    	 if(bullets>0)
    	 {
    		 System.err.println("Bullet fired");
    		 bullets--;

    		 System.err.println(bullets+"left");
    	 }
    	 
    	 else
    	 {
    		 System.out.println("Reload");
    	 }
     }
   
   
   
   
   
   
}
