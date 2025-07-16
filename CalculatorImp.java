package com.Abstraction;

public class CalculatorImp extends calcualtor {

	
	public void addition(int a,int b)
	{
		int  res=a+b;
		System.out.println(res);
	}
	
	
	public void substraction(int n1,int n2)
	{
		int  res=n1+n2;
		System.out.println(res);
	}
	
	public void multiplication(double x ,double y)
	{
		double ans= x*y;
		
		System.out.println(ans);
	}
	
	public void divsison(int a1,int b1)
	{
		int res=a1/b1;
		
		System.out.println(res);
	}

}
