package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class ConfigurationmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationmanagementApplication.class, args);
	}

}
