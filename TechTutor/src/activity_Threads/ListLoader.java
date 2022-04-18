package activity_Threads;

import java.util.ArrayList;

public class ListLoader {
	
	ArrayList<Integer> numList = new ArrayList<Integer>();
	
	public void loadList(int startNumber, int lastNumber) {
		for(int i = startNumber; i <= lastNumber; i++ ) 
		{
			numList.add(i);
		}
	}

}
