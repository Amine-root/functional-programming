package com.mybrand.functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {

		//Normal Java method
		System.out.println("Without Predicate");
		System.out.println(isValidPhone("+393202589871"));
		System.out.println(isValidPhone("+39325289654"));
		System.out.println(isValidPhone("+33582145893"));

		//Predicate
		System.out.println("Method With Predicate");
		System.out.println(isValidPhonePredicate.test("+393202589871"));
		System.out.println(isValidPhonePredicate.test("+39325289654"));
		System.out.println(isValidPhonePredicate.test("+33582145893"));

		//Combine predicate
		System.out.println("Method Combined Predicates");
		System.out.println(isValidPhonePredicate.and(isContains39).test("+393202589871"));
		System.out.println(isValidPhonePredicate.and(isContains39).test("+39325289654"));
		System.out.println(isValidPhonePredicate.and(isContains39).test("+33582145893"));
		
		//BiPredicate
		System.out.println("Method BiPredicate");
		System.out.println(testLength.test("+393202589871", 13));

	}


	//Check phone number
	static boolean isValidPhone(String phoneNumber) {
		return phoneNumber.startsWith("+39") && phoneNumber.length() == 13; 
	}

	//Predicate
	static Predicate<String> isValidPhonePredicate = phoneNumber -> phoneNumber.startsWith("+39") && phoneNumber.length() == 13;
	static Predicate<String> isContains39 = phoneNumber -> phoneNumber.contains(("+39")) && phoneNumber.length() == 13;						
	
	
	//BiPredicate
	static BiPredicate<String, Integer> testLength = (str, strLength) -> str.length() == strLength;
	
	
}
