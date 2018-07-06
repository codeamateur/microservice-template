package com.zjx.dev.template.account;

import com.zjx.dev.template.account.service.security.CustomUserInfoTokenServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
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
public class TemplateAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateAccountApplication.class, args);
	}

	@Autowired
	private ResourceServerProperties sso;

	@Bean
	public Docket swaggerAccountApi10() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.zjx.dev.template.account.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(
						new ApiInfoBuilder()
								.version("1.0")
								.title("账户服务 API")
								.description("账户服务 API v1.0")
								.build()
				);
	}

	@Bean
	public ResourceServerTokenServices myUserInfoTokenServices() {
		return new CustomUserInfoTokenServices(sso.getUserInfoUri(), sso.getClientId());

	}
}
