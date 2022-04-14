package day3;

import java.util.*;
public class InterestCalculator {
	Scanner sc;
	double amount;
	int interestrate;
	public void accept()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter Amount");
		amount=sc.nextDouble();
		System.out.println("Enter interest rate");
		interestrate=sc.nextInt();
	}
	public void calculateInterest()
	{
		switch(interestrate)
		{
		case 5:
				amount=amount+(amount*0.05);
				System.out.println("Final amount is "+amount);
				break;
		case 10:
				amount=amount+(amount*0.10);
				System.out.println("Final amount after 10 percentis"+amount);
				break;
		
		}
		
	}
	public static void main(String[] args) {
		InterestCalculator interest=new InterestCalculator();
		interest.accept();
		interest.calculateInterest();
	}
	

}
