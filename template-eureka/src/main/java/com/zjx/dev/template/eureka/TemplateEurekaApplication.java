package com.zjx.dev.template.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TemplateEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateEurekaApplication.class, args);
	}
}
