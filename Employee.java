package javaday2;

public class Employee {
	
	
	 int eid;
	String name;
	double sal;
	String dept;
	
	Employee(int eid,String name,double sal,String dept)
	{
		this.eid=eid;
		this.name=name;
		this.sal=sal;
		this.dept=dept;
	}
	
	
	public void printDetails() {
	
		
		  System.out.println("employee id "+eid);
		  
		  System.out.println("employee name "+name);
		  
		  
		  System.out.println("employee salary "+sal);
		  
		  
		  System.out.println("employee department "+dept);
		 
		  
		
	}

}
