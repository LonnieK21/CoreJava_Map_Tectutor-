package activity_ExceptionHandling;

public class EmployeeNameInvalidException extends Exception {
	
	@Override
	public String getMessage()
	{
		return "The employee name cannot be empty";
	}
}
