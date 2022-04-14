package day6;

public class InsufficientBalanceException extends Exception {
	
@Override
public String getMessage()
{
	return "Amount is greater than the balance";
}
}
