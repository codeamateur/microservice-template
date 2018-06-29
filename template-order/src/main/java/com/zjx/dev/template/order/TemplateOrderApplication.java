package com.zjx.dev.template.order;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableSwagger2
public class TemplateOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateOrderApplication.class, args);
	}

	@Bean
	public Docket swaggerPersonApi10() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.zjx.dev.template.order.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(
						new ApiInfoBuilder()
								.version("1.0")
								.title("订单服务 API")
								.description("订单服务 API v1.0")
								.build()
				);
	}
}
