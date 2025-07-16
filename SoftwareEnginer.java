package Inheritance;

public class SoftwareEnginer {

   String name;
   int empid;
   String company;
   String degree;
   int exp;
   double salary;
   
   public SoftwareEnginer() {
	
   }

   public SoftwareEnginer(String name, int empid, String company, String degree, int exp, double salry) {

	this.name = name;
	this.empid = empid;
	this.company = company;
	this.degree = degree;
	this.exp = exp;
	this.salary = salary;
	
   }
   
   public void displaySoftwareEnginer()
   {
	   System.out.println("Name:"+name);
	   System.out.println("EmpId:"+empid);
	   System.out.println("Company:"+company);
	   System.out.println("Degree:"+degree);
	   System.out.println("Experience:"+exp);
	   System.out.println("Salary:"+salary);
	   System.out.println("-----------------------------------");
	   
   }
  	
}
