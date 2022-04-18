package activity_Threads;

public class MainThread extends Thread{
	public static void main(String[] args) throws InterruptedException 
	{
		LoaderThread first = new LoaderThread(0,500000);
		LoaderThread second = new LoaderThread(500000,1000000);
		
		
		long startTime = System.currentTimeMillis();
		first.start();
		first.join();
		second.start();
		long endTime = System.currentTimeMillis();
		
		long runTime = endTime - startTime;
		
		System.out.println("Elapsed time in milliseconds: " + runTime);
		
	}
}
