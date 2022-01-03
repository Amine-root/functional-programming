package combinatorPattern;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("Alice", 
				"alicegmail.com", 
				"3954564654", 
				LocalDate.of(2000, 1, 1));
		
		
		CustomerValidatorService cusValida = new CustomerValidatorService();
		System.out.println(cusValida.isValid(customer));
		
		//Using combinator
		ValidationResult result = CustomerRegistrationValidator.isEmailValid()
		.and(CustomerRegistrationValidator.isPhoneValid())
		.and(CustomerRegistrationValidator.isAdult())
		.apply(customer);
		
		
		System.out.println(result);
		
		if(result != ValidationResult.SUCCESS)
			throw new IllegalStateException(result.name());		
	}
}
