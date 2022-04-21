package day11Java8Features;

public class DisplayMessage {//Example of lamnda Expression
	public void display()
	{
		DisplayInfo det=(message1)->{
			System.out.println("Name of user is  " +message1);
		};
		det.showMessage("Lonnie");
	}
	public static void main(String[] args) {
		DisplayMessage lamdemo=new DisplayMessage();
		lamdemo.display();
	}
}
