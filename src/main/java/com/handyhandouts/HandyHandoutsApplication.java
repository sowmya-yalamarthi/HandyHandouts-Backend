package com.handyhandouts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.handyhandouts.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class HandyHandoutsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandyHandoutsApplication.class, args);
	}

}
