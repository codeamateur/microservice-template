package com.zjx.dev.template.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableOAuth2Sso
public class TemplateGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateGatewayApplication.class, args);
	}


}
