package com.mybrand.imperative;

import java.util.ArrayList;
import java.util.List;

/**
 * TP : imperative programming VS declarative programming
 * 
 * @author amine.abouelfath
 *
 */

public class TpFunctional1 {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();

		people.add(new Person("Alex", Gender.MALE));
		people.add(new Person("Rasha", Gender.FEMALE));
		people.add(new Person("Pedro", Gender.MALE));
		people.add(new Person("Elisabeth", Gender.FEMALE));
		people.add(new Person("Federico", Gender.MALE));

		System.out.println("Imperative approach");
		//Imperative approach
		List<Person> females = new ArrayList<>();

		for (Person person : people) {
			if(person.getGender().equals(Gender.FEMALE))
				females.add(person);
		}

		for (Person female : females) {
			System.out.println(female);
		}

		System.out.println("Declarative approach");
		//Declarative approach
		
		//Predicate<? super Person> predicate = person -> person.getGender().equals(Gender.FEMALE);
		people.stream()
		.filter(person -> person.getGender().equals(Gender.FEMALE))
		//.collect(Collectors.toList())
		.forEach(System.out::println);
		
	}	

}
