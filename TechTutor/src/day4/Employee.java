package day4;

import java.util.*;
public abstract class Employee {
	private int empid;
	private String empname;
	protected Scanner sc;//I dont want to declare scanner again and again.
	public Employee()
	{
		sc=new Scanner(System.in);
	}
	public void accept()
	{
		System.out.println("Enter Employee id ");
		empid=sc.nextInt();
		System.out.println("Enter Employee name ");
		empname=sc.next();
	}
	public void display()
	{
		System.out.println("Employee id is "+empid);
		System.out.println("Employee name is "+empname);
	}
	public abstract void calculateSalary();

}





/*import java.util.*;
public class Employee {  //First part of employee class
	private int empid;
	private String empname;
	protected Scanner sc;//I dont want to declare scanner again and again.
	public Employee()
	{
		sc=new Scanner(System.in);
	}
	public void accept()
	{
		System.out.println("Enter Employee id ");
		empid=sc.nextInt();
		System.out.println("Enter Employee name ");
		empname=sc.next();
	}
	public void display()
	{
		System.out.println("Employee id is "+empid);
		System.out.println("Employee name is "+empname);
	}
	

}*/
