package com.crux;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class CabBookingApplication {
	private static final Logger logger = Logger.getLogger(CabBookingApplication.class.getName());
	public static void main(String[] args) {
		logger.info("Cab Booking started");
		SpringApplication.run(CabBookingApplication.class, args);
	}

}
