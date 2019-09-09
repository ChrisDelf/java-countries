package com.lambdaschool.javacountries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavacountriesApplication {
	// fields
	static CountryList ourCountryList;
	// constructor
	public static void main(String[] args) {
		ourCountryList = new CountryList();
		SpringApplication.run(JavacountriesApplication.class, args);
	}


}
