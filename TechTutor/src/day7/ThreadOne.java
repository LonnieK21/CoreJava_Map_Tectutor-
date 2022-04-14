package day7;

public class ThreadOne extends Thread{
	Table t1;
	public ThreadOne(Table t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		t1.printTable(20);
	}

}
