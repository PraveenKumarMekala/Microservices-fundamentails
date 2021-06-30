package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
@EntityScan("com.example.domain")
@EnableJpaRepositories("com.example.repository")
@EnableDiscoveryClient
public class AddCurrencyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddCurrencyServiceApplication.class, args);
	}

}
