package activity_Threads;

public class runLoader {
	public static void main(String[] args) 
	{
		ListLoader myList =new ListLoader();
		long startTime = System.currentTimeMillis();
		myList.loadList(0, 10000000);
		long endTime = System.currentTimeMillis();
		
		long runTime = endTime - startTime;
		
		System.out.println("Elapsed time in milliseconds: " + runTime);
	}
}
