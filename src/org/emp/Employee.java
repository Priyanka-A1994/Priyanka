package org.emp;

public class Employee {
	
	private void empId()
	{		System.out.println("This is empty Method");		}
	
	private void empId(int id)
	{		System.out.println(id);		}
	
	private void empId(String name) {
		System.out.println(name);
	}
	
	private void empId(long phoneno,String email) {
		System.out.println(phoneno +"\n" +email );
		
	}
		

public static void main(String[] args) 
{
	Employee e=new Employee();
	
	e.empId();
	e.empId(1001);
	e.empId("Priya");
	e.empId(8973633157l, "priyanka11.anand@gmail.com");
	
	
}
}





