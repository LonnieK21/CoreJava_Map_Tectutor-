package day7;


public class FirstThread extends Thread{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("The value of x is "+x);
			try
			{
			Thread.sleep(2000);
			}
			catch(InterruptedException ex)
			{
				System.out.println("Thread interrupted");
			}
		}
			
	}
	public static void main(String[] args) {
		FirstThread first=new FirstThread();//this thread is in new thread stage
		
		first.start();
		try {
			first.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SecondThread second=new SecondThread();
		second.start();
		try {
			second.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//second.start();//As soon as you call start method it will come in runnable stge 
		//and internally it will call run method where u will write all the logic which u want 
		//to perform whenever thread is started.
	}

}
/*
 * Rigth now there is only one thread that is main thread or it is also called daemon thread.
 * 
 */

/*   Part 2 of thread demo
 * 
//Runnable interface is predefined interface which can be used to create
//multithreaded program. it contains only single method that is run method
public class FirstThread implements Runnable{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("Value of x is "+x);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		FirstThread first=new FirstThread();
		Thread th1=new Thread(first);//I want to create a thread where the functionality is implemented using FirstThread class.
		Thread th2=new Thread(first);
		th1.start();
		th2.start();
		
		
	}
	

}*/

/*		Part 1 of thread demo
public class FirstThread extends Thread{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("The value of x is "+x);
			try
			{
			Thread.sleep(2000);
			}
			catch(InterruptedException ex)
			{
				System.out.println("Thread interrupted");
			}
		}
			
	}
	public static void main(String[] args) {
		FirstThread first=new FirstThread();//this thread is in new thread stage
		FirstThread second=new FirstThread();
		first.start();
		second.start();//As soon as you call start method it will come in runnable stge 
		//and internally it will call run method where u will write all the logic which u want 
		//to perform whenever thread is started.
	}

}

 Right now there is only one thread that is main thread or it is also called daemon thread.

*/