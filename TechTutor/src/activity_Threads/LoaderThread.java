package activity_Threads;

import java.util.ArrayList;

public class LoaderThread extends Thread{
	int startNumber;
	int lastNumber;
	ListLoader loaderObj = new ListLoader();
	ArrayList<Integer> numList = new ArrayList<Integer>();
	
	LoaderThread(int startNumber, int lastNumber)
	{
		this.startNumber = startNumber;
		this.lastNumber = lastNumber;
	}  
	public void run()
	{
		loaderObj.loadList(startNumber, lastNumber);
	}
}
