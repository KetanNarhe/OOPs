package com.methods;

public class MethodOverloading 
{
      public static void add(int a ,int b)
      {
    	  int ans=a+b;
    	   
    	  System.out.println(ans);
    	   
    	    
      }
      
      public static void add(double n1,double n2)
      {
    	  double res=n1+n2;
    	  
    	  System.out.println(res);
      }
      
      public static void add(int n1,int n2,int n3)
      {
    	 int res=n1+n2+n3;
    	 
    	 System.out.println(res);
      }
	
	
	public static void main(String[] args) 
	{
	   	add(23,29);
	   	add(14,12);
	   	add(22,8,9);

	}

}
