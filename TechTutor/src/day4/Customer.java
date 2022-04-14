package day4;

public class Customer implements PersonalDetails{

	@Override
	public void acceptName() {
System.out.println("Accepting nameof customer");
System.out.println("Company name is "+COMPANY_NAME);
	}

	@Override
	public void acceptAddress() {
System.out.println("Accepting Address of Customer");		
	}

}
