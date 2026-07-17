package com.opf.license_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LicenseServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(LicenseServiceApplication.class, args);
	}

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            System.out.println("Application started!");
            System.out.println("Arguments: ");
        };
    }
}
