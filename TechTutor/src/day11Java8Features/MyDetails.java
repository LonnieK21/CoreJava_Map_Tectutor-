package day11Java8Features;

public interface MyDetails {
	public void personalDetails();
	public default void educationDetails()//default methods are optional good for adding methods to interface after creation. child classes are not forced to use default methods
	{
		System.out.println("Default implementation");
	}

}
