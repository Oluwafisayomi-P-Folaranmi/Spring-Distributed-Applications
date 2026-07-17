package com.opf.config_server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigServerApplication.class, args);

    }

    @Bean
    public CommandLineRunner runner() {

        return args -> {
            System.out.println("Application started!");
            System.out.println("Arguments: ");
        };

    }

}
