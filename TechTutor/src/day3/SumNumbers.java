package day3;

public class SumNumbers {
	int total=0;
	public void show()
	{
		for(int x=1;x<=10;x++)
		{
			total=total+x;
			System.out.println("Total is "+total);
		}
	}
	public static void main(String[] args) {
		SumNumbers sum1=new SumNumbers();
		sum1.show();
	}
}
