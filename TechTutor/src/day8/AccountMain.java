package day8;

public class AccountMain {
	public static void main(String[] args) {
		BankAccount bank=new BankAccount();
		AccountThread1 th1=new AccountThread1(bank);
		AccountThread2 th2=new AccountThread2(bank);
		th1.start();
		th2.start();
	}

}
