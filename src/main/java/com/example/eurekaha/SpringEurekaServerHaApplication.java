package com.example.eurekaha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaServerHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerHaApplication.class, args);
	}
}
