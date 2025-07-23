package OOPS;

//Runtime polymorphism ,method overriding
public class Naukari {

     long phno;
	 String pass;
	 
	 int applays=0;
	 
	 public Naukari()
	 {
		
	 }

	 public Naukari(long phno, String pass) 
	 {
	
		super();
		this.phno = phno;
		this.pass = pass;
	 }
	 
	 public void profile(long phno,String pass)
	 {
		 if(this.phno==phno && this.pass==pass )
		 {
			 System.out.println("Profile is created Succesfully");
		 }
		 else
		 {
			 System.out.println("Invalid Credencial");
		 }
		 }
	 
	      public void Search()
	      {
	    	  System.out.println("Applay job here ");
	      }
	 
	      public void applay(long phno,String pass)
	      {
	    	  if(this.phno==phno && this.pass==pass )
	    	  {
	    		  applays++;
	    		  System.out.println("You are Applied " + applays + " times");
	    	
	    	  }
	    	  else
	    	  {
	    		  System.out.println("First create Your Profile");
	    	  }
	      }
	      
	      public void notifty()
	      {
	    	  System.out.println("call infromation");
	      }
	       
	      
	 
	 
	 
	 
}
