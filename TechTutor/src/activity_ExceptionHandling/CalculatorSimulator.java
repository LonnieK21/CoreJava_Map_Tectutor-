package activity_ExceptionHandling;

public class CalculatorSimulator {
	public static void main(String[] args) {
		TaxCalculator lonnie =new TaxCalculator();
		try {
			Double tax = lonnie.calculateTax("Jack", 55000, true);
			System.out.println("Tax amount "+tax);
		} catch (CountryNotValidException | EmployeeNameInvalidException | TaxNotEligibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
