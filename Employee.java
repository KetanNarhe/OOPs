package com.Abstraction;

public  class Employee  extends SunStar{

	String name;
	int age;
	double salary;
	    
       
      
       public Employee() {
    	   
    	   
	}
       
       public Employee(String name,int age,double salary)
       {
    	   this.name=name;
    	   this.age=age;
    	   this.salary=salary;
    	   
    	   
       }
           public void display()
           {
        	   System.out.println(name);
        	   System.out.println(age);
        	   System.out.println(salary);
           }

		 
		 public void printInfo() {
			
			   System.out.println("Print info method");
			
		   }
	
	
}
