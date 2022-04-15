package day8threadAssignment;

public class AccountThread1 extends Thread{
	BankAccount1 bankobj;
	public AccountThread1(BankAccount1 bankobj)
	{
		this.bankobj=bankobj;
	}
	public void run()
	{
		bankobj.withdraw(50000);
	}

}
