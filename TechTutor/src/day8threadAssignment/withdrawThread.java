package day8threadAssignment;

public class withdrawThread extends Thread{
	BankAccount bankobj;
	public withdrawThread(BankAccount bankobj)
	{
		this.bankobj=bankobj;
	}
	public void run()
	{
		bankobj.withdraw(30000);
	}

}
