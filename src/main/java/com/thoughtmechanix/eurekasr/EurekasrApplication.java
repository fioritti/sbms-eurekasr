package com.thoughtmechanix.eurekasr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekasrApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekasrApplication.class, args);
	}
}
