package day3;

import java.util.*;
public class MaximumDemo {
	Scanner scobj;
	int number1;
	int number2;
	public void accept()
	{
		scobj=new Scanner(System.in);
		System.out.println("Enter number 1");
		number1=scobj.nextInt();
		System.out.println("Enter Number 2");
		number2=scobj.nextInt();
		if(number1>number2)
		{
			System.out.println("Number 1 is maximum");
		}
		else
		{
			System.out.println("Number 2 is maximum");
		}
	}
	public static void main(String[] args) {
		MaximumDemo max1=new MaximumDemo();
		max1.accept();
	}

}
