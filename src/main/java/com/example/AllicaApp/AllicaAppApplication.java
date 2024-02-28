package com.example.AllicaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AllicaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllicaAppApplication.class, args);
	}

}
