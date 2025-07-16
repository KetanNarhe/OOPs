package com.Abstraction;

//Absatraction project 

public abstract class calcualtor {

	public abstract void  addition(int a,int b);
	
	public abstract void substraction(int n1,int n2);
	
	public void multiplication(double x ,double y)
	{
		double ans= x*y;
		
		System.out.println(ans);
	}
	
	public abstract void divsison(int a1,int b1);
	
}
