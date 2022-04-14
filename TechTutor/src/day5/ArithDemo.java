package day5;

import java.util.Scanner;

public class ArithDemo {
	private int number1;
	private int number2;
	private double result;
	private Scanner sc;
	public ArithDemo()
	{
		sc=new Scanner(System.in);
	}
	public void check()
	{
		System.out.println("Enter number 1");
		number1=sc.nextInt();
		System.out.println("Enter Number 2");
		number2=sc.nextInt();
		try
		{
		result=number1/number2;
		System.out.println("Resullt after division is "+result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Trying to divide a number by zero");
			
		}
		System.out.println("HEllo world program");
	}
	public static void main(String[] args) {
		ArithDemo ariths=new ArithDemo();
		ariths.check();
	}

}
