package com.telstra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// enable eureka server acts as service registry to hold multiple clients such as user, products, order and payment 
//this style of service is called microservices which is in fact resful api and service registry holds multiple microservices

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerRegistryApplication.class, args);
	}

}
