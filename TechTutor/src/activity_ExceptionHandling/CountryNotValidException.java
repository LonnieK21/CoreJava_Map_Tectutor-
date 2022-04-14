package activity_ExceptionHandling;

public class CountryNotValidException extends Exception {

	@Override
	public String getMessage()
	{
		return "CountryNotValidException";
	}
}
