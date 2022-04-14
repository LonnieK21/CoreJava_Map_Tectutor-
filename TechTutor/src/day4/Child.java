package day4;

public class Child extends Parent{
	public void welcome()
	{
		System.out.println("This is child class");
	}
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.show();
		Child c1=new Child();
		c1.show();
		c1.welcome();
		
	}

}
