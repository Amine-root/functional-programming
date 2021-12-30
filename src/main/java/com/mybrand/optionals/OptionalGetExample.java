package com.mybrand.optionals;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class OptionalGetExample {

	public static void main(String[] args) {
		
		Supplier<IllegalArgumentException> supplier = () -> new IllegalArgumentException();
		Consumer<String> consumer = x -> System.out.println(x);
		
		Optional.ofNullable("Hello").ifPresent(consumer);
		Optional.ofNullable("Hi").orElseThrow(supplier);
		
		Optional<String> optional = Optional.of("Good");
		if(optional.isPresent()) {
			String value = optional.get();
			System.out.println(value);
		}
		else
		{
			System.out.println("No value !!");
		}
		
		//Working with the user class
		User user = new User("Federico", "1820535");
		
		Optional<User> userOptional = Optional.of(user);
		
		userOptional.ifPresent(user1 -> System.out.println("The user is: " + user1.getUserName()));
		
		userOptional.ifPresent(value -> {
			 System.out.println("The user is: " + value.getUserName());
		});
				
		userOptional.orElseGet(() -> {
			return new User("Unknown", "0000000");
		});

	}

}
