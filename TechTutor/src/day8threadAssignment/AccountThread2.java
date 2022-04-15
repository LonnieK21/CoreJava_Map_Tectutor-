package day8threadAssignment;

public class AccountThread2 extends Thread{
	BankAccount1 bankobj;
	public AccountThread2(BankAccount1 bankobj)
	{
		this.bankobj=bankobj;
	}
	public void run()
	{
		bankobj.deposit(40000);
	}

}
