package day8;

public class BankAccount {
	double balance=80000;

	public synchronized void withdraw(double amount) //synchronizing this method prevents double withdraw from same account
	{
		if(balance<amount)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
		balance=balance-amount;
		System.out.println("Updated balance is "+balance);
		}
	}

}
