package com.mybrand.finalSection;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		System.out.println("First example");
		hello("John", null, value->{
			System.out.println("no last name for: " + value);
		});
		
		
		System.out.println("Second example");
		hello2("John", null, ()->{
			System.out.println("no last name");
		});



	}

	static void hello(String name, String surname, Consumer<String> callback) {
		System.out.println(name);
		if(surname != null) {
			System.out.println(surname);
		}
		else
		{
			callback.accept(name);
		}
	}

	static void hello2(String name, String surname, Runnable callback) {
		System.out.println(name);
		if(surname != null) {
			System.out.println(surname);
		}
		else
		{
			callback.run();
		}
	}


	//	function hello (firstName, lastName, callback) {
	//		console.log(firstName);
	//		if(lastName) {
	//			console.log(lastName);
	//		}else {
	//			callback();
	//		}
	//	};

}
