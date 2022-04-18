package activity_ExceptionHandling;

public class TaxNotEligibleException extends Exception {

	@Override
	public String getMessage()
	{
		return "The employee does not need to pay tax";
	}
}
