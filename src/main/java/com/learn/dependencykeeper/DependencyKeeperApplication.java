	package com.learn.dependencykeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyKeeperApplication {

	public static void main(String[] args) {
		System.out.println("Application Started");
		SpringApplication.run(DependencyKeeperApplication.class, args);
	}

}
