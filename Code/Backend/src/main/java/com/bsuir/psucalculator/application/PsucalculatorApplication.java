package com.bsuir.psucalculator.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.bsuir.psucalculator")
@EnableJpaRepositories(basePackages = "com.bsuir.psucalculator")
@EntityScan(basePackages = "com.bsuir.psucalculator")
public class PsucalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(PsucalculatorApplication.class, args);
    }
}
