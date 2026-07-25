package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplicationTests implements CommandLineRunner {

    @Autowired
    private CountryService service;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplicationTests.class, args);
    }

    @Override
    public void run(String... args) {
        service.getAllCountries().forEach(System.out::println);
    }
}