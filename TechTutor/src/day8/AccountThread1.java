package day8;

public class AccountThread1 extends Thread{
	BankAccount bankobj;
	public AccountThread1(BankAccount bankobj)
	{
		this.bankobj=bankobj;
	}
	public void run()
	{
		bankobj.withdraw(50000);
	}

}
