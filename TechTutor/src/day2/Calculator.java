package day2;

public class Calculator {
	int number1;
	int number2;//Declaration of variable
	public void accept()
	{
		number1=70;
		number2=40;//Assignment of variable
	}
	public void add()
	{
		int sum=number1+number2;
		System.out.println("Total is "+sum);
	}
	public void sub()
	{
		int diff=number1-number2;
		System.out.println("Difference is"+diff);

	}
	public static void main(String arg[])
	{
		Calculator cobj;
		cobj=new Calculator();
		cobj.accept();
		cobj.add();
		cobj.sub();
	}

}
