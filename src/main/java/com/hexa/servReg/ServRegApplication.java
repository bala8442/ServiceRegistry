package com.hexa.servReg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServRegApplication.class, args);
	}
}
