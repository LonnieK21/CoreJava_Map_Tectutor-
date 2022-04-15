package day8threadAssignment;

public class AccountMain {
	public static void main(String[] args) {
		BankAccount bank=new BankAccount();
		depositThread th1=new depositThread(bank);
		withdrawThread th2=new withdrawThread(bank);
		th2.start();
		th1.start();
		
	}

}
