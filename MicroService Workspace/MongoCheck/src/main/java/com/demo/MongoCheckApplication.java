package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.demo.repository")
public class MongoCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoCheckApplication.class, args);
	}

}
