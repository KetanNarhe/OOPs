package Inheritance;

//Single level Inheritance......

public class Developer  extends SoftwareEnginer{

	String teckstack;
	int project;
	String role;
	String domain;
	
	public Developer() 
	{
		
	}

	public Developer(String name, int empid, String company, String degree, int exp, double salary,String teckstack, int project, String role, String domain)
	{
		this.name = name;
		this.empid = empid;
		this.company = company;
		this.degree = degree;
		this.exp = exp;
		this.salary = salary;
		
		
		this.teckstack = teckstack;
		this.project = project;
		this.role = role;
		this.domain = domain;
	}
	
	
	public void dislpayDeveloper()
	{
		displaySoftwareEnginer(); 
		
		System.out.println("Techstack:"+teckstack);
		System.out.println("Project:"+project);
		System.out.println("Role :"+role);
		System.out.println("Domain:"+domain);
	
		
	}
	
	
	
	
	
	
	
}
