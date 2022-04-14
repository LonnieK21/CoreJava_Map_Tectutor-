package day7;

public class ThreadTwo extends Thread{
	Table tobj;
	public ThreadTwo(Table tobj)
	{
		this.tobj=tobj;
	}
	public void run()
	{
		tobj.printTable(30);
	}

}
