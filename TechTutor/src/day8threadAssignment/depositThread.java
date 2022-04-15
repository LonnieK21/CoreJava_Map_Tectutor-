package day8threadAssignment;

public class depositThread extends Thread{
	BankAccount bankobj;
	public depositThread(BankAccount bankobj)
	{
		this.bankobj=bankobj;
	}
	public void run()
	{
		bankobj.deposit(100000);
	}

}
