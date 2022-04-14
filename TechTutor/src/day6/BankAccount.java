package day6;

import java.util.*;
public class BankAccount {
	double balance=50000;
	double amount;
	Scanner sc;
	public BankAccount()
	{
		sc=new Scanner(System.in);
		
	}
	//Throws delegate the task ofhandling exception to calling method.
	public void withdraw() throws InsufficientBalanceException
	{
		System.out.println("Enter the amount to be withdrawn");
		amount=sc.nextDouble();
	//	try
		//{
		if(amount>balance)
		{
			throw new InsufficientBalanceException();
			//I am telling the jvm that this exception should come
		}
		/*}
		catch(InsufficientBalanceException ex)
		{
			System.out.println(ex.getMessage());
		}*/
	}
	public static void main(String[] args) {
		BankAccount banks=new BankAccount();
		try
		{
		banks.withdraw();
		}
		catch(InsufficientBalanceException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
