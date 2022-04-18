package activity_ExceptionHandling;

public class TaxCalculator {
	
	double salary;
	boolean isIndian;
	String empName;

	public double calculateTax(String empName, double salary,boolean isIndian)
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException
	{
		double taxAmount;
		this.salary=salary;
		this.isIndian=isIndian;
		this.empName=empName;
		if(!isIndian)
		{
			throw new CountryNotValidException();
		} else if(empName == "")
		{
			throw new EmployeeNameInvalidException();
		}
		if(salary > 100000 && isIndian) 
		{
			taxAmount = salary * .08;
		} else if(salary > 50000 && salary < 100000 && isIndian) 
		{
			taxAmount = salary * .06;
		} else if(salary > 30000 && salary < 50000 && isIndian) 
		{
			taxAmount = salary * .05;
		} else if(salary > 10000 && salary < 30000 && isIndian) 
		{
			taxAmount = salary * .04;
		}else 
		{
			throw new TaxNotEligibleException();
		}
		
		return taxAmount;
		
	}
}
