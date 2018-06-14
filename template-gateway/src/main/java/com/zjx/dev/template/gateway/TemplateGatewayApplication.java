package com.zjx.dev.template.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
@EnableEurekaClient
public class TemplateGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateGatewayApplication.class, args);
	}

	@Value("${git}")
	private String gitStr;

	@GetMapping("test")
	public String doTest(){
		return gitStr;
	}
}
