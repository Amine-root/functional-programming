package com.mybrand.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		
		//Normal Java function 
		Customer alexandre = new Customer("Alexandre", "9999999");
		greetCustomer(alexandre);
		greetCustomerV2(alexandre, false);
		
		//Consumer
		greetCustomerConsumer.accept(alexandre);
		greetCustomerConsumerV2.accept(alexandre, false);

	}
	
	static class Customer {
		public Customer(String nameCustomer, String phoneNumber) {
			super();
			this.nameCustomer = nameCustomer;
			this.phoneNumber = phoneNumber;
		}
		
		private final String nameCustomer;
		private final String phoneNumber;		
	}
	
	static void greetCustomer(Customer customer) {
		System.out.println("Hi " + customer.nameCustomer + "thanks for registering you phone "
				+ customer.phoneNumber);
	}
	
	static void greetCustomerV2(Customer customer, boolean showNumber) {
		System.out.println("Hi " + customer.nameCustomer + "thanks for registering you phone "
				+ (showNumber ? customer.phoneNumber : "*********"));
	}
	
	//Consumer
	static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hi " + customer.nameCustomer + "thanks for registering you phone "
			+ customer.phoneNumber);
	
	//BiConsumer
	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhone) -> System.out.println("Hi " + customer.nameCustomer + "thanks for registering you phone "
			+ (showPhone ? customer.phoneNumber : "*********"));
	

}
