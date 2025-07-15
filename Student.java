//Encapsualtion Project

package Encapsulation;

public class Student 
{
   private String name;
   private int rollno;
   private int age;
   
   
   
   
   public Student() 
   {

   }
   
   

   public Student(String name, int rollno, int age) 
   {
	
	this.name = name;
	this.rollno = rollno;
	this.age = age;
}



   public String getName()
   {
	return name;
	   
   }
   
   public int getRollno()
   {
	return rollno;
	   
   }
   
   public int getAge()
   {
	 return age;
	   
   }
   
   public void setName(String newName)
   {
       name=newName;
	   
   }
   
   public void setAge(int newAge)
   {
	    if (newAge > 0)
	    {
	        age = newAge;
	    } 
	    else 
	    {
	        System.out.println("Age must be positive.");
	    }
	}

  
   
}
