package day8threadAssignment;

public class AccountMain1 {
	public static void main(String[] args) {
		BankAccount1 bank=new BankAccount1();
		AccountThread1 th1=new AccountThread1(bank);
		AccountThread2 th2=new AccountThread2(bank);
		th1.start();
		
		
		th2.start();
	}

}
