package day3;

public class ConstructorDemo {
	public ConstructorDemo()
	{
		System.out.println("This is default constructor");
	}
	public ConstructorDemo(int x)
	{
		this();//call the default constructor from parameterized constructor
		//it is also called constructor chaining.
		System.out.println("Value in parameterized constructor ");
	}
	public static void main(String[] args) {
	//	ConstructorDemo c1=new ConstructorDemo();
		ConstructorDemo c2=new ConstructorDemo(50);
	}

}
