package com.devopslabassignment.my_ci_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCiProjectApplication.class, args);
		// Task 4 change to trigger CI
		System.out.println("Just Some Minor Changes"); 
	}

}
