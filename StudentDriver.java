package Encapsulation;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student  s1=new Student ("Ketan",29,12);
		
		
		System.out.println("Name:" +s1.getName());
		System.out.println("Age:"+s1.getAge());
		System.out.println("RollNo :"+s1.getRollno());
		System.out.println("--------------------------");
	
		
		s1.setName("Akshay");
		s1.setAge(22);
		
		
		

		System.out.println("Name:" +s1.getName());
		System.out.println("Age:"+s1.getAge());
		System.out.println("RollNo :"+s1.getRollno());
		
		
		
		
	      
		
            
	}

}
