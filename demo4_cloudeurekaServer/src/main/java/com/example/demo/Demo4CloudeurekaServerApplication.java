package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
public class Demo4CloudeurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo4CloudeurekaServerApplication.class, args);
	}
	
	
}
