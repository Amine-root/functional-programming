package com.mybrand.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Streams {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();

		people.add(new Person("Alex", Gender.MALE));
		people.add(new Person("Rasha", Gender.FEMALE));
		people.add(new Person("Pedro", Gender.MALE));
		people.add(new Person("Elisabeth", Gender.FEMALE));
		people.add(new Person("Federico", Gender.MALE));
		people.add(new Person("Luca", Gender.PREFER_NOT_SAY));
		
		
		//Streams
		System.out.println("-------- Example 1 --------");
		people.stream()
		.map(person -> person.name)
		.forEach(System.out::println);
		
		System.out.println("-------- Example 2 --------");
		people.stream()
		.map(person -> person.gender)
		.collect(Collectors.toSet())
		.forEach(System.out::println);
		
		System.out.println("-------- Example 3 --------");

//		Function<Person,String> personStringFunction = person -> person.name;
//		ToIntFunction<? super String> toIntFunction = name -> name.length();
//		IntConsumer intConsumer = System.out::println;

		people.stream()
		.map(person -> person.name)
		.mapToInt(name -> name.length())
		.forEach(System.out::println);
		
		System.out.println("-------- More on streams --------");

		Predicate<Person> predicatePerson = person -> Gender.FEMALE.equals(person.gender);
		boolean containsOnlyFemale = people.stream().allMatch(predicatePerson);
		System.out.println("allMatch: " + containsOnlyFemale);
		
		boolean containsFemale = people.stream().anyMatch(predicatePerson);
		System.out.println("anyMatch: " + containsFemale);
		
		boolean containsNoneFemale = people.stream().noneMatch(predicatePerson);
		System.out.println("noneMatch: " + containsNoneFemale);
	}

	
	static class Person {

		private String name;
		private Gender gender;


		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Gender getGender() {
			return gender;
		}
		
		public void setGender(Gender gender) {
			this.gender = gender;
		}
	}


	enum Gender{
		MALE, FEMALE, PREFER_NOT_SAY
	} 
	
	
}
