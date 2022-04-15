package day8threadAssignment;

public class BankAccount {
	double balance=100000;
	public synchronized void deposit(double amount) 
	{
		
		balance=balance+amount;
		System.out.println("Updated balance is after deposit is "+balance);
		
	}
	public synchronized void withdraw(double amount) //synchronizing this method prevents double withdraw from same account with insufficient
	{
		if(balance<amount)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
		balance=balance-amount;
		System.out.println("Updated balance is after withdraw is "+balance);
		}
	}

}
