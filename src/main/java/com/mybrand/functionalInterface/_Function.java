package com.mybrand.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		
		//Function takes 1 argument and produces 1 result
		System.out.println("Increment method1: " + increment(1));
		System.out.println("Decalrative method2 : " + incrementByOne.apply(1));
		
		//multiply by 10
		System.out.println("Multiple by 10: " + multiplyByTen.apply(2));
		
		//Chaining functions
		Function<Integer, Integer> addOneMultBy10 = incrementByOne.andThen(multiplyByTen);
		System.out.println("Chaining function: " + addOneMultBy10.apply(2));
		
		//BiFunction takes 2 argument and produces 1 result
		System.out.println(incrementByOneMultiply(4, 100));
		System.out.println(incrementByOneMultiplyFunction.apply(4, 100));
		
	}
	
	//Function<T,R> : Represents a function that accepts one argument and produces a result.
	static Function<Integer, Integer> incrementByOne = (number -> number + 1);
	
	//multiply by 10
	static Function<Integer, Integer> multiplyByTen = (number -> number * 10);
	
	//method increment a number
	static int increment(int number) {
		return number + 1;
	}
	
	//addAndMultiply
	static int incrementByOneMultiply(int number, int multiply) {
		return (number + 1) * multiply;
	}
	
	//BiFunction<T,U,R> Represents a function that accepts two arguments and produces a result.
	static BiFunction<Integer, Integer, Integer> incrementByOneMultiplyFunction = 
			(number, multiply) -> (number + 1) * multiply;

}
