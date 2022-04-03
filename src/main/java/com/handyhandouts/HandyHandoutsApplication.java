package com.handyhandouts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.handyhandouts.config.AppProperties;

import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;


@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
@EnableSwagger2
public class HandyHandoutsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandyHandoutsApplication.class, args);
	}
    
	
}
