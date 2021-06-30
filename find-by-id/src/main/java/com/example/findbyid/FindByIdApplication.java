package com.example.findbyid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
@EntityScan("com.example.domain")
@EnableJpaRepositories("com.example.repository")
public class FindByIdApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindByIdApplication.class, args);
	}

}
