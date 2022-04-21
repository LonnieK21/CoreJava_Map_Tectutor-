package day11Java8Features;

public class LambdaDemo {
	public void display()
	{
		MyDetails det=(num1,num2)->{
			System.out.println("Welcome to lambda expression");
		};
		det.personalDetails(0, 0);
	}
	public static void main(String[] args) {
		LambdaDemo lamdemo=new LambdaDemo();
		lamdemo.display();
	}
}
