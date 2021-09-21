package javaday2;

import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int eid=scan.nextInt();
		
		String name = scan.next();
		
		double sal = scan.nextDouble();
		
		String dept = scan.next();

		
		Employee E = new Employee(eid,name,sal,dept);
		E.printDetails();
	}

}
