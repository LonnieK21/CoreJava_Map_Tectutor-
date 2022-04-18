package activity_Threads;

import java.util.ArrayList;

public class ListLoader {//0-1-2-3-4-5-6-7-8-9-10
	
	ArrayList<Integer> numList = new ArrayList<Integer>();
	
	public void loadList(int startNumber, int lastNumber) {
		for(int i = startNumber; i <= lastNumber; i++ ) 
		{
			numList.add(i);
		}
	}

}
