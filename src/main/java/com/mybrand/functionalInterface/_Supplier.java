package com.mybrand.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {

		System.out.println(getConnectionUrl());
		System.out.println(getConnectionUrlSupplier.get());
		System.out.println(getConnectionUrlSuppliers.get());
	}
	
	//return a value
	static String getConnectionUrl() {
		return "jdbc://localhost:5432/users";
	}
	
	//Supplier
	static Supplier<String> getConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

	static Supplier<List<String>> getConnectionUrlSuppliers = () -> Arrays.asList("jdbc://localhost:80/users","jdbc://localhost:81/users");
	
}
