package day7;

public class SecondThread extends Thread{
	public void run()
	{
		for(int x=10;x>=1;x--)
		{
			System.out.println("Thread value is "+x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
