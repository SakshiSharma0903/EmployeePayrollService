package com.eureka.EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages="com.eureka.*")
public class EurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("Application started -----------------");
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
