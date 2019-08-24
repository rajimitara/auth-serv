package com.thoughtworks.foodyprofileservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class FoodyProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodyProfileServiceApplication.class, args);
	}

}
