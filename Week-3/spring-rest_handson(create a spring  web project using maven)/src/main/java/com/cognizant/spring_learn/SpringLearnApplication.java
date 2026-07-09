package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        LOGGER.trace("Trace Message");
        LOGGER.debug("Debug Message");
        LOGGER.info("Info Message");
        LOGGER.warn("Warning Message");
        LOGGER.error("Error Message");

        SpringApplication.run(SpringLearnApplication.class, args);
    }
}