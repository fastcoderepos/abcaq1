package com.fastcode.abcaq1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.fastcode.abcaq1"})
public class Abcaq1Application {

	public static void main(String[] args) {
		SpringApplication.run(Abcaq1Application.class, args);
	}

}

