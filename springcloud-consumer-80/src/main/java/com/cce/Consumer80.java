package com.cce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class Consumer80 {
	public static void main(String[] args) {
		SpringApplication.run(Consumer80.class, args);
	}
}
