package day8;

public class AccountThread2 extends Thread{
	BankAccount bankobj;
	public AccountThread2(BankAccount bankobj)
	{
		this.bankobj=bankobj;
	}
	public void run()
	{
		bankobj.withdraw(40000);
	}

}