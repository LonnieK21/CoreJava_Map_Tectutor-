package activity_ExceptionHandling;

public class TaxNotEligibleException extends Exception {

	@Override
	public String getMessage()
	{
		return "TaxNotEligibleException";
	}
}
