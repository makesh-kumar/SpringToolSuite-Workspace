package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZzzApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZzzApplication.class, args);
	}
	
	
    @PostConstruct
    private void init() {
            System.out.println("APP STRATED");
    }

}
