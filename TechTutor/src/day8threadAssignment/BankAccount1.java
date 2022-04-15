package day8threadAssignment;

public class BankAccount1 {	//this version of the code allows us to wait until account has balance 
	double balance=20000;
	boolean choice=true;
	public synchronized void withdraw(double amount)
	{
		if(balance<amount)
		{
			System.out.println("Insufficient balance");
			try {
				wait();
				System.out.println("Waiting so that another thread put some amount there");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//it will wait so that another thread can come into picutee
			// and deposit some amount
		}
		balance=balance-amount;
		System.out.println("Updated balance is "+balance);
		choice=false;
		
		
	}
	public synchronized void deposit(double amount)
	{
	
		
		balance=balance+amount;
		if(balance>amount)
		{
			notify();//it will notfiy any waiting thread that I am done now u can withdraw some 
			//amount
		
		
		}

}
}
