package day3;

import java.util.Scanner;//that means i m bringing scanner class in my program.

public class Employee {
	int empid;
	String empname;
	double salary;
	Scanner sc;
	public void accept()
	{
		sc=new Scanner(System.in);//we are initializing scanner. it should take input from
		//keyboard
		System.out.println("Enter employee id ");
		empid=sc.nextInt();//it can be used to accept input from keyboard
		System.out.println("Enter Employee name  ");
		empname=sc.next();
		System.out.println("Enter Salary");
		salary=sc.nextDouble();
		
	}
	public void display()
	{
		System.out.println("Employee id is "+empid);
		System.out.println("Employee name is "+empname);
		System.out.println("Salary is "+salary);
	}
	public static void main(String[] args) {
		Employee eobj=new Employee();
		eobj.accept();
		eobj.display();
	}

}
/*
 * Scanner class can be used to take input from user.
 */
