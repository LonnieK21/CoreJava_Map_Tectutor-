package day5;

//whenever u are extending from exception class that means it will be created as exception.
public class InvalidBalanceException extends Exception {
	@Override
	public String getMessage()
	{
		return "Trying to enter invalid balance";
	}

}
