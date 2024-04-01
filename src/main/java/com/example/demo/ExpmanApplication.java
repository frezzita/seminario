package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.demo.repository")
@ComponentScan(basePackages = "com.example.demo.controller")
@EntityScan(basePackages = {"com.example.demo.model"})

public class ExpmanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpmanApplication.class, args);
    }

}
