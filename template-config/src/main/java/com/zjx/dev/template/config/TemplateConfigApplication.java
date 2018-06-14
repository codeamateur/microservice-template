package com.zjx.dev.template.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TemplateConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateConfigApplication.class, args);
	}
}
