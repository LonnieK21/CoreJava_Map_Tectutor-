package day5;

import java.util.*;
public class InterestCalculator {
	private Scanner sc;
	private double balance;
	private int interestrate;
	public InterestCalculator()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter Balance ");
	
	}
	public void check()
	{
		System.out.println("Enter Balance ");
		balance=sc.nextDouble();
		try
		{
		if(balance<0)
		{
			throw new InvalidBalanceException();
			//telling the jvm that this exception will come at this point
		}
		}
		catch(InvalidBalanceException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
		InterestCalculator interestc=new InterestCalculator();
		interestc.check();
	}
	

}
