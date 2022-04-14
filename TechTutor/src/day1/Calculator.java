package day1;

public class Calculator {
	public void add()
	{
		System.out.println("This is add method");
	}
	public void sub()
	{
		System.out.println("This is subtract method");
	}
	public static void main(String arg[])
	{
		Calculator cobj;
		cobj=new Calculator();
		cobj.add();
		cobj.sub();
	}

}